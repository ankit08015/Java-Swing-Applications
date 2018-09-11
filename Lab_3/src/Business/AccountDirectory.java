/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ankit
 */
public class AccountDirectory {
    
    private ArrayList<Account> accList;

    public AccountDirectory(ArrayList<Account> accList) {
        this.accList = new ArrayList<>();
    }

    public AccountDirectory() {
        
        accList= new ArrayList<>();
    }
    
    

    public ArrayList<Account> getAccList() {
        return accList;
    }

    public void setAccList(ArrayList<Account> accList) {
        this.accList = accList;
    }
    
    public Account addAccount(){
        Account account= new Account();
        accList.add(account);
        return account;
    }
    
    public void deleteAccount(Account a){
        accList.remove(a);
    }
    
    public Account searchAccountNumber(String accNum){
        for(Account acc: accList){
            if(acc.getAccNum().equalsIgnoreCase(accNum))return acc;
        }
        return null;
    }
    

    
}
