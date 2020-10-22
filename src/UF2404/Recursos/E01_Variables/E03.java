package UF2404.Recursos.E01_Variables;

/**
 *Realizar un programa que tenga 2 variables enteras, dividendo y divisor. Meterle valores  enteros y positivos. Realizar la operación división y mostrar el resultado en pantalla
 * Repetir el mismo código con estas variaciones: entero y real, real y entero, real y real
 * Por ultimo, intentar dividir en los cuatro casos anteriores entre 0 y mostrar el resultado en pantalla
 *
 * @author Jorge Boado
 */
public class E03 {
    public static void main(String[] args) {

        int dividendo = 3, divisor = 2;
        System.out.println("Entero/Entero: 3/2= " + dividendo / divisor);
        System.out.println("Entero/Real: 3/Pi= " + (dividendo / Math.PI));
        System.out.println("Real/Entero: Pi/2= " + (Math.PI / divisor));
        System.out.println("Real/Real: Pi/(2/3)= " + (Math.PI / (2 / 3)));

        System.out.println("----------------------------------------");
        System.out.println("Ahora entre 0");
//        System.out.println("Entero/Entero: 3/2= " + (dividendo / divisor) / 0);
//        System.out.println("Entero/Real: 3/Pi= " + ((dividendo / Math.PI) / 0));
//        System.out.println("Real/Entero: Pi/2= " + ((Math.PI / divisor) / 0));
//        System.out.println("Real/Real: Pi/(2/3)= " + ((Math.PI / (2 / 3)) / 0));
        System.out.println(10.10f / 0);

    }
}
