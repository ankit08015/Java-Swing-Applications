/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ajaygoel
 */
public class ConfigureBusiness {
    
    public static Business initializeBusiness(){
        Business business = Business.getInstance();
       // Supplier s = business.getSupplierDirectory().addSupplier();
     //   s.setSupplier_name("Admin");
     //   s.setSupplier_location("Admin");
        
        UserAccount ua = business.getUserAccountDirectory().addUserAccount();
        
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setRole(UserAccount.ADMIN_ROLE);
       // ua.setIsActive(true);
        
        return business;
        
        
    }
    
}
