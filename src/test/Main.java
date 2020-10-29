package test;

import java.sql.*;

public class Main {
    public static void main(String[] args){
//        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/sqlite.db");
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:G:/CursoIparTek/BBDD/sqlite.db";
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected to the database");
                DatabaseMetaData dm = conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
                conn.close();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }
}
