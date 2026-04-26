/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.limonada.model;

/**
 *
 * @author Daniel
 */
public class Doctor {
    
    private int id;
    private String name;
    private String specialty;
    private boolean status;

    public Doctor() {
    }

    public Doctor(int id, String name, String specialty, boolean status) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
