
package com.idesi.proyecto;

public class Cita {
    
    int hora;
    int minutos;
    int dia;
    int mes;
    double codigo;
    String tipoExamen;
    
    public void setDate(int horas, int minutos, int dia, int mes){
        
    }
    

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public double getCodigo() {
        return codigo;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }
    
}
