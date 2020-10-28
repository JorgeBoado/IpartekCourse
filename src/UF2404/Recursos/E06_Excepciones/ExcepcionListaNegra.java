package UF2404.Recursos.E06_Excepciones;

//NOTTODO -Ejercicio 06 Falta por especificar

/**
 * @author Jorge Boado
 */
public class ExcepcionListaNegra extends Exception {
    private final int codigoError;

    public ExcepcionListaNegra(String message, int codigoError) {
        super(message);
        this.codigoError = codigoError;
    }

    @Override
    public String getMessage() {
        switch (this.codigoError) {
            case 1:
                return "Persona demasiado baja (altura menor de 1.60m)\n";
            case 2:
                return "Persona demasiado alta (altura mayor de 2.10m)\n";
            case 3:
                return "Persona en exceso delgada (peso inferior a 35kg)\n";
            case 4:
                return "Persona en exceso obesa (peso superior a 160kg)\n";
            case 5:
                return "Persona con los pies planos\n";
            default:
                return super.getMessage();
        }

    }
}
