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
 */
public class Card {
    
    //Card number or Jack, Queen, King or Ace
    CardValueEnum valueName;
    //Card suit ENUM CLUBS, HEARTS, DIAMONDS, SPADES
    CardSuitEnum suit;
    ArrayList<Integer> value = new ArrayList<>();

    public Card(CardValueEnum valueName, CardSuitEnum suit) {
        this.valueName = valueName;
        this.suit = suit;
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
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.suit);
        hash = 47 * hash + Objects.hashCode(this.valueName);
        return hash;
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
    public String toString() {
        return valueName + " OF " + suit;
    }
    
    
    
    
}
