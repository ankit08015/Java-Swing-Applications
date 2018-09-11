/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Customer.Customer;
import Business.Order.OrderItem;
import Business.Product.Product;
import Business.Product.ProductDirectory;
import Business.UserAccount.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ajaygoel
 */
public class Supplier {
    private String supplier_name;
    private String Supplier_location;
    private long zip_code;
    private ProductDirectory productDirectory;
    private UserAccount userAccount;
    
    private Map<OrderItem, Customer> suppOrderList;
    


    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
    
    public Supplier(){
        productDirectory = new ProductDirectory();
        suppOrderList= new HashMap<>();
    }

    public Map<OrderItem, Customer> getSuppOrderList() {
        return suppOrderList;
    }

    public void addOrder(OrderItem oi, Customer cust) {
        
        Product prod= oi.getProduct();
        int quant= oi.getQuantity();
        
        
        for(Product p: getProductDirectory().getProductDirectory()){
            if(p.equals(prod)){
                int oldAvail= p.getAvail();
                int newAvail= oldAvail-quant;
                p.setAvail(newAvail);
            }
        }
        
        suppOrderList.put(oi, cust);
        
      
    }
    
    public void cancelOrder(OrderItem oi){
        if(suppOrderList.containsKey(oi)){
            oi.setOrderStatus("CANCELLED");
        }
        Product p= oi.getProduct();
        int oldQuant=oi.getQuantity();
        int newQuant= oldQuant+p.getAvail();
        p.setAvail(newQuant);
    }
    
    

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public long getZip_code() {
        return zip_code;
    }

    public void setZip_code(long zip_code) {
        this.zip_code = zip_code;
    }

    public String getSupplier_location() {
        return Supplier_location;
    }

    public void setSupplier_location(String Supplier_location) {
        this.Supplier_location = Supplier_location;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }
    
    @Override
    public String toString(){
        return supplier_name;
    }
    
}
