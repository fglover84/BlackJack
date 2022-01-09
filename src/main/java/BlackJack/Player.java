/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

/**
 *
 * @author fionaglover
 */
public class Player {
    
    //Players name
    private String name;
    //Players playing hand
    private Hand hand;

    /**
     * Creates a new player
     * @param name 
     */
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        
    }
    
    

    /**
     * 
     * @return The players playing hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * 
     * @return players name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the players name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Takes the card and adds it to the players hand
     * @param card 
     */
    public void addCardToHand(Card card){
        hand.addCard(card);
    }
    
    
    @Override
    public String toString() {
        return name;
    }

    
    
    
}
