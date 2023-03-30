package FlowerApplication;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class LoginInterface extends javax.swing.JFrame {

    public LoginInterface() {
        initComponents();

        // To change the appearance of the button
        JButton[] btns = {toManagerPage, loginButton, forgetPassButton, signUButton};
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

        jPanel1 = new javax.swing.JPanel();
        pageTitleLabel = new javax.swing.JLabel();
        flowerPicBackgroundLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passTextField6 = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        rememberMeCheckBox = new javax.swing.JCheckBox();
        accountLabel = new javax.swing.JLabel();
        managerLabel = new javax.swing.JLabel();
        toManagerPage = new javax.swing.JButton();
        forgetPassButton = new javax.swing.JButton();
        emailTextField = new javax.swing.JTextField();
        signUButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 642));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 218, 211));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 524));

        pageTitleLabel.setFont(new java.awt.Font("Broadway", 0, 77)); // NOI18N
        pageTitleLabel.setForeground(new java.awt.Color(176, 161, 191));
        pageTitleLabel.setText("Login");

        flowerPicBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiIcon/Picture5.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(225, 218, 211));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        loginButton.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        loginButton.setForeground(new java.awt.Color(102, 102, 102));
        loginButton.setText("Let's Shop");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome to log in, with LOVE ");

        emailLabel.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        passTextField6.setBackground(new java.awt.Color(225, 218, 211));
        passTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 161, 191)));
        passTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextField6ActionPerformed(evt);
            }
        });

        passLabel.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password");

        rememberMeCheckBox.setText("Remember me");
        rememberMeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberMeCheckBoxActionPerformed(evt);
            }
        });

        accountLabel.setText("Don't have an account?");

        managerLabel.setText("Are you manager?");

        toManagerPage.setForeground(new java.awt.Color(255, 255, 255));
        toManagerPage.setText("Manager Page");
        toManagerPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toManagerPageActionPerformed(evt);
            }
        });

        forgetPassButton.setText("Forget password?");

        emailTextField.setBackground(new java.awt.Color(225, 218, 211));
        emailTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 161, 191)));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        signUButton.setForeground(new java.awt.Color(176, 161, 191));
        signUButton.setText("Sign Up Now");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pageTitleLabel)
                    .addComponent(welcomeLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passTextField6)
                            .addComponent(emailLabel)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(managerLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(toManagerPage))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(accountLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(signUButton))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(rememberMeCheckBox)
                                    .addGap(111, 111, 111)
                                    .addComponent(forgetPassButton))
                                .addComponent(passLabel))
                            .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addComponent(flowerPicBackgroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(629, 629, 629))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pageTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(welcomeLabel)
                        .addGap(53, 53, 53)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(passLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rememberMeCheckBox)
                            .addComponent(forgetPassButton))
                        .addGap(117, 117, 117)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountLabel)
                            .addComponent(signUButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toManagerPage)
                            .addComponent(managerLabel)))
                    .addComponent(flowerPicBackgroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTextField6ActionPerformed


    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        // To navigate to the Home interface
        HomeInterface HomeInterface1 = null;
        if (HomeInterface1 == null) {
            HomeInterface1 = new HomeInterface();
        }
        HomeInterface1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonActionPerformed


    private void rememberMeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberMeCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberMeCheckBoxActionPerformed


    private void toManagerPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toManagerPageActionPerformed

        // To navigate to the Manager interface
        ManagerInterface ManagerInterface1 = null;
        if (ManagerInterface1 == null) {
            ManagerInterface1 = new ManagerInterface();
        }
        ManagerInterface1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toManagerPageActionPerformed


    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

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
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel flowerPicBackgroundLabel;
    private javax.swing.JButton forgetPassButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel managerLabel;
    private javax.swing.JLabel pageTitleLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTextField passTextField6;
    private javax.swing.JCheckBox rememberMeCheckBox;
    private javax.swing.JButton signUButton;
    private javax.swing.JButton toManagerPage;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
