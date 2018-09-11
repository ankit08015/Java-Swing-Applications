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
public class MasterOrderCatalog {
    
    private ArrayList<OrderItemList> masterOrderCatalog;
    public MasterOrderCatalog(){
        masterOrderCatalog = new ArrayList<OrderItemList>();
    }

    public ArrayList<OrderItemList> getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(ArrayList<OrderItemList> masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }
    
    public OrderItemList addorder(OrderItemList ol)
    {
        masterOrderCatalog.add(ol);
        return ol;
    }
    
}
