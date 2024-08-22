
package com.mycompany.pollingsystem;
import java.sql.*;
import javax.swing.JOptionPane;
public class VotingPage extends javax.swing.JFrame 
{
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String pos = null;
    
    public VotingPage() 
    {
        initComponents();
        con = new DBConnection().createCon();
        if(con == null)
        {
            JOptionPane.showMessageDialog(null, "Connection is not created.");
        }
        setSize(970, 656);
        setLocation(150, 100);
        getPos();
        vote();
        
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

        panel2 = new java.awt.Panel();
        jComboBox1 = new javax.swing.JComboBox<>();
        label2 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        list2 = new java.awt.List();
        label3 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel2.setBackground(new java.awt.Color(252, 252, 252));
        panel2.setLayout(null);

        jComboBox1.setBackground(new java.awt.Color(252, 252, 252));
        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panel2.add(jComboBox1);
        jComboBox1.setBounds(10, 60, 330, 30);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(51, 0, 102));
        label2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(204, 204, 255));
        label2.setText("Select Position");
        panel2.add(label2);
        label2.setBounds(0, 0, 410, 40);

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/rightClick.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102), 2));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel2.add(jButton1);
        jButton1.setBounds(360, 60, 40, 30);

        list2.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        panel2.add(list2);
        list2.setBounds(10, 160, 390, 290);

        label3.setBackground(new java.awt.Color(204, 204, 255));
        label3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(51, 0, 102));
        label3.setText(" candidate                     position");
        panel2.add(label3);
        label3.setBounds(10, 130, 390, 30);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel5.setText("My votes");
        panel2.add(jLabel5);
        jLabel5.setBounds(10, 100, 200, 20);

        getContentPane().add(panel2);
        panel2.setBounds(50, 120, 410, 480);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 0, 102));
        label1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 255));
        label1.setText("                             Candidate mobile                             Candidate Name                               ");
        getContentPane().add(label1);
        label1.setBounds(460, 120, 450, 40);

        jButton2.setBackground(new java.awt.Color(252, 252, 252));
        jButton2.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 102));
        jButton2.setText("Vote Now");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 570, 450, 30);

        jLabel2.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("\"This is not a Moment, it's a Movement\"");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 80, 420, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/online-voting.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 30, 50, 50);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Collage Voting System");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 40, 270, 30);

        list1.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        getContentPane().add(list1);
        list1.setBounds(460, 160, 450, 410);

        jButton3.setBackground(new java.awt.Color(51, 0, 102));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 102));
        jButton3.setText("logout");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(790, 20, 120, 30);

        jButton4.setBackground(new java.awt.Color(51, 0, 102));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 102));
        jButton4.setText("Dashboard");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 102)));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(650, 20, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/yaduvanshmani/NetBeansProjects/PollingSystem/Image_folder/background.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
          
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         System.out.println("Hello world");
       
         pos = jComboBox1.getSelectedItem().toString();
         System.out.println(pos);
         boolean b = false;
         list1.removeAll();
         try
        {
            ps = con.prepareStatement("select * from candidate inner join student on candidate.mobile = student.mobile where  position = ?");
           
            ps.setString(1, pos);
            rs = ps.executeQuery();
            while(rs.next())
            {
            String mobile = rs.getString("mobile");
            String name = rs.getString("name");
            
            String result = mobile+"                        "+name;
            
            list1.add(result);
            b = true;
            }
            if(b == false)
            {
                JOptionPane.showMessageDialog(null, "There is no candidate for this position.");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error : "+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(list1.getItemCount() == 0)
         {
             JOptionPane.showMessageDialog(null, "No position selected.");
             return;
         } 
        
        String item = list1.getSelectedItem();
        if(item == null)
        {
            JOptionPane.showMessageDialog(null, "Select the candidate for vote.");
            return;
        }
         String cId = item.split("\\s")[0];
         
         try
         {
         ps = con.prepareStatement("update candidate set votes = votes+1 where mobile = ?");
         ps.setString(1, cId);
         int x = ps.executeUpdate();
         if(x < 1)
         {
             JOptionPane.showMessageDialog(null, "Error in voting");
             return;
         }
         
         ps = con.prepareStatement("insert into student_votes (mobile, position, candidate_id) values (?, ?, ?)");
         ps.setString(1, UserLogin.userId);
         ps.setString(2, pos);
         ps.setString(3, cId);
         int z = ps.executeUpdate();
         if(z < 1)
         {
             JOptionPane.showMessageDialog(null, "Error in voting");
             return;
         }
         vote();
         
         JOptionPane.showMessageDialog(null, "Voted");
          list1.removeAll();
         }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null, "Error : "+e);
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        new UserLogin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new UserDash().setVisible(true);
        setVisible(false);
        new DBConnection().closeCon(con);
    }//GEN-LAST:event_jButton4ActionPerformed

    void vote()
    {
        try{
        ps = con.prepareStatement("select * from student_votes inner join student on student_votes.candidate_id = student.mobile where student_votes.mobile = ?");
         ps.setString(1, UserLogin.userId);
         String space = "";
         rs = ps.executeQuery();
         list2.removeAll();
         while(rs.next())
         {
             String position = rs.getString("position");
             String candidate = rs.getString("name");
             
            for(int i = 1 ;i<=20-(candidate.length()); i++)
                space = space + " ";
            String result = (candidate+space+position);
                    
             
             
             list2.add(result);
             space = "";
             jComboBox1.removeItem(position);
         }
         
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error : "+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.List list1;
    private java.awt.List list2;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
