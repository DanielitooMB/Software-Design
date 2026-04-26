/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.limonada.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Daniel
 */
public class Appointment {
    
    private int id;
    private Doctor doctor;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private String reason;
    private boolean status;

    public Appointment(int id, Doctor doctor, LocalDate date, LocalTime time, String location, String reason, boolean status) {
        this.id = id;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.location = location;
        this.reason = reason;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
