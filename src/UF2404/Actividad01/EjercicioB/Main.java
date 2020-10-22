package UF2404.Actividad01.EjercicioB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Esta clase calcula la letra de un DNI introducida por el usuario y convierte de centimetros a pulgadas.
 * Lo hace desde CLI.
 *
 * @author Jorge Boado
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    private static final String OPCION1 = "1";
    private static final String OPCION2 = "2";
    private static final String OPCIONS = "s";

    public static void main(String[] args) {
        String s;
        do {
            menu();
            s = sc.nextLine().toLowerCase();
            switch (s) {
                case OPCION1:
                    calcularDNI();
                    break;
                case OPCION2:
                    calcularDistancia();
                    break;
                case OPCIONS:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("No es una opcion valida.");
                    break;
            }
        } while (!s.equalsIgnoreCase(OPCIONS));
        sc.close();
    }

    /**
     * Pregunta al usuario por una distancia en cm y las convierte a pulgadas.
     */
    private static void calcularDistancia() {
        double aux;
        boolean isValid;
        do {
            try {
                System.out.print("Introduce una cantidad de centimetros para pasarla a pulgadas: ");
                aux = Double.parseDouble(sc.nextLine().replace(',', '.'));
                System.out.println(aux + "cm = " + aux * 0.3936996 + " Pulgadas");
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Tienes que introducir un numero.");
                isValid = false;
            }
        } while (!isValid);

    }

    /**
     * Pregunta al usuario por los digitos de un DNI y pasa la informacion a otro funcion.
     */
    private static void calcularDNI() {
        boolean isValid;
        do {
            try {
                System.out.print("Introduce un numero de DNI:");
                System.out.println("El DNI completo es: " + calcularLetraDNI(sc.nextLine()) + ".");
                isValid = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);
    }

    /**
     * Esta funcion recibe una String de 8 digitos y calcula la letra de DNI correspondiente.
     * @param s Numero de DNI 8 digitos-
     * @return DNI completo con letra.
     * @throws Exception Parametros incorrectos. Siempre que no sean 8 digitos salta.
     */
    public static String calcularLetraDNI(String s) throws Exception {
        Pattern patron = Pattern.compile("[0-9]{8}");
        Matcher mat = patron.matcher(s);

        if (!mat.matches()) {
            throw new Exception("El valor introducido no es valido.");
        }
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        return s + "" + letras[Integer.parseInt(s) % 23];
    }

    /**
     * Este metodo tiene como funcion el mostrar el menu de la aplicacion.
     */
    private static void menu() {
        System.out.println("----------Menu---------");
        System.out.println("1- Calcular letra DNI.");
        System.out.println("2- Cualcular de cm a pulgadas.");
        System.out.println("S - Salir");
        System.out.print("Elige una de las opciones: ");
    }
}
