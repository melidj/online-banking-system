package onlinebank;

import java.awt.event.KeyEvent;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Account extends javax.swing.JInternalFrame {

    public Account() {
        initComponents();
        autoID();
    }
    
    
    
    @SuppressWarnings("unchecked")
    
    Connection con;
    Connection con1;
    PreparedStatement insert;
    ResultSet rs;
    ResultSet rs1;

    public void autoID()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/online_bank_db", "root", "");
            Statement s = con.createStatement();
            
            ResultSet rs = s.executeQuery("SELECT MAX(acc_id) FROM account");
            rs.next();
            rs.getString("Max(acc_id)");
            
            if(rs.getString("Max(acc_id)")== null)
            {
                lblacctno.setText("AC001");
            }
            else
            {
                long id = Long.parseLong(rs.getString("Max(acc_id)").substring(2,rs.getString("Max(acc_id)").length()));
                id++;
                
                lblacctno.setText("AC" + String.format("%03d", id));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblaccountno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcustid = new javax.swing.JTextField();
        txtcustname = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblacctno = new javax.swing.JLabel();
        cmboacctype = new javax.swing.JComboBox<>();
        btnFind = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));

        lblaccountno.setText("Account No");

        jLabel3.setText("Customer ID");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Account Type");

        jLabel6.setText("Balance");

        txtcustid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcustidKeyPressed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setMaximumSize(new java.awt.Dimension(63, 21));
        btnAdd.setMinimumSize(new java.awt.Dimension(63, 21));
        btnAdd.setPreferredSize(new java.awt.Dimension(63, 21));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblacctno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblacctno.setForeground(new java.awt.Color(0, 0, 153));
        lblacctno.setText("Account No");

        cmboacctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving", "Fix", "Current" }));
        cmboacctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboacctypeActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.setMaximumSize(new java.awt.Dimension(63, 21));
        btnFind.setMinimumSize(new java.awt.Dimension(63, 21));
        btnFind.setPreferredSize(new java.awt.Dimension(63, 21));
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblaccountno)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcustid)
                    .addComponent(txtcustname)
                    .addComponent(txtbalance)
                    .addComponent(lblacctno, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(cmboacctype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaccountno)
                    .addComponent(lblacctno))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcustid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtcustname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmboacctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnFind.getAccessibleContext().setAccessibleName("FInd");
        btnFind.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        try {
            String account_no = lblacctno.getText();
            String customer_id = txtcustid.getText();
            String custname = txtcustname.getText();
            String bal = txtbalance.getText();
            String acctype = cmboacctype.getSelectedItem().toString();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/online_bank_db", "root", "");
            insert = con.prepareStatement("insert into account(acc_id,cust_id,acc_type,balance)values(?,?,?,?)");
            insert.setString(1, account_no);
            insert.setString(2, customer_id);
            insert.setString(3, acctype);
            insert.setString(4, bal);
            
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Account Created");
            
            //clear all data after add a record
            txtcustid.setText("");
            txtcustname.setText("");
            txtbalance.setText("");
            cmboacctype.setSelectedIndex(-1);
            
            autoID(); // Generate new ID for the next record
            //after clear cursor focuses on that first text box
            txtcustid.requestFocus();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        
        try {
            String cust_id = txtcustid.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/online_bank_db", "root", "");
            
            insert = con.prepareStatement("SELECT * FROM customer WHERE cust_id = ?");
            insert.setString(1,cust_id);
            rs = insert.executeQuery();
            
            if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(this,"Customer not found");
            }
            else
            {
                String firstname = rs.getString("firstname");
                txtcustname.setText(firstname.trim());
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btnFindActionPerformed

    private void cmboacctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboacctypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboacctypeActionPerformed

    private void txtcustidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcustidKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                String procod = txtcustid.getText();
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/online_bank_db", "root", "");
                
                insert =con1.prepareStatement("SELECT * FROM customer WHERE cust_id = ?");
                insert.setString(1, procod);
                rs1 = insert.executeQuery();
                
                if(rs1.next() == false)
                {
                    JOptionPane.showMessageDialog(null, "Customer ID is not found");
                }
                else{
                    String firstname = rs1.getString("firstname");
                    txtcustname.setText(firstname.trim());
                }
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_txtcustidKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox<String> cmboacctype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblaccountno;
    private javax.swing.JLabel lblacctno;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcustid;
    private javax.swing.JTextField txtcustname;
    // End of variables declaration//GEN-END:variables
}
