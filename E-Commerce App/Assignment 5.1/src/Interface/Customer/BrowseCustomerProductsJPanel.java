/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Business;
import Business.Customer.Customer;
import Business.Product.Product;
import Business.Supplier.Supplier;
import Interface.Supplier.ManageProductCatalogJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author ajaygoel
 */
public class BrowseCustomerProductsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BrowseCustomerProductsJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private Customer customer;
    private ArrayList<String> CombInput;

    BrowseCustomerProductsJPanel(JPanel userProcessContainer, Business business, Customer customer) {
        
                initComponents();
                
                this.userProcessContainer= userProcessContainer;
                this.business= business;
                this.customer=customer;
                
                populateTable();
                populateComboBox();

    }
    
    public void populateTable(){
        int rowCount = productJTbl.getRowCount();
        
       productJTbl.getColumn("Image").setCellRenderer(new LabelRenderer());
         
        DefaultTableModel model = (DefaultTableModel) productJTbl.getModel();
    //    dtm.setRowCount(0);
        
             for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Supplier s: business.getSupplierDirectory().getSupplierDirectory()){
            if(s.getSupplier_location().equalsIgnoreCase(customer.getLocation())){
                
            for(Product p: s.getProductDirectory().getProductDirectory()){
                
                        JLabel label= new JLabel();
                label.setBounds(100, 100, 200, 200);
                ImageIcon i1= new ImageIcon(p.getImgLoc());
                Image img= i1.getImage();
                Image newImg= img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon iFinal= new ImageIcon(newImg);
                 label.setIcon(iFinal);
                
            
            Object row[]= new Object[5];
            row[0]= p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3]= p.getAvail();
            row[4]=label;
            model.addRow(row);
            }
            }
            
        }
        
    }
    
    public void populateComboBox()
    {
        CategoryComboBpx.removeAll();
        CategoryComboBpx.addItem("All");
        CategoryComboBpx.addItem("Electronics");
        CategoryComboBpx.addItem("Footwear");
        CategoryComboBpx.addItem("Topwear");
        CategoryComboBpx.addItem("Bottomwear");
        CategoryComboBpx.addItem("Accessories");
        CategoryComboBpx.addItem("Home&Furniture");
    }
    
    
    public void refresh_table(ArrayList<Product> product)
    {
           int rowCount = productJTbl.getRowCount();
        
       productJTbl.getColumn("Image").setCellRenderer(new LabelRenderer());
         
        DefaultTableModel model = (DefaultTableModel) productJTbl.getModel();
    
             
             
               //    DefaultTableModel dtm = (DefaultTableModel) masterFlightJTable.getModel();

        // dtm.setRowCount(0);
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        for(Supplier s: business.getSupplierDirectory().getSupplierDirectory()){
            if(s.getSupplier_location().equalsIgnoreCase(customer.getLocation())){
                
            for(Product p: product){
                
                        JLabel label= new JLabel();
                label.setBounds(100, 100, 200, 200);
                ImageIcon i1= new ImageIcon(p.getImgLoc());
                Image img= i1.getImage();
                Image newImg= img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon iFinal= new ImageIcon(newImg);
                 label.setIcon(iFinal);
                
            
            Object row[]= new Object[5];
            row[0]= p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            row[3]= p.getAvail();
            row[4]=label;
            model.addRow(row);
            }
            }
            
        }
    }
    
        public ArrayList<Product> Search_by_category(String category)
    {
        ArrayList<Product> product = new ArrayList<>();
        for(Supplier sup: business.getSupplierDirectory().getSupplierDirectory())
        {
            for(Product pf : sup.getProductDirectory().getProductDirectory())
            {
                if(pf.getCategories().equals(category))
                {
                    product.add(pf);
                }
            }
        }
        return product;
    }
        
        public ArrayList<Product> Search_name_category(String category ,String name)
    {
        ArrayList<Product> product = new ArrayList<>();
        for(Supplier sup: business.getSupplierDirectory().getSupplierDirectory())
        {
            for(Product pf : sup.getProductDirectory().getProductDirectory())
            {
                if(pf.getCategories().equals(category)&& pf.getProdName().equalsIgnoreCase(name))
                {
                    product.add(pf);
                }
            }
        }
        System.out.println(product.size());
        return product;
    }   
        
                public ArrayList<Product> Search_by_name(String name)
    {
        ArrayList<Product> product = new ArrayList<>();
        for(Supplier sup: business.getSupplierDirectory().getSupplierDirectory())
        {
            for(Product pf : sup.getProductDirectory().getProductDirectory())
            {
                if(pf.getProdName().equals(name))
                {
                    product.add(pf);
                }
            }
        }
        return product;
    }
        

        
    class LabelRenderer implements TableCellRenderer{

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            TableColumn tc= productJTbl.getColumn("Image");
            tc.setMinWidth(200);
            tc.setMaxWidth(200);
            productJTbl.setRowHeight(200);
            
            return (Component)value;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productJTbl = new javax.swing.JTable();
        backJBtn = new javax.swing.JButton();
        BookOrderJBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        ItemNameTxtField = new javax.swing.JTextField();
        CategoryComboBpx = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Browse Products");

        productJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Model Number", "Price", "Availablity", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productJTbl);

        backJBtn.setText("Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        BookOrderJBtn.setText("Buy Product");
        BookOrderJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookOrderJBtnActionPerformed(evt);
            }
        });

        SearchBtn.setText("Search: ");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Categories:");

        jLabel3.setText("Item Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJBtn)
                                .addGap(26, 26, 26)
                                .addComponent(BookOrderJBtn)
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CategoryComboBpx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ItemNameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJBtn)
                    .addComponent(BookOrderJBtn)
                    .addComponent(CategoryComboBpx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchBtn)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BookOrderJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookOrderJBtnActionPerformed
        // TODO add your handling code here:
        
                int row = productJTbl.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Product p= (Product)productJTbl.getValueAt(row,0);
        
        BuyProductJPanel vs = new BuyProductJPanel(userProcessContainer, business, p, customer);
        userProcessContainer.add("BuyProductJPanel", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
        
        
        
    }//GEN-LAST:event_BookOrderJBtnActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
                  userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        Product pd;       
        ArrayList<Product> pro = new ArrayList<>();
        String Category = (String) CategoryComboBpx.getSelectedItem();
        String Prod_Name = ItemNameTxtField.getText();
        
        if(Category.equalsIgnoreCase("All")&& Prod_Name.equals("")){
            populateTable();
            return;
        }
        else if(Category.equalsIgnoreCase("All")){
            
            pro = Search_by_name(Prod_Name);
                        refresh_table(pro);

            
        }
        
        
        
        else  if(Prod_Name.equals(""))
        {
            System.out.println(Category);
            System.out.println(Prod_Name);
            pro = Search_by_category(Category);//business.getProductDirectory().Search_by_category(Category);
            for(Product p1: pro)
            {
                System.out.println(p1.getProdName());
            }
            refresh_table(pro);
            
        }
        else
        {   
            System.out.println(Category);
            System.out.println(Prod_Name);
            pro = Search_name_category(Category, Prod_Name);
            for(Product p1: pro)
            {
                System.out.println(p1.getProdName());
            }
            refresh_table(pro);
            
        }
        ItemNameTxtField.setText("");
        
    }//GEN-LAST:event_SearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookOrderJBtn;
    private javax.swing.JComboBox<String> CategoryComboBpx;
    private javax.swing.JTextField ItemNameTxtField;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton backJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productJTbl;
    // End of variables declaration//GEN-END:variables
}
