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
public class Game {

    private static ArrayList<Player> players;
    private static Dealer dealer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayList<String> playerNames = new ArrayList<>();
        playerNames.add("Fiona");
        setPlayers(1, playerNames);
        dealer = new Dealer();
        dealer.startGame();
    }

    public static void setPlayers(int numberOfPlayers, ArrayList<String> playerNames) {
        players = new ArrayList<>();
        for(int i = 0; i < numberOfPlayers; i++){
            players.add(new Player(playerNames.get(i)));
        }
    }
    public static ArrayList<Player> getPlayers() {
        return players;
    }
    
    
    
}
