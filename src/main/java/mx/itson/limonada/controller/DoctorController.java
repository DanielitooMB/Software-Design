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
    
    public ArrayList<Doctor> getAll() {
        ArrayList<Doctor> list = new ArrayList<>();
        String sql = "SELECT * FROM doctor";
        try (Connection cx = new DbConnection().conected();
             PreparedStatement ps = cx.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Doctor(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("specialty"),
                    rs.getBoolean("status")
                ));
            }

        } catch (SQLException ex) {
            System.getLogger(DoctorController.class.getName())
                  .log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return list;
    }
}
