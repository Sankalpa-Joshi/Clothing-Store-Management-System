/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Order.java
 *
 * Created on Oct 16, 2023, 11:38:28 PM
 */
package csms;

import java.awt.print.PrinterException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author dell
 */
public class Order extends javax.swing.JFrame {

    /** Creates new form Order */
    public Order() {
        initComponents();
        Selected();
        SelectCust();
        getToday();
        
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
     private void update(){
         int newqty=oldqty-Integer.valueOf(ProQtyp.getText());
   try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
            String UpdateQuery="Update producttable set ProQty='"+newqty+"'"+"where ProID="+productid;
            Statement Add=Con.createStatement();
            Add.executeUpdate(UpdateQuery);
            //JOptionPane.showMessageDialog(this,"Message Updated Successfully");
            Selected();
            
           
        }catch(Exception e){
            e.printStackTrace();
        }
          
     }
    
public void getToday(){
    String date=new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime());
    Datelbl.setText(date);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ProPricep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ProQtyp = new javax.swing.JTextField();
        addto = new javax.swing.JButton();
        vieworder = new javax.swing.JButton();
        addorder = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        HomeP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        order = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        custnamelbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        billtbl = new javax.swing.JTable();
        totamtlbl = new javax.swing.JLabel();
        printbtn = new javax.swing.JButton();
        totamtlbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order");

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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(103, 103, 103))))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel9.setForeground(java.awt.Color.lightGray);
        jLabel9.setText("Price");

        ProPricep.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ProPricep.setForeground(java.awt.Color.red);
        ProPricep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel10.setForeground(java.awt.Color.lightGray);
        jLabel10.setText("Quantity");

        ProQtyp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ProQtyp.setForeground(java.awt.Color.red);
        ProQtyp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        addto.setBackground(new java.awt.Color(255, 153, 153));
        addto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addto.setForeground(java.awt.Color.red);
        addto.setText("ADD TO ORDER");
        addto.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        addto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addtoMouseClicked(evt);
            }
        });

        vieworder.setBackground(new java.awt.Color(255, 153, 153));
        vieworder.setFont(new java.awt.Font("Times New Roman", 1, 20));
        vieworder.setForeground(java.awt.Color.red);
        vieworder.setText("View Order");
        vieworder.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        vieworder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vieworderMouseClicked(evt);
            }
        });

        addorder.setBackground(new java.awt.Color(255, 153, 153));
        addorder.setFont(new java.awt.Font("Times New Roman", 1, 20));
        addorder.setForeground(java.awt.Color.red);
        addorder.setText("ADD Order");
        addorder.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        addorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addorderMouseClicked(evt);
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
                "ID", "Name", "Price", "Quantity"
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

        HomeP.setBackground(new java.awt.Color(255, 153, 153));
        HomeP.setFont(new java.awt.Font("Times New Roman", 1, 20));
        HomeP.setForeground(java.awt.Color.red);
        HomeP.setText("HOME");
        HomeP.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        HomeP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePMouseClicked(evt);
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
        jScrollPane2.setViewportView(CustTable);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setText("Customer Information");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel12.setForeground(java.awt.Color.lightGray);
        jLabel12.setText("Order ID");

        order.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        order.setForeground(java.awt.Color.red);
        order.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel14.setForeground(java.awt.Color.lightGray);
        jLabel14.setText("Customer Name");

        custnamelbl.setBackground(new java.awt.Color(255, 255, 255));
        custnamelbl.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        custnamelbl.setForeground(java.awt.Color.red);
        custnamelbl.setText("Customer Name");
        custnamelbl.setOpaque(true);

        Datelbl.setBackground(new java.awt.Color(255, 255, 255));
        Datelbl.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Datelbl.setForeground(java.awt.Color.red);
        Datelbl.setText("Date");
        Datelbl.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel18.setForeground(java.awt.Color.lightGray);
        jLabel18.setText("Date");

        billtbl.setFont(new java.awt.Font("Times New Roman", 1, 16));
        billtbl.setForeground(java.awt.Color.red);
        billtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Price", "Quantity", "Total"
            }
        ));
        billtbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        billtbl.setRowHeight(30);
        billtbl.setSelectionBackground(java.awt.Color.red);
        billtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billtblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(billtbl);

        totamtlbl.setBackground(new java.awt.Color(255, 255, 255));
        totamtlbl.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        totamtlbl.setForeground(java.awt.Color.red);
        totamtlbl.setText("Amount");
        totamtlbl.setOpaque(true);

        printbtn.setBackground(new java.awt.Color(255, 153, 153));
        printbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        printbtn.setForeground(java.awt.Color.red);
        printbtn.setText("Print");
        printbtn.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printbtnMouseClicked(evt);
            }
        });

        totamtlbl1.setBackground(new java.awt.Color(255, 255, 255));
        totamtlbl1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        totamtlbl1.setForeground(java.awt.Color.red);
        totamtlbl1.setText("RS");
        totamtlbl1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(addorder, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(vieworder))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Datelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(custnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(order, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(HomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ProPricep, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(ProQtyp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(577, Short.MAX_VALUE)
                .addComponent(totamtlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totamtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProQtyp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProPricep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addorder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vieworder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(HomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totamtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totamtlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-924)/2, (screenSize.height-861)/2, 924, 861);
    }// </editor-fold>//GEN-END:initComponents

private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    System.exit(0);
}//GEN-LAST:event_jLabel6MouseClicked
int i=1,Price,tot=0,total;
String prodname;
private void addtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addtoMouseClicked
if(flag==0 || ProQtyp.getText().isEmpty() || ProPricep.getText().isEmpty())
{
     JOptionPane.showMessageDialog(this, "Select Product and enter Quantity");
}
else{
    
}
    Price=Integer.valueOf(ProPricep.getText());
tot= Price*Integer.valueOf(ProQtyp.getText());

    Vector v=new Vector();
v.add(i);
v.add(prodname);
v.add(ProQtyp.getText());
v.add(Price);
v.add(tot);
DefaultTableModel dt=(DefaultTableModel)billtbl.getModel();
dt.addRow(v);
total=total+tot;
totamtlbl.setText(""+total);
update();
i++;

}//GEN-LAST:event_addtoMouseClicked

private void addorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addorderMouseClicked
if(order.getText().isEmpty())
{
    JOptionPane.showMessageDialog(this,"Enter order ID");
}else
{
    try{
    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
PreparedStatement add=Con.prepareStatement("insert into ordertable values(?,?,?)");
add.setInt(1,Integer.valueOf(order.getText()));
add.setString(2,custnamelbl.getText());
add.setInt(3,Integer.valueOf(totamtlbl.getText()));
 
int row=add.executeUpdate();
JOptionPane.showMessageDialog(this,"Order Successfully Added");
Con.close();

}catch(SQLException e)
{
    e.printStackTrace();
}
}    
}//GEN-LAST:event_addorderMouseClicked
int flag=0,productid,oldqty;
private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
    DefaultTableModel model=(DefaultTableModel)ProductTable.getModel();
    int Myindex=ProductTable.getSelectedRow();
    productid=Integer.valueOf(model.getValueAt(Myindex, 0).toString());
   prodname=model.getValueAt(Myindex, 1).toString();
    ProPricep.setText(model.getValueAt(Myindex, 2).toString());
    oldqty=Integer.valueOf(model.getValueAt(Myindex, 3).toString());
    flag=1;
}//GEN-LAST:event_ProductTableMouseClicked

private void HomePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePMouseClicked
// TODO add your handling code here:
     new home().setVisible(true);
    this.dispose();
}//GEN-LAST:event_HomePMouseClicked

private void CustTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustTableMouseClicked
 DefaultTableModel model=(DefaultTableModel)CustTable.getModel();
    int Myindex=CustTable.getSelectedRow();
    //CustID.setText(model.getValueAt(Myindex, 0).toString());
    custnamelbl.setText(model.getValueAt(Myindex, 1).toString());
    //CustPhone.setText(model.getValueAt(Myindex, 2).toString());
    //CustAddress.setText(model.getValueAt(Myindex, 3).toString());
    //CustDues.setText(model.getValueAt(Myindex, 4).toString());

}//GEN-LAST:event_CustTableMouseClicked

private void vieworderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vieworderMouseClicked
try{
    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/csmsdb","root","");
PreparedStatement add=Con.prepareStatement("select * from ORDERTABLE");
ResultSet rs=add.executeQuery();
            java.sql.ResultSetMetaData rsmd=rs.getMetaData();
int n=rsmd.getColumnCount();
DefaultTableModel dtm=(DefaultTableModel)billtbl.getModel();
dtm.setRowCount(0);
while(rs.next()){
    Vector v=new Vector();
    for(int j=1;j<=n;j++)
    {
        v.add(rs.getInt("OrderID"));
        v.add(rs.getString("CustName"));
        v.add(ProPricep.getText());
        v.add(ProQtyp.getText());
        v.add(rs.getString("Amount"));
}
    dtm.addRow(v);
}




}catch(SQLException e)
{
    e.printStackTrace();
}
       
}//GEN-LAST:event_vieworderMouseClicked

 
 
private void billtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billtblMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_billtblMouseClicked

private void printbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseClicked
        try {
            billtbl.print();// TODO add your handling code here:
        } catch (Exception exp) {
            exp.printStackTrace();
        }
}//GEN-LAST:event_printbtnMouseClicked

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Order().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustTable;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JButton HomeP;
    private javax.swing.JTextField ProPricep;
    private javax.swing.JTextField ProQtyp;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton addorder;
    private javax.swing.JButton addto;
    private javax.swing.JTable billtbl;
    private javax.swing.JLabel custnamelbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField order;
    private javax.swing.JButton printbtn;
    private javax.swing.JLabel totamtlbl;
    private javax.swing.JLabel totamtlbl1;
    private javax.swing.JButton vieworder;
    // End of variables declaration//GEN-END:variables
}
