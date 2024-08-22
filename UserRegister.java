
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.*;
public class UserRegister extends javax.swing.JFrame 
{
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String email = null;
    
    public UserRegister(String email) 
    {
        this.email = email;
        
        initComponents();
        setSize(861, 600);
        setLocation(150, 100);
        con = new DBConnection().createCon();
        if(con == null)
               System.out.println("Connection is not created " + con);
        
        else
               System.out.println("Connection is created " + con);
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new java.awt.Panel();
        label2 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label7 = new java.awt.Label();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel4.setBackground(new java.awt.Color(255, 255, 255));
        panel4.setLayout(null);

        label2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        label2.setText("Mobile");
        panel4.add(label2);
        label2.setBounds(100, 110, 60, 20);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel4.add(jTextField1);
        jTextField1.setBounds(60, 50, 310, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/telephone.png")); // NOI18N
        panel4.add(jLabel1);
        jLabel1.setBounds(60, 100, 30, 30);

        label4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        label4.setText("User_Name");
        panel4.add(label4);
        label4.setBounds(90, 30, 90, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/user.png")); // NOI18N
        panel4.add(jLabel3);
        jLabel3.setBounds(60, 30, 20, 20);

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        panel4.add(jTextField2);
        jTextField2.setBounds(60, 130, 310, 30);

        jTextField3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        panel4.add(jTextField3);
        jTextField3.setBounds(60, 200, 310, 30);

        label5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        label5.setText("Email_id");
        panel4.add(label5);
        label5.setBounds(90, 180, 90, 20);

        label6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        label6.setText("Confirm Password");
        panel4.add(label6);
        label6.setBounds(90, 320, 130, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/email (1).png")); // NOI18N
        panel4.add(jLabel4);
        jLabel4.setBounds(60, 180, 20, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/lock.png")); // NOI18N
        panel4.add(jLabel5);
        jLabel5.setBounds(60, 320, 20, 20);

        label7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        label7.setText("Password");
        panel4.add(label7);
        label7.setBounds(90, 250, 90, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/lock.png")); // NOI18N
        panel4.add(jLabel6);
        jLabel6.setBounds(60, 250, 20, 20);

        jButton2.setBackground(new java.awt.Color(51, 0, 102));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Register");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel4.add(jButton2);
        jButton2.setBounds(60, 420, 310, 23);

        jPasswordField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel4.add(jPasswordField1);
        jPasswordField1.setBounds(60, 280, 310, 30);

        jPasswordField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPasswordField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel4.add(jPasswordField2);
        jPasswordField2.setBounds(60, 350, 310, 30);

        getContentPane().add(panel4);
        panel4.setBounds(210, 90, 430, 460);

        panel1.setBackground(new java.awt.Color(51, 0, 102));
        panel1.setLayout(null);

        label1.setFont(new java.awt.Font("Serif", 1, 32)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 255));
        label1.setText("Student Registration");
        panel1.add(label1);
        label1.setBounds(310, 10, 280, 50);

        jButton1.setBackground(new java.awt.Color(51, 0, 102));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("LOGOUT");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1);
        jButton1.setBounds(720, 30, 140, 17);

        jButton3.setBackground(new java.awt.Color(51, 0, 102));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 255));
        jButton3.setText("DASHBOARD");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3);
        jButton3.setBounds(100, 30, 110, 17);

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        panel1.add(jLabel7);
        jLabel7.setBounds(20, 10, 50, 60);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 870, 80);

        label3.setBackground(new java.awt.Color(213, 192, 171));
        getContentPane().add(label3);
        label3.setBounds(644, 360, 230, 210);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 870, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               new AdminLogin(email).setVisible(true);
               setVisible(false);
               new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
                String name = jTextField1.getText();
                String mobile = jTextField2.getText();
                String email1 = jTextField3.getText();
                String pass = new String(jPasswordField1.getPassword());
                String confirmPass = new String(jPasswordField2.getPassword());
                System.out.println(name+" "+ mobile);
                if(name.equals("") || mobile.equals("") || email1.equals("") || pass.equals("")|| confirmPass.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "All the fields are mandatery, Complete the details");
                    return;         
                }
                if(!pass.equals(confirmPass))
                {
                    JOptionPane.showMessageDialog(null,"Password and confirm should be same.");
                    return;
                }
                
                
                if(mobile.length() != 10)
                {
                    JOptionPane.showMessageDialog(null,"Mobile should be ten digit.");
                    return;
                }
                double d = Double.parseDouble(mobile);
                
                ps = con.prepareStatement("select * from student where mobile = ?");
                ps.setString(1, mobile);
                rs = ps.executeQuery();
                if(rs.next())
                    JOptionPane.showMessageDialog(null, "This user_id already exist");
                else
                {
                    ps = con.prepareStatement("insert into student(name, mobile,email, password) values(?, ?,?,?)");
                    ps.setString(1, name);
                    ps.setString(2, mobile);
                    ps.setString(3, email1);
                    ps.setString(4, pass);
                    int x = ps.executeUpdate(); 
                    if(x >= 1){
                    JOptionPane.showMessageDialog(null, "User Registered");
                    }
                }
        }
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid mobile number!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AdminHome(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Panel panel1;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
