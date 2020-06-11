
package com.idesi.proyecto;

import java.util.Date;

public class Cita {
    
    Date date ;
    double codigo;
    String tipoExamen;
    
    public void setDate(int horas, int minutos, int dia, int mes){
        
        date = new Date(2020,mes,dia,horas,minutos,0);
    }
        
    public Date getDate() {
        return date;
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
