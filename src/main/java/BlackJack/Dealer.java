/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;

/**
 *
 * @author fionaglover
 */
public class Dealer {
    
    Deck deck;
    ArrayList<Player> players;

    public Dealer() {
        this.deck = new Deck();
        players = Game.getPlayers();
    }
    
    public void dealPlayersOpeningHand(){
        System.out.println("Dealing players opening hands"); 
        for (Player eachPlayer: players){
            System.out.println("Player: " + eachPlayer); 
            eachPlayer.addCardToHand(deck.getNextCard());
            eachPlayer.addCardToHand(deck.getNextCard());
            System.out.println("Hand: " + eachPlayer.getHand().toString()); 
        }
        
    }

    void startGame() {
        System.out.println("--------- Starting Game -----------");
        deck.shuffleDeck();
        dealPlayersOpeningHand();
        System.out.println("-----------------------------------");
    }
}
