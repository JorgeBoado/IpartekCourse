package UF2404.Recursos.E02_EstructurasCondicionales;

/**
 *Pedir por teclado al usuario que introduzca una distancia en cm
 * Una vez introducida, se solicitará que escoja a que unidad se van a convertir, introduciendo la opción por teclado
 * •	A convertir a metros
 * •	B: convertir a pulgadas
 * •	C: convertir a pies
 * •	D:convertir a yardas
 *
 * @author Jorge Boado
 */
import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad de cm: ");
        int aux = sc.nextInt();
        int menu;
        do {
            System.out.println("------------Menu--------------");
            System.out.println("1- Convertir a Metros");
            System.out.println("2- Convertir a Pulgadas");
            System.out.println("3- Convertir a Pies");
            System.out.println("4- Convertir a Yardas");
            System.out.println("0- Salir");
            System.out.print("Elige una opcion: ");
            menu=sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println(aux+"cm = "+aux*0.01+" Metros");
                    break;
                case 2:
                    System.out.println(aux+"cm = "+aux*0.3936996+" Pulgadas");
                    break;
                case 3:
                    System.out.println(aux+"cm = "+aux*0.0328083+" Pies");
                    break;
                case 4:
                    System.out.println(aux+"cm = "+aux*0.0109361+" Yardas");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor no valido");
                    break;
            }
        } while (menu!=0);
sc.close();
    }
}
