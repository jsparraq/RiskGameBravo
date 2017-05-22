/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author andre
 */
public class Declare_attack_Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Declare_attack_Interface() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo_Risk = new javax.swing.JLabel();
        Button_Finish = new javax.swing.JButton();
        Territory_attacker = new javax.swing.JComboBox();
        Map = new javax.swing.JLabel();
        Territory_Defender = new javax.swing.JComboBox<>();
        Button_Roll_Dice = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo_Risk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RISK-LOGO_EMEA.png"))); // NOI18N
        getContentPane().add(Logo_Risk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        Button_Finish.setText("Finish");
        getContentPane().add(Button_Finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 80, 40));

        Territory_attacker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Territory 1", "Territory 2" }));
        Territory_attacker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Territory_attackerActionPerformed(evt);
            }
        });
        getContentPane().add(Territory_attacker, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 140, -1));

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Map.jpg"))); // NOI18N
        getContentPane().add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 350, 220));

        Territory_Defender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Territory 3", "Territory 4" }));
        getContentPane().add(Territory_Defender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 140, -1));

        Button_Roll_Dice.setText("Roll Dice");
        getContentPane().add(Button_Roll_Dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 90, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue-hd-wallpapers-20.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Territory_attackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Territory_attackerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Territory_attackerActionPerformed

     
 
     
    


    
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
            java.util.logging.Logger.getLogger(Declare_attack_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Declare_attack_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Declare_attack_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Declare_attack_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Declare_attack_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Button_Finish;
    private javax.swing.JButton Button_Roll_Dice;
    private javax.swing.JLabel Logo_Risk;
    private javax.swing.JLabel Map;
    private javax.swing.JComboBox<String> Territory_Defender;
    private javax.swing.JComboBox Territory_attacker;
    // End of variables declaration//GEN-END:variables
}