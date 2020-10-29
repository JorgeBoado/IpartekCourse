package UF2404.Recursos.E11_Listas1;

import UF2404.pojo.Students;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una lista de nombres de alumnos, donde se guardaran con strings.
 * Insertar diez nombres de alumnos en la lista
 * Mostrar los diez nombres recorriendo la lista con un foreach
 *
 * @author Jorge Boado
 */
public class E01 {
    private static final int NUMBER_OF_STUDENTS = 10;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Genera un array de 5 estudiantes y los muestra por pantalla.
     *
     * @param args Argumentos Main.
     */
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            askStudent(i);
        }
        pintStudents(students);
    }

    /**
     * Imprime por pantalla los estudiantes que estan en el Array que recibe.
     *
     * @param ss ArrayList de estudiantes.
     */
    private static void pintStudents(ArrayList<Students> ss) {
        for (Students s : ss) {
            System.out.println(s.toString());
        }
    }

    /**
     * Pregunta el nombre del estudiante y lo devuelve pa`ra introducirlo en el Array.
     *
     * @return Devuelve un estudiante.
     */
    private static Students askStudent(int i) {
        do {
            try {
                Students p = new Students();
                System.out.print("Introduce el nombre del " + (i + 1) + "º alumno: ");
                p.setName(sc.nextLine());
                return p;
            } catch (Exception e) {
                System.out.println("Introduce un nombre corerctamente.");

            }
        } while (true);
    }
}
