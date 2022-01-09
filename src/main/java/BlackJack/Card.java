/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import Enum.CardSuitEnum;
import Enum.CardValueEnum;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author fionaglover
 * One playing card belonging to a deck of 52 playing cards
 * 
 */
public class Card {
    
     //Card values: ENUM: TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, 
     // JACK, QUEEN, KING or ACE
    private final CardValueEnum valueName;
    //Card suit ENUM CLUBS, HEARTS, DIAMONDS, SPADES
    private final CardSuitEnum suit;
    //Numerical value of card
    private final ArrayList<Integer> value = new ArrayList<>();
    //File path of where the card image is stored
    private final String imgFilePath;

    /**
     * Creates a new playing card
     * @param valueName 
     * @param suit
     * @param imgFilePath
     */
    public Card(CardValueEnum valueName, CardSuitEnum suit, String imgFilePath) {
        this.valueName = valueName;
        this.suit = suit;
        this.imgFilePath = imgFilePath;
        if (valueName.compareTo(CardValueEnum.ACE) == 0){
            value.add(1);
            value.add(11);
        } else if (valueName.compareTo(CardValueEnum.TWO) == 0){
            value.add(2);
        } else if (valueName.compareTo(CardValueEnum.THREE) == 0){
            value.add(3);
        } else if (valueName.compareTo(CardValueEnum.FOUR) == 0){
            value.add(4);
        } else if (valueName.compareTo(CardValueEnum.FIVE) == 0){
            value.add(5);
        } else if (valueName.compareTo(CardValueEnum.SIX) == 0){
            value.add(6);
        } else if (valueName.compareTo(CardValueEnum.SEVEN) == 0){
            value.add(7);
        } else if (valueName.compareTo(CardValueEnum.EIGHT) == 0){
            value.add(8);
        } else if (valueName.compareTo(CardValueEnum.NINE) == 0){
            value.add(9);
        } else if (valueName.compareTo(CardValueEnum.TEN) == 0){
            value.add(10);
        } else if (valueName.compareTo(CardValueEnum.JACK) == 0){
            value.add(10);
        } else if (valueName.compareTo(CardValueEnum.QUEEN) == 0){
            value.add(10);
        } else if (valueName.compareTo(CardValueEnum.KING) == 0){
            value.add(10);
        }
        
    }

    /**
     * @return The value name of the card
     * Can be CardValueEnum TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN
     * JACK, QUEEN, KING
     */
    public CardValueEnum getValueName() {
        return valueName;
    }

    /**
     * @return the suit of the card 
     * Can be CardSuitEnum HEARTS, DIAMONDS, CLUBS, SPADES
     */
    public CardSuitEnum getSuit() {
        return suit;
    }

    /**
     * @return the numerical value of the card
     * Ace can be equal to 1 or 11
     * 2 to 10 is its face value equivalent
     * Jack, Queen, King are equal to 10
     */
    public ArrayList<Integer> getValue() {
        return value;
    }

    /**
     * 
     * @return The file path name of where the card image is stored 
     */
    public String getImgFilePath() {
        return imgFilePath;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (!Objects.equals(this.suit, other.suit)) {
            return false;
        }
        return Objects.equals(this.valueName, other.valueName);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.valueName);
        hash = 67 * hash + Objects.hashCode(this.suit);
        return hash;
    }

    

    @Override
    public String toString() {
        return valueName + " OF " + suit;
    }
    
    
    
    
}
