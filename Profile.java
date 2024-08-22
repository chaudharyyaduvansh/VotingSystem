
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.JOptionPane;

public class Profile extends javax.swing.JFrame 
{
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public Profile() 
    {
        initComponents();
        con = new DBConnection().createCon();
        if(con == null)
            System.out.println("Connection is not created");
        setSize(917,630);
        setLocation(150, 100);
        textField1.setEchoChar('*');
        getDetail();
        
    }

    public void getDetail()
    {
         try
        {
        ps = con.prepareStatement("select * from student where mobile = ?");
        ps.setString(1, UserLogin.userId);
        rs = ps.executeQuery();
        rs.next();
        String name = rs.getString("name");
        String emailId = rs.getString("email");
        
        jTextField3.setText(name);
        jTextField5.setText(emailId);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error : "+e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        label4 = new java.awt.Label();
        jTextField3 = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(204, 204, 255));
        panel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("My Profile");
        panel1.add(jLabel1);
        jLabel1.setBounds(160, 10, 140, 30);

        getContentPane().add(panel1);
        panel1.setBounds(240, 100, 450, 50);

        panel4.setBackground(new java.awt.Color(102, 102, 255));
        panel4.setLayout(null);

        label4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label4.setText("Name");
        panel4.add(label4);
        label4.setBounds(90, 20, 50, 20);

        jTextField3.setBackground(new java.awt.Color(252, 252, 252));
        jTextField3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        panel4.add(jTextField3);
        jTextField3.setBounds(60, 40, 340, 40);

        label6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label6.setText("Email_id");
        panel4.add(label6);
        label6.setBounds(90, 110, 70, 20);

        jTextField5.setBackground(new java.awt.Color(252, 252, 252));
        jTextField5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        panel4.add(jTextField5);
        jTextField5.setBounds(60, 130, 340, 40);
        panel4.add(jLabel9);
        jLabel9.setBounds(60, 20, 0, 20);
        panel4.add(jLabel8);
        jLabel8.setBounds(60, 110, 20, 20);

        jButton2.setBackground(new java.awt.Color(51, 0, 102));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Update");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel4.add(jButton2);
        jButton2.setBounds(140, 320, 160, 30);

        jComboBox.setBackground(new java.awt.Color(252, 252, 252));
        jComboBox.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jComboBox.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's your Favorite color?", "What's your favorite pet name?", "Who is  your favorite author? ", "What was your dream job as a child?", "What is your first teacher name?" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        panel4.add(jComboBox);
        jComboBox.setBounds(60, 210, 340, 40);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Select your Question");
        panel4.add(jLabel5);
        jLabel5.setBounds(70, 180, 250, 15);

        textField1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        panel4.add(textField1);
        textField1.setBounds(60, 260, 340, 40);

        jButton4.setBackground(new java.awt.Color(51, 0, 102));
        jButton4.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 102));
        jButton4.setText("Change Password");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel4.add(jButton4);
        jButton4.setBounds(150, 370, 150, 30);

        getContentPane().add(panel4);
        panel4.setBounds(240, 150, 450, 420);

        jButton1.setBackground(new java.awt.Color(51, 0, 102));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("logout");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 20, 120, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 10, 50, 50);

        jButton3.setBackground(new java.awt.Color(51, 0, 102));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 102));
        jButton3.setText("Dashboard");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 20, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 610);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 200, 50, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new UserLogin().setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try
            {
        String name = jTextField3.getText();
            String email = jTextField5.getText();
            String sq = jComboBox.getSelectedItem().toString();
            String sa = textField1.getText();
            if(name.equals("") || email.equals("") || sq.equals("")||sa.equals(""))
            {
                JOptionPane.showMessageDialog(null, "All fields are mandatery");
                return;
            }
            ps = con.prepareStatement("update student set name = ?, email = ?, sq = ?, sa = ? where mobile = ?");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, sq);
            ps.setString(4, sa);
            ps.setString(5, UserLogin.userId);
             
            int x = ps.executeUpdate();
            if(x >= 1)
            {
                JOptionPane.showMessageDialog(null, "Your detail updated.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error : Detail is not updated");
            }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Error : "+ e);
            }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            new UserDash().setVisible(true);
            setVisible(false);
            new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            new ChangePassword().setVisible(true);
            setVisible(false);
            new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Panel panel1;
    private java.awt.Panel panel4;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
