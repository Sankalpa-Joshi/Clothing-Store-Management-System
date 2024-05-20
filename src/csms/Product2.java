/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Product2.java
 *
 * Created on May 6, 2023, 12:33:11 AM
 */
package csms;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author dell
 */
public class Product2 extends javax.swing.JFrame {

    /** Creates new form Product2 */
    public Product2() {
        initComponents();
        Selected();
    }
     Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;

  public void Selected()
{
    try{
       Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
       St= Con.createStatement();
       Rs= St.executeQuery("select * from PRODUCTTABLE");
       ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e)
    {
        e.printStackTrace();
}    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ProIDp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ProNamep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ProPricep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ProCatp = new javax.swing.JComboBox();
        ProQtyp = new javax.swing.JTextField();
        ProDelete = new javax.swing.JButton();
        ProEdit = new javax.swing.JButton();
        ProAdd = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        Homep = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Clothing Store Management System");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("x");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addComponent(jLabel6)
                .addGap(18, 18, 18))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel7.setText("Product ID");

        ProIDp.setFont(new java.awt.Font("Times New Roman", 0, 18));
        ProIDp.setForeground(java.awt.Color.red);
        ProIDp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel8.setText("Name");

        ProNamep.setFont(new java.awt.Font("Times New Roman", 0, 18));
        ProNamep.setForeground(java.awt.Color.red);
        ProNamep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel9.setText("Price");

        ProPricep.setFont(new java.awt.Font("Times New Roman", 0, 18));
        ProPricep.setForeground(java.awt.Color.red);
        ProPricep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel10.setText("Quantity");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel14.setText("Category");

        ProCatp.setFont(new java.awt.Font("Times New Roman", 1, 18));
        ProCatp.setForeground(java.awt.Color.red);
        ProCatp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Saree", "Lehenga", "Kurtha set", "Kurtha piece" }));

        ProQtyp.setFont(new java.awt.Font("Times New Roman", 0, 18));
        ProQtyp.setForeground(java.awt.Color.red);
        ProQtyp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        ProDelete.setBackground(new java.awt.Color(255, 153, 153));
        ProDelete.setFont(new java.awt.Font("Times New Roman", 1, 20));
        ProDelete.setForeground(java.awt.Color.red);
        ProDelete.setText("Delete");
        ProDelete.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        ProDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProDeleteMouseClicked(evt);
            }
        });

        ProEdit.setBackground(new java.awt.Color(255, 153, 153));
        ProEdit.setFont(new java.awt.Font("Times New Roman", 1, 20));
        ProEdit.setForeground(java.awt.Color.red);
        ProEdit.setText("Edit");
        ProEdit.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        ProEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProEditMouseClicked(evt);
            }
        });

        ProAdd.setBackground(new java.awt.Color(255, 153, 153));
        ProAdd.setFont(new java.awt.Font("Times New Roman", 1, 20));
        ProAdd.setForeground(java.awt.Color.red);
        ProAdd.setText("ADD");
        ProAdd.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        ProAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProAddMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel15.setForeground(java.awt.Color.red);
        jLabel15.setText("Product Information");

        ProductTable.setFont(new java.awt.Font("Times New Roman", 1, 16));
        ProductTable.setForeground(java.awt.Color.red);
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Category", "Status"
            }
        ));
        ProductTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTable.setRowHeight(30);
        ProductTable.setSelectionBackground(java.awt.Color.red);
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        Homep.setBackground(new java.awt.Color(255, 153, 153));
        Homep.setFont(new java.awt.Font("Times New Roman", 1, 20));
        Homep.setForeground(java.awt.Color.red);
        Homep.setText("HOME");
        Homep.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel11.setText("Search item");

        Search.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Search.setForeground(java.awt.Color.red);
        Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ProIDp, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(ProCatp, 0, 148, Short.MAX_VALUE)
                    .addComponent(ProQtyp, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(ProPricep, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(ProNamep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Homep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(ProEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ProDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(424, 424, 424))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(637, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProIDp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProNamep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProPricep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProQtyp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProCatp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Homep, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

private void ProDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProDeleteMouseClicked
 if(ProIDp.getText().isEmpty())
 {
     JOptionPane.showMessageDialog(this,"Enter the product to be deleted");
 }
 else
 {
     try{
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
         String Id=ProIDp.getText();
         String Query="Delete from PRODUCTTABLE where ProID="+Id;
         Statement Add=Con.createStatement();
         Add.executeUpdate(Query);
         Selected();
         JOptionPane.showMessageDialog(this,"Prodduct has been deleted successfully");
         
 }catch(SQLException e)
 {
   e.printStackTrace();
 }
}//GEN-LAST:event_ProDeleteMouseClicked
 
}
private void ProAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProAddMouseClicked
try{
    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
PreparedStatement add=Con.prepareStatement("insert into PRODUCTTABLE values(?,?,?,?,?)");
add.setInt(1,Integer.valueOf(ProIDp.getText()));
add.setString(2,ProNamep.getText());
add.setInt(3,Integer.valueOf(ProPricep.getText()));
add.setInt(4,Integer.valueOf(ProQtyp.getText()));
add.setString(5,ProCatp.getSelectedItem().toString());
int row=add.executeUpdate();
JOptionPane.showMessageDialog(this,"Product Successfully Added");
Con.close();
Selected();
}catch(SQLException e)
{
    e.printStackTrace();
}
    
}//GEN-LAST:event_ProAddMouseClicked

private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
    DefaultTableModel model=(DefaultTableModel)ProductTable.getModel();
    int Myindex=ProductTable.getSelectedRow();
    ProIDp.setText(model.getValueAt(Myindex, 0).toString());
    ProNamep.setText(model.getValueAt(Myindex, 1).toString());
    ProPricep.setText(model.getValueAt(Myindex, 2).toString());
    ProQtyp.setText(model.getValueAt(Myindex, 3).toString());
}//GEN-LAST:event_ProductTableMouseClicked

private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    System.exit(0);
}//GEN-LAST:event_jLabel6MouseClicked
private void HomepMouseClicked(java.awt.event.MouseEvent evt)
{
   new home().setVisible(true);
    this.dispose();
}

private void ProEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProEditMouseClicked
    if(ProIDp.getText().isEmpty()||ProNamep.getText().isEmpty()||ProPricep.getText().isEmpty()||ProQtyp.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Information is missing");
}//GEN-LAST:event_ProEditMouseClicked
else
    {
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
            String UpdateQuery="Update producttable set ProName='"+ProNamep.getText()+"'"+",ProPrice="+ProPricep.getText()+""+",ProQty="+ProQtyp.getText()+""+",ProCat='"+ProCatp.getSelectedItem().toString()+"'"+"where ProID="+ProIDp.getText();
            Statement Add=Con.createStatement();
            Add.executeUpdate(UpdateQuery);
            JOptionPane.showMessageDialog(this,"Message Updated Successfully");
            Selected();
            
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

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
            java.util.logging.Logger.getLogger(Product2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Product2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homep;
    private javax.swing.JButton ProAdd;
    private javax.swing.JComboBox ProCatp;
    private javax.swing.JButton ProDelete;
    private javax.swing.JButton ProEdit;
    private javax.swing.JTextField ProIDp;
    private javax.swing.JTextField ProNamep;
    private javax.swing.JTextField ProPricep;
    private javax.swing.JTextField ProQtyp;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField Search;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
