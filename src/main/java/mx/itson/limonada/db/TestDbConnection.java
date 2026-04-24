/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.limonada.db;

import java.sql.Connection;

/**
 *
 * @author Daniel
 */
public class TestDbConnection {
    public static void main(String[] args) {
        DbConnection db = new DbConnection();
        Connection cx = db.conected();
        
        if (cx != null) {
            System.out.println("Successful connection");
        } else {
            System.out.println("Connection failed");
        }
    }
}
