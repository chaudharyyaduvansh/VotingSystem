
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.*;
public class UserLogin extends javax.swing.JFrame 
{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; 
        public static String userId = null;
        public static String userName = null;
        char[] password = null;
        String pass = null;
        
       
    public UserLogin() 
    {
        con = new DBConnection().createCon();
       
        if(con == null)
        {
               JOptionPane.showMessageDialog(null, "Connection is not created ");
               return;
        }
        
        initComponents();
        setSize(930,600);
        setLocation(150, 100);
        setResizable(false);
             
         
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButton4 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        label2 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label5 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 3));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Collage Voting System");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 40, 270, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 30, 50, 50);

        label1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(label1);
        label1.setBounds(610, 360, 310, 80);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 102));
        jButton4.setText("STUDENT");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(710, 50, 120, 31);

        panel1.setBackground(java.awt.Color.white);
        panel1.setLayout(null);

        label2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        label2.setText("Password");
        panel1.add(label2);
        label2.setBounds(100, 190, 80, 20);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel1.add(jTextField1);
        jTextField1.setBounds(60, 120, 280, 30);

        label3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        label3.setText("User_Id");
        panel1.add(label3);
        label3.setBounds(100, 100, 80, 20);

        jButton2.setBackground(new java.awt.Color(51, 0, 102));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Login");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2);
        jButton2.setBounds(150, 290, 110, 30);
        panel1.add(jLabel5);
        jLabel5.setBounds(70, 100, 30, 20);
        panel1.add(jLabel6);
        jLabel6.setBounds(70, 190, 20, 20);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(51, 0, 102));
        label4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Student Login");
        panel1.add(label4);
        label4.setBounds(0, 0, 400, 40);

        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(jPasswordField1);
        jPasswordField1.setBounds(60, 220, 280, 30);

        getContentPane().add(panel1);
        panel1.setBounds(80, 150, 400, 370);

        jButton5.setBackground(new java.awt.Color(242, 242, 242));
        jButton5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 0, 102));
        jButton5.setText("Forget Password ?");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(190, 520, 190, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 920, 580);

        label5.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(label5);
        label5.setBounds(610, 360, 310, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
                userId = jTextField1.getText().trim();
                password = jPasswordField1.getPassword();
                pass = new String(password).trim();
                if(userId.equals("") || pass.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "User id and password cant be empty");
                    return;
                }
                ps = con.prepareStatement("select * from student where mobile = ? and password = ?");
                ps.setString(1, userId);
                ps.setString(2, pass);
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    userName = rs.getString("name");
                    new UserDash().setVisible(true);
                    setVisible(false);
                    new DBConnection().closeCon(con);
                }
                else
                    JOptionPane.showMessageDialog(null, "Please enter a valid user id or password");
                
                
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        userId = jTextField1.getText();
        System.out.println(userId);
        try
        {
        ps = con.prepareStatement("select * from student where mobile = ?");
        ps.setString(1, userId);
        rs = ps.executeQuery();
        if(!rs.next())
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid user id.");
        }
        else
        {
             new ForgetPassword().setVisible(true);
             setVisible(false);
             new DBConnection().closeCon(con);
        }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error : " +e);
        }
        
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
