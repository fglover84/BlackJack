/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import Enum.CardValueEnum;
import java.util.ArrayList;

/**
 *
 * @author fionaglover
 */
public class Hand {

    ArrayList<Card> cards;
    ArrayList<Integer> score;
    
    public Hand() {
        this.cards = new ArrayList<>();
        score = new ArrayList<>();
        score.add(0);
        score.add(0);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
        updateScore();
    }
    
    private ArrayList<Integer> updateScore(){
        boolean containAce = false;
        for(Card eachCard: cards){
            if (eachCard.valueName.equals(CardValueEnum.ACE) && !containAce){
                //Ace values are stored in list 
                //position 0 contains ace value 1, 
                //position 1 contains ace value 11
                //If first Ace in the hand then one score has Ace value 11 added 
                //and other has Ace value 1
                score.set(0, (score.get(0)+eachCard.value.get(1)));
                score.set(1, (score.get(1)+eachCard.value.get(0)));
                containAce = true;
            } else if (eachCard.valueName.equals(CardValueEnum.ACE) && containAce){
                //If ace already exist in the hand then only ace values of 1 are added to the scores
                score.set(0, (score.get(0)+eachCard.value.get(0)));
                score.set(1, (score.get(1)+eachCard.value.get(0)));
                containAce = true;
            } else {
                //Added to both scores in anticipation of drawing an Ace card
                score.set(0, (score.get(0)+eachCard.value.get(0)));
                score.set(1, (score.get(1)+eachCard.value.get(0)));
            }
        }
        System.out.println("Score Updated: " + score);
        return score;
    }
    
    public ArrayList<Integer> getScore() {
        return score;
    
    }

    @Override
    public String toString() {
        String handString = "";
        for(Card eachCard: cards){
            handString = handString.concat(eachCard.toString()) + ", ";
        }
        handString = handString.substring(0, handString.length()-2);
        return handString;
    }

    

    
    
    
    
}
