/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.GUI;

import excerciseone.BLL.BLLfrm0001;
import excerciseone.DTO.AccountSchool;
import java.awt.event.KeyEvent;

/**
 *
 * @author peter
 */
public class frm0001 extends javax.swing.JFrame {

    /**
     * Creates new form frm0001
     */
    public frm0001() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnamelogin = new java.awt.TextField();
        txtpasslogin = new java.awt.TextField();
        labelerrorlogin = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 100));
        setName("Login"); // NOI18N
        setPreferredSize(new java.awt.Dimension(548, 393));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(129, 211, 227));
        jPanel1.setToolTipText("");
        jPanel1.setName("JpanelLogin"); // NOI18N

        jLabel1.setBackground(new java.awt.Color(234, 242, 245));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 238));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_ilustracoes_04-01_1519777(1).png"))); // NOI18N
        jLabel1.setText("System Management Subject");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 251));
        jLabel2.setText("Name ");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 251));
        jLabel3.setText("Password");

        txtnamelogin.setName("txtnamelogin"); // NOI18N
        txtnamelogin.setPreferredSize(new java.awt.Dimension(69, 25));
        txtnamelogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameloginFocusGained(evt);
            }
        });
        txtnamelogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameloginKeyPressed(evt);
            }
        });

        txtpasslogin.setName("txtpasslogin"); // NOI18N
        txtpasslogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassloginFocusGained(evt);
            }
        });
        txtpasslogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassloginKeyPressed(evt);
            }
        });

        labelerrorlogin.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        labelerrorlogin.setForeground(new java.awt.Color(247, 77, 77));
        labelerrorlogin.setText("Incorrect name or password");
        labelerrorlogin.setName("labelerrorlogin"); // NOI18N

        btnlogin.setBackground(new java.awt.Color(241, 215, 36));
        btnlogin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.setName("btnlogin"); // NOI18N
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnloginMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpasslogin, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnamelogin, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelerrorlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlogin))
                        .addGap(86, 86, 86))
                    .addComponent(jLabel1))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelerrorlogin)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtnamelogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtpasslogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btnlogin)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       labelerrorlogin.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void btnloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMousePressed
        // TODO add your handling code here:
        this.checklogin();    
       // frm0003 frmhocsinh= new frm0003();
               //frmhocsinh.setAccurent(acc);
                //frmhocsinh.setVisible(true);
    }//GEN-LAST:event_btnloginMousePressed

    private void txtnameloginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameloginFocusGained
        // TODO add your handling code here:
        labelerrorlogin.setVisible(false);
    }//GEN-LAST:event_txtnameloginFocusGained

    private void txtpassloginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassloginFocusGained
        // TODO add your handling code here:
          labelerrorlogin.setVisible(false);
    }//GEN-LAST:event_txtpassloginFocusGained

    private void txtpassloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassloginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.checklogin();
        }
    }//GEN-LAST:event_txtpassloginKeyPressed

    private void txtnameloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameloginKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
           this.checklogin();
        }
    }//GEN-LAST:event_txtnameloginKeyPressed

    public void checklogin(){
       labelerrorlogin.setVisible(false);
       String name=txtnamelogin.getText();
       String pass=txtpasslogin.getText();
       BLLfrm0001 bLLfrm0001;
        bLLfrm0001 = new BLLfrm0001(name, pass);
       AccountSchool acc=bLLfrm0001.checkLogin();
       if(acc != null){
           
           if(acc.getNamelogin().equals("giao vu")){
               // giao vu
                frm0002 frmgiaovu= new frm0002();
                frmgiaovu.setAccurent(acc);
                frmgiaovu.setVisible(true);
           }else{
               // giao vu
                frm0003 frmhocsinh= new frm0003();
                frmhocsinh.setAccurent(acc);
                frmhocsinh.setVisible(true);
           }
            this.dispose();
       }else{
            labelerrorlogin.setVisible(true);
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
            java.util.logging.Logger.getLogger(frm0001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm0001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm0001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm0001.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm0001().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelerrorlogin;
    private java.awt.TextField txtnamelogin;
    private java.awt.TextField txtpasslogin;
    // End of variables declaration//GEN-END:variables
}
