package UF2404.Recursos.E00_Varios.CardDeck.POJO;

/**
 * Number class, contains the constructor and methods of Number.
 *
 * @author Jorge Boado
 */
public class Number {
    private static final String[] POKER_NUMBERS = {"Ace", "Jack", "Queen", "King"};
    private static final String[] SPANISH_NUMBERS = {"Ace", "Knave", "Knight", "King"};

    private final int id;
    private final int number;

    /**
     * Number constructor.
     *
     * @param id     Integer between 1 and 2, depending the deck type.
     * @param number Integer this number can go from 1 to 10 or 1 to 13, depending the deck.
     */
    public Number(int id, int number) {
        this.id = id;
        this.number = number;
    }

    /**
     * Returns the number attr.
     *
     * @return Integer number attr.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Depending of the id of the id attr will call the pokerNumbers or spanishNumbers function.
     *
     * @return String with the name or number of the card.
     */
    @Override
    public String toString() {
        switch (id) {
            case 1:
                return pokerNumbers();
            case 2:
                return spanishNumbers();
            default:
                return "";
        }
    }

    /**
     * Check if the number of the card have name in the Poker Deck.
     *
     * @return String with the name or number of the Poker card.
     */
    private String pokerNumbers() {
        switch (number) {
            case 1:
                return POKER_NUMBERS[0];
            case 11:
                return POKER_NUMBERS[1];
            case 12:
                return POKER_NUMBERS[2];
            case 13:
                return POKER_NUMBERS[3];
            default:
                return String.valueOf(number);
        }
    }

    /**
     * Check if the number of the card have name in the Spanish Deck.
     *
     * @return String with the name or number of the Spanish card.
     */
    private String spanishNumbers() {
        switch (number) {
            case 1:
                return SPANISH_NUMBERS[0];
            case 8:
                return SPANISH_NUMBERS[1];
            case 9:
                return SPANISH_NUMBERS[2];
            case 10:
                return SPANISH_NUMBERS[3];
            default:
                return String.valueOf(number);
        }
    }
}
