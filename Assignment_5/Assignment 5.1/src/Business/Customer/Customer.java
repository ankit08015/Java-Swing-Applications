/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.OrderItem;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class Customer {
    
    private String FirstName;
    private String LastName;
    private String Location;
    private int mobile_no;
    private int Credit_card_no;
    private String Mode_of_payment;
    private UserAccount userAccount;
    private ArrayList<OrderItem> orderList;
    
    public Customer(){
        orderList= new ArrayList<>();
    }

    public ArrayList<OrderItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderItem> orderList) {
        this.orderList = orderList;
    }
    
    public OrderItem addOrder(){
        OrderItem o= new OrderItem();
        orderList.add(o);
        return o;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }
    
    public void setUserAccount(UserAccount userAccount){
        this.userAccount = userAccount;
    }


    

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getCredit_card_no() {
        return Credit_card_no;
    }

    public void setCredit_card_no(int Credit_card_no) {
        this.Credit_card_no = Credit_card_no;
    }

    public String getMode_of_payment() {
        return Mode_of_payment;
    }

    public void setMode_of_payment(String Mode_of_payment) {
        this.Mode_of_payment = Mode_of_payment;
    }
    
    @Override
    public String toString(){
        return FirstName;
    }
    
    
}
