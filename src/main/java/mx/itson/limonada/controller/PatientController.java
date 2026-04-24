/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.limonada.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mx.itson.limonada.db.DbConnection;
import mx.itson.limonada.model.Patient;

/**
 *
 * @author Daniel
 */
public class PatientController {
    
    public Patient getPatient(int id) {
        Patient patient = null;
        try {
            Connection cx = new DbConnection().connected();
            String query = "SELECT * FROM patient WHERE id = ?";
            PreparedStatement ps = cx.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                patient = new Patient(
                        rs.getInt("id"),
                        rs.getString("rut"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getBoolean("status")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return patient;
    }
    
}
