/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static secure.usrdatabase.date;
import static secure.usrdatabase.usr;

/**
 *
 * @author Himanshi-pc
 */
public class edit_budget extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
PreparedStatement pst1=null;
ResultSet rs1=null;
PreparedStatement pst2=null;
ResultSet rs2=null;
PreparedStatement pst7=null;
ResultSet rs7=null;
public static String Table_click,add1,add2,add3,add4,add5;
    /**
     * Creates new form edit_budget
     */
    public edit_budget() {
        initComponents();
        conn=Connect.Connect();
        usr=login.Usrname_Txt.getText();
        Date d=new Date();
      SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
      date=s.format(d);
      usr=login.Usrname_Txt.getText();
        String sql="select * from LOG."+usr+" where date='"+date+"'";
        try{
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
         DefaultTableModel model;
        model=(DefaultTableModel)this.jTable1.getModel();
        jTable1.setFont(new Font("Seriff",Font.PLAIN,20));
        jTable1.setRowHeight(30);
       
        
        while(model.getRowCount()>0)
        {
            for(int i=0;i<model.getRowCount();i++)
            {
                model.removeRow(i);
            }
        }
            while(rs.next())
            {
                String time=rs.getString("time");
                int limit=rs.getInt("limit");
            String enm=rs.getString("ename");
            int eamt=rs.getInt("eamnt");
            
            String inm=rs.getString("iname");
            int iamt=rs.getInt("iamnt");
            model.addRow(new Object[]{time,limit,inm,iamt,enm,eamt});
            }
        }
        catch(Exception e)
        {
            
        }
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        limit_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        iname_txt = new javax.swing.JTextField();
        iamt_txt = new javax.swing.JTextField();
        ename_txt = new javax.swing.JTextField();
        eamt_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Constantia", 3, 76)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(176, 106, 71));
        jLabel2.setText("EDIT BUDGET");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(700, -60, 620, 230);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setText("Maximum Limit Of Spending");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(550, 160, 310, 50);
        jPanel1.add(limit_txt);
        limit_txt.setBounds(870, 160, 240, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel4.setText("Entity Name");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(650, 280, 190, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel5.setText("Amount Received");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(630, 320, 260, 60);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel6.setText("Entity Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(660, 420, 160, 60);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel7.setText("Amount Spendid");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(640, 490, 158, 28);

        iname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iname_txtActionPerformed(evt);
            }
        });
        jPanel1.add(iname_txt);
        iname_txt.setBounds(870, 270, 240, 40);

        iamt_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iamt_txtActionPerformed(evt);
            }
        });
        jPanel1.add(iamt_txt);
        iamt_txt.setBounds(870, 330, 240, 40);

        ename_txt.setToolTipText("");
        ename_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ename_txtActionPerformed(evt);
            }
        });
        jPanel1.add(ename_txt);
        ename_txt.setBounds(870, 430, 240, 40);
        jPanel1.add(eamt_txt);
        eamt_txt.setBounds(870, 490, 240, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("INCOME ENTRY");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(750, 230, 150, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("EXPENSE ENTRY");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(760, 380, 132, 22);

        jButton1.setFont(new java.awt.Font("Lucida Bright", 3, 36)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 690, 220, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time Of Entery", "limit", "Source of Income", "Amount Recieved", "Expense Entity", "Amount Spendid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(1212, 120, 680, 550);

        jButton2.setFont(new java.awt.Font("Lucida Bright", 3, 36)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(929, 691, 220, 60);

        jLabel1.setFont(new java.awt.Font("Constantia", 3, 76)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/calcbudget.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ename_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ename_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ename_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Date d=new Date();
      SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
      date=s.format(d);
      usr=login.Usrname_Txt.getText();
        
        try{
            
            String sql2="Update "+usr+" set limit="+limit_txt.getText()+" where limit="+add1+"";
            pst2=conn.prepareStatement(sql2);
             pst2.execute();
            
            String sql3="Update "+usr+" set iname='"+iname_txt.getText()+"'"+" where time='"+Table_click+"'";
            pst2=conn.prepareStatement(sql3);
             pst2.execute();
             
             String sql4="Update "+usr+" set iamnt="+iamt_txt.getText()+" where time='"+Table_click+"'";
            pst2=conn.prepareStatement(sql4);
             pst2.execute();
             
              String sql5="Update "+usr+" set ename='"+ename_txt.getText()+"'"+" where time='"+Table_click+"'";
            pst2=conn.prepareStatement(sql5);
             pst2.execute();
             
             String sql6="Update "+usr+" set eamnt="+eamt_txt.getText()+" where time='"+Table_click+"'";
            pst2=conn.prepareStatement(sql6);
             pst2.execute();
             
            limit_txt.setText("");
            iname_txt.setText("");
            iamt_txt.setText("");
            ename_txt.setText("");
            eamt_txt.setText("");
            
             
            String sql7="select * from LOG."+usr+" where date='"+date+"'";
             pst7=conn.prepareStatement(sql7);
        rs7=pst7.executeQuery();
         DefaultTableModel model;
        model=(DefaultTableModel)this.jTable1.getModel();
        while(model.getRowCount()>0)
        {
            for(int i=0;i<model.getRowCount();i++)
            {
                model.removeRow(i);
            }
        }
            while(rs7.next())
            {
                
                String time=rs7.getString("time");
                int limit=rs7.getInt("limit");
            String enm=rs7.getString("ename");
            int eamt=rs7.getInt("eamnt");
            
            String inm=rs7.getString("iname");
            int iamt=rs7.getInt("iamnt");
            model.addRow(new Object[]{time,limit,inm,iamt,enm,eamt});
            
            }
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
            int row=jTable1.getSelectedRow();
             Table_click=(jTable1.getModel().getValueAt(row,0).toString());
             usr=login.Usrname_Txt.getText();
             String sql1="select * from LOG."+usr+" where time='"+Table_click+"'" ;
             pst1=conn.prepareStatement(sql1);
             rs1=pst1.executeQuery();
             
             if (rs1.next()){
                 add1=rs1.getString("limit");
                 limit_txt.setText(add1);
                add2=rs1.getString("iname");
                 iname_txt.setText(add2);
               add3=rs1.getString("iamnt");
                 iamt_txt.setText(add3);
                add4=rs1.getString("ename");
                 ename_txt.setText(add4);
              add5=rs1.getString("eamnt");
                 eamt_txt.setText(add5);
             }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void iamt_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iamt_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iamt_txtActionPerformed

    private void iname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iname_txtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        usrdatabase u=new usrdatabase();
        u.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(edit_budget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_budget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_budget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_budget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_budget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eamt_txt;
    private javax.swing.JTextField ename_txt;
    private javax.swing.JTextField iamt_txt;
    private javax.swing.JTextField iname_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField limit_txt;
    // End of variables declaration//GEN-END:variables
}
