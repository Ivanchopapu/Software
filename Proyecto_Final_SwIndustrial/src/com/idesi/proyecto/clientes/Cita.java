
package com.idesi.proyecto.clientes;

import java.util.Calendar;
import java.util.Date;

public class Cita {
    
    Date fechaCita ;
    double codigo;
    String tipoExamen;
    
    public void setFechaCita(int hora, int minuto, int dia, int mes){
        
        Calendar miCalendario = Calendar.getInstance();
        miCalendario.set(Calendar.YEAR,2020);
        miCalendario.set(Calendar.MONTH,mes);
        miCalendario.set(Calendar.DATE,dia);
        miCalendario.set(Calendar.HOUR,hora);
        miCalendario.set(Calendar.MINUTE,minuto);
        
        this.fechaCita = miCalendario.getTime();
    }
        
    public Date getFechaCita() {
        return this.fechaCita;
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
