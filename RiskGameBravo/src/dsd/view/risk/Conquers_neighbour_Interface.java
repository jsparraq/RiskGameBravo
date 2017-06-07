package View;

import dsd.model.risk.Session;
import dsd.controller.risk.ConquersNeighbourManager;
import dsd.model.risk.Attack;
import dsd.model.risk.Player;

/**
 *
 * @author UNC Risk Game Model
 */
public class Conquers_neighbour_Interface extends javax.swing.JFrame {

    Session sessionstart;
    Attack Attack;
    Player playerstart;
    /**
     * Creates new form Interfaz
     */
    
    /**
     * 
     * @param session
     * @param attack 
     */
    public Conquers_neighbour_Interface(Session session,Attack attack,Player player) {
        playerstart = player;
        sessionstart = session;
        Attack = attack;
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

        Text = new javax.swing.JLabel();
        Logo_Risk = new javax.swing.JLabel();
        Button_Finish = new javax.swing.JButton();
        Value_army = new javax.swing.JComboBox();
        Map = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("Your Army");
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 120, -1));

        Logo_Risk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RISK-LOGO_EMEA.png"))); // NOI18N
        getContentPane().add(Logo_Risk, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 80));

        Button_Finish.setText("Finish");
        Button_Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FinishActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 180, 30));

        Value_army.setModel((new javax.swing.DefaultComboBoxModel(ConquersNeighbourManager.armies(Attack))));
        Value_army.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Value_armyActionPerformed(evt);
            }
        });
        getContentPane().add(Value_army, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 160, 30));

        Map.setIcon((new javax.swing.ImageIcon(getClass().getResource(ConquersNeighbourManager.Map(sessionstart)))));
        getContentPane().add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue-hd-wallpapers-20.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void Value_armyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Value_armyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Value_armyActionPerformed
   
    /**
     * 
     * @param evt 
     */
    private void Button_FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FinishActionPerformed
        ConquersNeighbourManager.Button_Finish(Attack, this, (String)Value_army.getSelectedItem(),sessionstart,playerstart);
    }//GEN-LAST:event_Button_FinishActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Button_Finish;
    private javax.swing.JLabel Logo_Risk;
    private javax.swing.JLabel Map;
    private javax.swing.JLabel Text;
    private javax.swing.JComboBox Value_army;
    // End of variables declaration//GEN-END:variables
}
