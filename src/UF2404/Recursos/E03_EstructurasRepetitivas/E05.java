package UF2404.Recursos.E03_EstructurasRepetitivas;

/**
 *
 *
 * @author Jorge Boado
 */
import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[8];
        int aux;
        for(int i=0; i<notas.length;i++){
            System.out.print("Introduce la nota del alumno "+ (i+1)+":");
            notas[i]=sc.nextInt();
            System.out.println("Deseas continuar introduciendo notas?");
            System.out.println("0-No");
            System.out.print("1-Si");
            System.out.println("Elige una opcion: ");
            aux = sc.nextInt();
            if(aux==0){break;}
        }
    }
}
