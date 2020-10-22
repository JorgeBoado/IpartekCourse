package UF2404.POJO;

public class Perro {
    private String raza;
    private String nombre;
    private int edad;
    private boolean vacunado;

    public Perro() {
    }

    public Perro(String raza, String nombre, int edad, boolean vacunado) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return nombre +" ==> "+
                " Raza: " + raza +
                ", edad: " + edad +" año(s)"+
                ", " + (vacunado?"si":"no") +" esta vacunado.";
    }
}
