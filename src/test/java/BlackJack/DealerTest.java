/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

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
    
    static Dealer dealer;
    
    public DealerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         
    }
    
    @BeforeEach
    public void setUp() {
        dealer = new Dealer();
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
     * 
     * Precondition:   Player has no cards in hand
     * Post-condition: Deck has been shuffled, player has two cards in their hand
     */
    @Test
    public void testStartGame() {
        System.out.println("Testing startGame");
        System.out.println("Hand has " + dealer.getPlayer().getHand().getCards().size() + " cards");
        dealer.startGame();
        System.out.println("Deck has been shuffled: " + dealer.getDeck().isShuffled());
        Player player = dealer.getPlayer();
        Hand playerHand = player.getHand();
        System.out.println("Hand has " + playerHand.getCards().size() + " cards");
        System.out.println("-----------------------------");
        assertTrue(playerHand.getCards().size() == 2 
                && dealer.getDeck().isShuffled());
        
    }
    
    /**
     * Test of playerHits method, of class Dealer.
     * UC8 - Player hits - Scenario 2
     * 
     * When a player chooses to hit, if the player's score is valid, 
     * the player is dealt another card and the new score is calculated and 
     * evaluated.
     * Precondition:   The players hand contains two cards, the hands score is valid
     * Post-condition:  The players hand contains one additional card, score is 
     *                 recalculated, score is re-evaluated

     * 
     */
    @Test
    public void testPlayerHits() {
        System.out.println("Testing playerHits");
        
        dealer.startGame();
        Player player = dealer.getPlayer();
        System.out.println("Hand has " + player.getHand().getCards().size() + " cards");
        System.out.println("Score is valid: " + player.getHand().evaluateScore());
        int startScore = player.getHand().getScore();
        dealer.playerHits();
        
        System.out.println("Hand has " + player.getHand().getCards().size() + " cards");
        System.out.println("Starting score is: " + startScore);
        System.out.println("Updated score is: " + player.getHand().getScore());
        System.out.println("Updated score is valid: " + player.getHand().evaluateScore());
        
        assertTrue(player.getHand().getCards().size() == 3);
    };
    
    /**
     * Test of playerStands method, of class Dealer.
     * UC9 - Player stands - Scenario 3
     * 
     * When a player chooses to stand, if the player's score is valid, 
     * the player is NOT dealt another card and the score is evaluated.
     * 
     * Precondition:         The players hand contains two cards, the hand score is valid
     * Post-condition:       Hand still contains 2 cards, Score when evaluated is valid
     * 
     */
    @Test
    public void testPlayerStands() {
        System.out.println("Testing playerStands");
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
        //True if deck is still the same size and the players hand when evaluated is valid
        assertTrue(dealer.getPlayer().getHand().getCards().size() == 2 && (playerHand.evaluateScore() == 0 || playerHand.evaluateScore() == 1));
    };

    /**
     * Test of resetGame method, of class Dealer.
     * UC10 - Reset Game  (Scenario 9)
     * 
     * When the game has ended, all cards should be returned to the deck from the players hands 
     * The deck should then contain 52 cards and the players hand should contain no cards
     * 
     * Precondition:    The players hand contains cards, the deck has less than 52 cards
     * Post-condition:  The players hand contains no cards, the deck contains 52 cards
     */
    @Test
    public void testResetGame() {
        System.out.println("Testing resetGame");
        System.out.println("Players hand starts with " + dealer.getPlayer().getHand().getCards().size() + " cards");
        System.out.println("Deck of cards starts with " + dealer.getDeck().getSize() + " cards in the deck");
        dealer.resetGame();
        System.out.println("Players hand finishes with " + dealer.getPlayer().getHand().getCards().size() + " cards");
        System.out.println("Deck of cards finishes with " + dealer.getDeck().getSize() + " cards in the deck after reset");
        assertTrue(dealer.getDeck().getSize() == 52 && dealer.getPlayer().getHand().getCards().isEmpty());
        
    }

    /**
     * Test of dealPlayersOpeningHand method, of class Dealer.
     * The players hand should start empty and contain two new cards once opening 
     * hand has been dealt to the player
     */
    @Test
    public void testDealPlayersOpeningHand() {
        System.out.println("Testing dealPlayersOpeningHand");
        System.out.println("Hand starts with " + dealer.getPlayer().getHand().getCards().size() + " cards");
        dealer.dealPlayersOpeningHand();
        System.out.println("Hand now contains " + dealer.getPlayer().getHand().getCards().size() + " cards");
        //Opening hand once dealt should contain 2 cards
        assertTrue(dealer.getPlayer().getHand().getCards().size() == 2);
    }

    

    

    /**
     * Test of dealPlayerCard method, of class Dealer.
     * A playing card should be added to the players hand  
     */
    @Test
    public void testDealPlayerCard() {
        System.out.println("Testing dealPlayerCard");
        Card result = dealer.dealPlayerCard(dealer.getPlayer());
        assertTrue(dealer.getPlayer().getHand().getCards().contains(result));
        
    }
    
}
