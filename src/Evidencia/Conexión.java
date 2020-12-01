package Evidencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexión {
    public static Connection connect() {
        Connection conx = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conx = DriverManager.getConnection("jdbc:sqlite:Evidencia/Citas.db");
            System.out.println("conexión establecida");
        } catch (ClassNotFoundException | SQLException e ) {
            System.out.println(e+"  Conexión no establecida");
        }
        return conx;
    }
}
