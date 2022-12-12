/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalRole;



import Business.EcoSystem;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Customer.Customer;
import Business.Hospital.Hospital;
import Business.Pharmacy.Pharmacy;
import userinterface.CustomerRole.CustomerOrderAction;
import userinterface.HospitalRole.HospitalOrderAction;

/**
 *
 * @author HOME
 */
public class HospitalAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    Pharmacy pharmacy;
    EcoSystem system;
    
    Hospital hospital;
    
    public HospitalAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;  
        this.userAccount = useraccount;
        this.system = system;
        
        for(Hospital h : system.getHospitalDirectory().getHospitalList() )
        {
            
                if(h.getHospitalName() == null ? useraccount.getEmployee().getName()== null : h.getHospitalName().equals(useraccount.getEmployee().getName()))
                {
                    this.hospital = h;
                }
           
        }
        
        HospitalNametext.setText(this.hospital.getHospitalName());
        HospitalAddressText.setText(this.hospital.getHospitalAddress());
        HospitalContactText.setText(this.hospital.getHospitalContactNo());
        
        valueLabel2.setText(this.hospital.getHospitalName());
        PharmacyComboBox.addItem("");
        for(Pharmacy p : system.getPharmacyDirectory().getPharmacyList())
        {
            PharmacyComboBox.addItem(p.getName());
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

        valueLabel2 = new javax.swing.JLabel();
        PharmacyComboBox = new javax.swing.JComboBox<>();
        PharmacyLabel = new javax.swing.JLabel();
        UpdateDetailLabels = new javax.swing.JLabel();
        CustomerNameLabel = new javax.swing.JLabel();
        HospitalNametext = new javax.swing.JTextField();
        CustomerContactNoLabel = new javax.swing.JLabel();
        HospitalContactText = new javax.swing.JTextField();
        CustomerAddressLabel = new javax.swing.JLabel();
        HospitalAddressText = new javax.swing.JTextField();

        valueLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        valueLabel2.setText("<value>");

        PharmacyComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PharmacyComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PharmacyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyComboBoxActionPerformed(evt);
            }
        });

        PharmacyLabel.setBackground(new java.awt.Color(255, 255, 255));
        PharmacyLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PharmacyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PharmacyLabel.setText("Select a Pharmacy:");

        UpdateDetailLabels.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        UpdateDetailLabels.setText("Hospital details");

        CustomerNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CustomerNameLabel.setText("Name:");

        HospitalNametext.setEditable(false);
        HospitalNametext.setBackground(new java.awt.Color(255, 255, 255));
        HospitalNametext.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        HospitalNametext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CustomerContactNoLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CustomerContactNoLabel.setText("Phone:");

        HospitalContactText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        HospitalContactText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CustomerAddressLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CustomerAddressLabel.setText("Address:");

        HospitalAddressText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        HospitalAddressText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(UpdateDetailLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CustomerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CustomerContactNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CustomerAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(HospitalNametext, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(HospitalContactText)
                                .addComponent(HospitalAddressText)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(PharmacyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PharmacyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(valueLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PharmacyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PharmacyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(UpdateDetailLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerNameLabel))
                    .addComponent(HospitalNametext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CustomerContactNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(HospitalContactText))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospitalAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyComboBoxActionPerformed
        // TODO add your handling code here:
        if(PharmacyComboBox.getSelectedItem() != "")
        {
            String phar = PharmacyComboBox.getSelectedItem().toString();
            pharmacy = system.getPharmacyDirectory().findPharmacy(phar);
            HospitalOrderAction cpo = new HospitalOrderAction(userProcessContainer, hospital, pharmacy);
            userProcessContainer.add("CustomerOrder", cpo);
            CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_PharmacyComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerAddressLabel;
    private javax.swing.JLabel CustomerContactNoLabel;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JTextField HospitalAddressText;
    private javax.swing.JTextField HospitalContactText;
    private javax.swing.JTextField HospitalNametext;
    private javax.swing.JComboBox<String> PharmacyComboBox;
    private javax.swing.JLabel PharmacyLabel;
    private javax.swing.JLabel UpdateDetailLabels;
    private javax.swing.JLabel valueLabel2;
    // End of variables declaration//GEN-END:variables
}
