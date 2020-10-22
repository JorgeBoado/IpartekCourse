package UF2404.Recursos.E06_Excepciones;

import UF2404.POJO.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar una clase personalizada llamada ExcepcionListaNegra que extienda la clase Exception
 * Dicha clase constara con un atributo de tipo int llamado codigoError, asi como un constructor completo solamente (sin métodos get ni set ni constructores vacíos). De manera adicional se implementaran los métodos abstractos heredados de la clase, en este caso getMessage().
 * getMessage comprobara el valor del atributo codigoError con una sentencia switch, mostrando el mensaje adecuado al código de error, siguiendo la siguiente tabla:
 * 1.	Persona demasiado baja (altura menor de 1.60m)
 * 2.	Persona demasiado alta (altura mayor de 2.10m)
 * 3.	Persona en exceso delgada (peso inferior a 35kg)
 * 4.	Persona en exceso obesa (peso superior a 160kg)
 * 5.	Persona con los pies planos
 * En el programa principal, se creara una lista de Pacientes y se solicitara los datos de cada uno de ellos por teclado. Introducir 4 pacientes dentro de los parámetros de salud aceptables e intentar meter 2 de ellos con datos que no permitan las excepciones (por ejemplo peso =225kg y altura = 1.20m)
 *
 * @author Jorge Boado
 */

//NOTTODO -Ejercicio 06 Falta por especificar

public class E06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Paciente> p = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Paciente p1 = new Paciente();
        }
    }
}
