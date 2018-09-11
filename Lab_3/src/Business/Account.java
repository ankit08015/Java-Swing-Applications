/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author ankit
 */
public class Account {
    
    private String routingNum;
    private String accNum;
    private Date createdDate;
    private int balance;
    private String bankName;

    public Account() {
        
        this.createdDate= new Date();
       
    }

    @Override
    public String toString() {
        return bankName ;
    }
    
    

    public Date getCreatedDate() {
        return createdDate;
    }
    
    


    public String getRoutingNum() {
        return routingNum;
    }

    public void setRoutingNum(String routingNum) {
        this.routingNum = routingNum;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    
    
}
