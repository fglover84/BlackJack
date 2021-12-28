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
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {
        
        //Create Spades cards and add to deck
        Card aceOfSpades = new Card(CardValueEnum.ACE, CardSuitEnum.SPADES);
        deck.add(aceOfSpades);
        Card twoOfSpades = new Card(CardValueEnum.TWO, CardSuitEnum.SPADES);
        deck.add(twoOfSpades);
        Card threeOfSpades = new Card(CardValueEnum.THREE, CardSuitEnum.SPADES);
        deck.add(threeOfSpades);
        Card fourOfSpades = new Card(CardValueEnum.FOUR, CardSuitEnum.SPADES);
        deck.add(fourOfSpades);
        Card fiveOfSpades = new Card(CardValueEnum.FIVE, CardSuitEnum.SPADES);
        deck.add(fiveOfSpades);
        Card sixOfSpades = new Card(CardValueEnum.SIX, CardSuitEnum.SPADES);
        deck.add(sixOfSpades);
        Card sevenOfSpades = new Card(CardValueEnum.SEVEN, CardSuitEnum.SPADES);
        deck.add(sevenOfSpades);
        Card eightOfSpades = new Card(CardValueEnum.EIGHT, CardSuitEnum.SPADES);
        deck.add(eightOfSpades);
        Card nineOfSpades = new Card(CardValueEnum.NINE, CardSuitEnum.SPADES);
        deck.add(nineOfSpades);
        Card tenOfSpades = new Card(CardValueEnum.TEN, CardSuitEnum.SPADES);
        deck.add(tenOfSpades);
        Card jackOfSpades = new Card(CardValueEnum.JACK, CardSuitEnum.SPADES);
        deck.add(jackOfSpades);
        Card queenOfSpades = new Card(CardValueEnum.QUEEN, CardSuitEnum.SPADES);
        deck.add(queenOfSpades);
        Card kingOfSpades = new Card(CardValueEnum.KING, CardSuitEnum.SPADES);
        deck.add(kingOfSpades);
        
        //Create Hearts cards and add to deck
        Card aceOfHearts = new Card(CardValueEnum.ACE, CardSuitEnum.HEARTS);
        deck.add(aceOfHearts);
        Card twoOfHearts = new Card(CardValueEnum.TWO, CardSuitEnum.HEARTS);
        deck.add(twoOfHearts);
        Card threeOfHearts = new Card(CardValueEnum.THREE, CardSuitEnum.HEARTS);
        deck.add(threeOfHearts);
        Card fourOfHearts = new Card(CardValueEnum.FOUR, CardSuitEnum.HEARTS);
        deck.add(fourOfHearts);
        Card fiveOfHearts = new Card(CardValueEnum.FIVE, CardSuitEnum.HEARTS);
        deck.add(fiveOfHearts);
        Card sixOfHearts = new Card(CardValueEnum.SIX, CardSuitEnum.HEARTS);
        deck.add(sixOfHearts);
        Card sevenOfHearts = new Card(CardValueEnum.SEVEN, CardSuitEnum.HEARTS);
        deck.add(sevenOfHearts);
        Card eightOfHearts = new Card(CardValueEnum.EIGHT, CardSuitEnum.HEARTS);
        deck.add(eightOfHearts);
        Card nineOfHearts = new Card(CardValueEnum.NINE, CardSuitEnum.HEARTS);
        deck.add(nineOfHearts);
        Card tenOfHearts = new Card(CardValueEnum.TEN, CardSuitEnum.HEARTS);
        deck.add(tenOfHearts);
        Card jackOfHearts = new Card(CardValueEnum.JACK, CardSuitEnum.HEARTS);
        deck.add(jackOfHearts);
        Card queenOfHearts = new Card(CardValueEnum.QUEEN, CardSuitEnum.HEARTS);
        deck.add(queenOfHearts);
        Card kingOfHearts = new Card(CardValueEnum.KING, CardSuitEnum.HEARTS);
        deck.add(kingOfHearts);
        

        //Create Diamonds cards and add to deck
        Card aceOfDiamonds = new Card(CardValueEnum.ACE, CardSuitEnum.DIAMONDS);
        deck.add(aceOfDiamonds);
        Card twoOfDiamonds = new Card(CardValueEnum.TWO, CardSuitEnum.DIAMONDS);
        deck.add(twoOfDiamonds);
        Card threeOfDiamonds = new Card(CardValueEnum.THREE, CardSuitEnum.DIAMONDS);
        deck.add(threeOfDiamonds);
        Card fourOfDiamonds = new Card(CardValueEnum.FOUR, CardSuitEnum.DIAMONDS);
        deck.add(fourOfDiamonds);
        Card fiveOfDiamonds = new Card(CardValueEnum.FIVE, CardSuitEnum.DIAMONDS);
        deck.add(fiveOfDiamonds);
        Card sixOfDiamonds = new Card(CardValueEnum.SIX, CardSuitEnum.DIAMONDS);
        deck.add(sixOfDiamonds);
        Card sevenOfDiamonds = new Card(CardValueEnum.SEVEN, CardSuitEnum.DIAMONDS);
        deck.add(sevenOfDiamonds);
        Card eightOfDiamonds = new Card(CardValueEnum.EIGHT, CardSuitEnum.DIAMONDS);
        deck.add(eightOfDiamonds);
        Card nineOfDiamonds = new Card(CardValueEnum.NINE, CardSuitEnum.DIAMONDS);
        deck.add(nineOfDiamonds);
        Card tenOfDiamonds = new Card(CardValueEnum.TEN, CardSuitEnum.DIAMONDS);
        deck.add(tenOfDiamonds);
        Card jackOfDiamonds = new Card(CardValueEnum.JACK, CardSuitEnum.DIAMONDS);
        deck.add(jackOfDiamonds);
        Card queenOfDiamonds = new Card(CardValueEnum.QUEEN, CardSuitEnum.DIAMONDS);
        deck.add(queenOfDiamonds);
        Card kingOfDiamonds = new Card(CardValueEnum.KING, CardSuitEnum.DIAMONDS);
        deck.add(kingOfDiamonds);
        
        //Create Clubs cards and add to deck
        Card aceOfClubs = new Card(CardValueEnum.ACE, CardSuitEnum.CLUBS);
        deck.add(aceOfClubs);
        Card twoOfClubs = new Card(CardValueEnum.TWO, CardSuitEnum.CLUBS);
        deck.add(twoOfClubs);
        Card threeOfClubs = new Card(CardValueEnum.THREE, CardSuitEnum.CLUBS);
        deck.add(threeOfClubs);
        Card fourOfClubs = new Card(CardValueEnum.FOUR, CardSuitEnum.CLUBS);
        deck.add(fourOfClubs);
        Card fiveOfClubs = new Card(CardValueEnum.FIVE, CardSuitEnum.CLUBS);
        deck.add(fiveOfClubs);
        Card sixOfClubs = new Card(CardValueEnum.SIX, CardSuitEnum.CLUBS);
        deck.add(sixOfClubs);
        Card sevenOfClubs = new Card(CardValueEnum.SEVEN, CardSuitEnum.CLUBS);
        deck.add(sevenOfClubs);
        Card eightOfClubs = new Card(CardValueEnum.EIGHT, CardSuitEnum.CLUBS);
        deck.add(eightOfClubs);
        Card nineOfClubs = new Card(CardValueEnum.NINE, CardSuitEnum.CLUBS);
        deck.add(nineOfClubs);
        Card tenOfClubs = new Card(CardValueEnum.TEN, CardSuitEnum.CLUBS);
        deck.add(tenOfClubs);
        Card jackOfClubs = new Card(CardValueEnum.JACK, CardSuitEnum.CLUBS);
        deck.add(jackOfClubs);
        Card queenOfClubs = new Card(CardValueEnum.QUEEN, CardSuitEnum.CLUBS);
        deck.add(queenOfClubs);
        Card kingOfClubs = new Card(CardValueEnum.KING, CardSuitEnum.CLUBS);
        deck.add(kingOfClubs);
        
    }
    
    
    
    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    //Returns number of cards in the deck to the caller
    public int getSize(){
        return deck.size();
    }
    
    //Returns next card from the top of the deck 
    public Card getNextCard(){
        return deck.remove(0);
    }
    
    //Puts returned card back into the bottom of the deck
    public void returnCardToDeck(Card card){
        deck.add(card);
    }
    
    //shuffles deck of cards randomly
    public void shuffleDeck(){  
        System.out.println("Shuffling deck of cards");
        Collections.shuffle(deck);
    }

    @Override
    public String toString() {
        return "Deck" + "has " + deck.size() + "cards";
    }

    
    
}
