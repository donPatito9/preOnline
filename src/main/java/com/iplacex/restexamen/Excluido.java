/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.restexamen;

/**
 *
 * @author Us
 */
public class Excluido {
    private int id;
    private String nombre;
    private String apellido;
    private String exclusion;
    private int edad;
    private double pension;
    private String afp;

    public Excluido() {
    }

    public Excluido(int id, String nombre, String apellido, String exclusion, int edad, double pension, String afp) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.exclusion = exclusion;
        this.edad = edad;
        this.pension = pension;
        this.afp = afp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getExclusion() {
        return exclusion;
    }

    public void setExclusion(String exclusion) {
        this.exclusion = exclusion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }
    
}
