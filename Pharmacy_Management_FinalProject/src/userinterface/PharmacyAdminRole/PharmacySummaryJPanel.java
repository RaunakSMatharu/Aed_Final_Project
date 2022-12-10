/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PharmacyAdminRole;

import Business.EcoSystem;
import Business.Pharmacy.Pharmacy;
import Business.Supplier.Supplier;
import Business.SupplierMedicineItem.SupplierMedicineItem;
import Business.SupplierOrders.SupplierOrders;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ruchikapadiwala
 */
public class PharmacySummaryJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;

    private UserAccount user;
    private Pharmacy pharmacy;
    private EcoSystem system;
    /**
     * Creates new form PharmacySummaryJPanel
     */
    public PharmacySummaryJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Pharmacy pharmacy) {
        initComponents();
        this.userProcessContainer = userProcessContainer;     
        this.user = account;
        this.system = system;
        System.out.println(system.getPharmacyDirectory().getPharmacyList());
        this.pharmacy = pharmacy;
        enterpriseLabel.setText(this.pharmacy + "'s orders");
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Order From", "Total Amount", "Message", "Delivery Man", "Delivered?", "Order Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 90, 730, 110);

        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        requestTestJButton.setText("Add Message >");
        requestTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton);
        requestTestJButton.setBounds(750, 250, 150, 50);

        refreshTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton);
        refreshTestJButton.setBounds(750, 20, 150, 40);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        enterpriseLabel.setText("<>");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(20, 30, 251, 30);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(30, 320, 110, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            if((workRequestJTable.getValueAt(selectedRow, 1)) == null)
            {
                JOptionPane.showMessageDialog(null,"Order is not live anymore!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                SupplierOrders so = (SupplierOrders) workRequestJTable.getValueAt(selectedRow, 0);
                PharmacyRequestJPanel fs = new PharmacyRequestJPanel(userProcessContainer, so);
                userProcessContainer.add("SysAdminManageEmployees", fs);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        if(workRequestJTable.getRowCount() > 0)
        {
            populateRequestTable();
            JOptionPane.showMessageDialog(null, "Table refreshed!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nothing to refresh!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
    public void populateRequestTable() {
        if(pharmacy.getPastSupplierOrderList() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel)workRequestJTable.getModel();
            dtm.setRowCount(0);
            
            refreshTestJButton.setEnabled(true);
            requestTestJButton.setEnabled(true);
            int count = 1;
            for(SupplierOrders so : pharmacy.getPastSupplierOrderList())
            {
                if(system.getSupplierDirectory().getSupplierList() != null)
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = so;
                    for(Supplier s : system.getSupplierDirectory().getSupplierList())
                    {
                        for(SupplierOrders or : s.getSupplierOrderDirectory().getSupplierOrderList())
                        {
                          if(so.equals(or))
                          {
                              row[1] = s;
                          }
                        }
                    }
                    row[2] = so.getTotalAmount();
                    row[3] = so.getMessage();
                    row[4] = so.getSupplierDeliveryMan();
                    if(so.isStatus())
                    {
                        row[5] = "Yes";
                    }
                    else
                    {
                        row[5] = "No";
                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[6] = so.getOrderDate().format(formatter);
                    dtm.addRow(row);
                    count++;
                }
            }
        }
    }
}