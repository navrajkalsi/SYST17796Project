/**
 * SYST 17796 Project Winter 2024.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class is the Start class for the Card Game.
 *
 * @author Navraj Singh Kalsi
 * @since 2024-10-06
 */

public class Start extends Game {

    public Start() {
        super("War");
    }

    @Override
    public void play(Player player1, Player player2) {
        int round = 0;

        GroupOfCards player1Cards = player1.getCards();
        GroupOfCards player2Cards = player2.getCards();

        while (!player1Cards.getCards().isEmpty() && !player2Cards.getCards().isEmpty()) {
            round++;
            System.out.println("Now playing Round: " + round);

            Card player1Card = player1Cards.getCard();
            Card player2Card = player2Cards.getCard();

            if (player1Card.getValue() > player2Card.getValue()) {
                System.out.println("Player 1 wins the round!");
                player1Cards.addCard(player1Card);
                player1Cards.addCard(player2Card);
            } else if (player1Card.getValue() < player2Card.getValue()) {
                System.out.println("Player 2 wins the round!");
                player2Cards.addCard(player1Card);
                player2Cards.addCard(player2Card);
            } else {
                System.out.println("Tie! It is a War!");
                ArrayList<Card> cards1 = new ArrayList<Card>();
                ArrayList<Card> cards2 = new ArrayList<Card>();

                cards1.add(player1Card);
                cards2.add(player2Card);

                while (player1Card.getValue() == player2Card.getValue()) {
                    player1Card = player1Cards.getCard();
                    player2Card = player2Cards.getCard();
                    cards1.add(player1Card);
                    cards2.add(player2Card);
                }

                int cards1Sum = 0;
                int cards2Sum = 0;

                for (Card card: cards1) {
                    cards1Sum += card.getValue();
                }
                for (Card card: cards2) {
                    cards2Sum += card.getValue();
                }

                if (cards1Sum > cards2Sum) {
                    for (Card card: cards1) {
                        player1Cards.addCard(card);
                    }
                    for (Card card: cards2) {
                        player1Cards.addCard(card);
                    }
                    System.out.println("Player 1 won " + (cards1.size() + cards2.size() + " cards."));
                } else {
                    for (Card card: cards1) {
                        player2Cards.addCard(card);
                    }
                    for (Card card: cards2) {
                        player2Cards.addCard(card);
                    }
                    System.out.println("Player 2 won " + (cards1.size() + cards2.size() + " cards."));
                }
                cards1.clear();
                cards2.clear();
            }

            System.out.println("Player 1 is left with " + player1Cards.getSize() + " cards.");
            System.out.println("Player 2 is left with " + player2Cards.getSize() + " cards.");
        }

        declareWinner(player1Cards, player2Cards);
    }

    @Override
    public void declareWinner(GroupOfCards player1Cards, GroupOfCards player2Cards) {
        if (player1Cards.getCards().isEmpty()) {
            System.out.println("Player 2 Wins!");
        } else {
            System.out.println("Player 1 Wins!");
        }
    }

    public static void main(String[] args) {

        ArrayList<Card> deck = createDeck();
        Collections.shuffle(deck);

        ArrayList<Card> player1Cards = new ArrayList<Card>(deck.subList(0, 26));
        ArrayList<Card> player2Cards = new ArrayList<Card>(deck.subList(26, 52));

        Player player1 = new Player(1, new GroupOfCards(player1Cards));
        Player player2 = new Player(2, new GroupOfCards(player2Cards));

        Start game = new Start();

        game.play(player1, player2);
    }
}
