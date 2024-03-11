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
public class Usuario {
    //private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double contribucion;
    private double pension;
    private String afp; 

    public Usuario() {
    }

    public Usuario( String nombre, String apellido, int edad, double contribucion, double pension, String afp) {
        //this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.contribucion = contribucion;
        this.pension = pension;
        this.afp = afp;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getContribucion() {
        return contribucion;
    }

    public void setContribucion(double contribucion) {
        this.contribucion = contribucion;
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
