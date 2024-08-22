
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.*;
public class ForgetPassword extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public ForgetPassword() {
        initComponents();
        con = new DBConnection().createCon();
        if(con == null)
        {
            JOptionPane.showMessageDialog(null, "Connection is created.");
        }
        setSize(750, 660);
        setLocation(150, 100);
        setResizable(false);
        getQue();
    }
    public void getQue()
    {
        try
        {
        ps = con.prepareStatement("select * from student where mobile = ?");
        ps.setString(1, UserLogin.userId);
        rs = ps.executeQuery();
        rs.next();
        String que = rs.getString("sq");
        
        label1.setText(que);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error : "+e);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        label1 = new java.awt.Label();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel2.setBackground(new java.awt.Color(51, 0, 102));
        panel2.setLayout(null);
        getContentPane().add(panel2);
        panel2.setBounds(80, 0, 100, 620);

        panel3.setBackground(new java.awt.Color(204, 204, 255));
        panel3.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        panel3.add(jLabel6);
        jLabel6.setBounds(10, 10, 50, 50);

        getContentPane().add(panel3);
        panel3.setBounds(0, 0, 80, 90);

        panel4.setBackground(new java.awt.Color(250, 250, 250));
        panel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Forget Your Password ?");
        panel4.add(jLabel2);
        jLabel2.setBounds(30, 10, 340, 50);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Confirm Password");
        panel4.add(jLabel4);
        jLabel4.setBounds(50, 290, 120, 20);

        jButton1.setBackground(new java.awt.Color(252, 252, 252));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("Back to Login");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel4.add(jButton1);
        jButton1.setBounds(50, 420, 310, 30);

        jButton2.setBackground(new java.awt.Color(51, 0, 102));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Okay");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel4.add(jButton2);
        jButton2.setBounds(50, 360, 310, 30);

        jPasswordField1.setBackground(new java.awt.Color(252, 252, 252));
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel4.add(jPasswordField1);
        jPasswordField1.setBounds(50, 240, 310, 30);

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        panel4.add(jTextField2);
        jTextField2.setBounds(50, 150, 310, 30);

        jLabel5.setText("Answer your quetion.");
        panel4.add(jLabel5);
        jLabel5.setBounds(50, 80, 130, 17);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("Enter Password");
        panel4.add(jLabel7);
        jLabel7.setBounds(50, 220, 120, 20);

        jPasswordField2.setBackground(new java.awt.Color(252, 252, 252));
        jPasswordField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel4.add(jPasswordField2);
        jPasswordField2.setBounds(50, 310, 310, 30);

        label1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        panel4.add(label1);
        label1.setBounds(50, 110, 310, 30);

        getContentPane().add(panel4);
        panel4.setBounds(250, 130, 410, 460);

        panel1.setBackground(new java.awt.Color(204, 204, 255));
        panel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("Forget Password");
        panel1.add(jLabel1);
        jLabel1.setBounds(140, 30, 280, 40);

        getContentPane().add(panel1);
        panel1.setBounds(180, 0, 560, 90);

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 90, 740, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new UserLogin().setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try
         {
            ps = con.prepareStatement("select * from student where mobile = ?");
            ps.setString(1, UserLogin.userId);
            rs = ps.executeQuery();
            rs.next();
            String ans = rs.getString("sa");
            String answer = jTextField2.getText();
            
            char[] pass = jPasswordField1.getPassword();
            char[] conPass = jPasswordField2.getPassword();
            String password = new String(pass);
            String conPassword = new String(conPass);
            if(password.equals("") || conPassword.equals("") || answer.equals(""))
         {
              JOptionPane.showMessageDialog(null, "All fields are mendatery.");
              return;
         }
            if(!ans.equals(answer))
            {
                JOptionPane.showMessageDialog(null, "Your answer is wrong.");
                return;
            }
         if(!password.equals(conPassword))
         {
              JOptionPane.showMessageDialog(null, "Password and Confirm Password should be same.");
              return;
         }
         
         
             ps = con.prepareStatement("update student set password = ? where mobile = ?");
             ps.setString(1, password);
             ps.setString(2, UserLogin.userId);
             int x = ps.executeUpdate();
             if(x >= 1)
             {
                 JOptionPane.showMessageDialog(null, "Your password is updated.");
             }
         }
         catch(SQLException e)
         {
             
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
