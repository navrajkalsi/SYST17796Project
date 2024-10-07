/**
 * SYST 17796 Project Winter 2024.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * This class models the Card Game.
 * @author Navraj Singh Kalsi
 * @since 2024-10-06
 */

public abstract class Game
{
    private final String gameName; //the title of the game
    private ArrayList<Player> players; // the players of the game

    /**
     * Constructor to set the name of the player.
     * @param gameName
     */
    public Game(String gameName)
    {
        this.gameName = gameName;
        this.players = new ArrayList<Player>();
    }

    /**
     * @return the gameName
     */
    public String getGameName()
    {
        return this.gameName;
    }

     /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers()
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players)
    {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play(Player player1, Player player2);

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner(GroupOfCards cards1, GroupOfCards cards2);

    /**
     * @return a standard deck with 52 cards
     */
    public static ArrayList<Card> createDeck() {

        ArrayList<Card> deck = new ArrayList<Card>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit: suits) {
            for (int i = 0; i < ranks.length; i++) {
                deck.add(new Card(suit, ranks[i], values[i]));
            }
        }

        return deck;
    }
}//end class
