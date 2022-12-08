/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SupplierDeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Orders.Orders;
import Business.Pharmacy.Pharmacy;
import Business.Supplier.Supplier;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.SupplierOrders.SupplierOrders;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raunak Singh Matharu
 */
public class SupplierDeliveryManWorkArea extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Supplier supplier;
    private SupplierDeliveryMan supplierDeliveryMan;
    /**
     * Creates new form SupplierDeliveryManWorkArea
     */
    public SupplierDeliveryManWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        
        for(Supplier s : business.getSupplierDirectory().getSupplierList())
        {
            if(s.findSupplierDeliveryMan(account.getEmployee().getName()) != null)
            {
                this.supplierDeliveryMan = s.findSupplierDeliveryMan(account.getEmployee().getName());
                this.supplier = s;
                break;
            }
        }
        lblDeliveryMan.setText("Orders to be delivered by " + this.supplierDeliveryMan);
        
//        if(workRequestJTable.getRowCount() > 0)
//        {
            populateTable();
//        }
    }
 public void populateTable(){
        if(supplier.getSupplierOrderDirectory() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel)workRequestJTable.getModel();
            dtm.setRowCount(0);
            for(SupplierOrders so : supplier.getSupplierOrderDirectory().getSupplierOrderList())
            {
                if(so.getSupplierDeliveryMan().equals(supplierDeliveryMan))
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = so;
                    row[1] = so.getTotalAmount();
                    row[2] = so.getMessage();
                    row[3] = so.getSupplierDeliveryMan();
                    if(so.isStatus())
                    {
                        row[4] = "Yes";
                    }
                    else
                    {
                        row[4] = "No";
                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[5] = so.getOrderDate().format(formatter);
                    dtm.addRow(row);
                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        lblDeliveryMan = new javax.swing.JLabel();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Price", "Message", "Delivery Man", "Delivered?", "Order Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane1.setBounds(20, 180, 910, 100);

        lblDeliveryMan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDeliveryMan.setText("<>");
        add(lblDeliveryMan);
        lblDeliveryMan.setBounds(88, 68, 400, 20);

        processJButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        processJButton.setText("Process");
        processJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton);
        processJButton.setBounds(690, 340, 110, 50);

        refreshJButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton);
        refreshJButton.setBounds(690, 70, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MicrosoftTeams-image (4).png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 80, 1080, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
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
                SupplierProcessDeliveryWorkArea fs = new SupplierProcessDeliveryWorkArea(userProcessContainer, so);
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
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        if(workRequestJTable.getRowCount() > 0)
        {
            populateTable();
            JOptionPane.showMessageDialog(null, "Table refreshed!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nothing to refresh!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeliveryMan;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
