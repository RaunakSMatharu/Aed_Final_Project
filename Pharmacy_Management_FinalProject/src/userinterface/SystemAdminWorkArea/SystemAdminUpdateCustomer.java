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
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliveryManRole;
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
public class SystemAdminUpdateCustomer extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminUpdateCustomer
     */
    private JPanel userProcessContainerSAUC;
    private EcoSystem ecosystemSAUC;
    private Customer customerSAUC;
    public SystemAdminUpdateCustomer(JPanel userProcessContainer, Customer customer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainerSAUC = userProcessContainer;
        this.customerSAUC = customer;
        this.ecosystemSAUC = ecosystem;;
        txtName.setText(customer.getName());
        txtPhoneNumber.setText(customer.getPhone());
        txtAddress.setText(customer.getAddress());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackSAUC = new javax.swing.JButton();
        btnSubmitSAUC = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnBackSAUC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBackSAUC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back Button.png"))); // NOI18N
        btnBackSAUC.setText("Back");
        btnBackSAUC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackSAUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSAUCActionPerformed(evt);
            }
        });
        add(btnBackSAUC);
        btnBackSAUC.setBounds(30, 30, 110, 50);

        btnSubmitSAUC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSubmitSAUC.setText("Submit");
        btnSubmitSAUC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmitSAUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitSAUCActionPerformed(evt);
            }
        });
        add(btnSubmitSAUC);
        btnSubmitSAUC.setBounds(440, 370, 160, 39);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Update Customer");
        add(lblTitle);
        lblTitle.setBounds(380, 50, 350, 29);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(340, 160, 51, 30);

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtName);
        txtName.setBounds(460, 163, 260, 30);

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPhoneNumber);
        txtPhoneNumber.setBounds(460, 220, 260, 30);

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber);
        lblPhoneNumber.setBounds(270, 220, 130, 30);

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress);
        lblAddress.setBounds(320, 280, 70, 30);

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAddress);
        txtAddress.setBounds(460, 280, 260, 30);
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1030, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackSAUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSAUCActionPerformed
        // TODO add your handling code here:
        userProcessContainerSAUC.remove(this);
        CardLayout layout = (CardLayout) userProcessContainerSAUC.getLayout();
        layout.previous(userProcessContainerSAUC);
    }//GEN-LAST:event_btnBackSAUCActionPerformed

    private void btnSubmitSAUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitSAUCActionPerformed
        // TODO add your handling code here:
        if(validateThisSAUC())
        {
            customerSAUC.setAddress(txtAddress.getText());
            customerSAUC.setPhone(txtPhoneNumber.getText());
            JOptionPane.showMessageDialog(null, "Details for " + customerSAUC.getName()+ " updated successfully!");
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_btnSubmitSAUCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSAUC;
    private javax.swing.JButton btnSubmitSAUC;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

     private boolean validateThisSAUC() {
        String regex = "\\d{10}";
        if(("".equals(txtPhoneNumber.getText())) || ("".equals(txtAddress.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPhoneNumber.getText().matches(regex)))
        {
            JOptionPane.showMessageDialog(null,"Phone number must have only 10 digits!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
}
