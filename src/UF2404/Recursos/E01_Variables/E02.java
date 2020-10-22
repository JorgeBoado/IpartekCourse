package UF2404.Recursos.E01_Variables;

/**
 *  Realizar una pequeña calculadora. Para ello se crearan 10 variables de distintos tipos numéricos. Una vez creadas dichas variables y asignadas desde código valores (se recomienda valores entre -10 y 10) realizar las siguientes operaciones:
 * •	La suma de todos los números
 * •	La resta de todos los números
 * •	La media de todos los números
 *
 * @author Jorge Boado
 */
public class E02 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 3;
        float n4 = 0.5f, n5 = 1.5f, n6 = 2.5f;
        double n7 = 0.3, n8 = 1.2, n9 = 3.1, n0 = 0.9;

        System.out.println("Suma: "+ (n1+n2+n3+n4+n5+n6+n7+n8+n9+n0));
        System.out.println("Resta: "+ (n1-n2-n3-n4-n5-n6-n7-n8-n9-n0));
        System.out.println("Media: "+ (n1+n2+n3+n4+n5+n6+n7+n8+n9+n0)/10);
    }

}
