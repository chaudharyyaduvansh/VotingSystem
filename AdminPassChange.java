
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.*;
public class AdminPassChange extends javax.swing.JFrame 
{
    String email = null;
    
    char[] currentPass = null;
    char[] newPass = null;
    char[] confirmPass = null;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public AdminPassChange(String email) 
    {
        initComponents();
        this.email = email;
        
        
        con = new DBConnection().createCon();
        if(con == null)
        {
            System.out.println("Connection is not created");
        }
        else
        {
            System.out.println("Connection is created");
        }
        setSize(870, 530);
        setLocation(150, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        label1 = new java.awt.Label();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(252, 252, 252));
        panel1.setPreferredSize(new java.awt.Dimension(300, 250));
        panel1.setLayout(null);

        label4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label4.setText("Current Password");
        panel1.add(label4);
        label4.setBounds(100, 20, 140, 20);

        label5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label5.setText("Confirm New Password");
        panel1.add(label5);
        label5.setBounds(100, 200, 190, 20);

        label6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label6.setText("New Password");
        panel1.add(label6);
        label6.setBounds(100, 110, 123, 20);

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 102));
        jButton2.setText("Go Back");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2);
        jButton2.setBounds(10, 310, 170, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/lock.png")); // NOI18N
        panel1.add(jLabel6);
        jLabel6.setBounds(70, 200, 20, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/key.png")); // NOI18N
        panel1.add(jLabel7);
        jLabel7.setBounds(70, 20, 30, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/lock.png")); // NOI18N
        panel1.add(jLabel8);
        jLabel8.setBounds(70, 110, 20, 20);

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 102));
        jButton4.setText("Update Password");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel1.add(jButton4);
        jButton4.setBounds(270, 310, 170, 30);

        jPasswordField1.setBackground(new java.awt.Color(252, 252, 252));
        jPasswordField1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        panel1.add(jPasswordField1);
        jPasswordField1.setBounds(60, 40, 340, 30);

        jPasswordField2.setBackground(new java.awt.Color(252, 252, 252));
        jPasswordField2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPasswordField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(jPasswordField2);
        jPasswordField2.setBounds(60, 130, 340, 30);

        jPasswordField3.setBackground(new java.awt.Color(252, 252, 252));
        jPasswordField3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPasswordField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(jPasswordField3);
        jPasswordField3.setBounds(60, 220, 340, 30);

        getContentPane().add(panel1);
        panel1.setBounds(210, 110, 450, 350);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 0, 102));
        label1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 255));
        label1.setText("Change Password");
        getContentPane().add(label1);
        label1.setBounds(210, 70, 450, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 30, 50, 40);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 102));
        jButton3.setText("Dashboard");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 30, 160, 30);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/logout.png")); // NOI18N
        jButton5.setText("Logout");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(710, 10, 120, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 870, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ManageAdmin(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            try
            {
            currentPass = jPasswordField1.getPassword();
            newPass = jPasswordField2.getPassword();
            confirmPass = jPasswordField3.getPassword();
            String currentPassword = new String(currentPass).trim();
            String newPassword = new String(newPass).trim();
            String confirmPassword = new String(confirmPass).trim();
            if(currentPassword.equals("")|| newPassword.equals("") || confirmPassword.equals(""))
            {
                JOptionPane.showMessageDialog(null, "All fields are mandatery.");
                return;
            }
            if(!newPassword.equals(confirmPassword))
            {
                JOptionPane.showMessageDialog(null, "NewPassword and ConfirmPassword must be same.");
                return;
            }
            ps = con.prepareStatement("select * from admin where email = ? and password = ?");
            ps.setString(1, email);
            ps.setString(2, currentPassword);
            rs = ps.executeQuery();
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null, "Invalid Current Password");
            }
            else
            {
                ps = con.prepareStatement("update admin set password = ? where email = ?");
                ps.setString(1, newPassword);
                ps.setString(2, email);
                ps.executeUpdate(); 
                JOptionPane.showMessageDialog(null, "Your password is successfully changed. ");
            }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AdminHome(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new AdminLogin(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton5ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private java.awt.Label label1;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
