package UF2404.Actividades.Actividad02.Main;

import UF2404.Actividades.Actividad02.pojo.Coche;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Aplicacion de Coches actividad 02.
 *
 * @author Jorge Boado
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Coche> concesionario = new ArrayList<>();
        char aux = 0;

        do {
            menu();
            try {
                aux = sc.nextLine().toLowerCase().charAt(0);
            } catch (Exception e) {
            }
            switch (aux) {
                case '1':
                    insertCar(concesionario);
                    break;
                case '2':
                    printArray(concesionario);
                    break;
                case 't':
                    init(concesionario);
                    break;
                case 's':
                    if (concesionario.size() > 0) {
                        printArray(concesionario);
                    }
                    System.out.println("***********FIN***********");
                    break;
                default:
                    System.out.println("No es una opcion valida.");
                    break;
            }
        } while (aux != 's');
    }

    /**
     * Pide al usuario datos por pantalla para crear un coche y lo introduce en el ArrayList.
     *
     * @param cs ArrayList tipo Coches.
     */
    private static void insertCar(ArrayList<Coche> cs) {
        Pattern plate = Pattern.compile("([A-Z]{1,2}[0-9]{4}[A-Z]{2})|([0-9]{4}[A-Z]{3})");
        String aux;
        boolean isValid;
        Coche c = new Coche();
        System.out.print("\n");
        do {
            try {
                System.out.print("Introduce la matricula del coche: ");
                aux = sc.nextLine().trim().toUpperCase();
                Matcher mat = plate.matcher(aux);
                if (mat.matches()) {
                    c.setMatricula(aux);
                    isValid = true;
                } else {
                    throw new Exception("La matricula " + aux + " no es valida.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                isValid = false;
            }
        } while (!isValid);
        System.out.print("Introduce la marca del coche: ");
        c.setMarca(sc.nextLine());
        System.out.print("Introduce el modelo del coche: ");
        c.setModelo(sc.nextLine());
        System.out.print("Introduce el color del coche: ");
        c.setColor(sc.nextLine());
        do {
            try {
                System.out.print("Introduce los caballos del coche: ");
                c.setPotencia(Math.abs(Integer.parseInt(sc.nextLine())));
                isValid = true;
            } catch (Exception e) {
                System.out.println("Introduce unicamente el numero de caballos que tiene.");
                isValid = false;
            }
        } while (!isValid);
        do {
            try {
                System.out.print("Introduce la cilindrada del coche: ");
                c.setCilindrada(Math.abs(Integer.parseInt(sc.nextLine())));
                isValid = true;
            } catch (Exception e) {
                System.out.println("Introduce el numero entero de la cilindrada que tiene.");
                isValid = false;
            }
        } while (!isValid);
        System.out.println("\nProbamos el coche.");
        c.arrancar();
        c.parar();
        cs.add(c);
    }

    /**
     * Imprime todos los coches del concesionario por pantalla en caso de que haya coches.
     *
     * @param cs Arralist de tipo Coche.
     */
    private static void printArray(ArrayList<Coche> cs) {
        System.out.println("**************CONCESIONARIO**************");
        if (cs.size() > 0) {
            for (Coche c : cs) {
                System.out.println(c.toString());
            }
        } else {
            System.out.println("No hay ningun coche en stock.");
        }
    }

    /**
     * Introduce unos valores en el ArraList concesionario para que no está vacio.
     * Para testear rapido.
     *
     * @param cs ArrayList tipo Coche.
     */
    private static void init(ArrayList<Coche> cs) {
        cs.add(new Coche("0000AAA", "Audi", "A4", "Blanco", 150, 2000));
        cs.add(new Coche("BI1234AZ", "BMW", "320d", "Negro", 150, 2000));
        cs.add(new Coche("0002AAA", "Mercedes", "CLA250", "Gris", 150, 2000));
        cs.add(new Coche("0003AAA", "Seat", "Ibiza", "Azul", 150, 2000));
        cs.add(new Coche("0004AAA", "Lancia", "Delta", "Verde", 150, 2000));
    }

    /**
     * Menu de la aplicacion.
     */
    private static void menu() {
        System.out.println("\n----------Menu---------");
        System.out.println("1- Introducir un coche.");
        System.out.println("2- Mostrar concesionario.");
        System.out.println("S- Salir");
        System.out.print("Elige una de las opciones: ");
    }
}
