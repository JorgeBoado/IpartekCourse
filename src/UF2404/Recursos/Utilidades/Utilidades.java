package UF2404.Recursos.Utilidades;

public class Utilidades {

    /**
     * Calcula la letra del DNI a partir de los numeros.
     *
     * @param s Numeros DNI.
     * @return DNI completo.
     * @throws Exception Valores introducidos incorrectos.
     */
    public static String calcularLetraDNI(String s) throws Exception {
        if (s == null || s.length() != 8) {
            throw new Exception("El valor introducido no es valido.");
        }
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        return s + "" + letras[Integer.parseInt(s) % 23];
    }
}
