/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ankit
 */
public class CinfigureBusiness {
    
    
    public static Business initializeBusiness(){
    
    Business business= Business.getInstance();
    
    Employee e= new Employee();
    e.setFirstName("admin");
    e.setLastName("");
    e.setOrganization("neu");
    
    
    
    UserAccount ua= business.getUserAccDir().addUserAcc();
    
    ua.setUserName("admin");
    ua.setPassword("admin");
    
    ua.setPerson(e);
    
    ua.setRole(UserAccount.ADMIN_ROLE);
    ua.setIsActive(true);
    
    return business;
    }
    
}
