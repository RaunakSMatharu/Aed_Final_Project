/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author HOME
 */
public class UserAccountDirectory {
    
    
  private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public void authenticateUser(){
        
    }
    
    public UserAccount createUserAccount(){
        UserAccount userAccount = new UserAccount();
        
        
        return userAccount;
    }
    
   

    public void findEmployee()
    {
        
    }
    
    /*public UserAccount findSupplierEmp(SupplierEmp supplierEmp)
    {
        for (UserAccount ua : userAccountList)
            if (ua.getSupplierEmp() == supplierEmp){
                return ua;
            }
        return null;
    }*/
    
    public void deleteUserAccount(UserAccount ua)
    {
        userAccountList.remove(ua);
    }
    
    
}
