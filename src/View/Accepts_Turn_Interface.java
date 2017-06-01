package View;

import Controller.AcceptTurnManager;
import riskgamemodel.Session;

/**
 *
 * @author UNC Risk Game Model
 */
public class Accepts_Turn_Interface extends javax.swing.JFrame {
    
    Session sessionstart;

    /**
     * 
     * @param session 
     */
    public Accepts_Turn_Interface(Session session) {
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

        Text = new javax.swing.JLabel();
        Logo_Risk = new javax.swing.JLabel();
        Button_Accepts = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(560, 430));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("Your turn has started!");
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        Logo_Risk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RISK-LOGO_EMEA.png"))); // NOI18N
        getContentPane().add(Logo_Risk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        Button_Accepts.setText("Accepts Turn");
        Button_Accepts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AcceptsActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Accepts, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 120, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue-hd-wallpapers-20.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void Button_AcceptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AcceptsActionPerformed
        AcceptTurnManager.Button_finish(sessionstart, this);
    }//GEN-LAST:event_Button_AcceptsActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Button_Accepts;
    private javax.swing.JLabel Logo_Risk;
    private javax.swing.JLabel Text;
    // End of variables declaration//GEN-END:variables
}
