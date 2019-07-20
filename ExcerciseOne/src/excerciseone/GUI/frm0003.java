/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.GUI;

import excerciseone.BLL.Common;
import excerciseone.DTO.AccountSchool;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author peter
 */
public class frm0003 extends javax.swing.JFrame {

    private AccountSchool accurent;
    
    /**
     * Creates new form frm0002
     */
    public frm0003() {
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
        timecurrents = new javax.swing.JLabel();
        btnchangepass = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jPanelChangepass = new javax.swing.JPanel();
        txtnamelogin = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpasslogin = new java.awt.TextField();
        btnlogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtnamelogin1 = new java.awt.TextField();
        btnlogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management Study");
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(129, 211, 227));

        timecurrents.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        timecurrents.setText("0000-00-00 00:00:00 ");

        btnchangepass.setBackground(new java.awt.Color(220, 204, 96));
        btnchangepass.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnchangepass.setText("Change password");
        btnchangepass.setName("btnchangepass"); // NOI18N
        btnchangepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnchangepassMouseClicked(evt);
            }
        });

        btnlogout.setBackground(new java.awt.Color(124, 121, 102));
        btnlogout.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.setName("btnchangepass"); // NOI18N
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlogoutMousePressed(evt);
            }
        });

        jPanelChangepass.setBackground(new java.awt.Color(227, 156, 129));
        jPanelChangepass.setVisible(false);

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

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 251));
        jLabel2.setText("Password New");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 251));
        jLabel3.setText("Password new again ");

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

        btnlogin.setBackground(new java.awt.Color(241, 215, 36));
        btnlogin.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnlogin.setText("Cancel");
        btnlogin.setName("btnlogin"); // NOI18N
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 251));
        jLabel4.setText("Password Old");

        txtnamelogin1.setName("txtnamelogin"); // NOI18N
        txtnamelogin1.setPreferredSize(new java.awt.Dimension(69, 25));
        txtnamelogin1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnamelogin1FocusGained(evt);
            }
        });
        txtnamelogin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnamelogin1KeyPressed(evt);
            }
        });

        btnlogin1.setBackground(new java.awt.Color(241, 215, 36));
        btnlogin1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnlogin1.setText("Save");
        btnlogin1.setName("btnlogin"); // NOI18N
        btnlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelChangepassLayout = new javax.swing.GroupLayout(jPanelChangepass);
        jPanelChangepass.setLayout(jPanelChangepassLayout);
        jPanelChangepassLayout.setHorizontalGroup(
            jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChangepassLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelChangepassLayout.createSequentialGroup()
                        .addGroup(jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpasslogin, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnamelogin, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelChangepassLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btnlogin))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelChangepassLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnamelogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChangepassLayout.createSequentialGroup()
                    .addContainerGap(239, Short.MAX_VALUE)
                    .addComponent(btnlogin1)
                    .addGap(231, 231, 231)))
        );
        jPanelChangepassLayout.setVerticalGroup(
            jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChangepassLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtnamelogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtnamelogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtpasslogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlogin)
                .addGap(21, 21, 21))
            .addGroup(jPanelChangepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChangepassLayout.createSequentialGroup()
                    .addContainerGap(197, Short.MAX_VALUE)
                    .addComponent(btnlogin1)
                    .addGap(22, 22, 22)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(timecurrents)
                .addGap(212, 212, 212)
                .addComponent(btnchangepass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlogout)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jPanelChangepass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogout)
                    .addComponent(btnchangepass)
                    .addComponent(timecurrents))
                .addGap(51, 51, 51)
                .addComponent(jPanelChangepass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
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

    private void btnlogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogoutMousePressed

    private void btnchangepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnchangepassMouseClicked
        // TODO add your handling code here:
        jPanelChangepass.setVisible(true);
    }//GEN-LAST:event_btnchangepassMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

            // TODO add your handling code here:
            
            Common com= new Common();
            ActionListener updateClockAction = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        timecurrents.setText(com.getTimeCurrent());
                      }
            };
            Timer t = new Timer(1000, updateClockAction);
            t.start();
            
//            Thread abc= new Thread(new Runnable() {
//                @Override
//                public void run() {
//                        timecurrents.setText(com.getTimeCurrent());             
//                }
//            });
//            while(true){
//                abc.start();
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(frm0003.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
            
            
    }//GEN-LAST:event_formWindowActivated

    private void txtnameloginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameloginFocusGained
        // TODO add your handling code here:
        labelerrorlogin.setVisible(false);
    }//GEN-LAST:event_txtnameloginFocusGained

    private void txtnameloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameloginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.checklogin();
        }
    }//GEN-LAST:event_txtnameloginKeyPressed

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

    private void txtnamelogin1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnamelogin1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamelogin1FocusGained

    private void txtnamelogin1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamelogin1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamelogin1KeyPressed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm0003.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm0003.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm0003.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm0003.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm0003().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchangepass;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogin1;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelChangepass;
    private javax.swing.JLabel timecurrents;
    private java.awt.TextField txtnamelogin;
    private java.awt.TextField txtnamelogin1;
    private java.awt.TextField txtpasslogin;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the accurent
     */
    public AccountSchool getAccurent() {
        return accurent;
    }

    /**
     * @param accurent the accurent to set
     */
    public void setAccurent(AccountSchool accurent) {
        this.accurent = accurent;
    }
}
