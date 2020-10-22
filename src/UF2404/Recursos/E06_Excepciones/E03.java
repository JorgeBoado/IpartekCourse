package UF2404.Recursos.E06_Excepciones;

import java.util.Scanner;

/**
 * Realice un método que reciba como argumento un String y un número y muestre la letra de la posición indicada. Llámelo pasando como parámetro  un String sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch, que en caso de producirse una excepción por un paso de parámetros a null, no acabe con la ejecución del programa.
 * Así mismo, se controlara también que si el numero pasado es mayor que el tamaño del string, capturara el error y nos solicitara meter un numero valido, indicándonos los valores en los que puede estar comprendido (para este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla no es una maravilla”)
 *
 * @author Jorge Boado
 */
public class E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        int n;
        try {
            System.out.print("Introduce un nombre: ");
            s = sc.nextLine();
            do {
                System.out.print("Introduce la posición de la letra que quieres: ");
                n = sc.nextInt();
            } while (n > s.length());
            System.out.println("La letra seleccionada es: "+calcularPosivion(s, n));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static char calcularPosivion(String s, int n) throws Exception {
        if (s == null) {
            throw new Exception("El texto introducido es nulo.");
        }
        if (n > s.length()) {
            throw new Exception("El numero introducido es mayor a la longitud del texto.");
        }
        return s.charAt(n - 1);
    }
}
