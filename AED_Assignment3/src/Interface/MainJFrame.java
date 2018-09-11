/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.TravelAgency;
import Interface.ManageAirliner.AirlinerHomeJPanel;
import Interface.ManageCustomer.CustHomeJPanel;
import Interface.ManageTravelAgency.TravelAgencyHomeJPanel;
import java.awt.CardLayout;

/**
 *
 * @author ankit
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    TravelAgency travelAgency;
    public MainJFrame() {
        initComponents();
        
        travelAgency= new TravelAgency();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        travelAgencyJButton = new javax.swing.JButton();
        manageAirlinerJButton = new javax.swing.JButton();
        manageCustomerJButton = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        travelAgencyJButton.setText("Travel Agency");
        travelAgencyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelAgencyJButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(travelAgencyJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, -1));

        manageAirlinerJButton.setText("Airliner");
        manageAirlinerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinerJButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(manageAirlinerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, -1));

        manageCustomerJButton.setText("Customer");
        manageCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerJButtonActionPerformed(evt);
            }
        });
        leftJPanel.add(manageCustomerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, -1));

        jSplitPane1.setLeftComponent(leftJPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void travelAgencyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelAgencyJButtonActionPerformed
        // TODO add your handling code here:
        
        TravelAgencyHomeJPanel travelPanel= new TravelAgencyHomeJPanel(userProcessContainer,travelAgency );
        userProcessContainer.add("TravelAgencyHomeJPanel",travelPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
    }//GEN-LAST:event_travelAgencyJButtonActionPerformed

    private void manageAirlinerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinerJButtonActionPerformed
        // TODO add your handling code here:
        
        AirlinerHomeJPanel airlinerPanel= new AirlinerHomeJPanel(userProcessContainer,travelAgency );
        userProcessContainer.add("AirlinerHomeJPanel",airlinerPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageAirlinerJButtonActionPerformed

    private void manageCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerJButtonActionPerformed
        // TODO add your handling code here:
        
        CustHomeJPanel custPanel= new CustHomeJPanel(userProcessContainer,travelAgency );
        userProcessContainer.add("CustHomeJPanel",custPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageCustomerJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JButton manageAirlinerJButton;
    private javax.swing.JButton manageCustomerJButton;
    private javax.swing.JButton travelAgencyJButton;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
