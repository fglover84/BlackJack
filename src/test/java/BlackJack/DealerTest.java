/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import Enum.GamePlayEnum;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fionaglover
 */
public class DealerTest {
    
    
    
    public DealerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
    }
    @AfterAll
    public static void tearDownClass() {
    }

    

    /**
     * Test of startGame method, of class Dealer.
     * UC5 - Deal opening hand/start game - Scenario 1
     * 
     * The game is started when the dealer shuffles the deck and deals two 
     * cards to each of the players
     */
    @Test
    public void testStartGame() {
        System.out.println("Testing startGame");
        BlackJack blackJack = new BlackJack();
        blackJack.getDealer().startGame();
        System.out.println("Deck has been shuffled: " + blackJack.getDealer().getDeck().isShuffled());
        Player player = blackJack.getPlayer();
        Hand playerHand = player.getHand();
        System.out.println("Hand has " + playerHand.getCards().size() + " cards");
        System.out.println("-----------------------------");
        assertTrue(playerHand.getCards().size() == 2 
                && blackJack.getDealer().getDeck().isShuffled());
        
    }
    
    /**
     * Test of playerHits method, of class Dealer.
     * UC8 - Player hits - Scenario 2
     * 
     * When a player chooses to hit, if the player's score is valid, 
     * the player is dealt another card and the new score is calculated and 
     * evaluated.
     * 
     */
    @Test
    public void testPlayerHits() {
        System.out.println("Testing playerHits");
        BlackJack blackJack = new BlackJack();
        Dealer dealer = blackJack.getDealer();
        dealer.startGame();
        Player player = blackJack.getPlayer();
        Hand playerHand = player.getHand();
        System.out.println("Hand has " + playerHand.getCards().size() + " cards");
        System.out.println("Score is valid: " + playerHand.evaluateScore());
        int startScore = playerHand.getScore();
        dealer.playerHits();
        
        System.out.println("Hand has " + playerHand.getCards().size() + " cards");
        System.out.println("Starting score is: " + startScore);
        System.out.println("Updated score is: " + playerHand.getScore());
        System.out.println("Updated score is valid: " + playerHand.evaluateScore());
        
        assertTrue(playerHand.getCards().size() == 3);
    };
    
    /**
     * Test of playerStands method, of class Dealer.
     * UC9 - Player stands - Scenario 3
     * 
     * When a player chooses to stand, if the player's score is valid, 
     * the player is NOT dealt another card and the score is evaluated.
     * 
     */
    @Test
    public void testPlayerStands() {
        System.out.println("Testing playerStands");
        BlackJack blackJack = new BlackJack();
        Dealer dealer = blackJack.getDealer();
        dealer.startGame();
        Player player = dealer.getPlayer();
        Hand playerHand = player.getHand();
        System.out.println("Hand has " + playerHand.getCards().size() + " cards");
        System.out.println("Hand is valid: " + playerHand.evaluateScore());
        //if the score is valid the player chooses to stand
        if(dealer.getPlayer().getHand().evaluateScore() == 1 || dealer.getPlayer().getHand().evaluateScore() == 0){
            dealer.playerStands();
        }
        //No card should have been dealt
        if (dealer.getPlayer().getHand().getCards().size() == 2){
            System.out.println("No card dealt to player");
        }
        System.out.println("Score is valid: " + playerHand.evaluateScore());
        
        assertTrue(dealer.getPlayer().getHand().getCards().size() == 2 && (playerHand.evaluateScore() == 0 || playerHand.evaluateScore() == 1));
    };
    
}
