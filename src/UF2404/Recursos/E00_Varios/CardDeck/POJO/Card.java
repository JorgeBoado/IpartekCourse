package UF2404.Recursos.E00_Varios.CardDeck.POJO;

public class Card {
    private int number;
    private String suits;

    public Card() {
    }

    public Card(int number, String suits) {
        this.number = number;
        this.suits = suits;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
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
                ", suits='" + suits + '\'' +
                '}';
    }
}
