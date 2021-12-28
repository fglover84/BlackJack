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
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        String[] args = null;
        Game.main(args);
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
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<String> playerNames = new ArrayList<>();
        playerNames.add("Fiona");
        Game.setPlayers(1, playerNames);
        ArrayList<Player> playerList = Game.getPlayers();
        assertFalse(playerList.isEmpty());
    }
    
    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        ArrayList<String> playerNames = new ArrayList<>();
        playerNames.add("Fiona");
        Game.setPlayers(1, playerNames);
        ArrayList<Player> playerList = Game.getPlayers();
        assertFalse(playerList.isEmpty());
    }

    
    
}
