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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of player constructor method, of class Player.
     * UC3 Create new player
     * When a new player is created they should be given a name and assigned an 
     * empty hand which should be responsible for storing cards dealt by the 
     * dealer during game play and for calculating the hand score and validating 
     * its value.
     */
    @Test
    public void testPlayerConstructor() {
        System.out.println("Testing player constructor");
        
        Player player = new Player("Fiona");
        assertTrue(player.getName().equals("Fiona") 
                && player.getHand().getCards().isEmpty()
        && player.getHand().getScoreList().get(0) == 0);
        
    }

    
    
}
