/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Business;
import Business.Customer.Customer;
import Business.UserAccount.UserAccount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajaygoel
 */
public class CustomerLoginJFrame extends javax.swing.JPanel {

    /**
     * Creates new form CustomerLoginJFrame
     */
    
    private JPanel userProcessContainer;
    private Business business;

    public CustomerLoginJFrame(JPanel userProcessContainer, Business business) {
        initComponents();
        this.business = business;
        this.userProcessContainer=userProcessContainer;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FirstNameTxtField = new javax.swing.JTextField();
        LocationTxtField = new javax.swing.JTextField();
        LastNameTxtField = new javax.swing.JTextField();
        CreditCardTxtField = new javax.swing.JTextField();
        MobiletxtField = new javax.swing.JTextField();
        PaymentComboBox = new javax.swing.JComboBox<>();
        SaveBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        UserNameTxtField = new javax.swing.JTextField();
        PasswordTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Customer Login");

        jLabel2.setText("First Name");

        jLabel3.setText("Credit Card Number:");

        jLabel4.setText("Mobile Number");

        jLabel5.setText("Location");

        jLabel6.setText("Last Name");

        jLabel7.setText("Mode of Payment");

        PaymentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Net Banking", "Credit Card", "Debit Card", " " }));

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("User name:");

        jLabel9.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SaveBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(FirstNameTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LastNameTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LocationTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(MobiletxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CreditCardTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PaymentComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PasswordTxtField)
                                        .addComponent(UserNameTxtField))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FirstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LocationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MobiletxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CreditCardTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PaymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(SaveBtn)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        
        try
        {
        
        String First_name = FirstNameTxtField.getText();
        if(First_name.matches(".*\\d.*"))
        {
            JOptionPane.showMessageDialog(null,"Please enter the first name with no digits");
            return;
        }
        
        String Last_name = LastNameTxtField.getText();
        if(Last_name.matches(".*\\d.*"))
        {
            JOptionPane.showMessageDialog(null,"Please enter the last name with no digits");
            return;
        }
        
        String Location = LocationTxtField.getText();
        if(Location.matches(".*\\d.*"))
        {
            JOptionPane.showMessageDialog(null,"Please enter the location name with no digits");
            return;
        }
        int Mobil_no = Integer.parseInt(MobiletxtField.getText());
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(MobiletxtField.getText());
        if(m.find() && m.group().equals(MobiletxtField.getText()))
        {
            JOptionPane.showMessageDialog(null,"Please enter the mobile no with 10 digits");
            return;
            
        }
        
        
        
        
        int Credit_card_no = Integer.parseInt(CreditCardTxtField.getText());
        String Mode_o_payment = String.valueOf(PaymentComboBox.getSelectedItem());
        
        if(First_name.equals("")|| Location.equals("")||Last_name.equals("")||Mobil_no==0||
                Credit_card_no==0){
            JOptionPane.showMessageDialog(this,"Please enter all the fields","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Customer c = business.getCustomerDirectory().addCustomer();
        c.setFirstName(First_name);
        c.setLastName(Last_name);
        c.setLocation(Location);
        c.setMobile_no(Mobil_no);
        c.setMode_of_payment(Mode_o_payment);
        c.setCredit_card_no(Credit_card_no);
       // c.setUserName(UserNameTxtField.getText());
        JOptionPane.showMessageDialog(this,"Customer Account has been created","Info", JOptionPane.INFORMATION_MESSAGE);
        UserAccount ua =business.getUserAccountDirectory().addUserAccount();
        ua.setUserName(UserNameTxtField.getText());
        ua.setIsActive(true);
        ua.setPassword(PasswordTxtField.getText());
        ua.setRole(UserAccount.CUSTOMER_ROLE);
        c.setUserAccount(ua);

        FirstNameTxtField.setText("");
        LastNameTxtField.setText("");
        LocationTxtField.setText("");
        MobiletxtField.setText("");
        CreditCardTxtField.setText("");
        PasswordTxtField.setText("");
        UserNameTxtField.setText("");
        
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please enter the valid values","Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_SaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CreditCardTxtField;
    private javax.swing.JTextField FirstNameTxtField;
    private javax.swing.JTextField LastNameTxtField;
    private javax.swing.JTextField LocationTxtField;
    private javax.swing.JTextField MobiletxtField;
    private javax.swing.JTextField PasswordTxtField;
    private javax.swing.JComboBox<String> PaymentComboBox;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField UserNameTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
