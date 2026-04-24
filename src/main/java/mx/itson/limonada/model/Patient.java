/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.limonada.model;

/**
 *
 * @author Daniel
 */
public class Patient {

    public Patient() {
    }

    public Patient(int id, String rut, String name, int age, boolean status) {
        this.id = id;
        this.rut = rut;
        this.name = name;
        this.age = age;
        this.status = status;
    }

    private int id;
    private String rut;
    private String name;
    private int age;
    private boolean status; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
