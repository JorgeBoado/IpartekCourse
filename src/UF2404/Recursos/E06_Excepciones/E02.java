package UF2404.Recursos.E06_Excepciones;

import java.util.Scanner;

/**
 * Realice un programa que nos solicite por teclado dos números, y leerlos usando la clase Scanner mediante la función nextLine().
 * Transformar ambos strings a números enteros usando la siguiente sentencia Integer.parseInt(numeroLeido). Agrupar el código entre un bloque try catch y procesar para que no se produzca una interrupción y finalización del programa si alguno de los números leídos no puede convertirse, retomando el control en el punto del fallo, hasta que se solucione
 *
 * @author Jorge Boado
 */
public class E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2;
        boolean isValid = false, validN1 = false;
        do {
            try {
                if (!validN1) {
                    System.out.print("Introduce el primer numero: ");
                    n1 = Integer.parseInt(sc.nextLine());
                    validN1 = true;
                }
                System.out.print("Introduce el segundo numero: ");
                n2 = Integer.parseInt(sc.nextLine());
                System.out.println("Los numeros son " + n1 + " y " + n2);
                isValid = true;
            } catch (Exception e) {
                System.out.println("Error, introduce un numero.");
            }
        } while (!isValid);
        sc.close();
    }
}
