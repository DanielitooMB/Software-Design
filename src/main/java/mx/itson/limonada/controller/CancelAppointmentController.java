/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.limonada.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import mx.itson.limonada.db.DbConnection;

/**
 *
 * @author Daniel
 */
public class CancelAppointmentController {
    
    public boolean cancelAppointment(int id) {
        try {
            Connection cx = new DbConnection().connected();
            String query = "DELETE FROM appointment WHERE id = ?";
            PreparedStatement ps = cx.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
}
