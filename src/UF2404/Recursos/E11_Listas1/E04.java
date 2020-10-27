package UF2404.Recursos.E11_Listas1;

import UF2404.POJO.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class E04 {
    private static final int NUMBER_OF_SUITS = 4;
    private static final int NUMBER_OF_CARDS = 13;

    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<>();

        System.out.println("-------------Initial-------------");
        init(deck);
        print(deck);
        System.out.println("-------------OrderByNumbers-------------");
        orderByNumbers(deck);
        print(deck);
        System.out.println("-------------OrderBySuits-------------");
        orderBySuits(deck);
        print(deck);
        System.out.println("-------------Shuffled-------------");
        Collections.shuffle(deck);
        print(deck);
    }

    /**
     * Sort the ArrayList by Suits.
     * @param d Card Object ArrayList.
     */
    private static void orderBySuits(ArrayList<Card> d) {
        d.sort(Comparator.comparingInt(Card::getSuits));
    }

    /**
     * Sort the ArrayList by numbers.
     * @param d Card Object ArrayList.
     */
    private static void orderByNumbers(ArrayList<Card> d) {
        d.sort(Comparator.comparingInt(Card::getNumber));
    }

    /**
     * Initialize the deck ArrayList.
     */
    private static void init(ArrayList<Card> deck) {
        for (int i = 0; i < NUMBER_OF_SUITS; i++) {
            for (int j = 0; j < NUMBER_OF_CARDS; j++) {
                Card c = new Card(j + 1, i + 1);
                deck.add(c);
            }
        }
    }

    /**
     * Print all elements from the ArrayList that receive.
     *
     * @param d Card type ArrayList.
     */
    private static void print(ArrayList<Card> d) {
        for (Card c : d) {
            System.out.println(c.toString());
        }
    }
}
