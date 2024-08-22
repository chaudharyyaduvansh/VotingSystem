
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.*;

public class AddCandidates extends javax.swing.JFrame 
{
    String email;
    Connection con = null;
    PreparedStatement ps = null;
    PreparedStatement ps1 = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    Object position = null;
    
    public AddCandidates(String email)
    {
        initComponents();
        setSize(1136,560);
        setLocation(150, 100);
        this.email = email;
        con = new DBConnection().createCon();
        if(con == null)
        {
            JOptionPane.showMessageDialog(null, "Connection is not created");
        }
        
        getPosChoice();
        getPos();
    }

    public void getPosChoice()
    {
        jComboBox1.removeAllItems();
        try
        {
           
            ps = con.prepareStatement("select * from position ");
            rs = ps.executeQuery();
            while(rs.next())
            {
               String s = rs.getString("position_name").toUpperCase(); 
               jComboBox1.addItem(s);
            }
        }
        catch(SQLException ee)
        {
            JOptionPane.showMessageDialog(null, "Error : server error.");
        }
    }
    public void getPos()
    {
        
        list1.removeAll();
        try
        {
            ps = con.prepareStatement("select * from student s  inner join candidate c on s.mobile = c.mobile");
            rs = ps.executeQuery();
            String space = "";
            while (rs.next())
                {
                    String mobile = rs.getString("mobile");
                    String pos = rs.getString("position");
                    String name = rs.getString("name").toUpperCase();
                    
                    
                    for(int i = 1 ;i<=22-(name.length()); i++)
                            space = space + " ";
                    String result = (mobile +"             "+name+space+pos);
                    
                   
                    list1.add(result);
                    space = "";
                }
            
        jTextField1.setText("");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        panel3 = new java.awt.Panel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        list1 = new java.awt.List();
        jButton2 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Candidate Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel4.setBackground(new java.awt.Color(51, 0, 102));
        panel4.setLayout(null);

        jButton3.setBackground(new java.awt.Color(51, 0, 102));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 255));
        jButton3.setText("STUDENT REGISTRATION");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel4.add(jButton3);
        jButton3.setBounds(200, 20, 200, 17);

        jButton4.setBackground(new java.awt.Color(51, 0, 102));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 255));
        jButton4.setText(" ADD POSITIONS");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel4.add(jButton4);
        jButton4.setBounds(400, 20, 160, 17);

        jButton5.setBackground(new java.awt.Color(51, 0, 102));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 255));
        jButton5.setText("ADD CANDIDATE");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel4.add(jButton5);
        jButton5.setBounds(560, 20, 170, 20);

        jButton6.setBackground(new java.awt.Color(51, 0, 102));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 255));
        jButton6.setText("MANAGE ADMIN");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel4.add(jButton6);
        jButton6.setBounds(880, 20, 140, 17);

        jButton7.setBackground(new java.awt.Color(51, 0, 102));
        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 255));
        jButton7.setText("VIEW RESULT");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel4.add(jButton7);
        jButton7.setBounds(730, 20, 140, 17);

        jButton8.setBackground(new java.awt.Color(51, 0, 102));
        jButton8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 255));
        jButton8.setText("DASHBOARD");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel4.add(jButton8);
        jButton8.setBounds(60, 20, 120, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        panel4.add(jLabel4);
        jLabel4.setBounds(10, 10, 50, 50);

        jButton9.setBackground(new java.awt.Color(51, 0, 102));
        jButton9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 204, 255));
        jButton9.setText("LOGOUT");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel4.add(jButton9);
        jButton9.setBounds(1030, 20, 100, 17);

        getContentPane().add(panel4);
        panel4.setBounds(0, 0, 1140, 60);

        panel1.setBackground(new java.awt.Color(204, 204, 255));
        panel1.setLayout(null);

        label2.setBackground(new java.awt.Color(250, 250, 250));
        label2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label2.setText("Student_id                     Candidate Name                     Candidate Position           ");
        panel1.add(label2);
        label2.setBounds(490, 90, 620, 50);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(51, 0, 102));
        label3.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        label3.setForeground(new java.awt.Color(204, 204, 255));
        label3.setText("Available Candidates");
        panel1.add(label3);
        label3.setBounds(490, 30, 620, 60);

        panel3.setBackground(new java.awt.Color(250, 250, 250));
        panel3.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(250, 250, 250));
        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField1.setHighlighter(null);
        panel3.add(jTextField1);
        jTextField1.setBounds(60, 190, 350, 40);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("Add");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel3.add(jButton1);
        jButton1.setBounds(60, 260, 350, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Candidate Position ");
        panel3.add(jLabel3);
        jLabel3.setBounds(60, 50, 180, 30);

        jComboBox1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRESIDENT", "SECRETARY", "GENERAL SECRETARY", "UNIVERSITY REPRESENTATIVE", "TREASURER" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        panel3.add(jComboBox1);
        jComboBox1.setBounds(60, 80, 350, 30);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("Candidate Mobile");
        panel3.add(jLabel5);
        jLabel5.setBounds(60, 160, 180, 30);

        panel1.add(panel3);
        panel3.setBounds(20, 90, 470, 350);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 0, 102));
        label1.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 255));
        label1.setText("Add New Candidates");
        panel1.add(label1);
        label1.setBounds(20, 30, 470, 60);

        list1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        panel1.add(list1);
        list1.setBounds(490, 140, 620, 300);

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 102));
        jButton2.setText("Delete");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2);
        jButton2.setBounds(750, 440, 140, 22);

        getContentPane().add(panel1);
        panel1.setBounds(0, 60, 1140, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new UserRegister(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Position(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new AddCandidates(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         new ManageAdmin(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new PollResult(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
                 
                   new AdminHome(email).setVisible(true);
                   setVisible(false);
                   new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try
            {
            position = jComboBox1.getSelectedItem();
            String pos = position.toString();
            String mobile = jTextField1.getText();
            if(mobile.equals(""))
            {
                JOptionPane.showMessageDialog(null, "mobile field can't be empty");
                return;
            }
            
            ps = con.prepareStatement("select * from student where mobile = ?");
            ps.setString(1, mobile);
            rs = ps.executeQuery();
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null, "The candidate is not valid student of collage.");
            }
                
                ps = con.prepareStatement("insert into candidate (mobile, position) values(?, ?)");
                ps.setString(1, mobile);
                ps.setString(2, pos);
                int x = ps.executeUpdate(); 
                if(x >=1)
                {
                      getPos();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error : candidate not created.");
                }
            }
            catch(SQLIntegrityConstraintViolationException e)
            {
                JOptionPane.showMessageDialog(null, "Error : The candidate alredy added.");
            }
            
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, " Error : "+e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try
        {
            
        String item = list1.getSelectedItem();
        String[] mobile = item.split("\\s");
        String uId = mobile[0];
        ps = con.prepareStatement("Delete from candidate where mobile = ?");
        ps.setString(1, uId);
        int x = ps.executeUpdate();
        if(x >= 1)
        {
           list1.remove(item);
        }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new AdminLogin(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.List list1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
