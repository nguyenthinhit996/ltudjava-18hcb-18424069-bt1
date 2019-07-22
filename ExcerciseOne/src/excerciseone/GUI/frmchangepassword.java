/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.GUI;

import excerciseone.BLL.Common;
import excerciseone.DTO.AccountSchool;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author peter
 */
public class frmchangepassword extends javax.swing.JFrame {
    
    private AccountSchool accountschool;
    private frm0002 frm0002s;
    private frm0003 frm0003s;
    

    /**
     * Creates new form frmchangepassword
     */
    public frmchangepassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanelChangepass1 = new javax.swing.JPanel();
        txtpassnew = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpassagain = new java.awt.TextField();
        btncancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtpasswordold = new java.awt.TextField();
        btnsave = new javax.swing.JButton();
        messageChangepass = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Change Password");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanelChangepass1.setBackground(new java.awt.Color(227, 156, 129));
        jPanelChangepass1.setPreferredSize(new java.awt.Dimension(530, 300));

        txtpassnew.setName("txtnamelogin"); // NOI18N
        txtpassnew.setPreferredSize(new java.awt.Dimension(69, 25));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 251));
        jLabel5.setText("Password new");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 251));
        jLabel6.setText("Password new again ");

        txtpassagain.setName("txtpasslogin"); // NOI18N
        txtpassagain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassagainMouseClicked(evt);
            }
        });
        txtpassagain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassagainKeyPressed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(195, 190, 152));
        btncancel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.setName("btnlogin"); // NOI18N
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 251));
        jLabel7.setText("Password old");

        txtpasswordold.setName("txtnamelogin"); // NOI18N
        txtpasswordold.setPreferredSize(new java.awt.Dimension(69, 25));

        btnsave.setBackground(new java.awt.Color(241, 215, 36));
        btnsave.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnsave.setText("Save");
        btnsave.setName("btnlogin"); // NOI18N
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsaveMousePressed(evt);
            }
        });

        messageChangepass.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        messageChangepass.setForeground(new java.awt.Color(238, 44, 17));
        messageChangepass.setText("jLabel1");

        javax.swing.GroupLayout jPanelChangepass1Layout = new javax.swing.GroupLayout(jPanelChangepass1);
        jPanelChangepass1.setLayout(jPanelChangepass1Layout);
        jPanelChangepass1Layout.setHorizontalGroup(
            jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChangepass1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGroup(jPanelChangepass1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(73, 73, 73)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChangepass1Layout.createSequentialGroup()
                        .addComponent(btnsave)
                        .addGap(56, 56, 56)
                        .addComponent(btncancel))
                    .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpassagain, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassnew, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(messageChangepass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpasswordold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelChangepass1Layout.setVerticalGroup(
            jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChangepass1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(messageChangepass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtpasswordold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtpassnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtpassagain, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btncancel))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelChangepass1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelChangepass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpassagainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassagainMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtpassagainMouseClicked

    private void txtpassagainKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassagainKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            savepassword();
        }
    }//GEN-LAST:event_txtpassagainKeyPressed

    private void btnsaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMousePressed
        // TODO add your handling code here:
        messageChangepass.setVisible(false);
        savepassword();
    }//GEN-LAST:event_btnsaveMousePressed

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        if(frm0002s != null){
            frm0002s.setEnabled(true);
            frm0002s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else{
            frm0003s.setEnabled(true);
            frm0003s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_btncancelMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        messageChangepass.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
          if(frm0002s != null){
            frm0002s.setVisible(true);
            frm0002s.setAccurent(accountschool);
        }else{
            frm0003s.setVisible(true);
            frm0003s.setAccurent(accountschool);
        } 
    }//GEN-LAST:event_formWindowClosed

    void savepassword(){
        if(!StringUtils.isNotBlank(txtpasswordold.getText())){
            messageChangepass.setForeground(Color.red);
            messageChangepass.setVisible(true);
            messageChangepass.setText("Incorrect input pass current !");
            return;
        }
        if(!StringUtils.isNotBlank(txtpassnew.getText())){
            messageChangepass.setForeground(Color.red);
            messageChangepass.setVisible(true);
            messageChangepass.setText("Incorrect input pass new !");
            return;
        }
        if(!StringUtils.isNotBlank(txtpassagain.getText())){
            messageChangepass.setForeground(Color.red);
            messageChangepass.setVisible(true);
            messageChangepass.setText("Incorrect input pass current again!");
            return;
        }
        if(txtpassnew.getText().equals(txtpassagain.getText())){
            Common com= new Common();
            if(com.changePassword(accountschool,txtpasswordold.getText(), txtpassnew.getText())){
                messageChangepass.setForeground(Color.GREEN);
                messageChangepass.setVisible(true);
                messageChangepass.setText("Success change password");
                accountschool.setPassword(txtpassnew.getText());
                txtpassagain.setText("");
                txtpassnew.setText("");
                txtpasswordold.setText("");
            }else{
                messageChangepass.setForeground(Color.red);
                messageChangepass.setVisible(true);
                messageChangepass.setText("Error when change password!");
            }
        }else{
            messageChangepass.setForeground(Color.red);
            messageChangepass.setVisible(true);
            messageChangepass.setText("Please confirm pass new !");
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(frmchangepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmchangepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmchangepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmchangepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmchangepassword().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanelChangepass1;
    private javax.swing.JLabel messageChangepass;
    private java.awt.TextField txtpassagain;
    private java.awt.TextField txtpassnew;
    private java.awt.TextField txtpasswordold;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the accountschool
     */
    public AccountSchool getAccountschool() {
        return accountschool;
    }

    /**
     * @param accountschool the accountschool to set
     */
    public void setAccountschool(AccountSchool accountschool) {
        this.accountschool = accountschool;
    }

    /**
     * @return the frm0002s
     */
    public frm0002 getFrm0002s() {
        return frm0002s;
    }

    /**
     * @param frm0002s the frm0002s to set
     */
    public void setFrm0002s(frm0002 frm0002s) {
        this.frm0002s = frm0002s;
    }

    /**
     * @return the frm0003s
     */
    public frm0003 getFrm0003s() {
        return frm0003s;
    }

    /**
     * @param frm0003s the frm0003s to set
     */
    public void setFrm0003s(frm0003 frm0003s) {
        this.frm0003s = frm0003s;
    }

    

}
