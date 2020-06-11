/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idesi.proyecto;

/**
 *
 * @author Cristofer
 */
public class Empleado extends Persona{
    private int codigoEmpleado;
    private String tipoEmpleado;
    private String RFC;
    private double salario;
    
    public Empleado(){}

    public Empleado(String nombre, int edad, int codigoEmpleado, String tipoEmpleado, String RFC, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigoEmpleado = codigoEmpleado;
        this.tipoEmpleado = tipoEmpleado;
        this.RFC = RFC;
        this.salario = salario;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
    
    
    
}
