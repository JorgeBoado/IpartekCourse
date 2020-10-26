package UF2404.Utilidades;

import UF2404.Interfaces.Funciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades implements Funciones {

    /**
     * Calcula la letra del DNI a partir de los numeros.
     *
     * @param s Numeros DNI.
     * @return DNI completo.
     * @throws Exception Valores introducidos incorrectos.
     */
    public static String calcularLetraDNI(String s) throws Exception {
        Pattern patron = Pattern.compile("[0-9]{8}");
        Matcher mat = patron.matcher(s);

        if (!mat.matches()) {
            throw new Exception("El valor introducido no es valido.");
        }
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        return s + "" + letras[Integer.parseInt(s) % 23];
    }

    @Override
    public String pedirNombre() {
        return null;
    }

    @Override
    public void imprimirNumeroLoteria(int tipoLoteria) {

    }

    @Override
    public float calcularVueltas(float dineroEntregado, float precioProducto) {
        return 0;
    }

//    @Override
//    public Serie pedirDatosPorConsola() {
//
//        return null;
//    }
}
