package UF2404.Recursos.E00_Varios.Perrera;

import UF2404.POJO.Perro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una perrera.
 *
 * @author Jorge Boado
 */
public class Perrera {

    private static final String OPCION1 ="1";
    private static final String OPCION2 ="2";
    private static final String OPCION3 ="3";
    private static final String OPCION_SALIDA ="x";

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Perro> perrera = new ArrayList<>();

    public static void main(String[] args) {
        String menu;
        init();
        do {
            menu();
            menu = sc.nextLine();
            switch (menu) {
                case OPCION1:
                    verPerrera();
                    break;
                case OPCION2:
                    anadirPerro();
                    break;
                case OPCION3:
                    buscarPerro();
                    break;
                case OPCION_SALIDA:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("No es una opcion valida.");
                    break;
            }
        } while (!OPCION_SALIDA.equalsIgnoreCase(menu));
    }

    /**
     * Añadir un perro.
     */
    private static void anadirPerro() {
        Perro p = new Perro();
        System.out.print("Raza del perro: ");
        p.setRaza(sc.nextLine());
        System.out.print("Nombre del perro: ");
        p.setNombre(sc.nextLine());
        System.out.print("Edad del perro: ");
        p.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.print("Esta vacunado? Si o No: ");
        p.setVacunado(sc.nextLine().equalsIgnoreCase("si")||sc.nextLine().equalsIgnoreCase("sí"));
        perrera.add(p);
        System.out.println(p.getNombre() + " se ha añadido a la perrera.");
    }

    /**
     * Busca un perro en la perrera por nombre.
     *
     * @return en caso de no encontrar el perro devuelve un false.
     */

    private static boolean buscarPerro() {
        System.out.println("-----------Perros------------");
        leerAL();
        System.out.print("Que perro quieres adoptar? Escribe el nombre: ");
        String nombre = sc.nextLine();
        for (Perro p : perrera) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Gracias por adoptar a " + p.getNombre() + ".");
                perrera.remove(p);
                return true;
            }
        }
        System.out.println("El perro no se ha encontrado.");
        return false;
    }

    /**
     * Menu perreraCLI
     */

    private static void menu() {
        System.out.println();
        System.out.println("------------Menu--------------");
        System.out.println("1- Ver perros.");
        System.out.println("2- Agregar perro.");
        System.out.println("3- Adoptar perro.");
        System.out.println("X- Salir");
        System.out.print("Elige una opcion: ");
    }

    /**
     * Inicilializa el arrayList para que haya perros en la perrera.
     */

    private static void init() {
        perrera.add(new Perro("Basset hound", "Rasterator", 1, true));
        perrera.add(new Perro("Beagle", "Bruno", 1, true));
        perrera.add(new Perro("Pastor aleman", "Rex", 1, true));
        perrera.add(new Perro("Boerboel", "Hugo", 1, true));
        perrera.add(new Perro("Border collie", "Laila", 1, true));
        perrera.add(new Perro("Boston terrier", "Kira", 1, true));
        perrera.add(new Perro("Pastor australiano", "Rufus", 1, true));
    }

    /**
     * Mostrar perrera.
     */

    private static void verPerrera(){
        System.out.println();
        System.out.println("------Perros en la perrera-------");
        leerAL();
    }
    /**
     * Lee el ArrayList
     */

    private static void leerAL() {
        for (Perro p : perrera) {
            System.out.println(p.toString());
        }
    }
}
