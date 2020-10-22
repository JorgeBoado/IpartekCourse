package UF2404.Recursos.E03_EstructurasRepetitivas;

/**
 *Mostrar con bucles for anidados las tablas de multiplicar del 0 al 10
 *
 * @author Jorge Boado
 */


public class E02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("-------Tabla del " + i + "----------");
            for (int j = 0; j <= 10; j++) {
                System.out.println("\t\t" + i + "x" + j + "=" + i * j);
            }
        }
    }
}
