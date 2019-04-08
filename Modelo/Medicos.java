/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jose,Marco,Yuliana,Elver
 */
public class Medicos {
    private String nombre;
     private String cedula;
      private String fecha;
       private String correo;
        private String telefono;
         private String usuario;
          private String pass;
           private String especialidad;
            private String codigo;
             private double salario;
            
    public double SalarioNeto;

    public Medicos(double Salario) {
        this.salario = Salario;
        this.SalarioNeto = 0;
    }

    public Medicos() {
        this.salario = 0;
        this.SalarioNeto = 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0.0) {
            this.salario = salario;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

  

    public String getEspecialidad() {
        return especialidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public Medicos(String nombre, String cedula, String fecha, String correo, String telefono, String usuario, String pass, String especialidad, String codigo, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha = fecha;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario = usuario;
        this.pass = pass;
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.salario = salario;
    }

    public Medicos(String nombre, String cedula, String fecha, String correo, String telefono, String usuario, String pass, String codigo, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha = fecha;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario = usuario;
        this.pass = pass;
        this.especialidad="Medico general";
        this.codigo = codigo;
        this.salario = salario;
    }
    
       
    public void calcularSalarioNeto() {
        if (this.salario < 817000) {
            this.deducionesDelSalario();
            System.out.println("Su salario es: " + this.salario + " y su salario neto es: " + this.SalarioNeto);

        }
        if (this.salario > 817001 && this.salario < 1226000) {
            double ImpuestosDeRenta10 = (this.salario * 10) / 100;
            this.deducionesDelSalario();
            this.SalarioNeto = this.SalarioNeto - ImpuestosDeRenta10;
            System.out.println("Su salario es: " + this.salario + " y su salario neto es: " + this.SalarioNeto);

        }
        if (this.salario > 1226001) {
            double ImpuestosDeRenta15 = (this.salario * 15) / 100;
            this.deducionesDelSalario();
            this.SalarioNeto = this.SalarioNeto - ImpuestosDeRenta15;
            System.out.println("Su salario es: " + this.salario + " y su salario neto es: " + this.SalarioNeto);
        }
    }

    public void deducionesDelSalario() {//Se calculan todas las deduciones y se le aplican de una vez al salario neto
        double EnfermadYMaternidad = (this.salario * 5.5) / 100;
        double InvalidezYMuerte = (this.salario * 3.64) / 100;
        double AporteDelTrabajador = (this.salario * 1) / 100;
        double AportaALaAsociaciónSolidarista = (this.salario * 3.3) / 100;
        double total = EnfermadYMaternidad + InvalidezYMuerte + AporteDelTrabajador + AportaALaAsociaciónSolidarista;
        this.SalarioNeto = this.salario - total;
    }

}
