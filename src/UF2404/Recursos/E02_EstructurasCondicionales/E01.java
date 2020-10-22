package UF2404.Recursos.E02_EstructurasCondicionales;

/**
 *Realizar un programa que realice la siguiente funcionalidad
 * Se crearan 5 variables enteras con los nombres a, b, c, d y e con los valores 6, 8, 0, 8 y 9
 * •	Comparar las variables a y c, indicar por consola cual es mayor
 * •	Indicar cual de las variables es la que tiene menor valor y la de mayor valor
 * •	Compara las variables b y d y comprueba si son iguales
 * •	Comprobar si se puede realizar la división de a/c si no se puede realizar indicarlo, en caso contrario realizar la división
 *
 * @author Jorge Boado
 */
public class E01 {
    public static void main(String[] args) {
        int a=6,b=8,c=0,d=8,e=9;

        System.out.println("1- "+ Math.max(a, c));
        System.out.println("2- Mayor = "+ mayor(a,b,c,d,e)+", Menor = "+menor(a,b,c,d,e));
        System.out.println("3- Son iguales b y d? "+ (b==d));
        System.out.println("4- a/c = No se puede dividir entre 0");
    }
    public static int mayor(int a, int s,int d,int f,int g){
        int[] array = {a,s,d,f,g};
        int max=array[0];
        for(int i =0;i<array.length-1;i++){
            max=Math.max(max, array[i+1]);
        }
        return max;
    }

    public static int menor(int a, int s,int d,int f,int g){
        int[] array = {a,s,d,f,g};
        int min=array[0];
        for(int i =0;i<array.length-1;i++){
            min=Math.min(min, array[i+1]);
        }
        return min;
    }
}
