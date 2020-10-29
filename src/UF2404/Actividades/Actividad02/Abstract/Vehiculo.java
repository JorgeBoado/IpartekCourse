package UF2404.Actividades.Actividad02.Abstract;

import UF2404.Actividades.Actividad02.Interfaces.IConducible;

/**
 * Clase abstracta de Vehiculo que tiene unos atributos generales.
 *
 * @author Jorge Boado
 */
public abstract class Vehiculo implements IConducible {
    private String color;
    private String matricula;

    /**
     * Envia el color del coche.
     *
     * @return String con el color del coche.
     */
    public String getColor() {
        return color;
    }

    /**
     * Aniade el color al coche.
     *
     * @param color String con el color del coche.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Envia la matrocula del coche.
     *
     * @return String con la matricula del coche.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Aniade la matricula al coche.
     *
     * @param matricula String con la matrocula del coche.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Metodo para comprobar que el coche arranca.
     */
    @Override
    public void arrancar() {
        System.out.println("Parece que el coche arranca.");
    }

    /**
     * Metodo para comprobar que el coche para.
     */
    @Override
    public void parar() {
        System.out.println("Se apaga correctamente.");
    }
}
