package UF2404.Recursos.E02_EstructurasCondicionales;

/**
 *Mostrar al usuario el siguiente menú:
 * Por favor escoja una opción:
 * •	A: calcular área de un triangulo
 * •	B: calcular el área de un cuadrado
 * •	C: calcular el área de un circulo
 * •	D: calcular el área de un pentágono
 * Realizad las operaciones adecuadas indicadas en cada categoría. En caso de que no se escoja una opción adecuada, se mostrara un mensaje de error.
 * No deberá realizarse este menú en bucle
 *
 * @author Jorge Boado
 */
import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        double aux, aux1;
        do {
            System.out.println("------------Menu--------------");
            System.out.println("1- calcular area de un triangulo");
            System.out.println("2- calcular area de un cuadrado");
            System.out.println("3- calcular area de un circulo");
            System.out.println("4- calcular area de un pentagono");
            System.out.println("0- Salir");
            System.out.print("Elige una opcion: ");
            menu=sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Introduce la longitud de la base: ");
                    aux=sc.nextDouble();
                    System.out.print("Introduce la altura: ");
                    aux1=sc.nextDouble();
                    System.out.println((aux*aux1)/2+" es el area del triaungulo.");
                    break;
                case 2:
                    System.out.print("Introduce la longitud del lado: ");
                    aux=sc.nextDouble();
                    System.out.println(Math.pow(aux, 2)+" es el area del cuadrado.");
                    break;
                case 3:
                    System.out.print("Introduce la longitud del radio: ");
                    aux=sc.nextDouble();
                    System.out.println(Math.PI*Math.pow(aux, 2)+" es el area del circulo.");
                    break;
                case 4:
                    System.out.print("Introduce la longitud de la apotema: ");
                    aux=sc.nextDouble();
                    System.out.print("Introduce la longitud del lado: ");
                    aux1=sc.nextDouble();
                    System.out.println(((aux*5)*aux1)/2+" es el area del pentagono.");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor no valido");
                    break;
            }
        } while (menu!=0);

    }
}
