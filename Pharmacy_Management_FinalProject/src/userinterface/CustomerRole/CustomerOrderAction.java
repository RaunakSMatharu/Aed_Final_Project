/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;
import Business.Customer.Customer;
import Business.MedicineItems.MedicineItem;
import Business.Orders.Orders;
import Business.Pharmacy.Pharmacy;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Raunak Singh Matharu
 */
public class CustomerOrderAction extends javax.swing.JPanel {

    /**
     * Creates new form CustomerOrderAction
     */
    
    JPanel userProcessContainer;
    Customer customer;
    Pharmacy pharma;
    Orders orders;
    int totalAmount = 0;
    
    ArrayList<MedicineItem> cart = new ArrayList<MedicineItem>();
    
    public CustomerOrderAction(JPanel userProcessContainer, Customer customer, Pharmacy pharmacy) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customer = customer;
        this.pharma = pharmacy;
        lblPharmacy.setText("Pharmacy: " +this.pharma.getName());
        populateMedicine(); 
        populateOrder();
        if(tblOrders.getRowCount() <= 0)
        {
            btnConfirm.setEnabled(false);
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

        lblPharmacy = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicines = new javax.swing.JTable();
        btnOrder = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(null);

        lblPharmacy.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPharmacy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPharmacy.setText("<value>");
        add(lblPharmacy);
        lblPharmacy.setBounds(260, 50, 481, 30);

        tblOrders.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No", "Medicine Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 340, 670, 150);

        tblMedicines.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine No", "Medicine Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicinesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMedicines);

        add(jScrollPane2);
        jScrollPane2.setBounds(170, 104, 670, 140);

        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder);
        btnOrder.setBounds(680, 270, 157, 37);

        txtAmount.setEditable(false);
        txtAmount.setBackground(new java.awt.Color(255, 255, 255));
        txtAmount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAmount);
        txtAmount.setBounds(680, 540, 159, 30);

        lblTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTotal.setText("Total Amount:");
        add(lblTotal);
        lblTotal.setBounds(550, 550, 100, 15);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(310, 530, 100, 40);

        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        add(btnConfirm);
        btnConfirm.setBounds(680, 580, 160, 40);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(170, 530, 90, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void tblMedicinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinesMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblMedicines.getSelectedRow();
        if (selectedRow >= 0)
        {
            btnOrder.setEnabled(true);
        }
    }//GEN-LAST:event_tblMedicinesMouseClicked

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedicines.getSelectedRow();
        if (selectedRow >= 0)
        {
            MedicineItem mi2 = (MedicineItem) tblMedicines.getValueAt(selectedRow, 1);

            cart.add(mi2);
            JOptionPane.showMessageDialog(null, "Medicine Item " + mi2.getName()+ " added to cart successfully!");
            totalAmount = totalAmount + mi2.getPrice();
            populateOrder();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow1 = tblOrders.getSelectedRow();
        if (selectedRow1 >= 0)
        {
            MedicineItem mi1 = (MedicineItem) tblOrders.getValueAt(selectedRow1, 1);
            //order.deleteFoodItem(fi);
            cart.remove(mi1);
            JOptionPane.showMessageDialog(null, "Medicine Item " + mi1.getName()+ " deleted from cart successfully!");
            totalAmount = totalAmount - mi1.getPrice();
            populateOrder();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        orders = pharma.getOrderDirectory().createNewOrder(customer);
        for(MedicineItem mo : cart)
        {
            orders.addItem(mo);
        }
        orders.calculateTotalAmount();
      
        JOptionPane.showMessageDialog(null, "Thank you for your order! Order of " + orders.getMedicineItemList().size() + " medicine item(s) for amount $" + orders.getTotalAmount() + " is placed successfully!");
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblMedicines;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
private void populateMedicine() {
        DefaultTableModel dtm = (DefaultTableModel)tblMedicines.getModel();
        dtm.setRowCount(0);
        if(pharma.getMedicineCatalog().getMedicineItemList() != null)
        {
            for(MedicineItem mi : pharma.getMedicineCatalog().getMedicineItemList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = mi.getId();
                row[1] = mi;
                row[2] = mi.getPrice();
                dtm.addRow(row);
            }
        }
        if(dtm.getRowCount() == 0)
            {
                btnOrder.setEnabled(false);
                btnDelete.setEnabled(false);
            }
    }

    private void populateOrder() {
        DefaultTableModel dtm = (DefaultTableModel)tblOrders.getModel();
        dtm.setRowCount(0);
        if(cart != null)
        {
            btnDelete.setEnabled(true);
            btnConfirm.setEnabled(true);
            int count = 1;
            for(MedicineItem mi3 : cart)
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = count;
                row[1] = mi3;
                row[2] =  mi3.getPrice();
                dtm.addRow(row);
                count++;
            }
            txtAmount.setText(Integer.toString(totalAmount));
        }
        if(tblOrders.getRowCount() <= 0)
        {
            btnConfirm.setEnabled(false);
            btnDelete.setEnabled(false);
        }
    }

}
