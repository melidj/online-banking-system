package onlinebank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Transfer extends javax.swing.JInternalFrame {

    
    public Transfer() {
        initComponents();
    }

    Connection con1;
    PreparedStatement pst1;
    PreparedStatement st1;
    PreparedStatement st2;
    PreparedStatement st3;
    ResultSet rs1;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfacc = new javax.swing.JTextField();
        txtbal = new javax.swing.JTextField();
        txttoaccount = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));

        jLabel1.setText("From Account");

        jLabel2.setText("Balance");

        jLabel3.setText("To Account");

        jLabel4.setText("Amount");

        txtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtfacc)
                                .addComponent(txtamount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(txttoaccount, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtbal, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttoaccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        btnCancel.setText("Cancel");

        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        
            try {
                String procod = txtfacc.getText();
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/online_bank_db", "root", "");
                
                pst1 = con1.prepareStatement("SELECT c.cust_id, c.firstname, c.lastname, a.balance FROM Customer c, Account a WHERE c.cust_id = a.cust_id AND a.acc_id = ?;");
                pst1.setString(1, procod);
                rs1 = pst1.executeQuery();
                
                if(rs1.next() == false)
                {
                    JOptionPane.showMessageDialog(null, "Account ID is not found");
                }
                else{
                    String balance = rs1.getString(4);
                    txtbal.setText(balance.trim());
                }
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        
        String facc = txtfacc.getText();
        String toaccount = txttoaccount.getText();
        String bal = txtbal.getText();
        String amount = txtamount.getText();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/online_bank_db", "root", "");
        
            con1.setAutoCommit(false);
            
            //Sender
            st1 = con1.prepareStatement("UPDATE account set balance = balance - ? WHERE  acc_id = ?");
            st1.setString(1, amount);
            st1.setString(2, facc);
            st1.executeUpdate();
            
            //Receiver
            st2 = con1.prepareStatement("UPDATE account set balance = balance + ? WHERE  acc_id = ?");
            st2.setString(1, amount);
            st2.setString(2, toaccount);
            st2.executeUpdate();
            
            st3 = con1.prepareStatement("insert into transfer(f_account,to_account,amount)values(?,?,?)");
            st3.setString(1, facc);
            st3.setString(2, toaccount);
            st3.setString(3, amount);
            st3.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Amount successfully transfered");
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Transfer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Transfer.class.getName()).log(Level.SEVERE, null, ex);
            
            try {
                con1.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(Transfer.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
                
        
        
        
    }//GEN-LAST:event_btnTransferActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtfacc;
    private javax.swing.JTextField txttoaccount;
    // End of variables declaration//GEN-END:variables
}
