package UF2404.Recursos.E00_Varios.CardDeck.Abstract;

import UF2404.Recursos.E00_Varios.CardDeck.POJO.Card;

import java.util.ArrayList;

public abstract class CardDeck {
    private ArrayList<Card> CardDeck = new ArrayList<>();

    protected abstract void create();

    protected abstract void print();

    void orderBySuit(){

    }
    void orderByNumbers(){

    }

    public ArrayList<Card> getCardDeck() {
        return CardDeck;
    }

    public void setCardDeck(ArrayList<Card> cardDeck) {
        CardDeck = cardDeck;
    }
}
