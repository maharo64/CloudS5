package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getCo() throws  Exception{
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/enchere", "postgres", "root");

    }
}