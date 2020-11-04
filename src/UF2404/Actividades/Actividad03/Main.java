package UF2404.Actividades.Actividad03;

import UF2404.Actividades.Actividad03.Modelo.AppGestion;
import UF2404.Actividades.Actividad03.Modelo.pojo.ImplementacionLibroDAO;
import UF2404.Actividades.Actividad03.Modelo.pojo.Libro;
import UF2404.Actividades.Actividad03.Utility.OrderByName;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Aplicacion de libreria.
 *
 * @author Jorge Boado
 */
public class Main extends AppGestion {
    private static final String NOMBRE_POJO = "libro";
    private static final ImplementacionLibroDAO mDAO = ImplementacionLibroDAO.getInstance();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char aux;
        do {
            pintarMenu(NOMBRE_POJO);
            aux = sc.nextLine().toLowerCase().charAt(0);
            switch (aux) {
                case '1':
                    listar();
                    break;
                case '2':
                    crear();
                    break;
                case '3':
                    eliminar();
                    break;
                case 's':
                    System.out.println("Bye.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (aux != 's');
    }

    /**
     * Lista todos los recursos
     */
    private static void listar() {
        ArrayList<Libro> libros = new ArrayList<>(mDAO.getAll());
        libros.sort(new OrderByName());
        for (Libro l : libros) {
            System.out.println(l.toString());
        }
    }

    /**
     * Pide por pantalla y crea un nuevo recurso
     */
    private static void crear() {
        Libro l = new Libro();
        String aux;
        boolean isValid;
        do {
            System.out.print("Introduce el nombre del libro: ");
            aux = sc.nextLine();
            if (mDAO.checkNombre(aux)) {
                l.setNombre(aux);
                isValid = true;
            } else {
                System.out.println("El nombre ya está cogido por otro libro.");
                isValid = false;
            }
        } while (!isValid);
        do {
            try {
                System.out.print("Introduce el numero de paginas: ");
                l.setNumeroPaginas(Integer.parseInt(sc.nextLine().trim()));
                isValid = true;
            } catch (Exception e) {
                System.out.println("Tienes que introducir un numero de paginas no letras.");
                isValid = false;
            }
        } while (!isValid);
        if (mDAO.insert(l)) {
            System.out.println("Nuevo libro insertado.");
        } else {
            System.out.println("Algo ha fallado.");
        }
    }

    /**
     * Elimina un Recurso
     */
    private static void eliminar() {
        System.out.print("Introduce la ID del libro que quieres borrar: ");
        if (mDAO.delete(Integer.parseInt(sc.nextLine()))) {
            System.out.println("Borrado.");
        } else {
            System.out.println("No existe un libro con esa ID.");
        }
    }
}
