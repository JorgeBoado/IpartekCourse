package UF2404.POJO;

public class Persona {

    private static final int MAX_EDAD = 120;
    private static final int MIN_EDAD = 0;

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    public void setEdad(int edad) throws Exception {
        if (edad > MAX_EDAD || edad < MIN_EDAD) {
            throw new Exception("La edad es incorrecta, debe estar comprendida entre " + MIN_EDAD + " y " + MAX_EDAD + ".");
        } else {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
