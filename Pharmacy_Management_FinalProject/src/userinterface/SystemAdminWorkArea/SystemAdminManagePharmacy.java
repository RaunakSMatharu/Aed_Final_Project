/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Pharmacy.Pharmacy;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Home
 */
public class SystemAdminManagePharmacy extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminManagePharmacy
     */
    
        private JPanel userProcessContainerSAMR;
    private EcoSystem ecosystem;
    private String user;
    
    public SystemAdminManagePharmacy(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainerSAMR = userProcessContainer;
        this.ecosystem = ecosystem;
        this.user = user;
        txtNameSAMR.setEnabled(false);
        txtAddressSAMR.setEnabled(false);

        btnSubmitSAMR.setEnabled(false);
        btnDeleteSAMR.setEnabled(false);
        btnManageSAMR.setEnabled(false);
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

        btnDeleteSAMR = new javax.swing.JButton();
        btnNewPharmacy = new javax.swing.JButton();
        txtNameSAMR = new javax.swing.JTextField();
        txtAddressSAMR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSubmitSAMR = new javax.swing.JButton();
        btnManageSAMR = new javax.swing.JButton();
        btnBackSAMR = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPharmacy = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnDeleteSAMR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDeleteSAMR.setText("Delete Pharmacy");
        btnDeleteSAMR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteSAMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSAMRActionPerformed(evt);
            }
        });
        add(btnDeleteSAMR);
        btnDeleteSAMR.setBounds(10, 135, 120, 44);

        btnNewPharmacy.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnNewPharmacy.setText("Create Pharmacy ");
        btnNewPharmacy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNewPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPharmacyActionPerformed(evt);
            }
        });
        add(btnNewPharmacy);
        btnNewPharmacy.setBounds(10, 189, 120, 43);

        txtNameSAMR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtNameSAMR);
        txtNameSAMR.setBounds(427, 187, 228, 19);

        txtAddressSAMR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAddressSAMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressSAMRActionPerformed(evt);
            }
        });
        add(txtAddressSAMR);
        txtAddressSAMR.setBounds(427, 218, 228, 19);

        jLabel1.setText("Pharmacy Name:");
        add(jLabel1);
        jLabel1.setBounds(265, 191, 144, 18);

        jLabel2.setText("Address:");
        add(jLabel2);
        jLabel2.setBounds(265, 221, 144, 17);

        btnSubmitSAMR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSubmitSAMR.setText("Submit");
        btnSubmitSAMR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmitSAMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitSAMRActionPerformed(evt);
            }
        });
        add(btnSubmitSAMR);
        btnSubmitSAMR.setBounds(551, 270, 104, 34);

        btnManageSAMR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnManageSAMR.setText("View Pharmacy");
        btnManageSAMR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageSAMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSAMRActionPerformed(evt);
            }
        });
        add(btnManageSAMR);
        btnManageSAMR.setBounds(10, 84, 120, 45);

        btnBackSAMR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBackSAMR.setText("< Back");
        btnBackSAMR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackSAMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSAMRActionPerformed(evt);
            }
        });
        add(btnBackSAMR);
        btnBackSAMR.setBounds(10, 20, 79, 21);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Pharmacy");
        add(lblTitle);
        lblTitle.setBounds(123, 18, 445, 29);

        tblPharmacy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No.", "Pharmacy Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPharmacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPharmacyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPharmacy);

        add(jScrollPane1);
        jScrollPane1.setBounds(178, 81, 477, 95);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1);
        jSeparator1.setBounds(161, 11, 11, 293);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Admin_Manage-Pharmacy.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(170, 10, 500, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteSAMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSAMRActionPerformed
        // TODO add your handling code here:
        int selectedRowSAMR = tblPharmacy.getSelectedRow();
        if (selectedRowSAMR >= 0)
        {
            Pharmacy selectedPharmacy = (Pharmacy) tblPharmacy.getValueAt(selectedRowSAMR, 1);
            ecosystem.getPharmacyDirectory().deletePharmacy(selectedPharmacy);
            JOptionPane.showMessageDialog(null, "Pharmacy " + selectedPharmacy.getName()+ " deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeleteSAMRActionPerformed

    private void btnNewPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPharmacyActionPerformed
        // TODO add your handling code here:
         btnNewPharmacy.setEnabled(false);
        txtNameSAMR.setEnabled(true);
        txtAddressSAMR.setEnabled(true);
        btnSubmitSAMR.setEnabled(true);
    }//GEN-LAST:event_btnNewPharmacyActionPerformed

    private void txtAddressSAMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressSAMRActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtAddressSAMRActionPerformed

    private void btnSubmitSAMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitSAMRActionPerformed
        // TODO add your handling code here:
         Pharmacy p = ecosystem.getPharmacyDirectory().createPharmacy(txtNameSAMR.getText(), txtAddressSAMR.getText());
        if(p == null)
        {
            JOptionPane.showMessageDialog(null,"Pharmacy " + txtNameSAMR.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Pharmacy created successfully as " + p.getName());
            btnNewPharmacy.setEnabled(true);
            txtNameSAMR.setEnabled(false);
            txtAddressSAMR.setEnabled(false);
            btnSubmitSAMR.setEnabled(false);
            txtNameSAMR.setText("");
            txtAddressSAMR.setText("");
        }
        populateTable();
    }//GEN-LAST:event_btnSubmitSAMRActionPerformed

    private void btnManageSAMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSAMRActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPharmacy.getSelectedRow();
        if (selectedRow >= 0)
        {
            Pharmacy selectedPharmacy = (Pharmacy) tblPharmacy.getValueAt(selectedRow, 1);
            SystemManageEmployees fs = new SystemManageEmployees(userProcessContainerSAMR, selectedPharmacy, ecosystem);
            userProcessContainerSAMR.add("SysAdminManageEmployees", fs);
            CardLayout layout = (CardLayout) userProcessContainerSAMR.getLayout();
            layout.next(userProcessContainerSAMR);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnManageSAMRActionPerformed

    private void btnBackSAMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSAMRActionPerformed
        // TODO add your handling code here:
         userProcessContainerSAMR.remove(this);
        Component[] componentArray = userProcessContainerSAMR.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel dwjp = (SystemAdminWorkAreaJPanel) component;
        //dwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainerSAMR.getLayout();
        layout.previous(userProcessContainerSAMR);
    }//GEN-LAST:event_btnBackSAMRActionPerformed

    private void tblPharmacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPharmacyMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblPharmacy.getSelectedRow();
        if (selectedRow >= 0)
        {
            btnDeleteSAMR.setEnabled(true);
            btnManageSAMR.setEnabled(true);
        }
    }//GEN-LAST:event_tblPharmacyMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSAMR;
    private javax.swing.JButton btnDeleteSAMR;
    private javax.swing.JButton btnManageSAMR;
    private javax.swing.JButton btnNewPharmacy;
    private javax.swing.JButton btnSubmitSAMR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPharmacy;
    private javax.swing.JTextField txtAddressSAMR;
    private javax.swing.JTextField txtNameSAMR;
    // End of variables declaration//GEN-END:variables

   private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)tblPharmacy.getModel();
        dtm.setRowCount(0);
        int count1 = 1;
        if(ecosystem.getPharmacyDirectory().getPharmacyList() != null)
        {
            for(Pharmacy p : ecosystem.getPharmacyDirectory().getPharmacyList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = p.getId();
                row[1] = p;
                row[2] = p.getAddress();
                dtm.addRow(row);
                count1++;
            }
        }
        else
        {
            tblPharmacy.setEnabled(false);
        }
    }
}

        
    

