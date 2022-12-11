/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
//import Business.Role.AdminRole;
import Business.Role.DeliveryManRole;
import Business.Role.SupplierDeliveryManRole;
import Business.Role.SupplierAdminRole;
import Business.Supplier.Supplier;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Home
 */
public class SystemAdminManageSupplierEmployee extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminManageSupplierEmployee
     */
        private JPanel userProcessContainer;
        private Supplier supplier;
        private String user;
        private EcoSystem ecosystem;
    
    public SystemAdminManageSupplierEmployee(JPanel userProcessContainer, Supplier supplier, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        this.ecosystem = ecosystem;
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
        txtConfirmPassword.setEnabled(false);
        txtName.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
        txtAddress.setEnabled(false);
        BtnSubmit.setEnabled(false);
        BtnDelete.setEnabled(false);
        BtnView.setEnabled(false);
        radioBtnDelivery.setEnabled(false);
        radioBtnManager.setEnabled(false);
        populateSupplierEmpTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnBack = new javax.swing.JButton();
        BtnView = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnCreate = new javax.swing.JButton();
        BtnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageSupplierEmp = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        radioBtnDelivery = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        radioBtnManager = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        BtnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back Button.png"))); // NOI18N
        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        add(BtnBack);
        BtnBack.setBounds(30, 30, 120, 50);

        BtnView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View Button.png"))); // NOI18N
        BtnView.setText("View");
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });
        add(BtnView);
        BtnView.setBounds(20, 130, 130, 50);

        BtnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete Button.png"))); // NOI18N
        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });
        add(BtnDelete);
        BtnDelete.setBounds(20, 210, 130, 50);

        BtnCreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create Button.png"))); // NOI18N
        BtnCreate.setText("Create");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });
        add(BtnCreate);
        BtnCreate.setBounds(20, 290, 130, 50);

        BtnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnSubmit.setText("Submit");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });
        add(BtnSubmit);
        BtnSubmit.setBounds(490, 600, 120, 40);

        tblManageSupplierEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee NO", "Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManageSupplierEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManageSupplierEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManageSupplierEmp);

        add(jScrollPane1);
        jScrollPane1.setBounds(240, 140, 720, 170);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setText("Manage Employee");
        add(lblTitle);
        lblTitle.setBounds(470, 40, 191, 29);

        txtUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtUsername);
        txtUsername.setBounds(340, 340, 200, 27);

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtPhoneNumber);
        txtPhoneNumber.setBounds(690, 390, 300, 30);

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber);
        lblPhoneNumber.setBounds(550, 390, 130, 30);

        radioBtnDelivery.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioBtnDelivery.setText("Delivery Agent");
        radioBtnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnDeliveryActionPerformed(evt);
            }
        });
        add(radioBtnDelivery);
        radioBtnDelivery.setBounds(520, 500, 140, 30);

        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtPassword);
        txtPassword.setBounds(340, 390, 200, 30);

        txtConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtConfirmPassword);
        txtConfirmPassword.setBounds(340, 440, 200, 28);

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress);
        lblAddress.setBounds(610, 440, 70, 30);

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUsername.setText("Username: ");
        add(lblUsername);
        lblUsername.setBounds(240, 340, 90, 25);

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtAddress);
        txtAddress.setBounds(690, 440, 300, 30);

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPassword.setText("Password: ");
        add(lblPassword);
        lblPassword.setBounds(240, 390, 90, 25);

        lblRole.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole);
        lblRole.setBounds(260, 500, 50, 30);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(620, 340, 60, 30);

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblConfirmPassword.setText("Confirm Password:");
        add(lblConfirmPassword);
        lblConfirmPassword.setBounds(170, 440, 160, 27);

        radioBtnManager.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioBtnManager.setText("Supplier Manager");
        radioBtnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnManagerActionPerformed(evt);
            }
        });
        add(radioBtnManager);
        radioBtnManager.setBounds(340, 500, 170, 30);

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add(txtName);
        txtName.setBounds(690, 340, 300, 30);
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1030, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnDeliveryActionPerformed
        // TODO add your handling code here:
        radioBtnManager.setSelected(false);
    }//GEN-LAST:event_radioBtnDeliveryActionPerformed

    private void radioBtnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnManagerActionPerformed
        // TODO add your handling code here:
        radioBtnDelivery.setSelected(false);
    }//GEN-LAST:event_radioBtnManagerActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        // TODO add your handling code here:
       if(validateThis())
        {

            Employee e = supplier.getEmployeeDirectory().createEmployee(txtName.getText(), txtAddress.getText(), txtPhoneNumber.getText());
            if(e == null)
            {
                JOptionPane.showMessageDialog(null,"Employee " + txtName.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                if(radioBtnManager.isSelected())
                {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), e, new SupplierAdminRole());
                    if(ua != null)
                    {
                        JOptionPane.showMessageDialog(null, "Manager account created successfully for " + e.getName());
                    }
                    else
                    {
                        supplier.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null,"Username " + txtUsername.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                else
                {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), e, new SupplierDeliveryManRole());
                    if(ua != null)
                    {
                        SupplierDeliveryMan sdm = supplier.getSupplierDeliveryManDirectory().createSupplierDeliveryMan(txtName.getText(), txtAddress.getText(), txtPhoneNumber.getText());
                        JOptionPane.showMessageDialog(null, "Delivery Man account created successfully for " + e.getName());
                    }
                    else
                    {
                        supplier.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null,"Username " + txtUsername.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                }
                BtnCreate.setEnabled(true);
                txtUsername.setText("");
                txtUsername.setEnabled(false);
                txtPassword.setText("");
                txtPassword.setEnabled(false);
                txtConfirmPassword.setText("");
                txtConfirmPassword.setEnabled(false);
                txtName.setText("");
                txtName.setEnabled(false);
                txtPhoneNumber.setText("");
                txtPhoneNumber.setEnabled(false);
                txtAddress.setText("");
                txtAddress.setEnabled(false);
                BtnSubmit.setEnabled(false);
                radioBtnDelivery.setSelected(false);
                radioBtnDelivery.setEnabled(false);
                radioBtnManager.setSelected(false);
                radioBtnManager.setEnabled(false);
            }
            populateSupplierEmpTable();
        }
        else
        {
            return;
        }
                
        
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void tblManageSupplierEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManageSupplierEmpMouseClicked
        // TODO add your handling code here:
       
        int selectedRow = tblManageSupplierEmp.getSelectedRow();
        if (selectedRow >= 0)
        {
            BtnDelete.setEnabled(true);
            BtnView.setEnabled(true);
        }
    }//GEN-LAST:event_tblManageSupplierEmpMouseClicked

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblManageSupplierEmp.getSelectedRow();
        if (selectedRow >= 0)
        {
            Employee selectedEmployee = (Employee) tblManageSupplierEmp.getValueAt(selectedRow, 1);
            SystemUpdateSupplierEmployee fs = new SystemUpdateSupplierEmployee(userProcessContainer, selectedEmployee, ecosystem);
            userProcessContainer.add("SysUpdateSupplierEmployee", fs);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_BtnViewActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblManageSupplierEmp.getSelectedRow();
        if (selectedRow >= 0)
        {
            Employee selectedEmployee = (Employee) tblManageSupplierEmp.getValueAt(selectedRow, 1);
            supplier.getEmployeeDirectory().deleteEmployee(selectedEmployee);
            JOptionPane.showMessageDialog(null, "Employee " + selectedEmployee.getName()+ " deleted successfully!");
            populateSupplierEmpTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        // TODO add your handling code here:
         BtnCreate.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        txtConfirmPassword.setEnabled(true);
        txtName.setEnabled(true);
        txtPhoneNumber.setEnabled(true);
        txtAddress.setEnabled(true);
        BtnSubmit.setEnabled(true);
        radioBtnDelivery.setEnabled(true);
        radioBtnManager.setEnabled(true);
    }//GEN-LAST:event_BtnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JButton BtnView;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTable tblManageSupplierEmp;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables


private void populateSupplierEmpTable() {
        DefaultTableModel dtm = (DefaultTableModel)tblManageSupplierEmp.getModel();
        dtm.setRowCount(0);
        if(supplier.getEmployeeDirectory().getEmployeeList() != null)
        {
            for(Employee e : supplier.getEmployeeDirectory().getEmployeeList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0]= e.getId();
                row[1]= e;
                UserAccount ua = ecosystem.getUserAccountDirectory().findEmployee(e);
                row[2] = ua.getRole().toString().substring(14).replace("Role", "");
                dtm.addRow(row);
            }
        }
        if(dtm.getRowCount() == 0)
            {
                BtnDelete.setEnabled(false);
                BtnView.setEnabled(false);
            }
    }

    private boolean validateThis() {
        String regex = "\\d{10}";
        if(("".equals(txtUsername.getText())) || ("".equals(txtPassword.getText())) || ("".equals(txtConfirmPassword.getText())) 
                || ("".equals(txtName.getText())) || ("".equals(txtPhoneNumber.getText())) || ("".equals(txtAddress.getText()))
                || ((radioBtnDelivery.isEnabled() == false) && (radioBtnManager.isEnabled() == false)))
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


