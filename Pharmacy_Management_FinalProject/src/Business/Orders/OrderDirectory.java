/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Orders;

import Business.Customer.Customer;
import java.util.ArrayList;
/**
 *
 * @author Raunak Singh Matharu
 */
public class OrderDirectory {
    private ArrayList<Orders> orderList;
    
    public OrderDirectory() {
        orderList = new ArrayList();
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }
    
    public Orders createNewOrder(Customer cust)
    {
        Orders orders = new Orders();
        orders.setCustomer(cust);
        orderList.add(orders);
        cust.getPastOrderList().add(orders);
        return orders;
    }    
    
}
