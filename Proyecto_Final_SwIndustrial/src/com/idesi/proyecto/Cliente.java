package com.idesi.proyecto;

public class Cliente extends Persona {

    
    String domicilio;
    Double Código_de_cliente;
    

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setDomicilio(String Domicilio) {
        this.domicilio = Domicilio;
    }

    public void setCódigo_de_cliente(Double Código_de_cliente) {
        this.Código_de_cliente = Código_de_cliente;
    }

    public void setEdad(int Edad) {
        this.edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Double getCódigo_de_cliente() {
        return Código_de_cliente;
    }

    public int getEdad() {
        return edad;
    }

}
