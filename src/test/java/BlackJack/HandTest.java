/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import Enum.CardSuitEnum;
import Enum.CardValueEnum;
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
public class HandTest {
    
    public HandTest() {
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
     * Test of getCards method, of class Hand.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Hand instance = new Hand();
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getCards();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addCard method, of class Hand.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = null;
        Hand instance = new Hand();
        instance.addCard(card);
        
    }
    
    /**
     * Test of updateScore method, of class Hand.
     */
    @Test
    public void testUpdateScoreAceAndKing() {
        System.out.println("Test updateScore");
        Hand hand = new Hand();
        Card aceOfSpades = new Card(CardValueEnum.ACE, CardSuitEnum.SPADES);
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS);
        hand.addCard(aceOfSpades);
        hand.addCard(kingOfHearts);
        ArrayList<Integer> score = hand.getScore();
        System.out.println("Hand: " + hand);
        System.out.println("Score is: " + score.get(0));
        System.out.println("Score should be 21");
        assertTrue(score.get(0) == 21);
        
    }

    
    
}
