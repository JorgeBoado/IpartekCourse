package UF2404.Recursos.E11_Listas1;

import UF2404.pojo.FootballPlayer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jorge Boado
 */
public class E02 {

    private static final char LOOP_CONDITION = 's';
    private static Scanner sc = new Scanner(System.in);

    /**
     * Genera una lista de jugadores de futbol y los imprime.
     * @param args Argumentos del Main.
     */
    public static void main(String[] args) {
        ArrayList<FootballPlayer> players = new ArrayList<>();

        do {
            players.add(createPlayer());
        } while (askContinue());
        printPlayers(players);
    }

    /**
     * Pide al usuario los datos del jugador por teclado.
     * @return Devuelve un objeto FootballPLayer para añadirlo al ArrayList de players.
     */
    private static FootballPlayer createPlayer() {
        boolean isValid;
        FootballPlayer fp = new FootballPlayer();

        System.out.print("Introduce un jugador: ");
        fp.setName(sc.nextLine());
        do {
            try {
                System.out.print("Introduce su numero de dorsal: ");
                fp.setDorsalNumber(Integer.parseInt(sc.nextLine()));
                isValid = true;
            } catch (Exception e) {
                System.out.println("Introduce un numero.");
                isValid = false;
            }
        } while (!isValid);
        return fp;
    }

    /**
     * Pregunta por pantalla al usuario si desea continuar introduciendo jugadores.
     * @return Devuelve un boolean para continuar preguntando o finalizar el programa.
     */
    private static boolean askContinue() {
        char v;
        do {
            try {
                System.out.println("Desea continuar introduciendo jugadores? Si o No?");
                v = sc.nextLine().toLowerCase().charAt(0);
                if (v == LOOP_CONDITION) {
                    return true;
                }
                if (v == 'n') {
                    return false;
                } else {
                    throw new Exception("Solo tienes que introducir un si o un no.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

    }

    /**
     * Imprime por pantalla los jugadores que recibe del ArrayList.
     * @param p ArrayList de tipo FootballPlayer.
     */
    private static void printPlayers(ArrayList<FootballPlayer> p) {
        System.out.println("Estos son los jugadores introducidos.");
        for (FootballPlayer fp : p) {
            System.out.println(fp.toString());
        }
    }
}

