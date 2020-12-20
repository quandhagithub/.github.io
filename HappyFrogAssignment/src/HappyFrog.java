
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Inpiron
 */
public class HappyFrog extends javax.swing.JFrame {

    Random rand = new Random();
    Thread Playing;
    private final int gravity = 1; //Toc do roi
    private final int pipesMoveSpeed = 1; //Toc do ong di chuyen
    private final int heightOfJump = 30; //Do cao con ech nhay moi lan bam phim
    //Kich thuoc cua con ech
    private final int FrogHeight = 30;
    private final int FrogWidth = 30;
    //Kich thuoc cua man hinh
    private final int ScreenWidth = 460;
    private final int ScreenHeight = 400;   
    //Toa do ban dau cua con ech
    private final int FrogX = 75;
    private final int FrogY = 120;
    //Kich thuoc cua cac cong
    private final int PipeWidth = 30;
    private final int PipeGap = 70;
    private int pipeUp1Height;
    private int pipeDown1Height;
    private int pipeUp2Height;
    private int pipeDown2Height;
    private int pipeUp3Height; 
    private int pipeDown3Height;
    private boolean start = false; //Phim bat dau
    private boolean pause = false; //Phim dung
    private boolean FrogAlive = false; //Kiem tra ech con song
    //Khung cua cac cap ong
    private Area pipeUp1Area;
    private Area pipeDown1Area;
    private Area pipeUp2Area;
    private Area pipeDown2Area;
    private Area pipeUp3Area;
    private Area pipeDown3Area;    
    private Area FrogArea; //Khung cua con ech
    private int score = 0; //Diem
    GameOver GameOver; 

    /**
     * Creates new form HappyFrog
     */
    public HappyFrog() {
        initComponents();
        this.setTitle("Happy Frog");
        this.setResizable(false);
        this.setSize(ScreenWidth, ScreenHeight);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        Frog.setIcon(loadimage("Frog", FrogWidth, FrogHeight));
        Frog.setLocation(FrogX, FrogY);
        JLabel ScreenBackground = new JLabel(loadimage("GameBackground", ScreenWidth, pnScreen.getHeight()));
        ScreenBackground.setBounds(0, 0, ScreenWidth, pnScreen.getHeight());
        pnScreen.add(ScreenBackground);
        txtScore.setEditable(false);
        txtPause.setEditable(false);
    }

    //load Icon
    private ImageIcon loadimage(String val, int width, int height) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(getClass().getClassLoader().getResource("Resource//" + val + ".jpg"));
            Image dimg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            return imageIcon;
        } catch (Exception e) {
        }
        return null;
    }

    public void FrogDrop() throws InterruptedException {
        //Lam con ech roi
        Frog.setBounds(Frog.getX(), Frog.getY() + gravity, FrogWidth, FrogHeight);
        //lay khung cua con ech
        FrogArea = new Area(Frog.getBounds());
        Thread.sleep(5);
    }

    public void PipesMove() throws InterruptedException {
        //Lam may cai ong di chuyen
        pipeUp1.setBounds(pipeUp1.getX() - pipesMoveSpeed, -10, PipeWidth, pipeUp1Height);
        pipeDown1.setBounds(pipeDown1.getX() - pipesMoveSpeed, pipeUp1Height + PipeGap, PipeWidth, pnScreen.getHeight() - (pipeUp1Height + PipeGap));
        pipeUp2.setBounds(pipeUp2.getX() - pipesMoveSpeed, -10, PipeWidth, pipeUp2Height);
        pipeDown2.setBounds(pipeDown2.getX() - pipesMoveSpeed, pipeUp2Height + PipeGap, PipeWidth, pnScreen.getHeight() - (pipeUp2Height + PipeGap));
        pipeUp3.setBounds(pipeUp3.getX() - pipesMoveSpeed, -10, PipeWidth, pipeUp3Height);
        pipeDown3.setBounds(pipeDown3.getX() - pipesMoveSpeed, pipeUp3Height + PipeGap, PipeWidth, pnScreen.getHeight() - (pipeUp3Height + PipeGap));
        //May cai ong khi di qua man hinh se duoc set lai cuoi man hinh
        if (pipeUp1.getX() + PipeWidth == 0) {
            randomPipeHeight(1);
            pipeUp1.setBounds(ScreenWidth, -10, PipeWidth, pipeUp1Height);
            pipeDown1.setBounds(ScreenWidth, pipeUp1Height + PipeGap, PipeWidth, ScreenWidth - (pipeUp1Height + PipeGap));
        }
        if (pipeUp2.getX() + PipeWidth == 0) {
            randomPipeHeight(2);
            pipeUp2.setBounds(ScreenWidth, -10, PipeWidth, pipeUp2Height);
            pipeDown2.setBounds(ScreenWidth, pipeUp1Height + PipeGap, PipeWidth, ScreenWidth - (pipeUp2Height + PipeGap));
        }
        if (pipeUp3.getX() + PipeWidth == 0) {
            randomPipeHeight(3);
            pipeUp3.setBounds(ScreenWidth, -10, PipeWidth, pipeUp3Height);
            pipeDown3.setBounds(ScreenWidth, pipeUp1Height + PipeGap, PipeWidth, ScreenWidth - (pipeUp3Height + PipeGap));
        }
        //lay khung cua cac ong
        pipeUp1Area = new Area(pipeUp1.getBounds());
        pipeDown1Area = new Area(pipeDown1.getBounds());
        pipeUp2Area = new Area(pipeUp2.getBounds());
        pipeDown2Area = new Area(pipeDown2.getBounds());
        pipeUp3Area = new Area(pipeUp3.getBounds());
        pipeDown3Area = new Area(pipeDown3.getBounds());
        Thread.sleep(5);
    }

    //Xu ly khi tro choi ket thuc
    private void gameOver() {
        FrogAlive = false;
        GameOver = new GameOver(score);
        GameOver.setLocationRelativeTo(null);
        GameOver.setVisible(true);
        Playing.stop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnScreen = new javax.swing.JPanel();
        Frog = new javax.swing.JLabel();
        pipeUp1 = new javax.swing.JButton();
        pipeDown1 = new javax.swing.JButton();
        pipeUp2 = new javax.swing.JButton();
        pipeDown2 = new javax.swing.JButton();
        pipeUp3 = new javax.swing.JButton();
        pipeDown3 = new javax.swing.JButton();
        txtScore = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtPause = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnScreen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnScreenKeyReleased(evt);
            }
        });

        pipeUp1.setBackground(new java.awt.Color(0, 204, 0));

        pipeDown1.setBackground(new java.awt.Color(0, 204, 0));

        pipeUp2.setBackground(new java.awt.Color(0, 204, 0));

        pipeDown2.setBackground(new java.awt.Color(0, 204, 0));

        pipeUp3.setBackground(new java.awt.Color(0, 204, 0));

        pipeDown3.setBackground(new java.awt.Color(0, 204, 0));

        txtScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtScore.setText("Score: 0");
        txtScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnScreenLayout = new javax.swing.GroupLayout(pnScreen);
        pnScreen.setLayout(pnScreenLayout);
        pnScreenLayout.setHorizontalGroup(
            pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnScreenLayout.createSequentialGroup()
                .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnScreenLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pipeDown1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnScreenLayout.createSequentialGroup()
                        .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                        .addComponent(pipeUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnScreenLayout.createSequentialGroup()
                        .addComponent(pipeDown2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pipeUp3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnScreenLayout.createSequentialGroup()
                        .addComponent(pipeUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(pipeDown3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(pnScreenLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Frog, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnScreenLayout.setVerticalGroup(
            pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnScreenLayout.createSequentialGroup()
                .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pipeUp2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(pipeDown3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pipeUp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(Frog, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pipeUp3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(pipeDown2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pipeDown1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(pnScreen, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtPause.setBackground(new java.awt.Color(204, 255, 255));
        txtPause.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPause.setText("Press (P) to pause");
        txtPause.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnNewGame)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addGap(18, 18, 18)
                .addComponent(txtPause, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnNewGame)
                    .addComponent(btnExit)
                    .addComponent(txtPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        pnScreen.requestFocus();
        btnNewGame.setFocusPainted(false);
        btnStart.setEnabled(false);
        randomPipeHeight(1);
        randomPipeHeight(2);
        randomPipeHeight(3);
        //Set khoang cach cua tung cap ong
        pipeUp1.setBounds(ScreenWidth + 60, 0, 0, 0);
        pipeDown1.setBounds(ScreenWidth + 60, 0, 0, 0);
        pipeUp2.setBounds(ScreenWidth + 220, 0, 0, 0);
        pipeDown2.setBounds(ScreenWidth + 220, 0, 0, 0);
        pipeUp3.setBounds(ScreenWidth + 370, 0, 0, 0);
        pipeDown3.setBounds(ScreenWidth + 370, 0, 0, 0);
        //lay khung cua con ech
        FrogArea = new Area(Frog.getBounds());
        //lay khung cua cac ong
        pipeUp1Area = new Area(pipeUp1.getBounds());
        pipeDown1Area = new Area(pipeDown1.getBounds());
        pipeUp2Area = new Area(pipeUp2.getBounds());
        pipeDown2Area = new Area(pipeDown2.getBounds());
        pipeUp3Area = new Area(pipeUp3.getBounds());
        pipeDown3Area = new Area(pipeDown3.getBounds());
        try {
            Playing = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            updateScore();
                            if (checkFrogAlive()) { //Neu con ech con song thi tiep tuc
                                if (!pause) {//Neu khong pause thi tiep tuc
                                    FrogDrop();
                                    PipesMove();
                                }
                            } else {
                                gameOver();
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(HappyFrog.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            };
        } catch (Exception e) {
        }
        FrogAlive = true;
        Playing.start();
    }//GEN-LAST:event_btnStartActionPerformed

    //Ham de check con ech con song hay khong
    private boolean checkFrogAlive() {
        //Con ech cham dat
        if (Frog.getY() == pnScreen.getHeight() - FrogHeight) {
            return false;
        }
        //Con ech cham may cai ong
        if (FrogArea.intersects(pipeUp1Area.getBounds2D())) {
            return false;
        }
        if (FrogArea.intersects(pipeDown1Area.getBounds2D())) {
            return false;
        }
        if (FrogArea.intersects(pipeUp2Area.getBounds2D())) {
            return false;
        }
        if (FrogArea.intersects(pipeDown2Area.getBounds2D())) {
            return false;
        }
        if (FrogArea.intersects(pipeUp3Area.getBounds2D())) {
            return false;
        }
        if (FrogArea.intersects(pipeDown3Area.getBounds2D())) {
            return false;
        }
        //Con ech bay qua cao
        if ((Frog.getX() == pipeUp1.getX() - FrogWidth || Frog.getX() == pipeUp2.getX() - FrogWidth 
                || Frog.getX() == pipeUp3.getX() - FrogWidth) && (Frog.getY() <= 0)) {
            return false;
        }
        return true;
    }

    private void updateScore() {
        //Cong diem moi lan qua ong
        if (Frog.getX() == pipeUp1.getX() || Frog.getX() == pipeUp2.getX() || Frog.getX() == pipeUp3.getX()) {
            txtScore.setText("Score: " + ++score);
        }
    }

    //Random chieu cao cua cac cot o tren
    private void randomPipeHeight(int coupleNumber) {
        if (coupleNumber == 1) {
            pipeUp1Height = rand.nextInt((190 - 100) + 1) + 100;
        }
        if (coupleNumber == 2) {
            pipeUp2Height = rand.nextInt((190 - 100) + 1) + 100;
        }
        if (coupleNumber == 3) {
            pipeUp3Height = rand.nextInt((190 - 100) + 1) + 100;
        }
    }
    
    //Set tat ca ve vi tri ban dau
    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        Playing.stop();
        pnScreen.requestFocus();
        btnStart.setEnabled(true);
        txtScore.setText("Score: " + (score = 0));
        randomPipeHeight(1);
        randomPipeHeight(2);
        randomPipeHeight(3);
        pipeUp1.setBounds(ScreenWidth + 60, 0, 0, 0);
        pipeDown1.setBounds(ScreenWidth + 60, 0, 0, 0);
        pipeUp2.setBounds(ScreenWidth + 220, 0, 0, 0);
        pipeDown2.setBounds(ScreenWidth + 220, 0, 0, 0);
        pipeUp3.setBounds(ScreenWidth + 370, 0, 0, 0);
        pipeDown3.setBounds(ScreenWidth + 370, 0, 0, 0);
        Frog.setLocation(FrogX, FrogY);
        FrogAlive = false;
        try {
            GameOver.setVisible(false);
            Playing.stop();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnNewGameActionPerformed

    private void pnScreenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnScreenKeyReleased
        //Ech nhay khi bam phim (↑) hoac (Space) va khi con ech con song va khi khong pause
        if ((evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_SPACE) && FrogAlive == true && !pause) {
            Frog.setBounds(Frog.getX(), Frog.getY() - heightOfJump, FrogWidth, FrogHeight);
        }
        //Pause game khi bam (P)
        if (evt.getKeyCode() == KeyEvent.VK_P) {
            try {
                if (!pause) {
                    txtPause.setText("Press (P) to resume");
                    pause = true;
                } else {
                    txtPause.setText("Press (P) to Pause");
                    pause = false;
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_pnScreenKeyReleased

    //Thoat game
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(HappyFrog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HappyFrog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HappyFrog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HappyFrog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HappyFrog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Frog;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pipeDown1;
    private javax.swing.JButton pipeDown2;
    private javax.swing.JButton pipeDown3;
    private javax.swing.JButton pipeUp1;
    private javax.swing.JButton pipeUp2;
    private javax.swing.JButton pipeUp3;
    private javax.swing.JPanel pnScreen;
    private javax.swing.JTextField txtPause;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}
