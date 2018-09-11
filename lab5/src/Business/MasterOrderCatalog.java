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
public class MasterOrderCatalog {
    
    private ArrayList<Order> orderCatalog;
    
    public MasterOrderCatalog(){
        orderCatalog= new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
    public Order addOrder(Order o){
       // Order o= new Order();
        orderCatalog.add(o);
        return o;
    }
    
    public void removeOrder(Order o){
        orderCatalog.remove(o);
    }
    
}
