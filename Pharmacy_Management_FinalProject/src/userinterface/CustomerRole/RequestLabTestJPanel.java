/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;


import Business.Orders.Orders;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Raunak Singh Matharu
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private Orders o;    

    
   
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel userProcessContainer, Orders o) {
        initComponents();
           
        this.userProcessContainer = userProcessContainer;
        
        this.o = o;
        enterpriseLabel.setText("OrderID: " + o);
        txtMessage.setText(o.getMessage());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Submit Message");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(580, 450, 180, 40);

        lblMessage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMessage.setText("Message: ");
        add(lblMessage);
        lblMessage.setBounds(260, 250, 90, 50);

        txtMessage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtMessage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtMessage);
        txtMessage.setBounds(390, 260, 370, 150);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(830, 60, 120, 40);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseLabel.setText("<>");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(60, 60, 390, 40);
        add(jLabel3);
        jLabel3.setBounds(10, 6, 1400, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if(txtMessage.getText() != "")
        {
            o.setMessage(txtMessage.getText());
            JOptionPane.showMessageDialog(null, "Message updated successfully");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Message cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerSummaryJPanell dwjp = (CustomerSummaryJPanell) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
