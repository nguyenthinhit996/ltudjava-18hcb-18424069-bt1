/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseone.GUI;

import excerciseone.DTO.AccountSchool;
import javax.swing.JFrame;

/**
 *
 * @author peter
 */
public class frmlogout extends javax.swing.JFrame {
    private AccountSchool accountSchool ;
    private frm0002 frm0002s;
    private frm0003 frm0003s;
    

    /**
     * Creates new form frmlogout
     */
    public frmlogout() {
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

        jPanelChangepass1 = new javax.swing.JPanel();
        btncancelLogout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnoklogout = new javax.swing.JButton();
        UserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        btncancelLogout.setBackground(new java.awt.Color(195, 190, 152));
        btncancelLogout.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btncancelLogout.setText("Cancel");
        btncancelLogout.setName("btnlogin"); // NOI18N
        btncancelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelLogoutMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 251));
        jLabel7.setText("Do you want logout");

        btnoklogout.setBackground(new java.awt.Color(241, 215, 36));
        btnoklogout.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnoklogout.setText("OK");
        btnoklogout.setName("btnlogin"); // NOI18N
        btnoklogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnoklogoutMouseClicked(evt);
            }
        });

        UserName.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(238, 44, 17));
        UserName.setText("jLabel1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_cross_handrawn_close_436171.png"))); // NOI18N

        javax.swing.GroupLayout jPanelChangepass1Layout = new javax.swing.GroupLayout(jPanelChangepass1);
        jPanelChangepass1.setLayout(jPanelChangepass1Layout);
        jPanelChangepass1Layout.setHorizontalGroup(
            jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChangepass1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChangepass1Layout.createSequentialGroup()
                        .addComponent(btnoklogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancelLogout)
                        .addGap(99, 99, 99))
                    .addGroup(jPanelChangepass1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))))
            .addGroup(jPanelChangepass1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelChangepass1Layout.setVerticalGroup(
            jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChangepass1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(UserName))
                .addGap(28, 28, 28)
                .addGroup(jPanelChangepass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelLogout)
                    .addComponent(btnoklogout))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelChangepass1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelChangepass1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelLogoutMouseClicked
        // TODO add your handling code here:
        UserName.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btncancelLogoutMouseClicked

    private void btnoklogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnoklogoutMouseClicked
        // TODO add your handling code here:
        if(frm0002s != null){
            frm0002s.dispose();
        }else{
            frm0003s.dispose();
        }
        frm0001 frm01 = new frm0001();
        frm01.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnoklogoutMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        UserName.setText(accountSchool.getNameshow());
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        if(frm0002s != null){
            frm0002s.setEnabled(true);
            frm0002s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }else{
            frm0003s.setEnabled(true);
            frm0003s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(frmlogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlogout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserName;
    private javax.swing.JButton btncancelLogout;
    private javax.swing.JButton btnoklogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelChangepass1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the accountSchool
     */
    public AccountSchool getAccountSchool() {
        return accountSchool;
    }

    /**
     * @param accountSchool the accountSchool to set
     */
    public void setAccountSchool(AccountSchool accountSchool) {
        this.accountSchool = accountSchool;
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
