package UF2404.Actividades.Actividad03.Utility;

import UF2404.Actividades.Actividad03.Modelo.pojo.Libro;

import java.util.Comparator;

/**
 * Class for order by name. It implements the method from Comparator.
 *
 * @author Jorge Boado
 */
public class OrderByName implements Comparator<Libro>
{
    @Override
    public int compare(Libro o1, Libro o2) {
        return o2.getNombre().compareToIgnoreCase(o1.getNombre());
    }
}
