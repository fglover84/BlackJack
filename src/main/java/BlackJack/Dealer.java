/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

/**
 *
 * @author fionaglover
 * Dealer controls the game play 
 */
public class Dealer {
    
    Deck deck;
    Player player;
    BlackJack blackJack;
    Player currentPlayer;

    /**
     * Dealer constructor creates a new deck of cards
     * @param player 
     */
    public Dealer(Player player) {
        this.deck = new Deck();
        this.player = player;
    }
    
    /**
     * The player chooses hit and if the score is currently valid they are 
     * dealt a new card
     * @return new playing card
     */
    public Card playerHits(){
//      The score evaluates to valid(true) 
//      The dealer deals one additional card to the player 
//      A new score is calculated 
//      The new score is evaluated (valid)
        System.out.println("Player hits");
        if(player.getHand().evaluateScore() == 0 || !player.getHand().isComplete()){
            return dealPlayerCard(player);
            
        }
        return null;
    }
    
    /**
     * 
     */
    public void playerStands(){
        System.out.println("Player stands");
        if(player.getHand().evaluateScore() == 0){
            player.getHand().setComplete(true);
            player.getHand().evaluateScore();
            
        }
        
    }
    
    /**
     * 
     */
    public void resetGame(){
        while(!player.getHand().getCards().isEmpty()){
            deck.returnCardToDeck(player.getHand().getCards().remove(0));
        }
        player.getHand().setComplete(false);
    }
    /**
     * Deals players opening hand. Takes two cards from the top of the deck and 
     * puts them in the players hand 
     */
    public void dealPlayersOpeningHand(){
        System.out.println("Dealing players opening hands"); 
        player.addCardToHand(deck.getNextCard());
        player.addCardToHand(deck.getNextCard());
             
    }

    /** 
     * @return Deck of cards
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * @return player
     */
    public Player getPlayer() {
        return player;
    }
    
    
    /**
     * Starts a new game of BlackJack by shuffling the deck of cards and 
     * deals the players opening hand
     */
    public void startGame() {
        System.out.println("--------- Starting Game -----------");
        deck.shuffleDeck();
        dealPlayersOpeningHand();
        
        System.out.println("-----------------------------------");
    }

    /**
     * Deals new playing card to the player 
     * @param player
     * @return new playing card from top of deck
     */
    public Card dealPlayerCard(Player player) {
        System.out.println("Dealing player new card");
        Card newCard = deck.getNextCard();
        player.getHand().addCard(newCard);
        return newCard;
    }
}
