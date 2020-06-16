package com.idesi.proyecto.clientes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cita {

    private Date fechaCita;
    private String codigo;
    private String tipoExamen;

    public void setFechaCita(int hora, int minuto, int dia, int mes) {
        
        Calendar miCalendario = Calendar.getInstance();
        miCalendario.set(Calendar.YEAR, 2020);
        miCalendario.set(Calendar.MONTH, mes);
        miCalendario.set(Calendar.DATE, dia);
        miCalendario.set(Calendar.HOUR_OF_DAY, hora);
        miCalendario.set(Calendar.MINUTE, minuto);
        fechaCita = miCalendario.getTime();

    }

    public Date getCita() {
        return this.fechaCita;
    }

    public String getFecha() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaConFormato = formato.format(fechaCita);
        return fechaConFormato;
    }

    public String getHora() {
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        String horaConFormato = formato.format(fechaCita);
        return horaConFormato;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

}
