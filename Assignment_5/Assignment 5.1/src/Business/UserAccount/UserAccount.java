/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

/**
 *
 * @author ajaygoel
 */ 
public class UserAccount {
    
    public static String ADMIN_ROLE = "admin";
    public static String CUSTOMER_ROLE = "customer";
    public static String SUPPLIER_ROLE = "Supplier";
    
    
    private static int count = 1000;
    private int userId;
    private String userName;
    private String password;
    private String role;
    private boolean isActive;
    
    //private Person person;
    
    public UserAccount(){
        userId = count++;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
/*
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }*/

    public int getUserId() {
        return userId;
    }
    
    @Override
    public String toString(){
        return userName;
    }

    
}
