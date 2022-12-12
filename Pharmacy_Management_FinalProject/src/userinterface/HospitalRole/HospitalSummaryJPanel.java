/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalRole;


import Business.Customer.Customer;
import Business.Hospital.Hospital;
import Business.EcoSystem;
import Business.Orders.Orders;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class HospitalSummaryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalSummaryJPanel
     */
    
    private JPanel userProcessContainer;

    private UserAccount user;
    private Customer customer;
    private Hospital hospital;
    private EcoSystem system;
    
    public HospitalSummaryJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;     
        this.user = account;
        this.system = system;
        for(Hospital c : system.getHospitalDirectory().getHospitalList() )
        {
            
                if(c.getHospitalName() == null ? user.getEmployee().getName()== null : c.getHospitalName().equals(user.getEmployee().getName()))
                {
                    this.hospital = c;
                }
        }
        CSenterpriseLabel.setText(this.hospital + "'s orders");
        populateRequestTable();
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
        HSWorkrequestTable = new javax.swing.JTable();
        HSBackButton = new javax.swing.JButton();
        HSrefreshTestJButton = new javax.swing.JButton();
        CSenterpriseLabel = new javax.swing.JLabel();

        HSWorkrequestTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HSWorkrequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Order From", "Total Amount", "Delivery Man Name", "Status", "Order Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(HSWorkrequestTable);

        HSBackButton.setBackground(new java.awt.Color(0, 0, 0));
        HSBackButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HSBackButton.setForeground(new java.awt.Color(255, 255, 255));
        HSBackButton.setText("< Back");
        HSBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HSBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSBackButtonActionPerformed(evt);
            }
        });

        HSrefreshTestJButton.setBackground(new java.awt.Color(0, 0, 0));
        HSrefreshTestJButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HSrefreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        HSrefreshTestJButton.setText("Refresh");
        HSrefreshTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HSrefreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSrefreshTestJButtonActionPerformed(evt);
            }
        });

        CSenterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        CSenterpriseLabel.setText("<>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HSrefreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HSBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CSenterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(CSenterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(HSBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HSrefreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HSBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_HSBackButtonActionPerformed

    private void HSrefreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSrefreshTestJButtonActionPerformed
        if(HSWorkrequestTable.getRowCount() > 0)
        {
            populateRequestTable();
            JOptionPane.showMessageDialog(null, "Table refreshed!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nothing to refresh!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_HSrefreshTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CSenterpriseLabel;
    private javax.swing.JButton HSBackButton;
    private javax.swing.JTable HSWorkrequestTable;
    private javax.swing.JButton HSrefreshTestJButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

public void populateRequestTable() {
        if(hospital.getPastOrderList() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel)HSWorkrequestTable.getModel();
            dtm.setRowCount(0);
            
            HSrefreshTestJButton.setEnabled(true);
           
            int count = 1;
            for(Orders o : hospital.getPastOrderList())
            {
                if(system.getPharmacyDirectory().getPharmacyList() != null)
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = o;
                    for(Pharmacy p : system.getPharmacyDirectory().getPharmacyList())
                    {
                        for(Orders or : p.getOrderDirectory().getOrderList())
                        {
                          if(o.equals(or))
                          {
                              row[1] = p;
                          }
                        }
                    }
                    row[2] = o.getTotalAmount();
                    row[3] = o.getDeliveryMan();
                    if(o.isStatus())
                    {
                        row[4] = "Yes";
                    }
                    else
                    {
                        row[4] = "No";
                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[5] = o.getOrderDate().format(formatter);
                    dtm.addRow(row);
                    count++;
                }
            }
        }
    }




}