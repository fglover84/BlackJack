/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import Enum.CardSuitEnum;
import Enum.CardValueEnum;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author fionaglover
 * Creates a deck of 52 playing cards containing 
 * Four suits: Hearts, Diamonds, Spades and Clubs
 * Each with values: Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, 
 * Jack, Queen and King
 */
public class Deck {

    private final ArrayList<Card> deck = new ArrayList<>();
    private boolean isShuffled;

    /**
     * Constructor for a new deck of cards
     */
    public Deck() {
        
        //Create Spades cards and add to deck
        Card aceOfSpades = new Card(CardValueEnum.ACE, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/AceOfSpades.png");
        deck.add(aceOfSpades);
        Card twoOfSpades = new Card(CardValueEnum.TWO, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/TwoOfSpades.png");
        deck.add(twoOfSpades);
        Card threeOfSpades = new Card(CardValueEnum.THREE, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/ThreeOfSpades.png");
        deck.add(threeOfSpades);
        Card fourOfSpades = new Card(CardValueEnum.FOUR, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/FourOfSpades.png");
        deck.add(fourOfSpades);
        Card fiveOfSpades = new Card(CardValueEnum.FIVE, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/FiveOfSpades.png");
        deck.add(fiveOfSpades);
        Card sixOfSpades = new Card(CardValueEnum.SIX, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/SixOfSpades.png");
        deck.add(sixOfSpades);
        Card sevenOfSpades = new Card(CardValueEnum.SEVEN, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/SevenOfSpades.png");
        deck.add(sevenOfSpades);
        Card eightOfSpades = new Card(CardValueEnum.EIGHT, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/EightOfSpades.png");
        deck.add(eightOfSpades);
        Card nineOfSpades = new Card(CardValueEnum.NINE, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/NineOfSpades.png");
        deck.add(nineOfSpades);
        Card tenOfSpades = new Card(CardValueEnum.TEN, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/TenOfSpades.png");
        deck.add(tenOfSpades);
        Card jackOfSpades = new Card(CardValueEnum.JACK, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/JackOfSpades.png");
        deck.add(jackOfSpades);
        Card queenOfSpades = new Card(CardValueEnum.QUEEN, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/QueenOfSpades.png");
        deck.add(queenOfSpades);
        Card kingOfSpades = new Card(CardValueEnum.KING, CardSuitEnum.SPADES, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/KingOfSpades.png");
        deck.add(kingOfSpades);
        
        //Create Hearts cards and add to deck
        Card aceOfHearts = new Card(CardValueEnum.ACE, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/AceOfHearts.png");
        deck.add(aceOfHearts);
        Card twoOfHearts = new Card(CardValueEnum.TWO, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/TwoOfHearts.png");
        deck.add(twoOfHearts);
        Card threeOfHearts = new Card(CardValueEnum.THREE, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/ThreeOfHearts.png");
        deck.add(threeOfHearts);
        Card fourOfHearts = new Card(CardValueEnum.FOUR, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/FourOfHearts.png");
        deck.add(fourOfHearts);
        Card fiveOfHearts = new Card(CardValueEnum.FIVE, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/FiveOfHearts.png");
        deck.add(fiveOfHearts);
        Card sixOfHearts = new Card(CardValueEnum.SIX, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/SixOfHearts.png");
        deck.add(sixOfHearts);
        Card sevenOfHearts = new Card(CardValueEnum.SEVEN, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/SevenOfHearts.png");
        deck.add(sevenOfHearts);
        Card eightOfHearts = new Card(CardValueEnum.EIGHT, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/EightOfHearts.png");
        deck.add(eightOfHearts);
        Card nineOfHearts = new Card(CardValueEnum.NINE, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/NineOfHearts.png");
        deck.add(nineOfHearts);
        Card tenOfHearts = new Card(CardValueEnum.TEN, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/TenOfHearts.png");
        deck.add(tenOfHearts);
        Card jackOfHearts = new Card(CardValueEnum.JACK, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/JackOfHearts.png");
        deck.add(jackOfHearts);
        Card queenOfHearts = new Card(CardValueEnum.QUEEN, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/QueenOfHearts.png");
        deck.add(queenOfHearts);
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/KingOfHearts.png");
        deck.add(kingOfHearts);
        

        //Create Diamonds cards and add to deck
        Card aceOfDiamonds = new Card(CardValueEnum.ACE, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/AceOfDiamonds.png");
        deck.add(aceOfDiamonds);
        Card twoOfDiamonds = new Card(CardValueEnum.TWO, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/TwoOfDiamonds.png");
        deck.add(twoOfDiamonds);
        Card threeOfDiamonds = new Card(CardValueEnum.THREE, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/ThreeOfDiamonds.png");
        deck.add(threeOfDiamonds);
        Card fourOfDiamonds = new Card(CardValueEnum.FOUR, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/FourOfDiamonds.png");
        deck.add(fourOfDiamonds);
        Card fiveOfDiamonds = new Card(CardValueEnum.FIVE, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/FiveOfDiamonds.png");
        deck.add(fiveOfDiamonds);
        Card sixOfDiamonds = new Card(CardValueEnum.SIX, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/SixOfDiamonds.png");
        deck.add(sixOfDiamonds);
        Card sevenOfDiamonds = new Card(CardValueEnum.SEVEN, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/SevenOfDiamonds.png");
        deck.add(sevenOfDiamonds);
        Card eightOfDiamonds = new Card(CardValueEnum.EIGHT, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/EightOfDiamonds.png");
        deck.add(eightOfDiamonds);
        Card nineOfDiamonds = new Card(CardValueEnum.NINE, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/NineOfDiamonds.png");
        deck.add(nineOfDiamonds);
        Card tenOfDiamonds = new Card(CardValueEnum.TEN, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/TenOfDiamonds.png");
        deck.add(tenOfDiamonds);
        Card jackOfDiamonds = new Card(CardValueEnum.JACK, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/JackOfDiamonds.png");
        deck.add(jackOfDiamonds);
        Card queenOfDiamonds = new Card(CardValueEnum.QUEEN, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/QueenOfDiamonds.png");
        deck.add(queenOfDiamonds);
        Card kingOfDiamonds = new Card(CardValueEnum.KING, CardSuitEnum.DIAMONDS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/KingOfDiamonds.png");
        deck.add(kingOfDiamonds);
        
        //Create Clubs cards and add to deck
        Card aceOfClubs = new Card(CardValueEnum.ACE, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/AceOfClubs.png");
        deck.add(aceOfClubs);
        Card twoOfClubs = new Card(CardValueEnum.TWO, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/TwoOfClubs.png");
        deck.add(twoOfClubs);
        Card threeOfClubs = new Card(CardValueEnum.THREE, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/ThreeOfClubs.png");
        deck.add(threeOfClubs);
        Card fourOfClubs = new Card(CardValueEnum.FOUR, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/FourOfClubs.png");
        deck.add(fourOfClubs);
        Card fiveOfClubs = new Card(CardValueEnum.FIVE, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/FiveOfClubs.png");
        deck.add(fiveOfClubs);
        Card sixOfClubs = new Card(CardValueEnum.SIX, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/SixOfClubs.png");
        deck.add(sixOfClubs);
        Card sevenOfClubs = new Card(CardValueEnum.SEVEN, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/SevenOfClubs.png");
        deck.add(sevenOfClubs);
        Card eightOfClubs = new Card(CardValueEnum.EIGHT, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/EightOfClubs.png");
        deck.add(eightOfClubs);
        Card nineOfClubs = new Card(CardValueEnum.NINE, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/NineOfClubs.png");
        deck.add(nineOfClubs);
        Card tenOfClubs = new Card(CardValueEnum.TEN, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/TenOfClubs.png");
        deck.add(tenOfClubs);
        Card jackOfClubs = new Card(CardValueEnum.JACK, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/JackOfClubs.png");
        deck.add(jackOfClubs);
        Card queenOfClubs = new Card(CardValueEnum.QUEEN, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/QueenOfClubs.png");
        deck.add(queenOfClubs);
        Card kingOfClubs = new Card(CardValueEnum.KING, CardSuitEnum.CLUBS, "/Users/fionaglover/NetBeansProjects/BlackJack/src/main/resources/images/KingOfClubs.png");
        deck.add(kingOfClubs);
        
        isShuffled = false;
    }
    
    
    /**
     * 
     * @return deck of cards
     */
    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    /**
     * 
     * @return size of the deck of cards
     */
    public int getSize(){
        return deck.size();
    }
    
    
    /**
     * 
     * @return card from the top of the deck
     */
    public Card getNextCard(){    
        return deck.remove(0);
    }
    
    
    /**
     * Returns card back to the bottom of the deck
     * @param card 
     */
    public void returnCardToDeck(Card card){
        deck.add(card);
        isShuffled = false;
    }
    
    
    
    /**
     * Shuffles deck of cards randomly
     */
    public void shuffleDeck(){  
        System.out.println("Shuffling deck of cards");
        Collections.shuffle(deck);
        isShuffled = true;
        
    }

    /**
     * 
     * @return Boolean is true if deck has been shuffled
     */
    public boolean isShuffled() {
        return isShuffled;
    }
    
    

    @Override
    public String toString() {
        return "Deck" + "has " + deck.size() + "cards";
    }

    
    
}
