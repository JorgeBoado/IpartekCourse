package UF2404.Recursos.E12_Listas2;

import UF2404.pojo.BoletoEuro;

import java.util.Arrays;

/**
 * Creates a winner lottery number.
 * All the creation is in the Object.
 *
 * @author Jorge Boado
 */
public class E02 {
    public static void main(String[] args) {
        BoletoEuro b = new BoletoEuro();
        System.out.println("Los numeros de la loteria son: " + Arrays.toString(b.getWinner()));
    }
}
