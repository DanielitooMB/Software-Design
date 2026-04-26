/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.limonada.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class DbConnection {
    
    String url      = "jdbc:mysql://switchback.proxy.rlwy.net:29928/railway";
    String user     = "root";
    String password = "mYVaCBuvhcEjSPHCZCGMUvRoVVGHyErO";
    String driver   = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Connection conected() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(DbConnection.class.getName())
                  .log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return cx;
    }
}
