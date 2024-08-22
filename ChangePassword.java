
package com.mycompany.pollingsystem;
import javax.swing.*;
import java.sql.*;

public class ChangePassword extends javax.swing.JFrame 
{
    char[] currentPass = null;
    char[] newPass = null;
    char[] confirmPass = null;
    
    
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public ChangePassword() 
    {
       
        initComponents();
        con = new DBConnection().createCon();
        if(con == null)
               JOptionPane.showMessageDialog(null, "Connection is not created ");
        
        setSize(790,630);
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
        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(252, 252, 252));
        panel1.setPreferredSize(new java.awt.Dimension(300, 250));
        panel1.setLayout(null);

        label4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label4.setText("Current Password");
        panel1.add(label4);
        label4.setBounds(100, 60, 190, 20);

        label5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label5.setText("Confirm New Password");
        panel1.add(label5);
        label5.setBounds(100, 270, 190, 20);

        label6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label6.setText("New Password");
        panel1.add(label6);
        label6.setBounds(100, 160, 123, 20);

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 102));
        jButton2.setText("Cancel");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2);
        jButton2.setBounds(10, 400, 170, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/lock.png")); // NOI18N
        panel1.add(jLabel6);
        jLabel6.setBounds(70, 270, 20, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/key.png")); // NOI18N
        panel1.add(jLabel7);
        jLabel7.setBounds(70, 60, 30, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/lock.png")); // NOI18N
        panel1.add(jLabel8);
        jLabel8.setBounds(70, 160, 20, 20);

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
        jButton4.setBounds(270, 400, 170, 30);

        jPasswordField1.setBackground(new java.awt.Color(252, 252, 252));
        jPasswordField1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        panel1.add(jPasswordField1);
        jPasswordField1.setBounds(70, 80, 340, 30);

        jPasswordField2.setBackground(new java.awt.Color(252, 252, 252));
        jPasswordField2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPasswordField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(jPasswordField2);
        jPasswordField2.setBounds(70, 180, 340, 30);

        jPasswordField3.setBackground(new java.awt.Color(252, 252, 252));
        jPasswordField3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPasswordField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(jPasswordField3);
        jPasswordField3.setBounds(60, 300, 340, 30);

        getContentPane().add(panel1);
        panel1.setBounds(140, 100, 450, 440);

        panel2.setBackground(new java.awt.Color(204, 204, 255));
        panel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("Change Password");
        panel2.add(jLabel1);
        jLabel1.setBounds(120, 10, 210, 30);

        getContentPane().add(panel2);
        panel2.setBounds(140, 50, 450, 50);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 10, 50, 0);

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 102));
        jButton3.setText("View Profile");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(630, 20, 120, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 780, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        new UserLogin().setVisible(true);
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
            
            
            if(currentPassword.equals("") || newPassword.equals("") || confirmPassword.equals(""))
            
                {
                    JOptionPane.showMessageDialog(null, "All fields are mandatery, please complete the details");
                    return;
                }
            if(!newPassword.equals(confirmPassword))
            {
                JOptionPane.showMessageDialog(null, "New Password and Confirm password must be same.");
                    return;
            }
            
                ps = con.prepareStatement("select * from student where mobile = ? and password = ?");
                ps.setString(1, UserLogin.userId);
                ps.setString(2, currentPassword);
                rs = ps.executeQuery();
                if(!rs.next())
                    JOptionPane.showMessageDialog(null, "Please enter a valid password");
                else
                {
                    
                    ps = con.prepareStatement("update student set password = ? where mobile = ?");
                    ps.setString(1, newPassword);
                    
                    ps.setString(2, UserLogin.userId);
                    ps.executeUpdate(); 
                    
                    JOptionPane.showMessageDialog(null, "Your password change successfully ");
                }
                
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            new Profile().setVisible(true);
            setVisible(false);
            new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
