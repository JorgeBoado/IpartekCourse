package UF2404.Recursos.E06_Excepciones;

import UF2404.POJO.Persona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea una clase Persona con los atributos nombre y edad. En el método setEdad lanzar una excepción si la edad introducida es menor que 0 o mayor que 120.
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso del constructor vacío, y lea los datos por teclado y los asigne a los objetos creados. Solo introducirá las personas en la lista si están en el rango de edad indicado, comprobándolo mediante el uso de excepciones
 *
 * @author Jorge Boado
 */
public class E04 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isValid;
        for (int i = 0; i < 6; i++) {
            Persona p = new Persona();
            System.out.print("Introduce el nombre de la persona: ");
            p.setNombre(sc.nextLine());
            do {
                try {
                    System.out.print("Introduce la edad de la persona: ");
                    p.setEdad(Integer.parseInt(sc.nextLine()));
                    isValid = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    isValid = false;
                }
            } while (!isValid);
            personas.add(p);
            System.out.println(personas.get(i).getNombre() + " ha sido agregado.");
        }
    }
}
