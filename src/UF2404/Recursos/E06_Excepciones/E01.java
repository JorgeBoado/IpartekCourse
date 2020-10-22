package UF2404.Recursos.E06_Excepciones;

/**
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la división por cero.
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa. Añada excepciones para recoger estas excepciones y avisar del problema al usuario
 *
 * @author Jorge Boado
 */

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        try {
            System.out.print("Introduce un numero a: ");
            a = sc.nextInt();
            System.out.print("Introduce un numero b: ");
            b = sc.nextInt();
            System.out.println("El valor de la division es: " + a / b);
        } catch (java.util.InputMismatchException malImput) {
            System.out.println("No se puede realizar ninguna operacion con letras.");
        } catch (ArithmeticException divisionEnCero) {
            System.out.println("No se puede dividir entre 0");
        }catch  (Exception e){
            System.out.println("Ha habido un fallo");
        }finally {
            sc.close();
        }
    }
}
