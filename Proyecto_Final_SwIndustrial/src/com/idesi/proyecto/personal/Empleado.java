
package com.idesi.proyecto.personal;

import com.idesi.proyecto.Persona;

public class Empleado extends Persona{
    private String codigoEmpleado;
    private String tipoEmpleado;
    private String RFC;
    private double salario;
    
    public Empleado(){}

    public Empleado(String nombre, int edad, String codigoEmpleado, String tipoEmpleado, String RFC, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigoEmpleado = codigoEmpleado;
        this.tipoEmpleado = tipoEmpleado;
        this.RFC = RFC;
        this.salario = salario;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
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
