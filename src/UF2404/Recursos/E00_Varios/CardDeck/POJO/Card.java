package UF2404.Recursos.E00_Varios.CardDeck.POJO;

/**
 * Card class, contains the constructor and methods of Card.
 *
 * @author Jorge Boado
 */
public class Card {
    private final Number number;
    private final Suit suit;

    /**
     * Card constructor.
     *
     * @param number Number type Object.
     * @param suit   Suit type Object.
     */
    public Card(Number number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    /**
     * Returns the number of the Card.
     *
     * @return Number type Object.
     */
    public Number getNumber() {
        return number;
    }

    /**
     * Returns the suit of the Card.
     *
     * @return Suit type Object.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Returns the Card attr.
     *
     * @return Card attr in String format.
     */
    @Override
    public String toString() {
        return number.toString() + " of " + suit.toString();
    }
}
