    
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.JOptionPane;

public class PollResult extends javax.swing.JFrame 
{
   
    
    String email;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public PollResult(String email) 
    {
        this.email = email;
         con = new DBConnection().createCon();
         if(con == null)
         {
             JOptionPane.showMessageDialog(null, "Connection is not created.");
             return;
         }
        initComponents();
        setSize(970,555);
        setLocation(150, 100);
        getPos();
    }
     public void getPos()
    {
        jComboBox1.removeAllItems();
        String s;
        try
        {
           
            ps = con.prepareStatement("select * from position ");
            rs = ps.executeQuery();
            while(rs.next())
            {
               s = rs.getString("position_name").toUpperCase(); 
               jComboBox1.addItem(s);
            }
        }
        catch(SQLException ee)
        {
            JOptionPane.showMessageDialog(null, "Error : server error.");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        list1 = new java.awt.List();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(252, 252, 252));
        panel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(252, 252, 252));
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/voting-results.png")); // NOI18N
        panel1.add(jLabel1);
        jLabel1.setBounds(70, 70, 190, 170);

        jLabel3.setBackground(new java.awt.Color(252, 252, 252));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("Select Position");
        panel1.add(jLabel3);
        jLabel3.setBounds(80, 240, 210, 40);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("please select the position which you want  to see the result.");
        panel1.add(jLabel2);
        jLabel2.setBounds(20, 280, 390, 20);

        jComboBox1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panel1.add(jComboBox1);
        jComboBox1.setBounds(20, 330, 330, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1);
        jButton1.setBounds(20, 380, 330, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        panel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 50, 40);

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 0, 102));
        jButton8.setText("DASHBOARD");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel1.add(jButton8);
        jButton8.setBounds(90, 20, 110, 17);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 102));
        jButton3.setText("REGISTER USER");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3);
        jButton3.setBounds(230, 20, 130, 17);

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 102));
        jButton4.setText("POSITIONS");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel1.add(jButton4);
        jButton4.setBounds(400, 20, 90, 17);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 0, 102));
        jButton5.setText("ADD CANDIDATE");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel1.add(jButton5);
        jButton5.setBounds(540, 20, 130, 20);

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 0, 102));
        jButton7.setText("VIEW RESULT");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel1.add(jButton7);
        jButton7.setBounds(710, 20, 110, 20);

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 102));
        jButton2.setText("LOGOUT");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2);
        jButton2.setBounds(840, 20, 100, 20);

        label3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        label3.setForeground(new java.awt.Color(51, 0, 102));
        label3.setText("Candidate Id                         Candidate Name                  Votes");
        panel1.add(label3);
        label3.setBounds(360, 150, 520, 30);

        list1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });
        panel1.add(list1);
        list1.setBounds(360, 180, 520, 310);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel1.add(jLabel7);
        jLabel7.setBounds(80, 430, 200, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panel1.add(jLabel8);
        jLabel8.setBounds(320, 90, 400, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panel1.add(jLabel9);
        jLabel9.setBounds(810, 90, 140, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/Winner no.1.png")); // NOI18N
        panel1.add(jLabel10);
        jLabel10.setBounds(700, 50, 110, 130);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        panel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 960, 520);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 960, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String position = jComboBox1.getSelectedItem().toString();
        String id, name = "", vote;
        String space = "";
        try
        {
        ps = con.prepareStatement("select sum(votes) as tVotes from candidate where position = ?");
        ps.setString(1, position);
        rs = ps.executeQuery();
        rs.next();
            String totalVotes = rs.getString("tVotes");
             jLabel7.setText("Total Votes : "+totalVotes);
            
        ps = con.prepareStatement("select * from candidate c inner join student s on c.mobile = s.mobile where position = ? order by votes desc",
                 ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ps.setString(1, position);
        rs = ps.executeQuery();
        list1.removeAll();
        while(rs.next())
        {
             id = rs.getString("mobile");
             name = rs.getString("name");
             vote = rs.getString("votes");
             
             for(int i = 1 ;i<=27-(name.length()); i++)
                space = space + " ";
            String result = (id+"             "+name+space+vote);
             list1.add(result);
             space = "";
        }
         rs.first();
         String winnerName = rs.getString("name");
         jLabel8.setText("The Winner for position "+position);
         
         jLabel9.setText(winnerName.toUpperCase());
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error : "+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new AdminLogin(email).setVisible(true);
         setVisible(false);
         new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
       
    }//GEN-LAST:event_list1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Label label3;
    private java.awt.List list1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
