/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class ProductDirectory {
    
    private ArrayList<Product> productDirectory;
    
    public ProductDirectory(){
        productDirectory = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductDirectory() {
        return productDirectory;
    }
    
    public Product addProduct()
    {
        Product pd = new Product();
        productDirectory.add(pd);
        return pd;
    }
    
    public void removeProd(Product pd)
    {
        productDirectory.remove(pd);
    }
    
    public Product SearchProd(int id)
    {
        for(Product pd:productDirectory)
        {
            if(pd.getModelNumber()==id)
                return pd;
        }
        
        return null;
    }
    
    
    
    
    
}
