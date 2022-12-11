/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;


import Business.EcoSystem;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Home
 */
public class SystemUpdateSupplierEmployee extends javax.swing.JPanel {

    /**
     * Creates new form SystemUpdateSupplierEmployee
     */
    private JPanel userProcessContainerSUE;
    private Employee employeeSUE;
    private EcoSystem ecosystemSUE;
    private UserAccount userSUE;
    
    public SystemUpdateSupplierEmployee(JPanel userProcessContainer, Employee employee, EcoSystem system) {
        initComponents();
        this.userProcessContainerSUE = userProcessContainer;
        this.employeeSUE = employee;
        this.ecosystemSUE = system;
        this.userSUE = ecosystemSUE.getUserAccountDirectory().findEmployee(employee);
        txtUsername.setText(userSUE.getUsername());
        txtPassword.setText(userSUE.getPassword());
        txtConfirmPassword.setText(userSUE.getPassword());
        txtName.setText(employee.getName());
        txtPhoneNumber.setText(employee.getPhone());
        txtAddress.setText(employee.getAddress());
        if(this.userSUE.getRole().toString().equals("Business.Role.DeliverManRole"))
        {
            radioBtnDelivery.setSelected(true);
        }
        else
        {
            radioBtnManager.setSelected(true);
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

        txtName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        radioBtnManager = new javax.swing.JRadioButton();
        txtPhoneNumber = new javax.swing.JTextField();
        lblConfirmPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        radioBtnDelivery = new javax.swing.JRadioButton();
        lblPhoneNumber = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        txtName.setEditable(false);
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtName);
        txtName.setBounds(430, 290, 310, 30);

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password: ");
        add(lblPassword);
        lblPassword.setBounds(250, 200, 170, 30);

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
        btnBack.setBounds(30, 30, 110, 50);

        radioBtnManager.setBackground(new java.awt.Color(255, 255, 255));
        radioBtnManager.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioBtnManager.setText("Supplier Manager");
        radioBtnManager.setEnabled(false);
        add(radioBtnManager);
        radioBtnManager.setBounds(430, 420, 180, 25);

        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPhoneNumber);
        txtPhoneNumber.setBounds(430, 330, 310, 30);

        lblConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmPassword.setText("Confirm Password:");
        add(lblConfirmPassword);
        lblConfirmPassword.setBounds(250, 241, 170, 30);

        txtUsername.setEditable(false);
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtUsername);
        txtUsername.setBounds(430, 150, 310, 30);

        radioBtnDelivery.setBackground(new java.awt.Color(255, 255, 255));
        radioBtnDelivery.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioBtnDelivery.setText("Delivery Man");
        radioBtnDelivery.setEnabled(false);
        add(radioBtnDelivery);
        radioBtnDelivery.setBounds(430, 470, 180, 25);

        lblPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber);
        lblPhoneNumber.setBounds(250, 330, 170, 30);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(440, 520, 130, 40);

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPassword);
        txtPassword.setBounds(430, 200, 310, 30);

        lblAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress.setText("Address:");
        add(lblAddress);
        lblAddress.setBounds(250, 371, 170, 30);

        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtConfirmPassword);
        txtConfirmPassword.setBounds(430, 240, 310, 30);

        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAddress);
        txtAddress.setBounds(430, 370, 310, 30);

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Username: ");
        add(lblUsername);
        lblUsername.setBounds(250, 151, 170, 30);

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(250, 290, 170, 30);

        lblRole.setBackground(new java.awt.Color(255, 255, 255));
        lblRole.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Role:");
        add(lblRole);
        lblRole.setBounds(250, 420, 170, 21);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setText("Update Employee Information");
        add(lblTitle);
        lblTitle.setBounds(370, 50, 350, 50);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hero-header.png"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1030, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainerSUE.remove(this);
        CardLayout layout = (CardLayout) userProcessContainerSUE.getLayout();
        layout.previous(userProcessContainerSUE);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(validateThisSUE())
        {
            userSUE.setPassword(txtPassword.getText());
            employeeSUE.setAddress(txtAddress.getText());
            employeeSUE.setPhone((txtPhoneNumber.getText()));
            JOptionPane.showMessageDialog(null, "Details for " + employeeSUE.getName()+ " updated successfully!");
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton radioBtnDelivery;
    private javax.swing.JRadioButton radioBtnManager;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables


private boolean validateThisSUE() {
        String regex = "\\d{10}";
        if(("".equals(txtPassword.getText())) || ("".equals(txtConfirmPassword.getText())) 
                || ("".equals(txtPhoneNumber.getText())) || ("".equals(txtAddress.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPassword.getText().equals(txtConfirmPassword.getText())))
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match!", "Warning", JOptionPane.WARNING_MESSAGE);
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

