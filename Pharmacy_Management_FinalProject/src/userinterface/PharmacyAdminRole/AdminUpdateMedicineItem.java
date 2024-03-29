/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PharmacyAdminRole;

import Business.MedicineItems.MedicineItem;
import Business.Pharmacy.Pharmacy;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruchikapadiwala
 */
public class AdminUpdateMedicineItem extends javax.swing.JPanel {

    /**
     * Creates new form AdminUpdateFoodItem
     */
    JPanel userProcessContainer;
    Pharmacy pharmacy;
    MedicineItem medicineItem;
    public AdminUpdateMedicineItem(JPanel userProcessContainer, MedicineItem mi) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.medicineItem = mi;
        txtName.setText(mi.getName());
        spinnerPrice.setValue(mi.getPrice());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        spinnerPrice = new javax.swing.JSpinner();
        btnSubmit = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setLayout(null);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("             Name:");
        add(lblName);
        lblName.setBounds(190, 240, 140, 50);

        lblPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPrice.setText("               Price:");
        add(lblPrice);
        lblPrice.setBounds(190, 320, 140, 50);

        spinnerPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        spinnerPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(spinnerPrice);
        spinnerPrice.setBounds(350, 320, 460, 50);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(640, 440, 160, 50);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("Update Medicine");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(460, 140, 197, 30);

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
        btnBack.setBounds(70, 60, 170, 60);

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtName);
        txtName.setBounds(350, 240, 460, 50);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/46c6cc94a14f2da88997d4df1d5efde7.jpg"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1030, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if((Integer)spinnerPrice.getValue() > 0)
        {
            medicineItem.setPrice((Integer)spinnerPrice.getValue());
            JOptionPane.showMessageDialog(null, "Medicine " + medicineItem.getName()+ " updated successfully!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Price must be greater than 0!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminManageMedicine dwjp = (AdminManageMedicine) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JSpinner spinnerPrice;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
