package UF2404.Actividades.Actividad03.Modelo.pojo;

import UF2404.Actividades.Actividad03.Modelo.LibroDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Implementacion del DAO.
 *
 * @author Jorge Boado
 */
public class ImplementacionLibroDAO implements LibroDao {
    private static final HashMap<Integer, Libro> hmLibros = new HashMap<>();
    private static ImplementacionLibroDAO mInstance;

    private ImplementacionLibroDAO() {

    }

    public static synchronized ImplementacionLibroDAO getInstance() {
        if (mInstance == null) {
            mInstance = new ImplementacionLibroDAO();
            hmLibros.put(1, new Libro(1, "La piramide roja", 450));
            hmLibros.put(2, new Libro(2, "El trono de fuego", 380));
            hmLibros.put(3, new Libro(3, "La sombra de la serpiente", 413));
            hmLibros.put(4, new Libro(4, "Dark Souls Lore Book", 260));
        }
        return mInstance;
    }

    /**
     * Obtiene todos los libros ordenados Alfabeticamente
     *
     * @return List<Libro>, si no existen libros Lista vacia pero no nula
     */
    @Override
    public List<Libro> getAll() {
        return new ArrayList<>(hmLibros.values());
    }

//    /**
//     * Recupera un libro por su identificador
//     *
//     * @param id int identificador
//     * @return Libro, null si no lo encuentra
//     */
//    @Override
//    public Libro getById(int id) {
//        return null;
//    }

    /**
     * Eliminar un Libro por su identificador
     *
     * @param id int identificador
     * @return true si elimina, false en caso contrario, por ejemplo si no existe el id
     */
    @Override
    public boolean delete(int id) {
        if (checkID(id)) {
            hmLibros.remove(id);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Inserta un nuevo Libro y actuliza su id
     *
     * @param l Libro a crear con id == 0, despues de insertar lo debe actualizar
     * @return true si lo crea, false si no puede, por ejemplo si ya existe el nombre
     */
    @Override
    public boolean insert(Libro l) {
        int idNueva = getAll().get(getAll().size() - 1).getId() + 1;
        l.setId(idNueva);
        try {
            hmLibros.put(idNueva, l);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Comprueba el nombre del libro está disponible.
     *
     * @param s String nombre del libro.
     * @return Boolean, true si está disponible, false si existe el nombre.
     */
    public boolean checkNombre(String s) {
        for (int i :
                hmLibros.keySet()) {
            if (s.equalsIgnoreCase(hmLibros.get(i).getNombre())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Comprueba la ID del libro está disponible.
     *
     * @param id String ID del libro.
     * @return Boolean, false si no existe, true si existe la ID.
     */
    public boolean checkID(int id) {
        for (int i : hmLibros.keySet()) {
            if (id == i) {
                return true;
            }
        }
        return false;
    }
}
