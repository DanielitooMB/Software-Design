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

    public Appointment() {
    }

    public Appointment(int id, String doctor, String specialty, LocalDate date, LocalTime time, String location, String reason, boolean status) {
        this.id = id;
        this.doctor = doctor;
        this.specialty = specialty;
        this.date = date;
        this.time = time;
        this.location = location;
        this.reason = reason;
        this.status = status;
    }
    
    private int id;
    private String doctor;
    private String specialty;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private String reason;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
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
