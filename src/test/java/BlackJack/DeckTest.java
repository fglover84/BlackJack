/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fionaglover
 */
public class DeckTest {
    static Deck deck;
    
    
    public DeckTest(){
        
    }
    @BeforeAll
    public static void setUpClass() {
         
    }
    
    @BeforeEach
    public void setUp() {
        deck = new Deck();
    }
    
    @AfterEach
    public void tearDown() {
    }
    @AfterAll
    public static void tearDownClass() {
    }
    
    
    /**
     * Test of Deck constructor, of class Deck.
     * UC1 Create new deck of cards
     * 
     * A new deck of cards containing 52 cards must be created. 
     * Each deck must contain 13 cards of each of the four suits Hearts, Diamonds, 
     * Spades and Clubs with values Ace, 2, 3, 4, 5, 6, 7, 8, 9 , 10, Jack, Queen 
     * and King for each suit. The numeric cards hold their face value, a Jack, 
     * Queen and King represent a value of 10 and an Ace represents either a 1 or a 11.
     * 
     * Precondition:     No deck of cards exist
     * Post-condition:   A deck of cards exists containing 52 cards
     */
    @Test
    public void testCreateNewDeck() {
        System.out.println("------------------------------------");
        System.out.println("testing createNewDeck");
        System.out.println("Checking there are 52 cards in the deck");
        
        int result = deck.getDeck().size();
        System.out.println("There are: " + result + " cards in the deck");
        System.out.println("------------------------------------");
        assertTrue (result == 52);
        
    }
    
    /**
     * Test shuffling of Deck cards, of class Deck.
     * UC2 Shuffle deck of cards 
     * 
     * Taking the deck of cards, when the dealer shuffles the deck of cards the 
     * order of the cards should have changed
     * 
     * Precondition:  Deck has not been shuffled
     * Post-condition: The order of the cards in the deck is different to the 
     *                  order in the initial deck
     */
    @Test
    public void testShuffleDeck() {
        System.out.println("Testing shuffleDeck");
        
        System.out.println("Deck has been shuffled: " + deck.isShuffled());
       
        ArrayList<Card> deckCopy = new ArrayList<>(deck.getDeck());
        
        deck.shuffleDeck();
        boolean hasBeenShuffled = false;
        
        for(int i = 0; i < deck.getSize(); i++){
            System.out.println("Card " + i);
            System.out.println(deckCopy.get(i));
            System.out.println(deck.getDeck().get(i));
            if(deckCopy.get(i) != deck.getDeck().get(i)){
                hasBeenShuffled = true;
            }
        }
        System.out.println("Cards have been shuffled: " + hasBeenShuffled);
        System.out.println("------------------------------------");
        assertTrue (hasBeenShuffled);
    }


    /**
     * Test of getNextCard method, of class Deck.
     * 
     * Card from the top of the deck should be returned
     * 
     */
    @Test
    public void testGetNextCard() {
        System.out.println("Testing getNextCard");
        Card expResult = deck.getDeck().get(0);
        Card result = deck.getNextCard();
        System.out.println("Next card in deck is: "+  expResult +  " Card returned is: " + result);
        System.out.println("-----------------------------------");
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of returnCardToDeck method, of class Deck.
     * 
     * Card should be returned to the bottom of the deck
     */
    @Test
    public void testReturnCardToDeck() {
        System.out.println("Testing returnCardToDeck");
        Card card = deck.getNextCard();
        
        deck.returnCardToDeck(card);
        System.out.println("Card being returned is: " + card);
        System.out.println("Card found at the bottom of the deck: " + deck.getDeck().get(deck.getDeck().size()-1).equals(card));
        
        System.out.println("-----------------------------------");
        assertTrue(deck.getDeck().get(deck.getDeck().size()-1).equals(card));
        
    }

    

    

    

    
    
    
}
