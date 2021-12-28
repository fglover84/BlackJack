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
    
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
