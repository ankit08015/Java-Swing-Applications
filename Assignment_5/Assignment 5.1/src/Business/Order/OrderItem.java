/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Product.Product;

/**
 *
 * @author ajaygoel
 */
public class OrderItem {
    
    private int quantity;
    private double salesPrice;
    private Product product;
    private String orderStatus;

    public OrderItem() {
        orderStatus="IN PROCESS";
    }
    
    

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quality) {
        this.quantity = quality;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice() {
        //this.salesPrice = salesPrice;
        salesPrice= quantity*product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    @Override
    public String toString(){
        return product.getProdName();
    }
    
}
