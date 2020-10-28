package UF2404.Recursos.E12_Listas2;

import UF2404.Utilidades.ConsoleColors;
import UF2404.Utilidades.CustomException;

import java.util.Scanner;

/**
 * @author Jorge Boado
 */
public class E01 {
    private static final String TEMP_EXCEPTION = "TEMP_EXCEPTION";

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] temps = new double[8];
        askTemp(temps);
        getData(temps);
    }

    /**
     * Receive an array and calculate the average, max, min temps and calculate the difference from average with the min
     * and max and the difference between the min and max.
     * @param n Double array.
     */
    private static void getData(double[] n) {
        double n1 = n[0];
        double n2 = n[0];
        double avg = n[0];

        for (int i = 1; i < n.length; i++) {
            n1 = Double.max(n1, n[i]);
            n2 = Double.min(n2, n[i]);
            avg = avg + n[i];
        }
        System.out.println("La media de las notas introducidas es: " + (avg / n.length));
        System.out.println("La nota maxima es: " + n1);
        System.out.println("La nota minima es: " + n2);
        System.out.println("La maxima esta " + (n1 - (avg / n.length)) + "ºC por encima de la media.");
        System.out.println("La minima esta " + ((avg / n.length) - n2) + "ºC por debajo de la media.");
        System.out.println("La diferencia entre la temperatura maxima y la minima es de: " + (n2 - n1) + "ºC.");

    }

    /**
     * Ask the user thought the screen for eight temps and saves in the array.
     * @param temps Double array.
     */
    private static void askTemp(double[] temps) {
        boolean isValid;
        double aux;
        for (int i = 0; i < temps.length; i++) {
            do {
                try {
                    System.out.print("Introduce una temperatura comprendida entre -90ºC y 75ºC: ");
                    aux = Double.parseDouble(sc.nextLine().replace(',', '.'));
                    if (aux < -90 || aux > 75) {
                        throw new CustomException(TEMP_EXCEPTION, "La temperatura debe estar comprendida entre -90ºC y 75ºC.");
                    }
                    temps[i]=aux;
                    isValid = true;
                } catch (CustomException e) {
                    System.out.println(ConsoleColors.RED_BOLD + e.getMessage() + ConsoleColors.RESET);
                    isValid = false;
                } catch (NumberFormatException e) {
                    System.out.println(ConsoleColors.GREEN_BOLD + "Tienes que introducir un numero, no una letra.." + ConsoleColors.RESET);
                    isValid = false;
                }
            } while (!isValid);
        }
    }
}
