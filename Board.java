/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Testing Jenkins branch
 */
package vinet_ballu;
import jaco.mp3.player.MP3Player;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Board extends javax.swing.JFrame {

    
    MP3Player mp3player = new MP3Player(getClass().getResource("Harshit.mp3")); 
    public void playMusic(){
        mp3player.play();
        mp3player.setRepeat(true);

    }
    public void stopMusic(){
        mp3player.pause();
    }
    public void closeMusic(){
        mp3player.stop();
    }
    int xx, yy;
    int apple = 21;
    int option1 = 20;
    int option2 = 19;
    int option3 = 18;
    int[][] arr = new int[22][2];
    int turn = 0;
    int move = 0;
    boolean isAI = false;

    
    
    public Board() {
        initComponents();
        Initialize();
        playMusic();
    }
    
    
    public void Initialize(){
        int j = 0;
        int k = 0;
        int space = 6;
 
        int p = 0;
        for(int i = 0; i < 21; i++,k++){
            
            arr[p][0] = (60 * k) + space * (k + 1)+3;
            arr[p][1] = 60 * j + space+3;
            if(i == 5 || i == 11 || i == 17){
                j++;
                k = -1;
                space = 6;
            }
            p++;
        }
        for(int i = 0; i < 21; i++){
            if(i == 5 || i == 11 || i == 17){
               
            }
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mode = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        Music = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        Board = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        mode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Play with Friend", "Play with AI" }));
        mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Choose Playing Mode");

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        info.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        info.setText("Your Moves...");

        Music.setSelected(true);
        Music.setText("Music");
        Music.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Music, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Music)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 3, true));

        Board.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agin.png"))); // NOI18N
        Board.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Board.setEnabled(false);
        Board.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void BoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardMouseClicked
        
        xx = evt.getX();
        yy = evt.getY();
        
        if(apple > 1 && (xx > arr[option1][0] && xx < arr[option1][0]+66 && yy > arr[option1][1] && yy < arr[option1][1]+60)){
            JButton btn = new JButton();
            btn.setSize(60, 60);
            btn.setLocation(arr[option1][0],arr[option1][1]);
            btn.setVisible(true);
            if(turn == 0){
                btn.setIcon(new ImageIcon(getClass().getResource("eatenapple.png")));
                
            }else{
                btn.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));

            }
            Board.add(btn);
            
            option1--;
            option2--;
            option3--;
            apple--;
            if(apple == 1 && turn == 0){
                JOptionPane.showMessageDialog(null,"Player Two Lost..");
            }else if(apple == 1 && turn == 1){
                JOptionPane.showMessageDialog(null, "Player Two has won..");
            }
            if(turn == 0){
                info.setText("Player One has selected 1");
                turn = 1;
            }else{
                info.setText("Player Two has selected 1");
                turn = 0;
            }
            if(isAI){
                playHarsh();
                turn = 0;
            }
            
        }else if(apple > 2 && (xx > arr[option2][0] && xx < arr[option2][0] + 66 && yy > arr[option2][1]  && yy < arr[option1][1]+60)){
           // System.out.println("Entered two");
            system.out.println("Testing Jenkins");
            JButton btn = new JButton();
            btn.setSize(60, 60);
            btn.setLocation(arr[option1][0],arr[option1][1]);
            btn.setVisible(true);
            if(turn == 0){
                btn.setIcon(new ImageIcon(getClass().getResource("eatenapple.png")));
            }else{
                btn.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));
            }
            Board.add(btn);
            JButton btn2 = new JButton();
            btn2.setSize(60, 60);
            btn2.setLocation(arr[option2][0],arr[option2][1]);
            btn2.setVisible(true);
            btn2.setVisible(true);
            if(turn == 0){
                btn2.setIcon(new ImageIcon(getClass().getResource("eatenapple.png")));
            }else{
                btn2.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));
            }
            
            Board.add(btn2);
            
            option1 -= 2;
            option2 -=2;
            option3 -=2;
            apple -=2;
            if(apple == 1 && turn == 0){
                JOptionPane.showMessageDialog(null,"Player Two Lost..");
            }else if(apple == 1 && turn == 1){
                JOptionPane.showMessageDialog(null, "Player Two has won..");
            }
            if(turn == 0){
                info.setText("Player One has selected 2");
                turn = 1;
            }else{
                info.setText("Player Two has selected 2");
                turn = 0;
            }
            if(isAI){
                playHarsh();
                turn = 0;
            }

            
        }else if((apple > 3 && (xx > arr[option3][0] && xx < arr[option1][0]+66 && yy > arr[option3][1] && yy < arr[option1][1] + 60) || ((xx > arr[option3][0] && yy > arr[option3][1]) && ( apple == 19 || apple == 13 || apple == 7 || apple == 20 || apple == 14 || apple == 8)))){
           // System.out.println("Entered Three");
            JButton btn = new JButton();
            btn.setSize(60, 60);
            btn.setLocation(arr[option1][0],arr[option1][1]);
            btn.setVisible(true);
            if(turn == 0){
                btn.setIcon(new ImageIcon(getClass().getResource("eatenapple.png")));
            }else{
                btn.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));
            }
            Board.add(btn);
            
            JButton btn2 = new JButton();
            btn2.setSize(60, 60);
            btn2.setLocation(arr[option2][0],arr[option2][1]);
            btn2.setVisible(true);
            if(turn == 0){
                btn2.setIcon(new ImageIcon(getClass().getResource("eatenapple.png")));
            }else{
                btn2.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));
            }
            Board.add(btn2);
            
            JButton btn3 = new JButton();
            btn3.setSize(60, 60);
            btn3.setLocation(arr[option3][0],arr[option3][1]);
            btn3.setVisible(true);
            if(turn == 0){
                btn3.setIcon(new ImageIcon(getClass().getResource("eatenapple.png")));
            }else{
                btn3.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));
            }
            Board.add(btn3);
            if(apple == 1 && turn == 0){
                JOptionPane.showMessageDialog(null,"Player Two Lost..");
            }else if(apple == 1 && turn == 1){
                JOptionPane.showMessageDialog(null, "Player Two has won..");
            }
            if(turn == 0){
                info.setText("Player One has selected 3");
                turn = 1;
            }else{
                info.setText("Player Two has selected 3");
                turn = 0;
            }
            
            option1 -= 3;
            option2 -=3;
            option3 -=3;
            apple -=3;
            if(isAI){
                playHarsh();
                turn = 0;
            }
        }
    }
    public void playHarsh(){
        if((apple - 4) % 4 == 0 || apple - 4 == 0) {
            JButton btn = new JButton();
            btn.setSize(60, 60);
            btn.setLocation(arr[option1][0],arr[option1][1]);
            btn.setVisible(true);
            btn.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));
            Board.add(btn);
            JButton btn2 = new JButton();
            btn2.setSize(60, 60);
            btn2.setLocation(arr[option2][0],arr[option2][1]);
            btn2.setVisible(true);
            btn2.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));
            Board.add(btn2);
            JButton btn3 = new JButton();
            btn3.setSize(60, 60);
            btn3.setLocation(arr[option3][0],arr[option3][1]);
            btn3.setVisible(true);
            btn3.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));
            Board.add(btn3);
            info.setText("AI has selected 3");
            option1 -= 3;
            option2 -=3;
            option3 -=3;
            apple -=3;
        }else if ((apple - 3) % 4 == 0 || apple - 3 == 0) {
            JButton btn = new JButton();
            btn.setSize(60, 60);
            btn.setLocation(arr[option1][0],arr[option1][1]);
            btn.setVisible(true);

            btn.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));

            Board.add(btn);

            JButton btn2 = new JButton();
            btn2.setSize(60, 60);
            btn2.setLocation(arr[option2][0],arr[option2][1]);
            btn2.setVisible(true);

            btn2.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));

            Board.add(btn2);

            option1 -= 2;
            option2 -=2;
            option3 -=2;
            apple -=2;

            info.setText("AI has selected 2");
        }else{
            JButton btn = new JButton();
            btn.setSize(60, 60);
            btn.setLocation(arr[option1][0],arr[option1][1]);
            btn.setVisible(true);

            btn.setIcon(new ImageIcon(getClass().getResource("eatenappleblack.png")));

            Board.add(btn);

            option1--;
            option2--;
            option3--;
            apple--;

            info.setText("AI has selected 1");
        }
        if (apple == 1){
            JOptionPane.showMessageDialog(null, "Only one apple left ... Soo sorry...");
            JOptionPane.showMessageDialog(null, "You Lost.. Please exit the game..");
        }
        
    }
    
    
    private void modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeActionPerformed
        // TODO add your handling code here:
        if(mode.getSelectedIndex() == 0){
            isAI = false;
        }else{
            isAI = true;
        }
    }//GEN-LAST:event_modeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Thank you for playing ... H");
        System.exit(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Board.setEnabled(true);
        mode.setEnabled(false);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicActionPerformed
        // TODO add your handling code here:
        if(Music.isSelected() == true){
            playMusic();
        }else{
            closeMusic();
        }
    }//GEN-LAST:event_MusicActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Board;
    private javax.swing.JCheckBox Music;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> mode;
    // End of variables declaration//GEN-END:variables
}
