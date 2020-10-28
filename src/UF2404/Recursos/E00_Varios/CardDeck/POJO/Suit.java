package UF2404.Recursos.E00_Varios.CardDeck.POJO;

/**
 * Suit class, contains the constructor and methods of Suit.
 *
 * @author Jorge Boado
 */
public class Suit {
    private static final String[] POKER_SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] SPANISH_SUITS = {"Coins", "Cups", "Clubs", "Swords"};

    private final int id;
    private final int suit;

    /**
     * Suit constructor.
     *
     * @param id   Integer between 1 and 2, depending the deck type.
     * @param suit Integer this one can go from 1 to 4.
     */
    public Suit(int id, int suit) {
        this.id = id;
        this.suit = suit;
    }

    /**
     * Returns the suit attr.
     *
     * @return Integer suit attr.
     */
    public int getSuit() {
        return suit;
    }

    /**
     * Depending of the id attr will get the name from the POKER_SUITS or SPANISH_SUITS.
     *
     * @return String with the name of the suit.
     */
    @Override
    public String toString() {
        return this.id == 1 ? POKER_SUITS[suit - 1] : SPANISH_SUITS[suit - 1];
    }
}
