/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierOrders;

import java.util.ArrayList;

/**
 *
 * @author HOME
 */
public class SupplierOrdersDirectory {
      private ArrayList<Business.SupplierOrders.SupplierOrders> supplierOrderList;
    
    public SupplierOrdersDirectory() {
        supplierOrderList = new ArrayList();
    }

    public ArrayList<Business.SupplierOrders.SupplierOrders> getSupplierOrderList() {
        return supplierOrderList;
    }
    
    public Business.SupplierOrders.SupplierOrders createNewSupplierOrder()
    {
        Business.SupplierOrders.SupplierOrders supplierOrders = new Business.SupplierOrders.SupplierOrders();
        
        return supplierOrders;
    }    
    
}
