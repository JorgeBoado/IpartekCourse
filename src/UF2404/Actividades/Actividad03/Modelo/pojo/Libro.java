package UF2404.Actividades.Actividad03.Modelo.pojo;

/**
 * Clase objeto Libro.
 *
 * @author Jorge Boado
 */
public class Libro {
    private int id;
    private String nombre;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(int id, String nombre, int numeroPaginas) {
        this.id = id;
        this.nombre = nombre;
        this.numeroPaginas = numeroPaginas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Nº" + id + ": " + nombre + ", numero de paginas: " + numeroPaginas + ".";
    }
}
