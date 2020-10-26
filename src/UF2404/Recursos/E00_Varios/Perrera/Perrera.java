package UF2404.Recursos.E00_Varios.Perrera;

import UF2404.POJO.Dog;

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
    private static ArrayList<Dog> perrera = new ArrayList<>();

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
        Dog p = new Dog();
        System.out.print("Raza del perro: ");
        p.setBreed(sc.nextLine());
        System.out.print("Nombre del perro: ");
        p.setName(sc.nextLine());
        System.out.print("Edad del perro: ");
        p.setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Esta vacunado? Si o No: ");
        p.setVaccinated(sc.nextLine().equalsIgnoreCase("si")||sc.nextLine().equalsIgnoreCase("sí"));
        perrera.add(p);
        System.out.println(p.getName() + " se ha añadido a la perrera.");
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
        for (Dog p : perrera) {
            if (p.getName().equalsIgnoreCase(nombre)) {
                System.out.println("Gracias por adoptar a " + p.getName() + ".");
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
        perrera.add(new Dog("Basset hound", "Rasterator", 1, true));
        perrera.add(new Dog("Beagle", "Bruno", 1, true));
        perrera.add(new Dog("Pastor aleman", "Rex", 1, true));
        perrera.add(new Dog("Boerboel", "Hugo", 1, true));
        perrera.add(new Dog("Border collie", "Laila", 1, true));
        perrera.add(new Dog("Boston terrier", "Kira", 1, true));
        perrera.add(new Dog("Pastor australiano", "Rufus", 1, true));
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
        for (Dog p : perrera) {
            System.out.println(p.toString());
        }
    }
}
