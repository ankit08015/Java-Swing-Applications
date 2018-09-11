/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.Order.MasterOrderCatalog;
import Business.Product.ProductDirectory;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author ajaygoel
 */
public class Business {
    public static Business business;
    
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private ProductDirectory productDirectory;
    private SupplierDirectory supplierDirectory;
    
    private Business(){
        userAccountDirectory = new UserAccountDirectory();
        customerDirectory = new CustomerDirectory();
        masterOrderCatalog= new MasterOrderCatalog();
        productDirectory = new ProductDirectory();
        supplierDirectory = new SupplierDirectory();
    }
    
    public static Business getInstance(){
        if(business==null){
            business = new Business();
        }
        return business;
        
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    
    
    
    
}
