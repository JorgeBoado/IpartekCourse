package UF2404.Actividad01.EjercicioA;

import java.util.Scanner;

/**
 * Esta clase calcula de nota media, maxima y minima de una clase de 5 alumnos.
 * El usuario ha de ir introduciendo las notas a mano por CLI.
 *
 * @author Jorge Boado
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    private static final int NUMERO_DE_ALUMNOS = 5;

    public static void main(String[] args) {
        double[] numbers;
        numbers = askNumbers();
        calculate(numbers);
        sc.close();
    }

    /**
     * Pregunta al usuario por las notas de los alumnos.
     * @return devuelve un array de double con todas las notas de los alumnos.
     */
    private static double[] askNumbers() {
        double[] n = new double[NUMERO_DE_ALUMNOS];
        for (int i = 0; i < n.length; i++) {
            boolean aux;
            do {
                try {
                    System.out.print("Introduce la " + (i + 1) + "º nota: ");
                    n[i] = Double.parseDouble(sc.nextLine().replace(',', '.'));
                    aux = false;
                } catch (Exception e) {
                    System.out.println("Ese dato no es valido.");
                    aux = true;
                }
            } while (aux);
        }
        return n;
    }

    /**
     * Calcula el numero medio, minimo y maximo del array recibido por parametros.
     * @param n Array tipo double con las notas de los alumnos.
     */
    private static void calculate(double[] n) {
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
    }
}
