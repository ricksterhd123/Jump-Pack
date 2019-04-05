/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import okhttp3.*;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 * <h1>LogIn Form</h1>
 * The logIn is a class that provides a simple Graphical User
 * Interface where the user is able to enter their account data
 * to be able to login and enter in our app.
 * Or to create an account which redirects the user to our
 * registration form on a browser website.
 * 
 * @author Nicekor
 * @author JamesR555
 * @version 1.0
 * @since 2019-03-26
 */
public class logIn extends javax.swing.JFrame {
    private int mousepX; // position X of the mouse when pressed
    private int mousepY;// position Y of the mouse when pressed

    /**
     * Creates new form logIn
     */
    public logIn() {
        initComponents();
        centerWindow();
        addResizableImageToBtn(closeBtn, "/images/close.png");
        addResizableImageToLbl(logo, "/images/jp_logo.png");
        addResizableImageToBtn(minimizeBtn, "/images/minimize.png");
        customiseJOptionPane();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        windowBar = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JButton();
        userNameTxtField = new javax.swing.JTextField();
        userLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        logInBtn = new javax.swing.JButton();
        passTxtField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        cancelBtn = new javax.swing.JButton();
        registerLbl = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(233, 111, 42));

        windowBar.setBackground(new java.awt.Color(237, 137, 80));
        windowBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                windowBarMouseDragged(evt);
            }
        });
        windowBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                windowBarMousePressed(evt);
            }
        });

        closeBtn.setBackground(new java.awt.Color(237, 137, 80));
        closeBtn.setForeground(new java.awt.Color(237, 137, 80));
        closeBtn.setBorder(null);
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        title.setText("JumpPack - Log In");

        minimizeBtn.setBackground(new java.awt.Color(237, 137, 80));
        minimizeBtn.setForeground(new java.awt.Color(237, 137, 80));
        minimizeBtn.setBorder(null);
        minimizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout windowBarLayout = new javax.swing.GroupLayout(windowBar);
        windowBar.setLayout(windowBarLayout);
        windowBarLayout.setHorizontalGroup(
            windowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, windowBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        windowBarLayout.setVerticalGroup(
            windowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, windowBarLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(windowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        userNameTxtField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userNameTxtField.setForeground(new java.awt.Color(204, 204, 204));
        userNameTxtField.setText("Username");
        userNameTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameTxtFieldFocusGained(evt);
            }
        });
        userNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtFieldActionPerformed(evt);
            }
        });
        userNameTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameTxtFieldKeyPressed(evt);
            }
        });

        userLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userLbl.setText("Account name:");

        passLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passLbl.setText("Password:");

        logInBtn.setText("Log-In ");
        logInBtn.setBorder(new javax.swing.border.MatteBorder(null));
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });

        passTxtField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passTxtField.setForeground(new java.awt.Color(204, 204, 204));
        passTxtField.setText("Password");
        passTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTxtFieldFocusGained(evt);
            }
        });
        passTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passTxtFieldKeyPressed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.setBorder(new javax.swing.border.MatteBorder(null));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        registerLbl.setText("Don't have a JumpPack account?");

        registerBtn.setText("Create a new account...");
        registerBtn.setBorder(new javax.swing.border.MatteBorder(null));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registerLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passLbl)
                            .addComponent(userLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(logInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(windowBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLbl)
                    .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerLbl))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * When the register button is pressed the user is redirected
     * to the following website:
     * <a href="https://jumppack.herokuapp.com/register">JumpPack Registration </a>
     * on his default browser.
     * @param evt The ActionEvent
     */
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                URI uri = new URI("https://jumppack.herokuapp.com/register");
                desktop.browse(uri);
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    /**
     * This method makes the cancel button end the app.
     * @param evt The ActionEvent
     */
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * This method makes the user be able to click the
     * login button by pressing the Enter Key
     * while the password text field is on focus.
     * @param evt The KeyEvent
     */
    private void passTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTxtFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logInBtn.doClick();
        }
    }//GEN-LAST:event_passTxtFieldKeyPressed

    /**
     * This method makes the password text field become empty
     * and the text colour black
     * if the user click on it as we have a placeholder.
     * @param evt The FocusEvent
     */
    private void passTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFieldFocusGained
        passTxtField.setText("");
        passTxtField.setForeground(Color.BLACK);
    }//GEN-LAST:event_passTxtFieldFocusGained

    /**
     * When the button "Login" is pressed, this method checks
     * if the user data is correct, if it isn't it
     * tells the user why he can't login, if it is the user gains access
     * to the app and the HomePage is opened.
     * @param evt The ActionEvent
     */
    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        String uname = userNameTxtField.getText();
        String pass = passTxtField.getText();

        //When the user account database is created the .equals variable will need to be updated with the caried values from the complete web app
        HttpClient client = new HttpClient();
        client.setAuthenticator(new Authenticator() {
            @Override public Credential authenticate(
      Proxy proxy, URL url, List<Challenge> challenges) throws IOException {
    return Credential.basic("scott", "tiger");
  }

  @Override public Credential authenticateProxy(
      Proxy proxy, URL url, List<Challenge> challenges) throws IOException {
    return null;
  }
});
        if (uname.equals("admin") && pass.equals("Password123")) {

            JOptionPane loginMsg = new JOptionPane("Logging in, Please wait...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
            final JDialog msg = loginMsg.createDialog(this, "Connecting..");

            new SwingWorker<Void, Void>() {

                @Override
                protected Void doInBackground() throws Exception {
                    //Causes a tempoary delay for the log in
                    Thread.sleep(2500);

                    return null;
                }

                // this is called when background thread above has completed.
                protected void done() {
                    msg.dispose();
                };
            }.execute();

            msg.setVisible(true);
            dispose();
            HomePage a = null;
            try {
                a = new HomePage();
            } catch (IOException ex) {
                Logger.getLogger(logIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            a.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_logInBtnActionPerformed

    /**
     * This method makes the user be able to click the
     * login button by pressing the Enter Key
     * while the username text field is on focus.
     * @param evt The KeyEvent
     */
    private void userNameTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameTxtFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logInBtn.doClick();
        }
    }//GEN-LAST:event_userNameTxtFieldKeyPressed

    private void userNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtFieldActionPerformed

    /**
     * This method makes the username text field become empty
     * and the text colour
     * if the user click on it as we have a placeholder.
     * @param evt The FocusEvent
     */
    private void userNameTxtFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTxtFieldFocusGained
        userNameTxtField.setText("");
        userNameTxtField.setForeground(Color.BLACK);
    }//GEN-LAST:event_userNameTxtFieldFocusGained

    /**
     * This method is used to change the instance variables:
     * mousepX
     * mousepY
     * to the mouse current position when the window bar is pressed.
     * @param evt The MouseEvent
     */
    private void windowBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowBarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_windowBarMousePressed

    /**
     * This method is used to make the customised window bar draggable.
     * @param evt The MouseEvent
     */
    private void windowBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowBarMouseDragged
        int pX = evt.getXOnScreen();
        int pY = evt.getYOnScreen();
        this.setLocation(pX - mousepX, pY - mousepY);
    }//GEN-LAST:event_windowBarMouseDragged

    /**
     * This method makes the minimise button minimise the application.
     * @param evt The ActionEvent
     */
    private void minimizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeBtnActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeBtnActionPerformed

    /**
     * This method makes the close button end the application.
     * @param evt The ActionEvent
     */
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logInBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JLabel passLbl;
    private javax.swing.JPasswordField passTxtField;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel registerLbl;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLbl;
    private javax.swing.JTextField userNameTxtField;
    private javax.swing.JPanel windowBar;
    // End of variables declaration//GEN-END:variables

    /**
     * This method changes the position of the window
     * to the center of the screen.
     */
    private void centerWindow() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    /**
     * This method adds a resizable image to a button and makes it being
     * the same size as the button.
     * @param button The JButton chosen.
     * @param path The path of the image.
     */
    private void addResizableImageToBtn(javax.swing.JButton button, String path) {
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(path)));
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);

        button.setIcon(i);
    }

    /**
     * This method adds a resizable image to a label and makes it being
     * the same size as the label.
     * @param label The JLabel chosen.
     * @param path The path of the image.
     */
    private void addResizableImageToLbl(javax.swing.JLabel label, String path) {
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(path)));
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);

        label.setIcon(i);
    }

    /**
     * This method customises the JOption Pane.
     */
    private void customiseJOptionPane() {
        JDialog.setDefaultLookAndFeelDecorated(true);
        UIManager.put("OptionPane.background", new ColorUIResource(237, 137, 80));
        UIManager.put("Panel.background", new ColorUIResource(237, 137, 80));

        UIManager.put("OptionPane.errorDialog.titlePane.background", new ColorUIResource(233, 111, 42));
        UIManager.put("OptionPane.errorDialog.border.background", new ColorUIResource(233, 111, 42));
        UIManager.put("OptionPane.questionDialog.titlePane.background", new ColorUIResource(233, 111, 42));
        UIManager.put("OptionPane.questionDialog.border.background", new ColorUIResource(233, 111, 42));
        UIManager.put("OptionPane.warningDialog.titlePane.background", new ColorUIResource(233, 111, 42));
        UIManager.put("OptionPane.warningDialog.border.background", new ColorUIResource(233, 111, 42));

        // the following statement should let us change the close icon of the JOptionPane but I can't do it resizable as this first
        // argument is not an object, it's a string. We can always resize the icon that we have to become smaller (?)
        
        //UIManager.put("InternalFrame.closeIcon", i);
    }
}
