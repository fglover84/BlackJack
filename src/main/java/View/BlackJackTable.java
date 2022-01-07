/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BlackJack.BlackJack;
import BlackJack.Dealer;
import BlackJack.Player;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author fionaglover
 */
public class BlackJackTable extends javax.swing.JFrame {

    private ImageIcon cardIconImage;
    private Image cardImg;
    private final BlackJack game;
    private final Dealer dealer;
    private Player player;
    ArrayList<JLabel> player1CardPlacments;
    /**
     * Creates new BlackJack Table and sets up the table for the game to begin.
     * Asks dealer to start the game and adds cards and starting score to the table.
     */
    public BlackJackTable() {
        initComponents();
        game = new BlackJack();
        dealer = game.getDealer();
        player = game.getPlayer();
        setUpNewGame();
                
    }
    
    /**
     * Sets up a new game of BlackJack removes any current cards from the display
     * adds the cards for the new game to the table, updates the score value and
     * the result of the current game status
     */
    private void setUpNewGame(){
        dealer.startGame();
        player1CardPlacments = new ArrayList<>();
        player1CardPlacments.add(card1);
        player1CardPlacments.add(card2);
        player1CardPlacments.add(card3);
        player1CardPlacments.add(card4);
        player1CardPlacments.add(card5);
        player1CardPlacments.add(card6);
        player1CardPlacments.add(card7);
        card1.setIcon(null);
        card2.setIcon(null);
        card3.setIcon(null);
        card4.setIcon(null);
        card5.setIcon(null);
        card6.setIcon(null);
        card7.setIcon(null);
        
        addCardsToTable();
        updateScore();
        evaluateScore();
    }
    /**
    * 
    * Updates the score of the players hand on the BlackJack table
    * If the hand contains an Ace then two scores are displayed one with Ace
    * value 11 and the other Ace value 1. 
    * Until the value of the hand with ace value 11 exceeds 21 at which point 
    * only one score is shown
    * 
    */
    private void updateScore(){
        
        ArrayList<Integer> scoreList = player.getHand().getScoreList();
        String scoreString;
        if (Objects.equals(scoreList.get(0), scoreList.get(1))){
            scoreString = String.valueOf(scoreList.get(0));
        } else if(scoreList.get(0) > 21){
            scoreString = String.valueOf(scoreList.get(1));
        }else {
            scoreString = String.valueOf(scoreList.get(1)) + " / " + String.valueOf(scoreList.get(0));
        }
        score.setText(scoreString);
    }
    
    /**
     * Uses the evaluation of the score to display if the player has won a BlackJack
     * score of 21, is still in the game or has lost the game
     */
    private void evaluateScore(){
        int evaluatedScore = player.getHand().evaluateScore();
        switch (evaluatedScore) {
            case 1:
                result.setText("BlackJack - You WIN!!");
                break;
            case 0:
                result.setText("Game in play");
                break;
            case -1:
                result.setText("You lose!");
                break;
        }
    }
    
    /**
     * Evaluates the final score of the hand to be used when the player chooses 
     * to stand  
     */
    private void evaluateFinalScore(){
        int evaluatedScore = player.getHand().evaluateScore();
        switch (evaluatedScore) {
            case 0:
                result.setText("You win!");
                break;
            case -1:
                result.setText("You lose!");
                break;
        }
    }
    
    /**
    *
    * Adds all cards in the players hand to the table
    */
    private void addCardsToTable(){
        for(int i = 0; i<player.getHand().getCards().size(); i++){
            FileInputStream fis = null;
            try {
                File file = new File(player.getHand().getCards().get(i).getImgFilePath());
                fis = new FileInputStream(file);
                ;
                cardImg = ImageIO.read(fis);
                Image resizedCardImage = cardImg.getScaledInstance(100, 150, 1);
                cardIconImage = new ImageIcon(resizedCardImage);
                player1CardPlacments.get(i).setIcon(cardIconImage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BlackJackTable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BlackJackTable.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(BlackJackTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        standButton = new javax.swing.JButton();
        hitButton = new javax.swing.JButton();
        player1Label = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card6 = new javax.swing.JLabel();
        card7 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        scoreLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        scoreLabel.setText("Score:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 100, 0, 0);
        jPanel2.add(scoreLabel, gridBagConstraints);

        buttonPanel.setLayout(new java.awt.GridBagLayout());

        standButton.setText("Stand");
        standButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                standButtonMouseClicked(evt);
            }
        });
        standButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 1, 15, 0);
        buttonPanel.add(standButton, gridBagConstraints);

        hitButton.setText("Hit");
        hitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hitButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 96, 15, 0);
        buttonPanel.add(hitButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        jPanel2.add(buttonPanel, gridBagConstraints);

        player1Label.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        player1Label.setText("Player 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(75, 100, 0, 0);
        jPanel2.add(player1Label, gridBagConstraints);

        cardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        cardPanel.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 18, 100, 150));
        cardPanel.add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 18, 100, 150));
        cardPanel.add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 18, 100, 150));
        cardPanel.add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 18, 100, 150));
        cardPanel.add(card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 18, 100, 150));
        cardPanel.add(card6, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 18, 100, 150));
        cardPanel.add(card7, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 18, 100, 150));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(cardPanel, gridBagConstraints);

        score.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel2.add(score, gridBagConstraints);

        resultLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        resultLabel.setText("Result:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 100, 0, 0);
        jPanel2.add(resultLabel, gridBagConstraints);

        result.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel2.add(result, gridBagConstraints);

        newGameButton.setText("New Game");
        newGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newGameButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 138, 100, 0);
        jPanel2.add(newGameButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel2, gridBagConstraints);

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

    private void standButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standButtonActionPerformed

    private void hitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hitButtonMouseClicked
        // Calls the dealer to deal the next card to the player and 
        //updates the detils of the new card and score on the Black Jack table
        if (!player.getHand().isComplete()){
            dealer.playerHits();
            addCardsToTable();
            updateScore();
            evaluateScore();
        }
        
    }//GEN-LAST:event_hitButtonMouseClicked

    private void newGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameButtonMouseClicked
        // TODO add your handling code here:
        dealer.resetGame();
        setUpNewGame();
    }//GEN-LAST:event_newGameButtonMouseClicked

    private void standButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_standButtonMouseClicked
        // TODO add your handling code here:
        dealer.playerStands();
        evaluateFinalScore();
    }//GEN-LAST:event_standButtonMouseClicked

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
            java.util.logging.Logger.getLogger(BlackJackTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackJackTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackJackTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackJackTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJackTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel card6;
    private javax.swing.JLabel card7;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JButton hitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel result;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel score;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton standButton;
    // End of variables declaration//GEN-END:variables

    
}
