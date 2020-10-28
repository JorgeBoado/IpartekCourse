package UF2404.Recursos.E00_Varios.CardDeck.Abstract;

import UF2404.Recursos.E00_Varios.CardDeck.POJO.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Abstract class of CardDeck that implement some useful functions for the children class.
 *
 * @author Jorge Boado
 */
public abstract class CardDeck {
    /**
     * Abstract method for create the deck.
     */
    protected abstract void create();

    /**
     * Prints the ArrayList that receive.
     *
     * @param cd Card type ArrayList.
     */
    public void print(ArrayList<Card> cd) {
        for (Card c : cd) {
            System.out.println(c.toString());
        }
    }

    /**
     * Orders the ArrayList that receive by suits.
     *
     * @param cd Card type ArrayList.
     */
    public void orderBySuit(ArrayList<Card> cd) {
        orderByNumbers(cd);
        cd.sort(Comparator.comparingInt(card -> card.getSuit().getSuit()));
    }

    /**
     * Orders the ArrayList that receive by numbers.
     *
     * @param cd Card type ArrayList.
     */
    public void orderByNumbers(ArrayList<Card> cd) {
        cd.sort(Comparator.comparingInt(card -> card.getNumber().getNumber()));
    }

    /**
     * Uses the shuffle method from Collections libraries for disorder the ArrayList that receive.
     *
     * @param cd Card type ArrayList.
     */
    public void shuffle(ArrayList<Card> cd) {
        Collections.shuffle(cd);
    }

    /**
     * Abstract method for get the Card type ArrayList from the Deck.
     *
     * @return Card type ArrayList.
     */
    public abstract ArrayList<Card> getCardDeck();
}
