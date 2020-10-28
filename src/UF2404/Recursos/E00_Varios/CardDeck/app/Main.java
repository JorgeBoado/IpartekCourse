package UF2404.Recursos.E00_Varios.CardDeck.app;

import UF2404.Recursos.E00_Varios.CardDeck.POJO.PokerDeck;
import UF2404.Recursos.E00_Varios.CardDeck.POJO.SpanishDeck;
import UF2404.Utilidades.ConsoleColors;

/**
 * App for show, disorder and order Poker card deck and Spanish card deck.
 *
 * @author Jorge Boado
 */
public class Main {

    /**
     * Main method starts the app.
     *
     * @param args Main arguments.
     */
    public static void main(String[] args) {
        System.out.println(ConsoleColors.RED_UNDERLINED + "**************Poker deck****************" + ConsoleColors.RESET);
        PokerDeck pd = new PokerDeck();
        System.out.println(ConsoleColors.GREEN_BOLD + "------------OrderByNumber------------" + ConsoleColors.RESET);
        pd.orderByNumbers(pd.getCardDeck());
        pd.print(pd.getCardDeck());
        System.out.println(ConsoleColors.GREEN_BOLD + "------------Shuffle deck------------" + ConsoleColors.RESET);
        pd.shuffle(pd.getCardDeck());
        pd.print(pd.getCardDeck());
        System.out.println(ConsoleColors.GREEN_BOLD + "------------OrderBySuits------------" + ConsoleColors.RESET);
        pd.orderBySuit(pd.getCardDeck());
        pd.print(pd.getCardDeck());
        System.out.println();
        System.out.println(ConsoleColors.RED_UNDERLINED + "**************Spanish deck****************" + ConsoleColors.RESET);
        SpanishDeck sd = new SpanishDeck();
        System.out.println(ConsoleColors.GREEN_BOLD + "------------OrderByNumber------------" + ConsoleColors.RESET);
        sd.orderByNumbers(sd.getCardDeck());
        sd.print(sd.getCardDeck());
        System.out.println(ConsoleColors.GREEN_BOLD + "------------Shuffle deck------------" + ConsoleColors.RESET);
        sd.shuffle(sd.getCardDeck());
        sd.print(sd.getCardDeck());
        System.out.println(ConsoleColors.GREEN_BOLD + "------------OrderBySuits------------" + ConsoleColors.RESET);
        sd.orderBySuit(sd.getCardDeck());
        sd.print(sd.getCardDeck());
    }
}
