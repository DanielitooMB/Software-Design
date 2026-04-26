/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.limonada.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mx.itson.limonada.db.DbConnection;


/**
 *
 * @author Daniel
 */
public class CancelAppointmentController {
    
    public boolean cancel(int appointmentId, int doctorId, int patientId) {
        String deleteAppointment = "DELETE FROM appointment WHERE id = ?";
        String deleteDoctor      = "DELETE FROM doctor WHERE id = ?";
        String deletePatient     = "DELETE FROM patient WHERE id = ?";

        try (Connection cx = new DbConnection().conected()) {
            // 1. Primero elimina el appointment (tiene FK a doctor)
            PreparedStatement ps1 = cx.prepareStatement(deleteAppointment);
            ps1.setInt(1, appointmentId);
            ps1.executeUpdate();

            // 2. Luego elimina el doctor
            PreparedStatement ps2 = cx.prepareStatement(deleteDoctor);
            ps2.setInt(1, doctorId);
            ps2.executeUpdate();

            // 3. Luego elimina el paciente
            PreparedStatement ps3 = cx.prepareStatement(deletePatient);
            ps3.setInt(1, patientId);
            ps3.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
            return false;
        }
    }
    
}
