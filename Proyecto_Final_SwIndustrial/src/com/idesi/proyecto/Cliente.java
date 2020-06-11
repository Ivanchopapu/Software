package com.idesi.proyecto;

public class Cliente extends Persona {

    String Nombre;
    String Domicilio;
    Double Código_de_cliente;
    int Edad;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setCódigo_de_cliente(Double Código_de_cliente) {
        this.Código_de_cliente = Código_de_cliente;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public Double getCódigo_de_cliente() {
        return Código_de_cliente;
    }

    public int getEdad() {
        return Edad;
    }

}
