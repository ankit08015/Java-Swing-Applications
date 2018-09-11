/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierDirectory;
    
    public SupplierDirectory()
    {
        supplierDirectory = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }
    
    public Supplier addSupplier()
    {
        Supplier sr = new Supplier();
        supplierDirectory.add(sr);
        return sr;
    }
    
    public void removeSupplier(Supplier s)
    {
        supplierDirectory.remove(s);
    }
    
    public Supplier Search(String supp)
    {
        for(Supplier s : supplierDirectory)
        {
            if(supp.equals(s.getSupplier_name()))
                return s;
        }
        return null;
    }
            
    
}
