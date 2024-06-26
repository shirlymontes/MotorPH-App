package com.group4.main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.group4.form.EmployeeForm;
import com.group4.form.PayrollForm;
import com.group4.form.TimesheetForm;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Main extends javax.swing.JFrame {

    private Animator animatorLogin;
    private Animator animatorBody;
    private boolean Login;
    private JPopupMenu profileMenu;

    public Main() {
        initComponents();
        getContentPane().setBackground(new Color(73, 79, 101));
        setResizable(true); // allow JFrame to be resized
        setLocationRelativeTo(null); //center the frame on the screen
        setLayout();

        //set to shape the window to rounded sides
        java.awt.EventQueue.invokeLater(() -> {
            setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
        });
        //Animation behavior in login panel
        TimingTarget targetLogin = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (Login) {
                    Background.setAnimate(fraction);//Animate background during login
                } else {
                    Background.setAnimate(1f - fraction);// reverse animation during logout
                }
            }

            @Override
            public void end() {
                if (Login) {
                    PanelLogin.setVisible(false);
                    Background.setShowPaint(true);
                    PanelBody.setAlpha(0);
                    PanelBody.setVisible(true);
                    animatorBody.start();
                } else {
                    enableLogin(true);
                    txtUser.grabFocus();
                }
            }
        };

        //the animation behavior for the main body panel
        TimingTarget targetBody = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (Login) {
                    PanelBody.setAlpha(fraction);
                } else {
                    PanelBody.setAlpha(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (Login == false) {
                    PanelBody.setVisible(false);
                    Background.setShowPaint(false);
                    Background.setAnimate(1);
                    PanelLogin.setVisible(true);
                    animatorLogin.start();

                }
            }

        };
        //animators for login and body transitions
        animatorLogin = new Animator(1500, targetLogin);
        animatorBody = new Animator(500, targetBody);
        animatorLogin.setResolution(0);
        animatorBody.setResolution(0);

        initializePlaceholders();//initialize placeholders for text fields

    }

    //initialize the placeholders for the username and passwords fields
    private void initializePlaceholders() {
        txtUser.setText("Enter Username");
        txtUser.setForeground(new Color(155, 155, 155)); //color of placeholder
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtUser.getText().equals("Enter Username")) {
                    txtUser.setText("");
                    txtUser.setForeground(Color.BLACK);
                }
                txtUser.getCaret().setVisible(true);

            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtUser.getText().isEmpty()) {
                    txtUser.setText("Enter Username");
                    txtUser.setForeground(new Color(155, 155, 155));
                }
            }
        });

        txtPass.setPlaceholder("Enter Password");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new com.group4.resources.Button();
        button2 = new com.group4.resources.Button();
        jTextField1 = new javax.swing.JTextField();
        Background = new com.group4.resources.WaveBackground();
        PanelLogin = new com.group4.resources.PanelTransparent();
        cmdLogin = new com.group4.resources.Button();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new com.group4.resources.textField1();
        txtPass = new com.group4.resources.PasswordField();
        PanelBody = new com.group4.resources.PanelTransparent();
        cmdLogout = new com.group4.resources.Button();
        Profile = new javax.swing.JLabel();
        panelFormPlaceholder = new com.group4.resources.PanelTransparent();
        EmployeeForm = new com.group4.form.EmployeeForm();
        TimesheetForm = new com.group4.form.TimesheetForm();
        PayrollForm = new com.group4.form.PayrollForm();
        sideMenu = new com.group4.component.SideMenu();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(73, 79, 101));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        Background.setLayout(new java.awt.CardLayout());

        cmdLogin.setBackground(new java.awt.Color(255, 140, 50));
        cmdLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdLogin.setForeground(new java.awt.Color(255, 255, 255));
        cmdLogin.setText("LOGIN");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/Group 18 (1).png"))); // NOI18N

        txtUser.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/profile.png"))); // NOI18N
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmdLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                            .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(363, 363, 363))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(441, 441, 441))))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cmdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        Background.add(PanelLogin, "card2");

        PanelBody.setBackground(new java.awt.Color(73, 79, 101));
        PanelBody.setToolTipText("");

        cmdLogout.setBackground(new java.awt.Color(73, 79, 101));
        cmdLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/log-out (1).png"))); // NOI18N
        cmdLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogoutActionPerformed(evt);
            }
        });

        Profile.setBackground(new java.awt.Color(255, 255, 255));
        Profile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/officer.png"))); // NOI18N
        Profile.setText("   Hello, Admin!    ");
        Profile.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Profile.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ProfileAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });

        panelFormPlaceholder.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelFormPlaceholderAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panelFormPlaceholder.setLayout(new java.awt.CardLayout());
        panelFormPlaceholder.add(EmployeeForm, "card2");
        panelFormPlaceholder.add(TimesheetForm, "card4");
        panelFormPlaceholder.add(PayrollForm, "card3");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/Group 19.png"))); // NOI18N

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cmdLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(panelFormPlaceholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 800, Short.MAX_VALUE)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(sideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addComponent(cmdLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(PanelBodyLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(panelFormPlaceholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Background.add(PanelBody, "card3");

        getContentPane().add(Background, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Action listener for LOGIN 
    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        Login = true;
        if (!animatorLogin.isRunning()) { //check if the login animator is not already running
            String user = txtUser.getText().trim(); // get the trimmed username
            String pass = String.valueOf(txtPass.getPassword()); //get the password
            boolean action = true;//checked if the login should proceed

            //check if username is empty
            if (user.equals("")) {
                txtUser.grabFocus();
                action = false;
            }
            //check if password is empty
            if (pass.equals("")) {
                if (action) {
                    txtPass.grabFocus();
                }
                action = false; // do  ot proceed with login
            }
            if (action) {
                if (checkCredentials(user, pass)) { //check credentials.csv
                    animatorLogin.start(); //Start login animation
                    enableLogin(false); // disappear login fields and button
                } else {
                    //display error message or handle failed login
                    javax.swing.JOptionPane.showMessageDialog(this, "Invalid username or password");
                }

            }
        }

    }//GEN-LAST:event_cmdLoginActionPerformed
    //method to check credentials.csv
    private boolean checkCredentials(String username, String password) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\PotChi\\Documents\\NetBeansProjects\\MotorPH CP2\\src\\com\\group4\\csv\\credentials.csv"));
            for (String line : lines) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String user = parts[0].trim();
                    String pass = parts[1].trim();
                    if (user.equals(username) && pass.equals(password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }


    private void cmdLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogoutActionPerformed
        Login = false;
        clearLogin();
        animatorBody.start();
    }//GEN-LAST:event_cmdLogoutActionPerformed
    private void logout() {
        Login = false;
        clearLogin();
        animatorBody.start();
    }

    private void loadForm(JPanel panel) {
        panelFormPlaceholder.removeAll();
        panelFormPlaceholder.add(panel);
        panelFormPlaceholder.revalidate();
        panelFormPlaceholder.repaint();
    }


    private void ProfileAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ProfileAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileAncestorAdded

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
        profileMenu = new JPopupMenu(); // Create JPopupMenu 
        JMenuItem logoutMenuItem = new JMenuItem("Logout");
        logoutMenuItem.addActionListener(e -> logout());
        profileMenu.add(logoutMenuItem);

        // Add mouse click listener to the profile image and add menu item for logout
        Profile.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (SwingUtilities.isLeftMouseButton(evt)) { //show the profile menu when the left mouse button clicked
                    profileMenu.show(Profile, evt.getX(), evt.getY());

                }
            }
        });
    }//GEN-LAST:event_ProfileMouseClicked

    private void panelFormPlaceholderAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelFormPlaceholderAncestorAdded
        //to load different forms when the button is clicked        
        sideMenu.getButtonEmployees().addActionListener(e -> {
            loadForm(new EmployeeForm());
        });

        sideMenu.getButtonTimesheet().addActionListener(e -> {
            loadForm(new TimesheetForm());
        });

        sideMenu.getButtonPayroll().addActionListener(e -> {
            loadForm(new PayrollForm());
        });
    }//GEN-LAST:event_panelFormPlaceholderAncestorAdded

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained


    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost


    }//GEN-LAST:event_txtUserFocusLost

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained

    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost

    }//GEN-LAST:event_txtPassFocusLost
// method to enable or disable login fields and button
    private void enableLogin(boolean action) {
        txtUser.setEditable(action);
        txtPass.setEditable(action);

        cmdLogin.setEnabled(action);
    }

    // to clear login fields
    public void clearLogin() {
        txtUser.setText("");
        txtPass.setText("");

    }

    private void setLayout() {
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(Background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(Background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    
    // start of the application
    public static void main(String args[]) {
        //install custom fonts
        FlatRobotoFont.install();
        // set the default font for ui components
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));

        try {
            UIManager.setLookAndFeel(new FlatLightLaf()); // set the look and feel , makes the application looks more modern 
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace(); // print stack trace if LAF is not supported
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true); // make the frame visible
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group4.resources.WaveBackground Background;
    private com.group4.form.EmployeeForm EmployeeForm;
    private com.group4.resources.PanelTransparent PanelBody;
    private com.group4.resources.PanelTransparent PanelLogin;
    private com.group4.form.PayrollForm PayrollForm;
    private javax.swing.JLabel Profile;
    private com.group4.form.TimesheetForm TimesheetForm;
    private com.group4.resources.Button button1;
    private com.group4.resources.Button button2;
    private com.group4.resources.Button cmdLogin;
    private com.group4.resources.Button cmdLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private com.group4.resources.PanelTransparent panelFormPlaceholder;
    private com.group4.component.SideMenu sideMenu;
    private com.group4.resources.PasswordField txtPass;
    private com.group4.resources.textField1 txtUser;
    // End of variables declaration//GEN-END:variables
}
