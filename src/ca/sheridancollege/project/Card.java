/**
 * SYST 17796 Project Winter 2024.
 */
package ca.sheridancollege.project;

/**
 * This class models a Card in the Card Game.
 * @author Navraj Singh Kalsi
 * @since 2024-10-06
 */
public class Card {
    private String suit; //suit of the card
    private String rank; //rank of the card
    private int value; //value of the card

    /**
     * A constructor that allows to set the suit, rank and value of the card.
     * @param suit
     * @param rank
     * @param value
     */
    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    /**
     * @return value of the specific card
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set for the card
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the rank of the card
     */
    public String getRank() {
        return this.rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return the suit of the card
     */
    public String getSuit() {
        return this.suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return a String representation of a card.
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
