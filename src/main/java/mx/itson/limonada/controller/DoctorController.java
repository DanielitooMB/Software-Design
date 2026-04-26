/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.limonada.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mx.itson.limonada.db.DbConnection;
import mx.itson.limonada.model.Doctor;

/**
 *
 * @author Daniel
 */
public class DoctorController {
    
    public Doctor getById(int id) {
        String sql = "SELECT * FROM doctor WHERE id = ?";
        try (Connection cx = new DbConnection().conected();
             PreparedStatement ps = cx.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Doctor(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("specialty"),
                    rs.getBoolean("status")
                );
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
}
