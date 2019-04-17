/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author kille
 */
public class MoCitas {
    private String hora;
    private Date fecha;
    private int ID;
    private Pacientes paciente;
    private Medicos medico;
    private int año;
    private int mes;
    private int dia;
 
    public String getHora() {
        return hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getID() {
        return ID;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public Medicos getMedico() {
        return medico;
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public MoCitas(int ID,String hora,Pacientes paciente,Medicos medico,int año,int mes, int dia) {
        this.ID=ID;
        this.hora=hora;
        this.fecha=null;
        this.año=año;
        this.mes=mes;
        this.dia=dia;
        this.paciente=paciente;
        this.medico=medico;
    }
    
    public void validarFecha(int año,int mes,int dia){
        año=año-1900;
        mes=mes-1;
        this.fecha= new Date(año,mes,dia);
    }

         
     
    
}