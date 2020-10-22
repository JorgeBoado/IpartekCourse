package UF2404.Recursos.E03_EstructurasRepetitivas;

/**
 *Realizar la modificación pertinente al ejercicio 4 para que una vez que el usuario haya escogido una de las opciones y muestre la operación, desea continuar? Si escoje la opción si volverá a mostrar el menú, si escoge no, saldrá de la ejecución del programa
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
                default:
                    System.out.println("Valor no valido");
                    break;
            }
            System.out.println("Desea continuar?");
            System.out.println("0-No");
            System.out.println("1-Si");
            System.out.print("Elige una opcion: ");
            menu=sc.nextInt();
        } while (menu!=0);

    }
}
