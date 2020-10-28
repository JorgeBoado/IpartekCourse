package UF2404.Recursos.E00_Varios.CardDeck.POJO;

import UF2404.Recursos.E00_Varios.CardDeck.Abstract.CardDeck;

import java.util.ArrayList;

/**
 * PokerDeck class that extends from CardDeck, contains the methods of PokerClass.
 *
 * @author Jorge Boado
 */
public class PokerDeck extends CardDeck {

    private static final int NUMBER_OF_SUITS = 4;
    private static final int NUMBER_OF_CARDS = 13;

    private ArrayList<Card> cardDeck = new ArrayList<>();

    /**
     * PokerDeck constructor, call the create method.
     */
    public PokerDeck() {
        create();
    }

    /**
     * Fill the cardDeck with Poker Cards.
     */
    @Override
    public void create() {
        for (int i = 0; i < NUMBER_OF_SUITS; i++) {
            for (int j = 0; j < NUMBER_OF_CARDS; j++) {
                Card c = new Card(new Number(1, (j + 1)), new Suit(1, (i + 1)));
                cardDeck.add(c);
            }
        }
    }

    /**
     * Returns the Poker deck.
     *
     * @return Card type ArrayList.
     */
    @Override
    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }
}
