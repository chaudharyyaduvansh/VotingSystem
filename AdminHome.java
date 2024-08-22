
package com.mycompany.pollingsystem;
public class AdminHome extends javax.swing.JFrame 
{

    String email;
    
    public static String check = "mahima";
    public AdminHome(String email) 
    {
        this.email = email;
        
        initComponents();
        setSize(955, 630);
        setLocation(150, 100);
        System.out.println("  Recieved  " + email );
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255,255,255, 140));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("     ADD CANDIDATES");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(70, 0, 210, 30);

        jLabel16.setBackground(new java.awt.Color(102, 0, 102));
        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 51));
        jLabel16.setText("      Here you can add or remove candidates.");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 30, 380, 20);

        jButton11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 0, 102));
        jButton11.setText("Click Here");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(110, 60, 130, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 300, 370, 90);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255, 140));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel3.setLayout(null);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setText("ADD POSITIONS");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(100, 0, 160, 30);

        jLabel19.setBackground(new java.awt.Color(102, 0, 102));
        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 0, 0));
        jLabel19.setText("      Here you can add or delete the positions.");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(-10, 30, 360, 20);

        jButton10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 0, 102));
        jButton10.setText("Click Here");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(120, 60, 120, 19);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(490, 210, 350, 90);

        jPanel2.setBackground(new java.awt.Color(255,255,255,140));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.setLayout(null);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("REGISTER USERS");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(90, 0, 170, 30);

        jLabel17.setBackground(new java.awt.Color(102, 0, 102));
        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 0));
        jLabel17.setText("      Here you can register the new users.");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(20, 30, 340, 20);

        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 0, 102));
        jButton6.setText("Click Here");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(110, 60, 130, 19);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 120, 370, 90);

        jPanel5.setBackground(new java.awt.Color(255,255, 255, 140));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel5.setLayout(null);

        jLabel23.setBackground(new java.awt.Color(102, 0, 102));
        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 0, 0));
        jLabel23.setText("      Here Admin can update their profile.");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(0, 30, 350, 20);

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 0, 0));
        jLabel22.setText("MANAGE ADMIN");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(90, 0, 160, 30);

        jButton13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 0, 102));
        jButton13.setText("Click Here");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton13);
        jButton13.setBounds(110, 60, 120, 19);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(100, 470, 370, 90);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Welcome To Admin Dashboard");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 70, 320, 40);

        jPanel4.setBackground(new java.awt.Color(255,255,255, 140));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel4.setLayout(null);

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("VIEW RESULT");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(120, 0, 130, 30);

        jLabel21.setBackground(new java.awt.Color(102, 0, 102));
        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 0, 0));
        jLabel21.setText("      Here you can see the polling result.");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(20, 30, 320, 20);

        jButton12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 0, 102));
        jButton12.setText("Click Here");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12);
        jButton12.setBounds(120, 60, 140, 19);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(490, 390, 350, 90);

        panel1.setBackground(new java.awt.Color(51, 0, 102));
        panel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        panel1.add(jLabel4);
        jLabel4.setBounds(20, 10, 50, 50);

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 255));
        jButton7.setText("DashBoard");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel1.add(jButton7);
        jButton7.setBounds(60, 20, 100, 20);

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 204, 255));
        jButton9.setText("Logout");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel1.add(jButton9);
        jButton9.setBounds(850, 20, 80, 20);

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Student Registration");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2);
        jButton2.setBounds(170, 20, 150, 19);

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Add Position");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3);
        jButton3.setBounds(330, 20, 120, 19);

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 255));
        jButton4.setText("Add Candidates");
        jButton4.setActionCommand("Add Candidate");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel1.add(jButton4);
        jButton4.setBounds(460, 20, 130, 20);

        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 255));
        jButton5.setText("View Result");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel1.add(jButton5);
        jButton5.setBounds(580, 20, 140, 19);

        jButton8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 255));
        jButton8.setText("Manage Admin");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel1.add(jButton8);
        jButton8.setBounds(720, 20, 120, 19);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 940, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 60, 940, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new PollResult(email).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new UserRegister(email).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new AddCandidates(email).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Position(email).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new ManageAdmin(email).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         new AdminHome(email).setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         new UserRegister(email).setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
          new Position(email).setVisible(true);
          setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         new AddCandidates(email).setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
          new PollResult(email).setVisible(true);
          setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
          new ManageAdmin(email).setVisible(true);
          setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    
    
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
