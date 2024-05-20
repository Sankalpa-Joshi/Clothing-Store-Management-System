
package csms;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Employee extends javax.swing.JFrame {
private ImageIcon format=null;
byte[] person=null;
    public Employee() {
        initComponents();
        SelectEmp();
    }
     Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;
     String path2=null;
     PreparedStatement pst=null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmpPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EmpAddress = new javax.swing.JTextField();
        EmpAdd = new javax.swing.JButton();
        EmpDelete = new javax.swing.JButton();
        EmpEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        EmpID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EmpName = new javax.swing.JTextField();
        HomeE = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EmpSalary = new javax.swing.JTextField();
        EmpType = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clothing Store Management System");

        X.setFont(new java.awt.Font("Times New Roman", 0, 36));
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setText("x");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(X))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(X)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Name");

        EmpPhone.setFont(new java.awt.Font("Times New Roman", 0, 18));
        EmpPhone.setForeground(java.awt.Color.red);
        EmpPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel3.setForeground(java.awt.Color.lightGray);
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel4.setForeground(java.awt.Color.lightGray);
        jLabel4.setText("Address");

        EmpAddress.setFont(new java.awt.Font("Times New Roman", 0, 18));
        EmpAddress.setForeground(java.awt.Color.red);
        EmpAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        EmpAdd.setBackground(new java.awt.Color(255, 153, 153));
        EmpAdd.setFont(new java.awt.Font("Times New Roman", 1, 20));
        EmpAdd.setForeground(java.awt.Color.red);
        EmpAdd.setText("ADD");
        EmpAdd.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        EmpAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpAddMouseClicked(evt);
            }
        });

        EmpDelete.setBackground(new java.awt.Color(255, 153, 153));
        EmpDelete.setFont(new java.awt.Font("Times New Roman", 1, 20));
        EmpDelete.setForeground(java.awt.Color.red);
        EmpDelete.setText("Delete");
        EmpDelete.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        EmpDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpDeleteMouseClicked(evt);
            }
        });

        EmpEdit.setBackground(new java.awt.Color(255, 153, 153));
        EmpEdit.setFont(new java.awt.Font("Times New Roman", 1, 20));
        EmpEdit.setForeground(java.awt.Color.red);
        EmpEdit.setText("Edit");
        EmpEdit.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        EmpEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpEditMouseClicked(evt);
            }
        });
        EmpEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpEditActionPerformed(evt);
            }
        });

        EmpTable.setForeground(java.awt.Color.red);
        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address", "Salary", "type"
            }
        ));
        EmpTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        EmpTable.setRowHeight(25);
        EmpTable.setSelectionBackground(java.awt.Color.red);
        EmpTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmpTable);

        EmpID.setFont(new java.awt.Font("Times New Roman", 0, 18));
        EmpID.setForeground(java.awt.Color.red);
        EmpID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Employee Records");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("ID");

        EmpName.setFont(new java.awt.Font("Times New Roman", 0, 18));
        EmpName.setForeground(java.awt.Color.red);
        EmpName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        HomeE.setBackground(new java.awt.Color(255, 153, 153));
        HomeE.setFont(new java.awt.Font("Times New Roman", 1, 20));
        HomeE.setForeground(java.awt.Color.red);
        HomeE.setText("HOME");
        HomeE.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        HomeE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeEMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel5.setForeground(java.awt.Color.lightGray);
        jLabel5.setText("Type");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel8.setForeground(java.awt.Color.lightGray);
        jLabel8.setText("Salary");

        EmpSalary.setFont(new java.awt.Font("Times New Roman", 0, 18));
        EmpSalary.setForeground(java.awt.Color.red);
        EmpSalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        EmpType.setFont(new java.awt.Font("Times New Roman", 1, 18));
        EmpType.setForeground(java.awt.Color.red);
        EmpType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Full Time", "Part Time" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EmpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmpType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(EmpName)
                    .addComponent(EmpPhone)
                    .addComponent(EmpAddress)
                    .addComponent(EmpSalary)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HomeE, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EmpEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(EmpDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(234, 234, 234))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(HomeE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-841)/2, (screenSize.height-735)/2, 841, 735);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectEmp()
{
    try{
       Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
       St= Con.createStatement();
       Rs= St.executeQuery("select * from EMPTABLE");
       EmpTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e)
    {
        e.printStackTrace();
}    
}
private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
    System.exit(0);
}//GEN-LAST:event_XMouseClicked

private void EmpAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpAddMouseClicked
    try{
    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
    PreparedStatement add=Con.prepareStatement("insert into EmpTable values(?,?,?,?,?,?)");
    add.setString(1,EmpID.getText());
    add.setString(2,EmpName.getText());
    add.setString(3,EmpPhone.getText());
    add.setString(4,EmpAddress.getText());
    add.setInt(5,Integer.valueOf(EmpSalary.getText()));
    add.setString(6,EmpType.getSelectedItem().toString());
    
                
            
           
    int row=add.executeUpdate();
    JOptionPane.showMessageDialog(this,"Information Successfully Added");
    Con.close();
    SelectEmp();
    }catch(SQLException e)
{
    e.printStackTrace();
}
}//GEN-LAST:event_EmpAddMouseClicked

private void EmpDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpDeleteMouseClicked
if(EmpID.getText().isEmpty())
 {
     JOptionPane.showMessageDialog(this,"Enter the employee record to be deleted");
 }
 else
 {
     try{
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
         String Id=EmpID.getText();
         String Query="Delete from EMPTABLE where EmpID="+Id;
         Statement Add=Con.createStatement();
         Add.executeUpdate(Query);
         SelectEmp();
         JOptionPane.showMessageDialog(this,"Employee Record has been deleted successfully");
         
 }catch(SQLException e)
 {
   e.printStackTrace();
 }
}                                       
}//GEN-LAST:event_EmpDeleteMouseClicked

private void EmpEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpEditMouseClicked
 if(EmpID.getText().isEmpty()||EmpName.getText().isEmpty()||EmpPhone.getText().isEmpty()||EmpAddress.getText().isEmpty()||EmpSalary.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Information is missing");
}                                    
else
    {
        try{
            
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
            //+"'"+",EmpPhone='"+EmpPhone.getText()+"'"+",EmpAddress='"+EmpAddress.getText()+"'"+",EmpSalary='"+EmpSalary.getText()+""
            String UpdateQuery="Update EmpTable set EmpName='"+EmpName.getText()+"'"+",EmpPhone='"+EmpPhone.getText()+"'"+",EmpAddress='"+EmpAddress.getText()+"'"+",EmpSalary="+EmpSalary.getText()+""+",EmpType='"+EmpType.getSelectedItem().toString()+"'"+"where EmpID="+EmpID.getText();
            Statement Add=Con.createStatement();
            Add.executeUpdate(UpdateQuery);
            JOptionPane.showMessageDialog(this,"Message Updated Successfully");
            SelectEmp();
            
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}//GEN-LAST:event_EmpEditMouseClicked

private void EmpTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpTableMouseClicked
        try {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
 int r=EmpTable.getSelectedRow();
 String cl=(EmpTable.getModel().getValueAt(r, 0).toString());
String sql="select * from EmpTable where EmpID='"+cl+"'";
        try {
            pst=Con.prepareStatement(sql);
            Rs=pst.executeQuery();
            if(Rs.next()){
                String id=Integer.toString(Rs.getInt(1));
                String name=Rs.getString(2);
               String phone=Rs.getString(3);
               String add=Rs.getString(4);
               String sal=Rs.getString(5);
               
              
                
              
               
            
               
                EmpID.setText(id);
                EmpName.setText(name);
                EmpPhone.setText(phone);
                EmpAddress.setText(add);
                EmpSalary.setText(sal);
                
              
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_EmpTableMouseClicked

private void HomeEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeEMouseClicked
    new home().setVisible(true);
    this.dispose();
}//GEN-LAST:event_HomeEMouseClicked

private void EmpEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpEditActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_EmpEditActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Employee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmpAdd;
    private javax.swing.JTextField EmpAddress;
    private javax.swing.JButton EmpDelete;
    private javax.swing.JButton EmpEdit;
    private javax.swing.JTextField EmpID;
    private javax.swing.JTextField EmpName;
    private javax.swing.JTextField EmpPhone;
    private javax.swing.JTextField EmpSalary;
    private javax.swing.JTable EmpTable;
    private javax.swing.JComboBox EmpType;
    private javax.swing.JButton HomeE;
    private javax.swing.JLabel X;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
