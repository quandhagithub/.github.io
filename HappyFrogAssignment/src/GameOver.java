
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Inpiron
 */
public class GameOver extends javax.swing.JFrame {

    /**
     * Creates new form GameOver
     */
    public GameOver(int score) {
        initComponents();
        this.setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        createBestfile();
        this.setTitle("GAME OVER");
        lbScore.setText("" + score); //hien diem cua ban
        lbBest.setText("" + checkBest(score)); //hien diem cao nhat
        //Hien thi icon huy chuong tuy cao so diem cua ban
        if (score < 10) {
            lbMedal.setIcon(loadimage("Unranked"));
        } else if (10 <= score && score < 20) {
            lbMedal.setIcon(loadimage("Bronze"));
        } else if (20 <= score && score < 30) {
            lbMedal.setIcon(loadimage("Silver"));
        } else if (30 <= score && score < 40) {
            lbMedal.setIcon(loadimage("Gold"));
        } else if (40 <= score && score < 50) {
            lbMedal.setIcon(loadimage("Platinum"));
        } else {
            lbMedal.setIcon(loadimage("Diamond"));
        }
    }

    //Load Icon
    private ImageIcon loadimage(String val) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(getClass().getClassLoader().getResource("Resource//" + val + ".jpg"));
            Image dimg = img.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            return imageIcon;
        } catch (Exception e) {
        }
        return null;
    }
    
    //Tao cai file luu diem cao nhat
    private void createBestfile() {
        File file = new File("best.dat");
        try {
            if (file.createNewFile()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                bw.write("0");
                bw.close();
            }
        } catch (Exception e) {
        }

    }

    //Neu minh vuot ky luc thi se update lai Best Score
    private int checkBest(int score) {
        File file = new File("best.dat");
        String best;
        int point = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            if ((best = br.readLine()) != null) {//Neu file khong null
                int bestScore = Integer.parseInt(best);
                if (score > bestScore) {//Khi diem cua ban lon hon diem cao
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    //Viet de diem cua ban vao diem cao trong file
                    bw.write(score + "");
                    bw.flush();
                    bw.close();
                    point = score; //diem cao nhat bang diem cua ban
                } else {
                    point = bestScore; //diem cao nhat bang diem cao nhat trong file
                }
                System.err.println("Create successly.");
            }
            br.close();           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return point;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbMedal = new javax.swing.JLabel();
        lbBest = new javax.swing.JLabel();
        lbScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 204, 51)));
        jPanel1.setForeground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Medal");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Score");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Best");

        lbMedal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbBest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbMedal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lbBest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbMedal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbScore, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addGap(6, 6, 6)
                .addComponent(lbBest, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBest;
    private javax.swing.JLabel lbMedal;
    private javax.swing.JLabel lbScore;
    // End of variables declaration//GEN-END:variables

}
