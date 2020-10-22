package UF2404.Recursos.E03_EstructurasRepetitivas;

/**
 *Realizar un ejercicio que nos muestre la tabla de multiplicar del 6
 *
 * @author Jorge Boado
 */
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero del que quieras la tabla de multiplicar: ");
        n = sc.nextInt();
        System.out.println("-------Tabla del " + n + "----------");
        for (int i = 0; i <= 10; i++) {
            System.out.println("\t\t" + n + "x" + i + "=" + n * i);
        }
        sc.close();
    }
}
