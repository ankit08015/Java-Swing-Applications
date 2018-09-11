/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class OrderItemList {
    private int Ordernumber;
    private static int count =0;
    private ArrayList<OrderItem> orderItemList;
    
    public OrderItemList(){
        count++;
        orderItemList= new ArrayList<>();
        Ordernumber = count;
    }

    public int getOrdernumber() {
        return Ordernumber;
    }

    public void setOrdernumber(int Ordernumber) {
        this.Ordernumber = Ordernumber;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    
    private OrderItem addOrderItem(){
        
        OrderItem o = new OrderItem();
      //  o.setQuantity(q);
      //  o.setProduct(p);
       // o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
        
    }
    
    public void removeOrderItem(OrderItem o)
    {
       orderItemList.remove(o);
    }
    
    
    
}
