package UF2404.Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionSQLite {
    // Creacion de la instancia.
    private static ConexionSQLite mInstance;

    //Conexion
    private Connection mConexion = null;
    private Properties mPropiedades;

    //Constantes de Inicio de sesion
    private static final String DATABASE_DRIVER = "org.sqlite.JDBC";
    private static final String DATABASE_URL = "jdbc:sqlite:G:/CursoIparTek/BBDD/";
    private static final String DATABASE_NAME = "sqlite.db";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "";
//    private static final String MAX_POOL = "250";

    // El constructor privado no permite que se genere un constructor por defecto.
    // (con mismo modificador de acceso que la definicion de la clase)
    private ConexionSQLite() {

    }

    public static ConexionSQLite getInstance() {
        if (mInstance == null) {
            mInstance = new ConexionSQLite();
        }
        return mInstance;
    }
    private Properties getProperties() {
        if (mPropiedades == null) {
            mPropiedades = new Properties();
//            mPropiedades.setProperty("user", USERNAME);
//            mPropiedades.setProperty("password", PASSWORD);
//            mPropiedades.setProperty("MaxPooledStatements", MAX_POOL);
        }
        return mPropiedades;
    }

    //Conexion a MyPHPAdmin Local
    public Connection conectarLocal() {
        if (mConexion == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                mConexion = DriverManager.getConnection(DATABASE_URL, getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("No se ha podido conectar a local.");
                e.printStackTrace();
            }
        }
        return mConexion;
    }

    //Conexion a la base de datos
    public Connection conectar() {
        if (mConexion == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                mConexion = DriverManager.getConnection(DATABASE_URL + DATABASE_NAME, getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("No se ha podido conectar a la base de datos " + DATABASE_NAME);
                e.printStackTrace();
            }
        }
        return mConexion;
    }

    //Desconexion de MyPHPAdmin Local
    public void desconectarLocal() {
        if (mConexion != null) {
            try {
                mConexion.close();
                mConexion = null;
            } catch (SQLException e) {
                System.err.println("No se ha podido desconectar de local.");
                e.printStackTrace();
            }
        }
    }

    //Desconexion de la base de datos
    public void desconectar() {
        if (mConexion != null) {
            try {
                mConexion.close();
                mConexion = null;
            } catch (SQLException e) {
                System.err.println("No se ha podido desconectar de la base de datos.");
                e.printStackTrace();
            }
        }
    }
}
