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
import mx.itson.limonada.model.Doctor;


/**
 *
 * @author Daniel
 */
public class AppointmentController {

    public Appointment getNext() {
        String sql = "SELECT a.id, a.doctor_id, a.date, a.time, a.location, a.reason, a.status, " +
                     "d.name AS doctor_name, d.specialty " +
                     "FROM appointment a " +
                     "JOIN doctor d ON a.doctor_id = d.id " +
                     "ORDER BY a.date ASC, a.time ASC " +
                     "LIMIT 1";
        try (Connection cx = new DbConnection().conected();
             PreparedStatement ps = cx.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                System.out.println("Cita encontrada ID: " + rs.getInt("id"));
                Doctor doctor = new Doctor(
                    rs.getInt("doctor_id"),
                    rs.getString("doctor_name"),
                    rs.getString("specialty"),
                    true
                );
                return new Appointment(
                    rs.getInt("id"),
                    doctor,
                    rs.getDate("date").toLocalDate(),
                    rs.getTime("time").toLocalTime(),
                    rs.getString("location"),
                    rs.getString("reason"),
                    rs.getBoolean("status")
                );
            } else {
                System.out.println("No hay citas en la base de datos");
            }

        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getMessage());
        }
        return null;
    }
    
}
