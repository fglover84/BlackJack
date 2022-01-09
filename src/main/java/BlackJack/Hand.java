/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import Enum.CardValueEnum;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author fionaglover
 * Holds the cards relating to a hand of cards during game play
 */
public class Hand {
    
    //Can have multiple cards in hand until the hand value reaches >=22 (Bust)
    private ArrayList<Card> cards;
    //Two scores calculated to account for the possibility of having an ace with 
    //value 1 or 11. Each subsequent ACE after the first will only have a value 
    //of 1
    private ArrayList<Integer> score;
    //True when player has finished playing the hand. Either when they lose or 
    //choose to stand
    boolean complete;
    
   
    public Hand() {
        this.cards = new ArrayList<>();
        this.score = new ArrayList<>();
        this.score.add(0);
        this.score.add(0);
        this.complete = false;
        
    }

    /**
     * 
     * @return ArrayList of cards in the hand
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Adds card to the hand and re-calculates the score 
     * @param card 
     */
    public void addCard(Card card) {
        System.out.println("adding card " + card + " to hand");
        this.cards.add(card);
        calculateScore();
    }
    
    /**
     * 
     * Calculates the score of the hand
     * @return ArrayList of two integer value scores
     * First value is calculated giving any potential first Ace an 11 value,
     * Second value contains the score giving a first potential ace a 1 value
     */
    private ArrayList<Integer> calculateScore(){
        if (cards.size() >= 2){
            System.out.println("Calculating score");
            //reseting score
            score.set(0, 0);
            score.set(1, 0);
            boolean containAce = false;
            for(Card eachCard: cards){
                System.out.println("Card: " + eachCard);
                if (eachCard.getValueName().equals(CardValueEnum.ACE) && !containAce){
                    //Ace values are stored in list 
                    //position 0 contains ace value 1, 
                    //position 1 contains ace value 11
                    //If first Ace in the hand then one score has Ace value 11 added 
                    //and other has Ace value 1
                    score.set(0, (score.get(0)+eachCard.getValue().get(1)));
                    score.set(1, (score.get(1)+eachCard.getValue().get(0)));
                    containAce = true;
                } else if (eachCard.getValueName().equals(CardValueEnum.ACE) && containAce){
                    //If ace already exist in the hand then only ace values of 1 are added to the scores
                    score.set(0, (score.get(0)+eachCard.getValue().get(0)));
                    score.set(1, (score.get(1)+eachCard.getValue().get(0)));

                } else {
                    //Added to both scores in anticipation of drawing an Ace card
                    score.set(0, (score.get(0)+eachCard.getValue().get(0)));
                    score.set(1, (score.get(1)+eachCard.getValue().get(0)));
                }
                System.out.println("Score Updated: " + score);
            }
        }
        
        return score;
    }
    
    /**
     * 
     * @return integer value of the score of the hand
     * If the first value contains an ace taking the value beyond the 21 value 
     * threshold but the second value does not exceed 21 then the second value will 
     * be returned.
     */
    public int getScore() {
        //first score in list with potential Ace scored as 11 is returned if value is <=21
        if(score.get(0)<=21){
            return score.get(0);
        //else the second value will always be the lowest of the two
        }  else {
                return score.get(1);
            
        }
    
    }
    
    /**
     * 
     * @return score of hand as String representation
     */
    public String getScoreAsText(){
        String scoreString;
        if (Objects.equals(score.get(0), score.get(1))){
            scoreString = String.valueOf(score.get(0));
        } else if(score.get(0) > 21){
            scoreString = String.valueOf(score.get(1));
        } else if(evaluateScore() == 1){
            scoreString = String.valueOf(score.get(0));
                  
        } else {
            scoreString = String.valueOf(score.get(1)) + " / " + String.valueOf(score.get(0));
        }
        return scoreString;
    }
    
    /**
     * 
     * @return an ArrayList of the players scores
     * First value counts first Ace as value 11, second value counts first 
     * Ace as value 1
     */
    public ArrayList<Integer> getScoreList(){
        return score;
    }
    
    
    /**
     * 
     * @return int value determining if the score is valid. -1 is invalid and player is bust, 
     * 0 is valid and player can continue playing, 1 is a BlackJack and player wins
     * BlackJack is classified as a score of 21 when the first two cards are dealt
     */
    public int evaluateScore(){
        if (this.getScore() == 21 && cards.size() == 2){
            complete = true;
            return 1;
            
        } else if (this.getScore() == 21){
            complete = true;
            return 0;
        } else if (this.getScore() < 21){
            return 0;
        } else {
            complete = true;
            return -1;
        }
    }
    
    /**
     * 
     * @return score evaluation as a String representation
     */
    public String getScoreEvaluationAsText(){
        int evaluatedScore = this.evaluateScore();
        String text = "";
        switch (evaluatedScore) {
            case 1:
                text = "BlackJack - You WIN!!";
                break;
            case 0:
                text = "Game in play";
                break;
            case -1:
                text = "You lose!";
                break;
        }
        if (evaluateScore() == 0 && getScore() == 21){
            text = "You win!";
        }
        return text;
    }
    
    public String getFinalScoreEvaluationAsText(){
        int evaluatedScore = evaluateScore();
        String text = "";
        switch (evaluatedScore) {
            case 1:
                text = "BlackJack - You WIN!!";
                break;
            case 0:
                text = "You win!";
                break;
            case -1:
                text = "You lose!";
                break;
        }
        return text;
    }
    
    

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
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
