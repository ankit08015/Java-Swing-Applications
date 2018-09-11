/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliner;

import Business.Airliner;
import Business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ankit
 */
public class ViewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightJPanel
     */

    
    private JPanel userProcessContainer;
    private Flight flight;
    private Airliner airl;

    ViewFlightJPanel(JPanel userProcessContainer, Flight flight, Airliner airl) {
                initComponents();

                this.flight=flight;
                this.userProcessContainer= userProcessContainer;
                this.airl=airl;
                populateFlightDetails();
                updateJButton.setEnabled(true);
                saveJButton.setEnabled(false);
                
                airlinerNameTxtField.setEnabled(false);
                flightNameTxtField.setEnabled(false);
                fromTxtField.setEnabled(false);
                toTxtField.setEnabled(false);
                seatAvailTxtField.setEnabled(false);
                priceTxtField.setEnabled(false);
               // timeTxtField.setEnabled(false);
                dateTxtField.setEnabled(false);
                



                
        
    }
    
    public void populateFlightDetails(){
        
        airlinerNameTxtField.setText(airl.getName());
        flightNameTxtField.setText(flight.getFlightName());
        fromTxtField.setText(flight.getFromLocation());
        toTxtField.setText(flight.getToLocation());
        seatAvailTxtField.setText(Integer.toString(flight.getAvailableSeats()));
        priceTxtField.setText(Double.toString(flight.getPrice()));
       // timeTxtField.setText(flight.getTime());
       String time= flight.getTime();
       if(time.equalsIgnoreCase("morning")){
            timeBtnGroup.clearSelection();
               morningJBtn.setSelected(true);
       }
       
       else if(time.equalsIgnoreCase("night")){
            timeBtnGroup.clearSelection();
               nightJBtn.setSelected(true);
           
       }
       else{
            timeBtnGroup.clearSelection();
               noonJBtn.setSelected(true);
           
       }
        Date date= flight.getDate();
        
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        
        String date1= df.format(date);
        dateTxtField.setText(date1);
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeBtnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        airlinerNameTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        flightNameTxtField = new javax.swing.JTextField();
        toTxtField = new javax.swing.JTextField();
        dateTxtField = new javax.swing.JTextField();
        seatAvailTxtField = new javax.swing.JTextField();
        fromTxtField = new javax.swing.JTextField();
        saveJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        priceTxtField = new javax.swing.JTextField();
        nightJBtn = new javax.swing.JRadioButton();
        noonJBtn = new javax.swing.JRadioButton();
        morningJBtn = new javax.swing.JRadioButton();

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Flight Details");

        jLabel2.setText("AirLiner: ");

        airlinerNameTxtField.setEditable(false);

        jLabel3.setText("From: ");

        jLabel4.setText("Flight Name: ");

        jLabel5.setText("Date: ");

        jLabel6.setText("To: ");

        jLabel7.setText("Seats Available: ");

        jLabel8.setText("Time: ");

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Price: ");

        timeBtnGroup.add(nightJBtn);
        nightJBtn.setText("Night");

        timeBtnGroup.add(noonJBtn);
        noonJBtn.setText("After Noon");

        timeBtnGroup.add(morningJBtn);
        morningJBtn.setSelected(true);
        morningJBtn.setText("Morning");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(saveJButton)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(airlinerNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flightNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(toTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(fromTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(updateJButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(dateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(seatAvailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(morningJBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noonJBtn)
                                .addGap(18, 18, 18)
                                .addComponent(nightJBtn)))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(airlinerNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(flightNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fromTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(toTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(morningJBtn)
                        .addComponent(noonJBtn)
                        .addComponent(nightJBtn)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(seatAvailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJButton)
                    .addComponent(updateJButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinerJPanel manageJPanel = (ManageAirlinerJPanel) component;
        manageJPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
                updateJButton.setEnabled(false);
                saveJButton.setEnabled(true);
                
                flightNameTxtField.setEnabled(true);
                fromTxtField.setEnabled(true);
                toTxtField.setEnabled(true);
                seatAvailTxtField.setEnabled(true);
                priceTxtField.setEnabled(true);
              //  timeTxtField.setEnabled(true);
                dateTxtField.setEnabled(true);
        
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
              if(flightNameTxtField.getText().equals("")||fromTxtField.getText().equals("")||toTxtField.getText().equals("")||dateTxtField.getText().equals("")
                ||priceTxtField.getText().equals("")||seatAvailTxtField.getText().equals(""))
        {
              JOptionPane.showMessageDialog(null, "None of the fields can be Blank", "Warning", JOptionPane.WARNING_MESSAGE);
         
                return ;
        }
            
        
        flight.setFlightName(flightNameTxtField.getText());
        String date= dateTxtField.getText();
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException ex) {
              JOptionPane.showMessageDialog(null, "Please enter Date in dd/mm/yyyy format to search", "Warning", JOptionPane.WARNING_MESSAGE);
           
                return ;
        }
        flight.setDate(date1);
        flight.setFromLocation(fromTxtField.getText());
                String time=null;
       
        
        for (Enumeration<AbstractButton> buttons = timeBtnGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                time= button.getText();
            }
            
        }
         flight.setTime(time);
        flight.setToLocation(toTxtField.getText());
        try {
            flight.setPrice(Double.parseDouble(priceTxtField.getText()));
            flight.addFlightSeat(Integer.parseInt(seatAvailTxtField.getText()));
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Please enter numerics only", "Warning", JOptionPane.WARNING_MESSAGE);
           
                return ;
        }
        
        
                JOptionPane.showMessageDialog(null, "Flight details updated Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        
        
              updateJButton.setEnabled(true);
                saveJButton.setEnabled(false);
                
                flightNameTxtField.setEnabled(false);
                fromTxtField.setEnabled(false);
                toTxtField.setEnabled(false);
                priceTxtField.setEnabled(false);
               // timeTxtField.setEnabled(false);
                dateTxtField.setEnabled(false);
                seatAvailTxtField.setEnabled(false);
    }//GEN-LAST:event_saveJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerNameTxtField;
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JTextField flightNameTxtField;
    private javax.swing.JTextField fromTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton morningJBtn;
    private javax.swing.JRadioButton nightJBtn;
    private javax.swing.JRadioButton noonJBtn;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField seatAvailTxtField;
    private javax.swing.ButtonGroup timeBtnGroup;
    private javax.swing.JTextField toTxtField;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
