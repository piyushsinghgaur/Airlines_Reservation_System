/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seat;

import java.awt.Toolkit;

/**
 *
 * @author Dell
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        setIcon();
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

        Header = new javax.swing.JPanel();
        MainLogo = new javax.swing.JLabel();
        WelcomeText = new javax.swing.JLabel();
        OwnerName3 = new javax.swing.JLabel();
        OwnerName5 = new javax.swing.JLabel();
        OwnerName6 = new javax.swing.JLabel();
        OwnerName7 = new javax.swing.JLabel();
        OwnerName8 = new javax.swing.JLabel();
        OwnerName9 = new javax.swing.JLabel();
        OwnerName10 = new javax.swing.JLabel();
        OwnerName11 = new javax.swing.JLabel();
        OwnerName12 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();

        setTitle("About");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(207, 0, 15));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainLogo.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        MainLogo.setForeground(new java.awt.Color(255, 255, 255));
        MainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seat/HeaderMainLogoTextNew.png"))); // NOI18N
        Header.add(MainLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 190, 60));

        WelcomeText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        WelcomeText.setForeground(new java.awt.Color(255, 255, 255));
        Header.add(WelcomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 20, 40));

        OwnerName3.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        OwnerName3.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName3.setText("© Air Asia Airlines.");
        Header.add(OwnerName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 260, -1));

        OwnerName5.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OwnerName5.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName5.setText("Air Asia Airlines Reservation System");
        Header.add(OwnerName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 330, -1));

        OwnerName6.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        OwnerName6.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName6.setText("About");
        Header.add(OwnerName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 40));

        OwnerName7.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OwnerName7.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName7.setText("Version : 1.0");
        Header.add(OwnerName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, -1));

        OwnerName8.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OwnerName8.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName8.setText("This application was produced for educational");
        Header.add(OwnerName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 350, 20));

        OwnerName9.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OwnerName9.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName9.setText("use and non-profit purpose.");
        Header.add(OwnerName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 310, 20));

        OwnerName10.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OwnerName10.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName10.setText("Piyush Singh Gaur");
        Header.add(OwnerName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 190, 20));

        OwnerName11.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OwnerName11.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName11.setText("8400222863");
        Header.add(OwnerName11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 110, 20));

        OwnerName12.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OwnerName12.setForeground(new java.awt.Color(255, 255, 255));
        OwnerName12.setText("Developed by");
        Header.add(OwnerName12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 140, 40));

        CloseButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CloseButton.setText("CLOSE");
        CloseButton.setFocusPainted(false);
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        Header.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 330, 50));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel MainLogo;
    private javax.swing.JLabel OwnerName10;
    private javax.swing.JLabel OwnerName11;
    private javax.swing.JLabel OwnerName12;
    private javax.swing.JLabel OwnerName3;
    private javax.swing.JLabel OwnerName5;
    private javax.swing.JLabel OwnerName6;
    private javax.swing.JLabel OwnerName7;
    private javax.swing.JLabel OwnerName8;
    private javax.swing.JLabel OwnerName9;
    private javax.swing.JLabel WelcomeText;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("appIcon.png")));
    }
}
