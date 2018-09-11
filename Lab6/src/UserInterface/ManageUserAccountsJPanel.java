/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Business;
import Business.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ankit
 */
public class ManageUserAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountsJPanel
     */
    public ManageUserAccountsJPanel() {
    }

    private JPanel userProcessContainer;
    private Business business;

    ManageUserAccountsJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        refreshTable();
    }

    public void refreshTable() {
        DefaultTableModel dtm = (DefaultTableModel) manageUserJTbl.getModel();

        dtm.setRowCount(0);
        for (UserAccount ua : business.getUserAccDir().getUserAccList()) {
            Object row[] = new Object[3];
            row[0] = ua;
            row[1] = ua.getUserName();
            row[2] = ua.getRole();
            dtm.addRow(row);

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
        manageUserJTbl = new javax.swing.JTable();
        backJBtn = new javax.swing.JButton();
        removeJBtn = new javax.swing.JButton();
        addUserAccJBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Manage User Account");

        manageUserJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person", "User Name", "Role"
            }
        ));
        jScrollPane1.setViewportView(manageUserJTbl);

        backJBtn.setText("<<Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        removeJBtn.setText("Remove");
        removeJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJBtnActionPerformed(evt);
            }
        });

        addUserAccJBtn.setText("Add User Account");
        addUserAccJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserAccJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJBtn)
                        .addGap(53, 53, 53)
                        .addComponent(removeJBtn)
                        .addGap(56, 56, 56)
                        .addComponent(addUserAccJBtn)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJBtn)
                    .addComponent(removeJBtn)
                    .addComponent(addUserAccJBtn))
                .addContainerGap(349, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = manageUserJTbl.getSelectedRow();
        if (selectedRow >= 0) {

            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove?", "Warning", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                UserAccount ua = (UserAccount) manageUserJTbl.getValueAt(selectedRow, 0);

                if (ua.getRole().equals(UserAccount.ADMIN_ROLE)) {
                    JOptionPane.showMessageDialog(this, "You can not delete an ADMIN user", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                business.getUserAccDir().deleteUserAcc(ua);
                JOptionPane.showMessageDialog(this, "Account deleted successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                refreshTable();

            }

        } else {
            JOptionPane.showMessageDialog(this, "Please Select a row first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_removeJBtnActionPerformed

    private void addUserAccJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserAccJBtnActionPerformed
        // TODO add your handling code here:
   
        AddUserAccountJPanel admin = new AddUserAccountJPanel(userProcessContainer, business);
        userProcessContainer.add("AddUserAccountJPanel", admin);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_addUserAccJBtnActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
  
        
        CardLayout layout= (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserAccJBtn;
    private javax.swing.JButton backJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageUserJTbl;
    private javax.swing.JButton removeJBtn;
    // End of variables declaration//GEN-END:variables
}
