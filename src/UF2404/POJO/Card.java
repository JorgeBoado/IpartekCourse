package UF2404.POJO;

public class Card {
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    private int number;
    private int suits;

    public Card(int number, int suits) {
        this.number = number;
        this.suits = suits;
    }

    public int getNumber() {
        return number;
    }

    public int getSuits() {
        return suits;
    }

    @Override
    public String toString() {
        String aux;
        switch (number) {
            case 1:
                aux = "Ace";
                break;
            case 11:
                aux = "Jack";
                break;
            case 12:
                aux = "Queen";
                break;
            case 13:
                aux = "King";
                break;
            default:
                aux = String.valueOf(number);
                break;
        }
        return "Card{" +
                "number=" + aux +
                ", suits='" + SUITS[suits] + '\'' +
                '}';
    }
}
