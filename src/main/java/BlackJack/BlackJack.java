/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

/**
 *
 * @author fionaglover
 * 
 * 
 */
public class BlackJack {

    private Player player;
    private Dealer dealer;

    /**
    *
    * Creates the player and dealer
    * Dealer handles the rest of the set up
    */
    public BlackJack() {
        
        
        String playerName = "Fiona";
        player = new Player(playerName);
        
        dealer = new Dealer(player);
        
    }

    /**
    * 
    * @return player 
    * 
    */
    public Player getPlayer() {
        return player;
    }

    /**
    * 
    * @return dealer 
    * 
    */
    public Dealer getDealer() {
        return dealer;
    }
    
    
    
    
}
