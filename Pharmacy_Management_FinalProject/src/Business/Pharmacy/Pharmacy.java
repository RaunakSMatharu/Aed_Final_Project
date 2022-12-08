/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author Ruchi
 */
public class Pharmacy {
    private String name;
    private String address;
    private String email;
    private String phone;
    private int id;
    private static int count = 1;
    
    public Pharmacy() {
        id = count;
        count++;
    }
    
    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
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
 
