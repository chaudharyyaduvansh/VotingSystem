
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.*;
public class ManageAdmin extends javax.swing.JFrame 
{
    String email = null;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public ManageAdmin(String email) 
    {
        con = new DBConnection().createCon();
        if(con == null)
        System.out.println("Connection is not created.");
        else
            System.out.println("Connection is created.");
        initComponents();
        this.email = email;
        setSize(950, 550);
        setLocation(150, 100);
        getDetail();
    }
    
    public void getDetail()
    {
        try
            {
                
                ps = con.prepareStatement("select * from admin where email = ?");
                ps.setString(1, email);
                rs = ps.executeQuery();
                rs.next();
                        
                String aName = rs.getString("name");
                String aEmail = rs.getString("email");
                System.out.println(aName +" " +aEmail);
               
                
                jTextField1.setText(aName);
                jTextField2.setText(aEmail);
            }
        catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Error : Can't fatch data.");
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("Email_Id");
        panel1.add(jLabel1);
        jLabel1.setBounds(140, 140, 70, 20);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(jTextField1);
        jTextField1.setBounds(130, 70, 340, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setText("Name");
        panel1.add(jLabel2);
        jLabel2.setBounds(140, 50, 60, 20);

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(jTextField2);
        jTextField2.setBounds(130, 160, 340, 30);

        jButton3.setBackground(new java.awt.Color(51, 0, 102));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Update Account");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3);
        jButton3.setBounds(210, 260, 160, 30);

        getContentPane().add(panel1);
        panel1.setBounds(170, 100, 590, 350);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 0, 50, 50);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 0, 102));
        label1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 255));
        label1.setText("Manage Adminstrator");
        getContentPane().add(label1);
        label1.setBounds(170, 60, 590, 40);

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("Change Password");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 470, 160, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 102));
        jButton2.setText("Dashboard");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 10, 160, 30);

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 102));
        jButton4.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/logout.png")); // NOI18N
        jButton4.setText("Logout");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(760, 10, 120, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 940, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          new AdminPassChange(email).setVisible(true);
          setVisible(false);
          new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try
          {
          String name = jTextField1.getText().trim();
          String newEmail = jTextField2.getText().trim();
          if(name.equals("") || newEmail.equals(""))
          {
              JOptionPane.showMessageDialog(null, "All fields are mandatery.");
          }
          
          else
          {
          ps = con.prepareStatement("update admin set name = ?, email = ? where email = ?");
          ps.setString(1, name);
          ps.setString(2, newEmail);
          ps.setString(3, email);
          int x = ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Account Updated" + x);
          }
          }
          catch(SQLException e)
          {
              System.out.println(e);
          }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           new AdminHome(email).setVisible(true);
           setVisible(false);
           new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new AdminLogin(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton4ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
