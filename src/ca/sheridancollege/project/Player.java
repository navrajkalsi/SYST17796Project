/**
 * SYST 17796 Project Winter 2024.
 */
package ca.sheridancollege.project;

/**
 * This class models a Player in the Card Game.
 * @author Navraj Singh Kalsi
 * @since 2024-10-06
 */

public class Player
{
    private int id; //the unique ID for this player
    private GroupOfCards cards; //cards that a player has

    /**
     * A constructor that allows you to set the player's unique ID and group of cards they have.
     * @param id the unique ID to assign to this player.
     * @param cards collection of cards assigned to this player.
     */
    public Player(int id, GroupOfCards cards)
    {
        this.id= id;
        this.cards = cards;
    }

    /**
     * @return id of player
     */
    public int getId()
    {
        return id;
    }

    /**
     * Ensure that the ID of player is unique
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return cards
     */
    public GroupOfCards getCards() {
        return this.cards;
    }

    /**
     * @param cards the group of cards to set
     */
    public void setCards(GroupOfCards cards) {
        this.cards = cards;
    }
}
