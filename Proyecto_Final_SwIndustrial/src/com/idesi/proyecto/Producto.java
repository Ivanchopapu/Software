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
public class Producto {
    private int codigo;
    private String tipoProducto;
    private String nombreProducto;
    private int existencia;
    private int precio;
    
    public Producto(){}

    public Producto(int codigo, String tipoProducto, String nombreProducto, int existencia, int precio) {
        this.codigo = codigo;
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.existencia = existencia;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
