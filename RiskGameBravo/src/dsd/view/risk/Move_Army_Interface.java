package dsd.view.risk;

import javax.swing.Icon;
import dsd.controller.risk.MoveArmyManager;
import dsd.model.risk.Session;

/**
 *
 * @author UNC Risk Game Model
 */
public class Move_Army_Interface extends javax.swing.JFrame {

    Session sessionstart;
    /**
     * Creates new form Interfaz
     */
    
    /**
     * 
     * @param session 
     */
    public Move_Army_Interface(Session session) {
        sessionstart = session;
        initComponents();
        this.setLocationRelativeTo(null);
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
        Final_Territory = new javax.swing.JComboBox();
        Starting_territory = new javax.swing.JComboBox();
        Map = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo_Risk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsd/view/images/RISK-LOGO_EMEA.png"))); // NOI18N
        getContentPane().add(Logo_Risk, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        Button_Finish.setText("Finish");
        Button_Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FinishActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 160, 30));

        Final_Territory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----" }));
        Final_Territory.setEnabled(false);
        Final_Territory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Final_TerritoryActionPerformed(evt);
            }
        });
        getContentPane().add(Final_Territory, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 310, 20));

        Starting_territory.setModel((new javax.swing.DefaultComboBoxModel(MoveArmyManager.Territories(sessionstart))));
        Starting_territory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Starting_territoryActionPerformed(evt);
            }
        });
        getContentPane().add(Starting_territory, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 310, -1));

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsd/view/images/Classic.png"))); // NOI18N
        getContentPane().add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsd/view/images/blue-hd-wallpapers-20.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void Final_TerritoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Final_TerritoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Final_TerritoryActionPerformed

    /**
     * 
     * @param evt 
     */
    private void Starting_territoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Starting_territoryActionPerformed
        Final_Territory.setEnabled(true);
        Final_Territory.setModel(new javax.swing.DefaultComboBoxModel(dsd.controller.risk.MoveArmyManager.neighbours(sessionstart, (String)Starting_territory.getSelectedItem())));
    }//GEN-LAST:event_Starting_territoryActionPerformed

    /**
     * 
     * @param evt 
     */
    private void Button_FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FinishActionPerformed
        dsd.controller.risk.MoveArmyManager.Button_Finish(this, (String)Starting_territory.getSelectedItem(), (String)Final_Territory.getSelectedItem(), sessionstart);
    }//GEN-LAST:event_Button_FinishActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Button_Finish;
    private javax.swing.JComboBox Final_Territory;
    private javax.swing.JLabel Logo_Risk;
    private javax.swing.JLabel Map;
    private javax.swing.JComboBox Starting_territory;
    // End of variables declaration//GEN-END:variables
}
