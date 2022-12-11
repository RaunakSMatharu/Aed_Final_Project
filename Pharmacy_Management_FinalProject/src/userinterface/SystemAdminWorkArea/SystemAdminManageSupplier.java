/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Supplier.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class SystemAdminManageSupplier extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminManageSupplier
     */
     private JPanel userProcessContainerSMR;
    private EcoSystem ecosystem;
    private String user;
    public SystemAdminManageSupplier(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainerSMR = userProcessContainer;
        this.ecosystem = ecosystem;
        this.user = user;
        txtSupplierName.setEnabled(false);
        txtAddress.setEnabled(false);

        btnSubmit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnView.setEnabled(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSupplierName = new javax.swing.JTextField();
        lblSupplierName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        txtSupplierName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtSupplierName);
        txtSupplierName.setBounds(450, 320, 300, 40);

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSupplierName.setText("Supplier Name:");
        add(lblSupplierName);
        lblSupplierName.setBounds(300, 330, 122, 18);

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress);
        lblAddress.setBounds(350, 390, 80, 21);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Supplier");
        add(lblTitle);
        lblTitle.setBounds(270, 20, 445, 29);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete Button.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(20, 280, 130, 54);

        btnView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View Button.png"))); // NOI18N
        btnView.setText("View");
        btnView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView);
        btnView.setBounds(20, 200, 130, 50);

        btnCreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create Button.png"))); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate);
        btnCreate.setBounds(20, 370, 130, 54);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back Button.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(20, 20, 130, 50);

        tblSupplier.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Serial No", "Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSupplier);

        add(jScrollPane2);
        jScrollPane2.setBounds(240, 86, 690, 200);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(530, 470, 100, 40);

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtAddress);
        txtAddress.setBounds(450, 380, 300, 40);
        add(jLabel4);
        jLabel4.setBounds(0, 0, 1030, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int selectedRowSAMR = tblSupplier.getSelectedRow();
        if (selectedRowSAMR >= 0)
        {
            Supplier selectedSupplier = (Supplier) tblSupplier.getValueAt(selectedRowSAMR, 1);
            ecosystem.getSupplierDirectory().deleteSupplier(selectedSupplier);
            JOptionPane.showMessageDialog(null, "Supplier " + selectedSupplier.getName()+ " deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
       btnCreate.setEnabled(false);
        txtSupplierName.setEnabled(true);
        txtAddress.setEnabled(true);
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Supplier s = ecosystem.getSupplierDirectory().createSupplier(txtSupplierName.getText(), txtAddress.getText());
        if(s == null)
        {
            JOptionPane.showMessageDialog(null,"Supplier " + txtSupplierName.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Supplier created successfully as " + s.getName());
            btnCreate.setEnabled(true);
            txtSupplierName.setEnabled(false);
            txtAddress.setEnabled(false);
            btnSubmit.setEnabled(false);
            txtSupplierName.setText("");
            txtAddress.setText("");
        }
        populateTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblSupplier.getSelectedRow();
        if (selectedRow >= 0)
        {
            Supplier selectedSupplier = (Supplier) tblSupplier.getValueAt(selectedRow, 1);
            SystemAdminManageSupplierEmployee se = new SystemAdminManageSupplierEmployee(userProcessContainerSMR, selectedSupplier, ecosystem);
            userProcessContainerSMR.add("SysAdminManageEmployees", se);
            CardLayout layout = (CardLayout) userProcessContainerSMR.getLayout();
            layout.next(userProcessContainerSMR);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainerSMR.remove(this);
        Component[] componentArray = userProcessContainerSMR.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel dwjp = (SystemAdminWorkAreaJPanel) component;
        //dwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainerSMR.getLayout();
        layout.previous(userProcessContainerSMR);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblSupplier.getSelectedRow();
        if (selectedRow >= 0)
        {
            btnDelete.setEnabled(true);
            btnView.setEnabled(true);
        }
    }//GEN-LAST:event_tblSupplierMouseClicked

                                       


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables
 
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)tblSupplier.getModel();
        dtm.setRowCount(0);
        int count1 = 1;
        if(ecosystem.getSupplierDirectory().getSupplierList()!= null)
        {
            for(Supplier s : ecosystem.getSupplierDirectory().getSupplierList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = s.getId();
                row[1] = s;
                row[2] = s.getAddress();
                dtm.addRow(row);
                count1++;
            }
        }
        else
        {
            tblSupplier.setEnabled(false);
        }
    }
}
