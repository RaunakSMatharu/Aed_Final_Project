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
        messageJTextField.setText(o.getMessage());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        requestTestJButton.setText("Submit Message");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton);
        requestTestJButton.setBounds(370, 100, 130, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Message: ");
        add(jLabel1);
        jLabel1.setBounds(70, 26, 80, 50);

        messageJTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        messageJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(messageJTextField);
        messageJTextField.setBounds(180, 26, 320, 40);

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(180, 100, 120, 30);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        enterpriseLabel.setText("<>");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(10, 10, 170, 30);
        add(jLabel3);
        jLabel3.setBounds(10, 6, 1400, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        if(messageJTextField.getText() != "")
        {
            o.setMessage(messageJTextField.getText());
            JOptionPane.showMessageDialog(null, "Message updated successfully");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Message cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerSummaryJPanell dwjp = (CustomerSummaryJPanell) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
