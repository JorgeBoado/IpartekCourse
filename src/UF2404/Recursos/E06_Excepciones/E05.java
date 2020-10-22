package UF2404.Recursos.E06_Excepciones;

import java.io.File;
import java.io.FileInputStream;

/**
 * Realizar un programa que lance un número aleatorio del 1 al 6. Según el número sacado, se lanzara una excepción u otra de la siguiente lista:
 * •	1: ArithmeticException
 * •	2: NullpointerException
 * •	3: NumberFormatException
 * •	4: SecurityException
 * •	5: NegativeArrayException
 * •	6: IOException
 * Haciendo uso del try y del catch, mostrar un mensaje por pantalla y explicar cuál es la excepción ocurrida. Repetir este proceso de manera indefinida, controlando dichas excepciones y sin dar pie a que el programa se cuelgue
 *
 * @author Jorge Boado
 */
public class E05 {
    public static void main(String[] args) {
        do {
            try {
                Exceptions((int) Math.round(1 + Math.random() * 5));
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e.toString());
//                System.out.println(e.getCause() + " cuz " + e.getMessage());
            }
        } while (true);
    }

    private static void Exceptions(int n) throws Exception {
        System.out.println("Numero " + n);
        switch (n) {
            case 1:
                System.out.println(1 / 0);
                break;
            case 2:
                String s = "a";
                s.charAt(10);
                break;
            case 3:
                int a = Integer.parseInt(null);
                break;
            case 4:
                // - SecurityException
                throw new SecurityException();
//                break;
            case 5:
                // - NegativeArrayException
                break;
            case 6:
                File file = new File("prueba.txt");
                FileInputStream fileInputStream = null;
                fileInputStream = new FileInputStream(file);
                fileInputStream.read();
                break;
            default:
                System.out.println("Que haces aqui?");
                break;
        }
    }
}
