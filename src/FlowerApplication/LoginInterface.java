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
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(999, 598));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 203, 189));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 524));

        pageTitleLabel.setFont(new java.awt.Font("Gabriola", 0, 90)); // NOI18N
        pageTitleLabel.setForeground(new java.awt.Color(217, 132, 155));
        pageTitleLabel.setText("Login");

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome to log in, with LOVE ");

        emailLabel.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        passTextField6.setBackground(new java.awt.Color(242, 203, 189));
        passTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 161, 191)));
        passTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextField6ActionPerformed(evt);
            }
        });

        passLabel.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password");

        rememberMeCheckBox.setBackground(new java.awt.Color(51, 51, 51));
        rememberMeCheckBox.setText("Show password");
        rememberMeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberMeCheckBoxActionPerformed(evt);
            }
        });

        accountLabel.setText("Don't have an account?");

        managerLabel.setText("Are you manager?");

        toManagerPage.setBackground(new java.awt.Color(102, 102, 102));
        toManagerPage.setForeground(new java.awt.Color(255, 255, 255));
        toManagerPage.setText("Manager Page");
        toManagerPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toManagerPageActionPerformed(evt);
            }
        });

        forgetPassButton.setBackground(new java.awt.Color(51, 51, 51));
        forgetPassButton.setText("Forget password?");
        forgetPassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPassButtonActionPerformed(evt);
            }
        });

        emailTextField.setBackground(new java.awt.Color(242, 203, 189));
        emailTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(176, 161, 191)));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        signUButton.setBackground(new java.awt.Color(217, 132, 155));
        signUButton.setForeground(new java.awt.Color(217, 132, 155));
        signUButton.setText("Sign Up Now");
        signUButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\st\\Downloads\\vectorPinkFlower.png")); // NOI18N
        jLabel1.setText("jLabel1");

        loginButton.setBackground(new java.awt.Color(217, 132, 155));
        loginButton.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(217, 132, 155));
        loginButton.setText("Login");
        loginButton.setActionCommand("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel)
                            .addComponent(passTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(rememberMeCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(forgetPassButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(accountLabel)
                                        .addGap(67, 67, 67)
                                        .addComponent(signUButton))
                                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(welcomeLabel)
                            .addComponent(pageTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(283, 283, 283)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(managerLabel)
                .addGap(18, 18, 18)
                .addComponent(toManagerPage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(pageTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(welcomeLabel)
                .addGap(65, 65, 65)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rememberMeCheckBox)
                    .addComponent(forgetPassButton))
                .addGap(33, 33, 33)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUButton)
                    .addComponent(accountLabel))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(managerLabel)
                    .addComponent(toManagerPage))
                .addGap(316, 316, 316))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void toManagerPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toManagerPageActionPerformed

        // Go to the Manager interface
        ManagerInterface ManagerInterface1 = null;
        if (ManagerInterface1 == null) {
            ManagerInterface1 = new ManagerInterface();
        }
        ManagerInterface1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_toManagerPageActionPerformed

    private void rememberMeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberMeCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberMeCheckBoxActionPerformed

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

    private void forgetPassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPassButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgetPassButtonActionPerformed

    private void signUButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUButtonActionPerformed
        //Go to the signup interface:
        SignupInterface signupInterface = null;
        if (signupInterface == null) {
            signupInterface = new SignupInterface();
        }
        signupInterface.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signUButtonActionPerformed





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
    private javax.swing.JButton forgetPassButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
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
