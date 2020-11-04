package UF2404.Actividades.Actividad03.Modelo;

public abstract class AppGestion {

    protected static final String OP_LISTAR = "1";
    protected static final String OP_CREAR = "2";
    protected static final String OP_ELIMINAR = "3";
    //	protected static final String OP_MODIFICAR = "4";
    protected static final String OP_SALIR = "s";

    /**
     * Se encraga de pintar las pociones del menu.
     *
     * @param nombrePojo nombre del recurso que se gestiona en esta App
     */
    protected static void pintarMenu(final String nombrePojo) {

        System.out.println("************************************");
        System.out.println(" " + OP_LISTAR + ".- Listar todos los " + nombrePojo + "s.");
        System.out.println(" " + OP_CREAR + ".- Crear un " + nombrePojo + ".");
        System.out.println(" " + OP_ELIMINAR + ".- Dar de baja un " + nombrePojo + ".");
//		System.out.println(" " + OP_MODIFICAR + ".- Editar un " + nombrePojo);
//		System.out.println(" etc etc ...");
        System.out.println(" ");
        System.out.println(" " + OP_SALIR + " - Salir");
        System.out.println("************************************");

    }

}
