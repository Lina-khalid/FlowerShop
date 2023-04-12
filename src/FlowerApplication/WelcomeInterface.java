package FlowerApplication;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class WelcomeInterface extends javax.swing.JFrame {

    public void scaleimglbl() {
ImageIcon icon = new ImageIcon("C:\\Users\\st\\Pictures\\pinki.jpg");
Image img = icon.getImage();
Image imgScale = img.getScaledInstance(welLable.getWidth(), welLable.getHeight(), Image.SCALE_SMOOTH);
ImageIcon scaledIcon = new ImageIcon(imgScale);
welLable.setIcon(scaledIcon);
}
    
    public WelcomeInterface() {
        initComponents();
        scaleimglbl();
        // To change the appearance of the button
        JButton[] btns = {startButton};
        for (JButton btn : btns) {
            btn.setBackground(new Color(225, 218, 211));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                }

                @Override
                public void mouseReleased(MouseEvent me) {

                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    btn.setBackground(new Color(209, 190, 190));
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(225, 218, 211));
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        welLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(999, 598));
        setResizable(false);
        setSize(new java.awt.Dimension(999, 598));
        getContentPane().setLayout(null);

        startButton.setBackground(new java.awt.Color(237, 192, 204));
        startButton.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        startButton.setForeground(new java.awt.Color(217, 132, 155));
        startButton.setText("Shop Now");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton);
        startButton.setBounds(400, 420, 160, 40);
        startButton.getAccessibleContext().setAccessibleName("Shop Now");

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("the Flory Shop will help you the best!");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 360, 390, 30);

        jLabel2.setFont(new java.awt.Font("Gabriola", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Daffodiles are blue, tulips are red,");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 300, 720, 70);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Flory Shop");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 160, 690, 200);

        welLable.setForeground(new java.awt.Color(240, 240, 240));
        welLable.setIcon(new javax.swing.ImageIcon("C:\\Users\\st\\Pictures\\pinki.jpg")); // NOI18N
        welLable.setMaximumSize(new java.awt.Dimension(999, 598));
        welLable.setMinimumSize(new java.awt.Dimension(999, 598));
        welLable.setPreferredSize(new java.awt.Dimension(999, 598));
        getContentPane().add(welLable);
        welLable.setBounds(0, 0, 999, 598);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        //Go to the signup interface:
       SignupInterface signupInterface = null;
        if (signupInterface == null) {
            signupInterface = new SignupInterface();
        }
        signupInterface.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_startButtonActionPerformed


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
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel welLable;
    // End of variables declaration//GEN-END:variables
}
