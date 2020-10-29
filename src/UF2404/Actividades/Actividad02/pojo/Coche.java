package UF2404.Actividades.Actividad02.pojo;

import UF2404.Actividades.Actividad02.Abstract.Vehiculo;

/**
 * Clase de Objeto coche, aqui estan todos los atributos y metodos de el objeto coche.
 *
 * @author Jorge Boado
 */
public class Coche extends Vehiculo {
    private String marca;
    private String modelo;
    private int potencia;
    private int cilindrada;

    /**
     * Constrtuctor vacio de coche.
     */
    public Coche() {
    }

    /**
     * Constructor con todos los atributos de coche usado para el llenado de test.
     *
     * @param matricula  String
     * @param marca      String
     * @param modelo     String
     * @param color      String
     * @param potencia   Integer
     * @param cilindrada Integer
     */
    public Coche(String matricula, String marca, String modelo, String color, int potencia, int cilindrada) {
        this.setMatricula(matricula);
        this.marca = marca;
        this.modelo=modelo;
        this.setColor(color);
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }

    /**
     * Aniade la marca al coche.
     *
     * @param marca String
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Aniade el modelo al coche.
     * @param modelo String
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Aniade la potencia al coche.
     *
     * @param potencia Strting
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * Aniade la cilindrada al coche.
     *
     * @param cilindrada String
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * Manda una String con los datos del coche de una forma legible.
     *
     * @return String con datos del coche.
     */
    @Override
    public String toString() {
        return "+ " + marca + " " + modelo + " " + cilindrada + "cc con " +
                potencia + "CV con matricula " + this.getMatricula() + " color " +
                this.getColor().toLowerCase() + ".";

    }
}
