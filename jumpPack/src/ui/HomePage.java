/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import httpClient.HttpClient;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import org.json.JSONArray;

/**
 *
 * @author up869373
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    private int mousepX; // position X of the mouse when pressed
    private int mousepY; // position Y of the mouse when pressed

    int x = 0;
    Timer timer;

    public HomePage() throws IOException {
        initComponents();
        centerWindow();
        slideShow();
//        gamesLst();
        gamesLibrary();
        addResizableImageToBtn(closeBtn, "/images/close.png");
        addResizableImageToLbl(logo, "/images/jp_logo.png");
        addResizableImageToBtn(minimizeBtn, "/images/minimize.png");
        addResizableImageToBtn(dotaBtn, "/images/dota.png.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HpPanel = new javax.swing.JPanel();
        windowBar = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JButton();
        Nav = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pic = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        Library = new javax.swing.JPanel();
        games = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gamesList = new javax.swing.JList<>();
        Store = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        storeGamesList = new javax.swing.JList<>();
        storeGameSearchTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        storeGameImage = new javax.swing.JPanel();
        storeGameInfo = new javax.swing.JPanel();
        storeGameTitle = new javax.swing.JLabel();
        Friends = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dotaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        HpPanel.setBackground(new java.awt.Color(233, 111, 42));

        windowBar.setBackground(new java.awt.Color(237, 137, 80));
        windowBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                windowBarMouseDragged(evt);
            }
        });
        windowBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                windowBarMouseClicked(evt);
            }
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
        title.setText("JumpPack ");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(windowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(windowBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Nav.setBackground(new java.awt.Color(233, 111, 45));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("Library");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton4.setText("Friends");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton3.setText("Store");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("New and Trending on JumpPack..");

        javax.swing.GroupLayout NavLayout = new javax.swing.GroupLayout(Nav);
        Nav.setLayout(NavLayout);
        NavLayout.setHorizontalGroup(
            NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NavLayout.setVerticalGroup(
            NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Main.setLayout(new java.awt.CardLayout());

        Library.setBackground(new java.awt.Color(237, 137, 80));

        games.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        games.setText("Games:");

        gamesList.setBackground(new java.awt.Color(237, 137, 80));
        gamesList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gamesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(gamesList);

        javax.swing.GroupLayout LibraryLayout = new javax.swing.GroupLayout(Library);
        Library.setLayout(LibraryLayout);
        LibraryLayout.setHorizontalGroup(
            LibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LibraryLayout.createSequentialGroup()
                .addContainerGap(739, Short.MAX_VALUE)
                .addGroup(LibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LibraryLayout.createSequentialGroup()
                        .addComponent(games)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LibraryLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        LibraryLayout.setVerticalGroup(
            LibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LibraryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(games)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
        );

        Main.add(Library, "Library");

        jScrollPane3.setViewportView(storeGamesList);

        storeGameSearchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeGameSearchTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search");

        javax.swing.GroupLayout storeGameImageLayout = new javax.swing.GroupLayout(storeGameImage);
        storeGameImage.setLayout(storeGameImageLayout);
        storeGameImageLayout.setHorizontalGroup(
            storeGameImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        storeGameImageLayout.setVerticalGroup(
            storeGameImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout storeGameInfoLayout = new javax.swing.GroupLayout(storeGameInfo);
        storeGameInfo.setLayout(storeGameInfoLayout);
        storeGameInfoLayout.setHorizontalGroup(
            storeGameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        storeGameInfoLayout.setVerticalGroup(
            storeGameInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        storeGameTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        storeGameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeGameTitle.setText("Game title");

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(storeGameImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(storeGameInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(storeGameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                .addContainerGap())
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addComponent(storeGameTitle)
                .addGap(26, 26, 26)
                .addComponent(storeGameImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeGameInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout StoreLayout = new javax.swing.GroupLayout(Store);
        Store.setLayout(StoreLayout);
        StoreLayout.setHorizontalGroup(
            StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoreLayout.createSequentialGroup()
                .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StoreLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(storeGameSearchTxtField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StoreLayout.setVerticalGroup(
            StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeGameSearchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Main.add(Store, "Store");

        jLabel4.setText("Friends");

        javax.swing.GroupLayout FriendsLayout = new javax.swing.GroupLayout(Friends);
        Friends.setLayout(FriendsLayout);
        FriendsLayout.setHorizontalGroup(
            FriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
            .addGroup(FriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FriendsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        FriendsLayout.setVerticalGroup(
            FriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
            .addGroup(FriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FriendsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Main.add(Friends, "Friends");

        jLabel1.setText("Home");

        dotaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dota.png.jpg"))); // NOI18N
        dotaBtn.setAlignmentY(0.0F);
        dotaBtn.setAutoscrolls(true);
        dotaBtn.setContentAreaFilled(false);
        dotaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(dotaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(763, Short.MAX_VALUE))
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                    .addContainerGap(431, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(415, Short.MAX_VALUE)))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(dotaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(553, Short.MAX_VALUE))
            .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                    .addContainerGap(341, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addContainerGap(341, Short.MAX_VALUE)))
        );

        Main.add(Home, "Home");

        javax.swing.GroupLayout HpPanelLayout = new javax.swing.GroupLayout(HpPanel);
        HpPanel.setLayout(HpPanelLayout);
        HpPanelLayout.setHorizontalGroup(
            HpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(windowBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        HpPanelLayout.setVerticalGroup(
            HpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HpPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(windowBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(HpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(HpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(HpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dotaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dotaBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout card = (CardLayout) Main.getLayout();
        card.show(Main, "Store");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CardLayout card = (CardLayout) Main.getLayout();
        card.show(Main, "Friends");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout card = (CardLayout) Main.getLayout();
        card.show(Main, "Home");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout card = (CardLayout) Main.getLayout();
        card.show(Main, "Library");
//        gamesLst();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void windowBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowBarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_windowBarMousePressed

    private void windowBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowBarMouseClicked
        if (evt.getClickCount() == 2) {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            pack();

            setSize(screenSize.width, screenSize.height);
            setLocation(screenSize.width / 2 - this.getSize().width / 2, screenSize.height / 2 - this.getSize().height / 2);
        }
    }//GEN-LAST:event_windowBarMouseClicked

    private void windowBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowBarMouseDragged
        int pX = evt.getXOnScreen();
        int pY = evt.getYOnScreen();
        this.setLocation(pX - mousepX, pY - mousepY);
        setSize(1280, 720);

    }//GEN-LAST:event_windowBarMouseDragged

    private void minimizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeBtnActionPerformed
        this.setState(HomePage.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void storeGameSearchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeGameSearchTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeGameSearchTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Friends;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel HpPanel;
    private javax.swing.JPanel Library;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Nav;
    private javax.swing.JPanel Store;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton dotaBtn;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel games;
    private javax.swing.JList<String> gamesList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logo;
    private javax.swing.JButton minimizeBtn;
    private javax.swing.JLabel pic;
    private javax.swing.JPanel storeGameImage;
    private javax.swing.JPanel storeGameInfo;
    private javax.swing.JTextField storeGameSearchTxtField;
    private javax.swing.JLabel storeGameTitle;
    private javax.swing.JList<String> storeGamesList;
    private javax.swing.JLabel title;
    private javax.swing.JPanel windowBar;
    // End of variables declaration//GEN-END:variables
// changes position of the window to the center of the screen
    private void centerWindow() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    // this function adds an image to a button and makes it being the same size as the button
    private void addResizableImageToBtn(javax.swing.JButton button, String path) {
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(path)));
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);

        button.setIcon(i);
    }

    // this function adds an image to a label and makes it being the same size as the label
    private void addResizableImageToLbl(javax.swing.JLabel label, String path) {
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(path)));
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);

        label.setIcon(i);
    }

    private void slideShow() {
        SetImage(4);

        timer = new Timer(1700, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImage(x);
                x += 1;
                if (x >= 5) {
                    x = 0;
                }
            }
        });
        timer.start();
    }

    private void SetImage(int i) {
        String[] list = {
            "/images/anthem.jpeg",
            "/images/apex.jpg",
            "/images/Devil-May-Cry.jpg",
            "/images/sekiro.PNG",
            "/images/tc2.jpg"
        };

        ImageIcon myImage = new ImageIcon((Toolkit.getDefaultToolkit().getImage(getClass().getResource(list[i]))));
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon p = new ImageIcon(img2);
        pic.setIcon(p);
    }

//    private void gamesLst() {
//        gamesPanel.add(new JButton("Apex Legends"));
//        gamesScroll.add(new JButton("Apex Legends"));
//    }
    
    /**
     * This method makes a GET request to our api and adds the data to the JList.
     * @throws IOException 
     */
    private void gamesLibrary() throws IOException {
        DefaultListModel DLM = new DefaultListModel();
        
        HttpClient client = new HttpClient();
        JSONArray gamesNamesArray = client.getArray("https://jumppack.herokuapp.com/api/store/games");
        
        String gameName = "";
        for (int i = 0; i < gamesNamesArray.length(); i++) {
            gameName = gamesNamesArray.getJSONObject(i).getString("game_name");
            DLM.addElement(gameName);
        }
        gamesList.setModel(DLM);
        
    }
    
    
}
