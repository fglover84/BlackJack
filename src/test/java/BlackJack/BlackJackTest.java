/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;


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
public class BlackJackTest {
    
    public BlackJackTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        String[] args = null;
        BlackJack.main(args);
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    
    /**
     * Test of testBlackJackMain method, of class BlackJack.
     * UC4 Game setup
     * To set up the game a dealer must be created, who is then responsible for 
     * creating a new deck of cards. A number of new players is selected by the 
     * user and names given for each. With this information new players are created.
     * 
     */
    @Test
    public void testBlackJackMain() {
        System.out.println("Testing blackjack main");
        Dealer dealer = BlackJack.getDealer();
        System.out.println("Dealer has been created: " + dealer != null);
        System.out.println("Deck has been created: " + dealer.getDeck() != null);
        System.out.println("Players have been created: " + !BlackJack.getPlayers().isEmpty());
        System.out.println("Players: " + BlackJack.getPlayers());
        
        assertTrue(dealer != null 
                && dealer.getDeck() != null 
                && !BlackJack.getPlayers().isEmpty());
    }   
    
}
