/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Supplier;

import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.SupplierDeliveryMan.SupplierDeliveryManDirectory;

/**
 *
 * @author HOME
 */
public class Supplier {
    
    private String name;
    private String address;
    private String email;
    private String phone;
    

    public Supplier() {
        
    }
    
    public String getAddress() {
        return address;
    }

    public void getId() {
        
    }

    public void getSupplierDeliveryManDirectory() {
       // return supplierDeliveryManDirectory;
    }

    public void getEmployeeDirectory() {
       
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    @Override
    public String toString() {
        return name;
    }

    
     
    
}
