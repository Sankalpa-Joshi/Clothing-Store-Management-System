/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on Apr 12, 2023, 9:27:28 PM
 */
package csms;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class login extends javax.swing.JFrame {

    /** Creates new form login */
    public login() {
        initComponents();
        
    }

    Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UID = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        CLear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PASS = new javax.swing.JPasswordField();
        Showpass = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 33));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 93, 33));

        UID.setBackground(new java.awt.Color(255, 204, 204));
        UID.setFont(new java.awt.Font("Times New Roman", 0, 18));
        UID.setBorder(null);
        jPanel1.add(UID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 161, 34));

        Login.setBackground(new java.awt.Color(255, 153, 153));
        Login.setFont(new java.awt.Font("Times New Roman", 1, 14));
        Login.setText("Login");
        Login.setBorder(null);
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 82, 40));

        CLear.setBackground(new java.awt.Color(255, 153, 153));
        CLear.setFont(new java.awt.Font("Times New Roman", 1, 14));
        CLear.setText("Clear");
        CLear.setBorder(null);
        CLear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLearMouseClicked(evt);
            }
        });
        jPanel1.add(CLear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 82, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36));
        jLabel3.setText("Login to continue");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 50));

        PASS.setBackground(new java.awt.Color(255, 204, 204));
        PASS.setFont(new java.awt.Font("Times New Roman", 0, 18));
        PASS.setBorder(null);
        jPanel1.add(PASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 161, 34));

        Showpass.setText("Show Password");
        Showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowpassActionPerformed(evt);
            }
        });
        jPanel1.add(Showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/csms/front'.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-450)/2, 800, 450);
    }// </editor-fold>//GEN-END:initComponents

private void CLearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLearMouseClicked
    UID.setText("");
    PASS.setText("");
    
}//GEN-LAST:event_CLearMouseClicked

private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
    if(UID.getText().equals(""))
    {
         JOptionPane.showMessageDialog(this,"Please fill out User ID");
    }
    else if(PASS.getText().equals(""))
    {
         JOptionPane.showMessageDialog(this,"Please fill out Password");
    }
    else if(UID.getText().contains("admin") && PASS.getText().contains("12345"))
    {
        JOptionPane.showMessageDialog(this,"Login Successfull!! Welcome");
          new home().setVisible(true);
          this.dispose();
    }
    else
    {
         JOptionPane.showMessageDialog(this,"Wrong User ID or Password!!","Message",JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_LoginMouseClicked

private void ShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowpassActionPerformed
    if(Showpass.isSelected()){
        PASS.setEchoChar((char)0);
    }
    else{
        PASS.setEchoChar('*');
    }
}//GEN-LAST:event_ShowpassActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLear;
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField PASS;
    private javax.swing.JCheckBox Showpass;
    private javax.swing.JTextField UID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
