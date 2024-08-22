
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.*;


public class Position extends javax.swing.JFrame 
{

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String email;
   
    public Position(String email) 
    {
        this.email = email;
        initComponents();
        setSize(1160, 560);
        setLocation(150, 100);
        System.out.println(" Received in position");
        con = new DBConnection().createCon();
        if(con == null)
               System.out.println("Connection is not created " + con);
        getPos();
    }
    
    public void getPos()
    {
        list1.removeAll();
        try
        {
            ps = con.prepareStatement("Select * from position");
            rs = ps.executeQuery();
            while (rs.next())
                {
                    String name = rs.getString("position_name").toUpperCase();
                    int id = rs.getInt("position_id");
                    String result = (id +"                                "+name);
                    list1.add(result);
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

        panel1 = new java.awt.Panel();
        label3 = new java.awt.Label();
        panel3 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jButton9 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        list1 = new java.awt.List();
        panel4 = new java.awt.Panel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(204, 204, 255));
        panel1.setLayout(null);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(51, 0, 102));
        label3.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        label3.setForeground(new java.awt.Color(204, 204, 255));
        label3.setText("Available Positions");
        panel1.add(label3);
        label3.setBounds(500, 10, 620, 60);

        panel3.setBackground(new java.awt.Color(250, 250, 250));
        panel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Position Name");
        panel3.add(jLabel2);
        jLabel2.setBounds(150, 60, 170, 40);

        jTextField1.setBackground(new java.awt.Color(250, 250, 250));
        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jTextField1.setHighlighter(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel3.add(jTextField1);
        jTextField1.setBounds(60, 140, 340, 40);

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
        jButton1.setBounds(60, 220, 340, 30);

        panel1.add(panel3);
        panel3.setBounds(30, 70, 470, 350);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 0, 102));
        label1.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 255));
        label1.setText("Add New Position");
        panel1.add(label1);
        label1.setBounds(30, 10, 470, 60);

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 0, 102));
        jButton9.setText("Delete");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel1.add(jButton9);
        jButton9.setBounds(700, 430, 210, 30);

        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label2.setForeground(new java.awt.Color(51, 0, 102));
        label2.setText("Position_Id                                                  Position_Name");
        panel1.add(label2);
        label2.setBounds(500, 70, 620, 30);

        list1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        list1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        panel1.add(list1);
        list1.setBounds(500, 100, 620, 320);

        getContentPane().add(panel1);
        panel1.setBounds(0, 60, 1150, 470);

        panel4.setBackground(new java.awt.Color(51, 0, 102));
        panel4.setLayout(null);

        jButton2.setBackground(new java.awt.Color(51, 0, 102));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("LOGOUT");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel4.add(jButton2);
        jButton2.setBounds(1030, 20, 100, 17);

        jButton3.setBackground(new java.awt.Color(51, 0, 102));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 255));
        jButton3.setText("REGISTER USER");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel4.add(jButton3);
        jButton3.setBounds(220, 20, 130, 17);

        jButton4.setBackground(new java.awt.Color(51, 0, 102));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 255));
        jButton4.setText("POSITIONS");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel4.add(jButton4);
        jButton4.setBounds(370, 20, 160, 20);

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
        jButton5.setBounds(530, 20, 170, 20);

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
        jButton7.setBounds(720, 20, 140, 17);

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
        jButton8.setBounds(70, 20, 120, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        panel4.add(jLabel4);
        jLabel4.setBounds(10, 10, 50, 40);

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

        getContentPane().add(panel4);
        panel4.setBounds(0, 0, 1150, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new AdminLogin(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try
        {
              
                String position = jTextField1.getText();
                System.out.println(position);
                if(position.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Position field can't be empty");
                    return;
                }
                
               
                ps = con.prepareStatement("insert into position (position_name) values(?)");
                ps.setString(1, position);
                int x = ps.executeUpdate(); 
                if(x >=1)
                {
                      getPos();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error : Position not created.");
                }
                
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try
        {
            
        String item = list1.getSelectedItem();
        String[] pid = item.split("\\s");
        int pId = Integer.parseInt(pid[0]);
        ps = con.prepareStatement("Delete from position where position_id = ?");
        ps.setInt(1, pId);
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
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new ManageAdmin(email).setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton6ActionPerformed

    
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
