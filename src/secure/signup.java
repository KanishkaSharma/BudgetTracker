package secure;


import com.sun.glass.events.KeyEvent;
import java.sql.*;
import java.awt.Color;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author com
 */
public class signup extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
       setTitle("SignUp");
       getContentPane().setBackground(new Color(204,244,255));
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
        usrname_txt = new javax.swing.JTextField();
        Pswd_Txt = new javax.swing.JPasswordField();
        Cancel = new javax.swing.JButton();
        usrname = new javax.swing.JLabel();
        Cnf_Pswd = new javax.swing.JLabel();
        Sec_Ans_Txt = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Sec_Que = new javax.swing.JLabel();
        Cnfm_Pswd_Txt = new javax.swing.JPasswordField();
        Nm_Txt = new javax.swing.JTextField();
        Sec_Ans = new javax.swing.JLabel();
        Nm = new javax.swing.JLabel();
        Create_Acc = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Reset = new javax.swing.JButton();
        Pswd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        usrname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrname_txtActionPerformed(evt);
            }
        });
        jPanel1.add(usrname_txt);
        usrname_txt.setBounds(800, 270, 249, 40);

        Pswd_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pswd_TxtActionPerformed(evt);
            }
        });
        jPanel1.add(Pswd_Txt);
        Pswd_Txt.setBounds(800, 350, 249, 40);

        Cancel.setFont(new java.awt.Font("Lucida Bright", 3, 36)); // NOI18N
        Cancel.setText("CANCEL");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel);
        Cancel.setBounds(960, 710, 200, 50);

        usrname.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        usrname.setText("User Name*");
        jPanel1.add(usrname);
        usrname.setBounds(450, 270, 200, 40);

        Cnf_Pswd.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        Cnf_Pswd.setText("Confirm Password*");
        jPanel1.add(Cnf_Pswd);
        Cnf_Pswd.setBounds(440, 410, 310, 60);
        jPanel1.add(Sec_Ans_Txt);
        Sec_Ans_Txt.setBounds(800, 590, 249, 40);

        Save.setFont(new java.awt.Font("Lucida Bright", 3, 36)); // NOI18N
        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save);
        Save.setBounds(420, 710, 200, 50);

        Sec_Que.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        Sec_Que.setText("Security Question*");
        jPanel1.add(Sec_Que);
        Sec_Que.setBounds(450, 480, 290, 70);

        Cnfm_Pswd_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cnfm_Pswd_TxtActionPerformed(evt);
            }
        });
        jPanel1.add(Cnfm_Pswd_Txt);
        Cnfm_Pswd_Txt.setBounds(800, 420, 249, 40);

        Nm_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nm_TxtKeyTyped(evt);
            }
        });
        jPanel1.add(Nm_Txt);
        Nm_Txt.setBounds(800, 190, 249, 40);

        Sec_Ans.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        Sec_Ans.setText("Security Answer*");
        jPanel1.add(Sec_Ans);
        Sec_Ans.setBounds(450, 570, 280, 60);

        Nm.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        Nm.setText("Name*");
        jPanel1.add(Nm);
        Nm.setBounds(460, 190, 130, 40);
        Nm.getAccessibleContext().setAccessibleName("jLabel1");

        Create_Acc.setFont(new java.awt.Font("Constantia", 3, 76)); // NOI18N
        Create_Acc.setText("Create Your Account");
        jPanel1.add(Create_Acc);
        Create_Acc.setBounds(440, 100, 810, 90);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was the name of your school?", "What is your pet’s name?", "What is your  Favorite color?", "Who was your childhood hero?", "What is your Nickname?" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(800, 500, 249, 40);

        Reset.setFont(new java.awt.Font("Lucida Bright", 3, 36)); // NOI18N
        Reset.setText("CLEAR");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset);
        Reset.setBounds(690, 710, 200, 50);

        Pswd.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        Pswd.setText("Password*");
        jPanel1.add(Pswd);
        Pswd.setBounds(450, 340, 190, 50);

        jLabel1.setFont(new java.awt.Font("Simplified Arabic", 3, 56)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/calcbudget.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -40, 1980, 1160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pswd_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pswd_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pswd_TxtActionPerformed

    private void Cnfm_Pswd_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cnfm_Pswd_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cnfm_Pswd_TxtActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        try{
        conn=Connect.Connect();
            
            String sql="insert into LOG.SIGNIN(fname,username,pswd,secques,secans) values(?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            if(Nm_Txt.getText().equals("")||usrname_txt.getText().equals("")||Pswd_Txt.getText().equals("")||Cnfm_Pswd_Txt.getText().equals("")||jComboBox1.getSelectedItem().equals("")||Sec_Ans_Txt.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Entry Fields Cannot Be Empty!");
            }
            else{
                if(Pswd_Txt.getText().equals(Cnfm_Pswd_Txt.getText()))
                {
                 pst.setString(1,Nm_Txt.getText());
                 pst.setString(2,usrname_txt.getText());
                 pst.setString(3,Pswd_Txt.getText());
                 //pst.setString(4,Cnfm_Pswd_Txt.getText());
                 pst.setString(4,jComboBox1.getSelectedItem().toString());
                 pst.setString(5,Sec_Ans_Txt.getText());
                 pst.execute();  
                 JOptionPane.showMessageDialog(null, "Saved");
                 this.hide();
               login u=new login();
               
                u.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Reconfirm Password");
                }
            }
            String sql1="create table "+usrname_txt.getText()+"(date date default current_date not null,time time default current_time not null primary key,limit integer,iname varchar(30),iamnt integer,ename varchar(30),eamnt integer,etot integer,itot integer)";
            pst=conn.prepareStatement(sql1);
            pst.execute();
            //String total=usrname_txt.getText()+"total";
            // String sql2="create table "+total+"(date date default current_date not null,tot integer)";
            //pst=conn.prepareStatement(sql2);
            //pst.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
 Cnfm_Pswd_Txt.setText("");
 Pswd_Txt.setText("");
   Nm_Txt.setText("");
    usrname_txt.setText("");
     Sec_Ans_Txt.setText("");
      
      
 
    }//GEN-LAST:event_ResetActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        this.hide();
        login l=new login();
        l.setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void usrname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrname_txtActionPerformed

    private void Nm_TxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nm_TxtKeyTyped
       char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)|| (c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_SPACE)))
        {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Please enter valid name!");
            evt.consume();
        }
    }//GEN-LAST:event_Nm_TxtKeyTyped

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel Cnf_Pswd;
    private javax.swing.JPasswordField Cnfm_Pswd_Txt;
    private javax.swing.JLabel Create_Acc;
    private javax.swing.JLabel Nm;
    private javax.swing.JTextField Nm_Txt;
    private javax.swing.JLabel Pswd;
    private javax.swing.JPasswordField Pswd_Txt;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Save;
    private javax.swing.JLabel Sec_Ans;
    private javax.swing.JTextField Sec_Ans_Txt;
    private javax.swing.JLabel Sec_Que;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel usrname;
    private javax.swing.JTextField usrname_txt;
    // End of variables declaration//GEN-END:variables
}