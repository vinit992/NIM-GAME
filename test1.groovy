pipeline {
    agent any
    triggers { pollSCM('H/5 * * * *') }
    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
        disableConcurrentBuilds()
        timestamps()
    }
    environment {
        GIT_URL = "https://github.com/vinit992/NIM-GAME.git"
        BRANCH_A = "vinit992-patch-1"
        BRANCH_B = "vinit992-patch-2"
        
    }
    parameters {
        booleanParam(defaultValue: false, description: 'Update pipeline parameters without building/deploying', name: 'UPDATE_PIPELINE_ONLY')
    }

    stages {
    
        stage('Initialization') {
            steps {
                script {
                    deleteDir()
                    dir('app') {
                        checkout([$class: 'GitSCM',
                            branches: [[name: '**/tags/**']],
                            doGenerateSubmoduleConfigurations: false,
                            extensions: [],
                            submoduleCfg: [],
                            userRemoteConfigs: [[credentialsId: '',
                                refspec: '+refs/tags/*:refs/remotes/origin/tags/*',
                                url: "${GIT_URL}"
                            ]]
                        ])
                    }
                }
            }
        }

        stage('Validate TAG Branch') {
            steps {
                script {
                    dir('app') {
                        def currentTag = sh(returnStdout: true, script: "git describe --tags").trim()
                        def branchAStatus = sh(returnStdout: true, returnStatus: true, script: "git branch -a --contains ${currentTag} | grep ${BRANCH_A}")
                        def branchBStatus = sh(returnStdout: true, returnStatus: true, script: "git branch -a --contains ${currentTag} | grep ${BRANCH_B}")
                        
                        println "Validating tag: ${currentTag}"
                        
                        if (branchAStatus == 0) {
                            buildPipeline = 'clusterA'
                            echo "Deployed on cluster A"
                        } else if (branchBStatus == 0) {
                            buildPipeline = 'clusterB'
                            echo "Deployed on cluster B"
                        } else {
                            currentBuild.result = 'ABORTED'
                            error('Tag does not belong to branch A or branch B. Aborted')
                        }
                    }
                }
            }
        }

        stage('Trigger Cluster A Build Pipeline') {
            when {
                expression { buildPipeline == 'clusterA' }
            }
            steps {
                script {
                    build(job: 'ClusterA_Build_Job', wait: false)
                }
            }
        }

        stage('Trigger Cluster B Build Pipeline') {
            when {
                expression { buildPipeline == 'clusterB' }
            }
            steps {
                script {
                    build(job: 'ClusterB_Build_Job', wait: false)
                }
            }
        }
    }
}
