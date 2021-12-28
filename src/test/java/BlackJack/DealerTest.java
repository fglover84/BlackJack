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
     * Each player should have been dealt two cards
     */
    @Test
    public void testStartGame() {
        System.out.println("Testing startGame");
        String[] args = null;
        Game.main(args);
        ArrayList<Player> players = Game.getPlayers();
        Hand playerHand = players.get(0).getHand();
        System.out.println("Hand has " + playerHand.getCards().size() + "Cards");
        assertEquals(2, playerHand.getCards().size());
    }
    
}
