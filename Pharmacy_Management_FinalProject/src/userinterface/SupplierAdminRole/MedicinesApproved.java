/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SupplierAdminRole;

import Business.EcoSystem;

import Business.Supplier.Supplier;

import Business.Drugs.Drugs;
import Business.Supplier.Supplier;
import Business.SupplierMedicineItem.SupplierMedicineItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class MedicinesApproved extends javax.swing.JPanel {

    /**
     * Creates new form MedicinesApproved
     */
    JPanel userProcessContainer;
    //Supplier supplier;
    EcoSystem system;
    public MedicinesApproved(JPanel userProcessContainer, EcoSystem system) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
       // this.supplier = supplier;
        this.system = system;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DrugApproval1 = new javax.swing.JTable();
        btn_back = new javax.swing.JButton();

        tbl_DrugApproval1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DRUG", "Components", "Disease"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_DrugApproval1);

        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(119, 119, 119))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_DrugApproval1;
    // End of variables declaration//GEN-END:variables
public void populateTable() {
    
     DefaultTableModel dtm = (DefaultTableModel)tbl_DrugApproval1.getModel();
        dtm.setRowCount(0); //deletes the empty records  
        int count1 = 1;
        if(system.getDrugsDirectory().getDrugsList()!= null)
        {
            System.out.println("Inside part");
            for(Drugs s : system.getDrugsDirectory().getDrugsList())
            {
                Object[] row = new Object[dtm.getColumnCount()]; //creates an array
                row[0] = s.getId();
                row[1] = s;
                row[2] = s.getDrugCompostion();
                row[3] = s.getDisease();
                dtm.addRow(row);
                count1++;
            }
        }
        else
        {
            tbl_DrugApproval1.setEnabled(false);
        }
    
        
    }




}
