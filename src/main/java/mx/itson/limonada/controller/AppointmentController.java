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
import mx.itson.limonada.model.Appointment;

/**
 *
 * @author Daniel
 */
public class AppointmentController {
    
    public Appointment gAppointment(int id) {
        Appointment appointment = null;
        try {
            Connection cx = new DbConnection().connected();
            String query = "SELECT * FROM appointment WHERE id = ?";
            PreparedStatement ps = cx.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                appointment = new Appointment(
                        rs.getInt("id"),
                        rs.getString("doctor"),
                        rs.getString("specialty"),
                        rs.getDate("date").toLocalDate(),
                        rs.getTime("time").toLocalTime(),
                        rs.getString("location"),
                        rs.getString("reason"),
                        rs.getBoolean("status")
                );
            }
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return appointment;
    }
}
