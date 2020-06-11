
package com.idesi.proyecto;

import java.util.Calendar;
import java.util.Date;

public class Cita {
    
    Calendar calendario ;
    double codigo;
    String tipoExamen;
    
    public void setcalendario(int hora, int minuto, int dia, int mes){
        
        calendario.set(Calendar.YEAR,2020);
        calendario.set(Calendar.MONTH,mes);
        calendario.set(Calendar.DATE,dia);
        calendario.set(Calendar.HOUR,hora);
        calendario.set(Calendar.MINUTE,minuto);
    }
        
    public Calendar getCalendario() {
        return calendario;
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
