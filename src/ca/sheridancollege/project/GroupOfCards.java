/**
 * SYST 17796 Project Winter 2024.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class models Group of Cards in the Card Game.
 * @author Navraj Singh Kalsi
 * @since 2024-10-06
 */

// Each player has a group of card associated with them.
// When one player has no cards left, that player loses the game.

public class GroupOfCards
{
    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;

    /**
     * Constructor to set the cards ArrayList.
     * @param cards
     */
    public GroupOfCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> getCards()
    {
        return cards;
    }

    /**
     * @param cards the group of cards
     */
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return cards.size();
    }

    /**
     * Returns a random Card.
     * @return random card from a players deck
     */
    public Card getCard() {
        Collections.shuffle(this.cards);
        return this.cards.remove(0);
    }

    /**
     * @param card adds card to player's deck
     */
    public void addCard(Card card) {
        this.cards.add(card);
        Collections.shuffle(cards);
    }

}//end class
