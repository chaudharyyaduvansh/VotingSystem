
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.*;
public class AdminLogin extends javax.swing.JFrame 
{
     Connection con = null;
     PreparedStatement ps = null;
     ResultSet rs = null;
     String email = "admin@gmail.com";
     char[] password = null;
    
    public AdminLogin(String email) 
    {
        con = new DBConnection().createCon();
        if(con == null)
               JOptionPane.showMessageDialog(null, "Connection is not created ");
        
        
        initComponents();
        this.email = email;
        setSize(919, 570);
        setLocation(150, 100);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        label4 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton9 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label5 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 102));
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(jTextField1);
        jTextField1.setBounds(40, 130, 280, 30);

        jButton2.setBackground(new java.awt.Color(51, 0, 102));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Login");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2);
        jButton2.setBounds(40, 280, 280, 30);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(51, 0, 102));
        label4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Admin Login");
        panel1.add(label4);
        label4.setBounds(0, 0, 380, 40);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("Password");
        panel1.add(jLabel1);
        jLabel1.setBounds(50, 190, 90, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setText("Email_id");
        panel1.add(jLabel2);
        jLabel2.setBounds(50, 110, 70, 20);

        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(jPasswordField1);
        jPasswordField1.setBounds(40, 220, 270, 30);

        getContentPane().add(panel1);
        panel1.setBounds(100, 160, 380, 360);

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 0, 102));
        jButton9.setText("ADMIN");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(740, 60, 120, 30);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("Collage Voting System");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 50, 270, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 50, 50, 50);

        label5.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(label5);
        label5.setBounds(610, 360, 310, 80);

        jLabel3.setBackground(new java.awt.Color(51, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -4, 920, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try
      {
                
                email = jTextField1.getText().trim();
                password = jPasswordField1.getPassword();
                String pass = new String(password).trim();
                if(email.equals("") || pass.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "email id and password cant be empty");
                    return;
                }
                ps = con.prepareStatement("select * from admin where email = ? and password = ?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ps.setString(1, email);
                ps.setString(2, pass);
                rs = ps.executeQuery();
                if(!rs.next())
                    JOptionPane.showMessageDialog(null, "Please enter a valid user id or password");
                else
                {
                    new AdminHome(email).setVisible(true);
                    setVisible(false);
                    new DBConnection().closeCon(con);
                }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    catch(Exception e)
    {
        System.out.println(e);
    }
       
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
