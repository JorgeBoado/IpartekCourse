package UF2404.Recursos.E00_Varios.PerreraSQLite.Modelo;


import UF2404.Recursos.E00_Varios.PerreraSQLite.Modelo.pojo.Perro;

import java.util.ArrayList;

public class PerroDAOArrayList implements PerroDAO {

    private final ArrayList<Perro> lista = new ArrayList<>();
    private int indice;
    private static PerroDAOArrayList INSTANCE = null;


    private PerroDAOArrayList() {
        super();
        lista.add(new Perro(1, "Bubba"));
        lista.add(new Perro(2, "Laika"));
        lista.add(new Perro(3, "Rintintin"));
        lista.add(new Perro(4, "goffy"));
        indice = 5;

    }

    public static synchronized PerroDAOArrayList getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new PerroDAOArrayList();
        }

        return INSTANCE;
    }


    @Override
    public ArrayList<Perro> listar() {
        return lista;
    }

    @Override
    public Perro recuperar(int id) {
        return null;
    }

    @Override
    public Perro crear(Perro p) {

        p.setId(indice);
        lista.add(p);
        indice++;

        return p;
    }

    @Override
    public Perro modificar(Perro p) throws Exception {
        int id = p.getId();

        Perro pBuscar = recuperar(id);
        if (pBuscar == null) {
            throw new Exception("No existe perro con id=" + id);
        }

        String nombre = p.getNombre();
        for (Perro perro : lista) {
            if (nombre.equals(perro.getNombre()) &&
                    id != perro.getId()
            ) {
                throw new Exception("El nombre ya existe" + nombre);
            }
        }

        eliminar(id);
        lista.add(p);

        return p;
    }

    @Override
    public boolean eliminar(int id) {
        return false;
    }

}
