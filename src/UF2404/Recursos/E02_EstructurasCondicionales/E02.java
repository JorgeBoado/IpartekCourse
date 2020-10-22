package UF2404.Recursos.E02_EstructurasCondicionales;

/**
 * Realiza un programa que pida un numero por consola. En caso de que el numero sea mayor que 50, o menor que 0, indicar que el numero introducido no es valido
 *
 * @author Jorge Boado
 */

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux, counter = 0;
        do {
            System.out.print("Introduce un numero por teclado mayor que 0 e inferior a 50: ");
            aux = sc.nextInt();
            if (aux <= 50 && aux >= 0) {
                System.out.println("El numero es valido.");
            } else {
                if (counter < 3) {
                    System.out.println("Numero invalido.");
                } else {
                    System.out.println("Lee el enunciado.");
                }
            }
        } while (aux > 50 || aux < 0);
sc.close();
    }
}
