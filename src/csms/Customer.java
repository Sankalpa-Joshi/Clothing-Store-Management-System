/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Customer.java
 *
 * Created on Apr 16, 2023, 9:28:21 PM
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


public class Customer extends javax.swing.JFrame {

    /** Creates new form Customer */
    public Customer() {
        initComponents();
        SelectCust();
    }
    Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CustPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CustDues = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CustAddress = new javax.swing.JTextField();
        CustAdd = new javax.swing.JButton();
        CustDelete = new javax.swing.JButton();
        CustEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustTable = new javax.swing.JTable();
        CustID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CustName = new javax.swing.JTextField();
        Home = new javax.swing.JButton();
        productbut = new javax.swing.JButton();
        OrdersNum = new javax.swing.JLabel();
        amtlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer");

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
                .addContainerGap(245, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(X)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(X)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Name");

        CustPhone.setFont(new java.awt.Font("Times New Roman", 0, 18));
        CustPhone.setForeground(java.awt.Color.red);
        CustPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel3.setForeground(java.awt.Color.lightGray);
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel4.setForeground(java.awt.Color.lightGray);
        jLabel4.setText("Address");

        CustDues.setFont(new java.awt.Font("Times New Roman", 0, 18));
        CustDues.setForeground(java.awt.Color.red);
        CustDues.setText("0");
        CustDues.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel5.setForeground(java.awt.Color.lightGray);
        jLabel5.setText("Dues");

        CustAddress.setFont(new java.awt.Font("Times New Roman", 0, 18));
        CustAddress.setForeground(java.awt.Color.red);
        CustAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        CustAdd.setBackground(new java.awt.Color(255, 153, 153));
        CustAdd.setFont(new java.awt.Font("Times New Roman", 1, 20));
        CustAdd.setForeground(java.awt.Color.red);
        CustAdd.setText("ADD");
        CustAdd.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        CustAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustAddMouseClicked(evt);
            }
        });

        CustDelete.setBackground(new java.awt.Color(255, 153, 153));
        CustDelete.setFont(new java.awt.Font("Times New Roman", 1, 20));
        CustDelete.setForeground(java.awt.Color.red);
        CustDelete.setText("Delete");
        CustDelete.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        CustDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustDeleteMouseClicked(evt);
            }
        });

        CustEdit.setBackground(new java.awt.Color(255, 153, 153));
        CustEdit.setFont(new java.awt.Font("Times New Roman", 1, 20));
        CustEdit.setForeground(java.awt.Color.red);
        CustEdit.setText("Edit");
        CustEdit.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        CustEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustEditMouseClicked(evt);
            }
        });

        CustTable.setForeground(java.awt.Color.red);
        CustTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address", "Dues"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CustTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CustTable.setRowHeight(25);
        CustTable.setSelectionBackground(java.awt.Color.red);
        CustTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustTable);

        CustID.setFont(new java.awt.Font("Times New Roman", 0, 18));
        CustID.setForeground(java.awt.Color.red);
        CustID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Customer Information");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("ID");

        CustName.setFont(new java.awt.Font("Times New Roman", 0, 18));
        CustName.setForeground(java.awt.Color.red);
        CustName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        Home.setBackground(new java.awt.Color(255, 153, 153));
        Home.setFont(new java.awt.Font("Times New Roman", 1, 20));
        Home.setForeground(java.awt.Color.red);
        Home.setText("HOME");
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        productbut.setBackground(new java.awt.Color(0, 0, 0));
        productbut.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        productbut.setForeground(new java.awt.Color(255, 255, 255));
        productbut.setText("Order");
        productbut.setBorder(null);

        OrdersNum.setBackground(new java.awt.Color(255, 255, 255));
        OrdersNum.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        OrdersNum.setForeground(java.awt.Color.red);
        OrdersNum.setText("ID");
        OrdersNum.setOpaque(true);

        amtlbl.setBackground(new java.awt.Color(255, 255, 255));
        amtlbl.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        amtlbl.setForeground(java.awt.Color.red);
        amtlbl.setText("Amount");
        amtlbl.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CustAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(CustDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(productbut, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(OrdersNum, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amtlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                            .addComponent(CustDues, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(CustID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(CustName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(CustPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(CustAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(11, 11, 11)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(214, 214, 214))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustDues, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productbut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrdersNum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-952)/2, (screenSize.height-703)/2, 952, 703);
    }// </editor-fold>//GEN-END:initComponents
 public void SelectCust()
{
    try{
       Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
       St= Con.createStatement();
       Rs= St.executeQuery("select * from CUSTTABLE");
       CustTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e)
    {
        e.printStackTrace();
}    
}
private void CustAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustAddMouseClicked
    try{
    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
    PreparedStatement add=Con.prepareStatement("insert into CustTable values(?,?,?,?,?)");
add.setString(1,CustID.getText());
add.setString(2,CustName.getText());

add.setString(3,CustPhone.getText());
add.setString(4,CustAddress.getText());
add.setInt(5,Integer.valueOf(CustDues.getText()));


int row=add.executeUpdate();
JOptionPane.showMessageDialog(this,"Information Successfully Added");
Con.close();
SelectCust();
}catch(SQLException e)
{
    e.printStackTrace();
}
}//GEN-LAST:event_CustAddMouseClicked

private void CustDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustDeleteMouseClicked
if(CustID.getText().isEmpty())
 {
     JOptionPane.showMessageDialog(this,"Enter the customer information to be deleted");
 }
 else
 {
     try{
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
         String Id=CustID.getText();
         String Query="Delete from CUSTTABLE where CustID="+Id;
         Statement Add=Con.createStatement();
         Add.executeUpdate(Query);
         SelectCust();
         JOptionPane.showMessageDialog(this,"Customer Information has been deleted successfully");
         
 }catch(SQLException e)
 {
   e.printStackTrace();
 }
}                                       
}//GEN-LAST:event_CustDeleteMouseClicked

private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
    System.exit(0);
}//GEN-LAST:event_XMouseClicked

private void CustEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustEditMouseClicked
 if(CustID.getText().isEmpty()||CustName.getText().isEmpty()||CustPhone.getText().isEmpty()||CustAddress.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Information is missing");
}                                    
else
    {
        try{
            //+"'"+",CustPhone='"+CustPhone.getText()+"'"+",CustAddress='"+CustAddress.getText()+"'"+",CustDues='"+CustDues.getText()
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
            String UpdateQuery="Update CustTable set CustName='"+CustName.getText()+"'"+",CustPhone='"+CustPhone.getText()+"'"+",CustAddress='"+CustAddress.getText()+"'"+",CustDues='"+CustDues.getText()+"'"+"where CustID="+CustID.getText();
            Statement Add=Con.createStatement();
            Add.executeUpdate(UpdateQuery);
            JOptionPane.showMessageDialog(this,"Message Updated Successfully");
            SelectCust();
            
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}//GEN-LAST:event_CustEditMouseClicked

private void CustTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustTableMouseClicked
 DefaultTableModel model=(DefaultTableModel)CustTable.getModel();
    int Myindex=CustTable.getSelectedRow();
    CustID.setText(model.getValueAt(Myindex, 0).toString());
    CustName.setText(model.getValueAt(Myindex, 1).toString());
    CustPhone.setText(model.getValueAt(Myindex, 2).toString());
    CustAddress.setText(model.getValueAt(Myindex, 3).toString());
    CustDues.setText(model.getValueAt(Myindex, 4).toString());
    
    try{
       Connection Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
     St =Conn.createStatement();
     Statement St1=Conn.createStatement();
     Rs= St.executeQuery("select count(*) from ORDERTABLE where CustName='"+model.getValueAt(Myindex, 1).toString()+"'");
    ResultSet Rs1=St1.executeQuery("select sum(AMOUNT) from ORDERTABLE where CustName='"+model.getValueAt(Myindex, 1).toString()+"'");
    while(Rs.next()){
        OrdersNum.setText(""+Rs.getInt(1));
        
    }
     while(Rs1.next()){
        amtlbl.setText("Rs"+Rs1.getInt(1));
        
    }
    }
    catch(SQLException e){
        
    }
   
}//GEN-LAST:event_CustTableMouseClicked

private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
    new home().setVisible(true);
    this.dispose();
}//GEN-LAST:event_HomeMouseClicked

            
        
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Customer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustAdd;
    private javax.swing.JTextField CustAddress;
    private javax.swing.JButton CustDelete;
    private javax.swing.JTextField CustDues;
    private javax.swing.JButton CustEdit;
    private javax.swing.JTextField CustID;
    private javax.swing.JTextField CustName;
    private javax.swing.JTextField CustPhone;
    private javax.swing.JTable CustTable;
    private javax.swing.JButton Home;
    private javax.swing.JLabel OrdersNum;
    private javax.swing.JLabel X;
    private javax.swing.JLabel amtlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton productbut;
    // End of variables declaration//GEN-END:variables
}
