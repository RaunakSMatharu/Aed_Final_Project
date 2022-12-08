/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.SupplierEmp.SupplierEmp;
import Business.UserAccount.UserAccount;



/**
 *
 * @author Raunak Singh Matharu
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH", "SomeAddress", "SomePhone");
                //SupplierEmp supplierEmp = system.getSupplierEmpDirectory().createSupplierEmp("RRH", "SomeAddress", "SomePhone");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
}
