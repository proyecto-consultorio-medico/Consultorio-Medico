/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BD;
import Modelo.Medicos;
import Modelo.Secretaria; 

import Vista.FrmBuscarUsuario;
import Vista.FrmSesion;
import Vista.Usuarios;
import Vista.frmCambioPass;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose,Marco,Yuliana,Elver
 */
public class ControladorUsuarios {
    private Secretaria secretaria;
    private Medicos medico;
    private  Object obj[];
    
    public ControladorUsuarios() {
        this.secretaria = null;
        this.medico= null;
    }
    /**
     * Metodo que agrega usuario segun su tipo(medico o secretaria)
     * @param frmUsuarios
     * @return retorna un estado booleano
     */
    public boolean agregar(Usuarios frmUsuarios){
        if (!"".equals(frmUsuarios.getTxtcedula().getText())) {
             if ("Secretaria".equals(frmUsuarios.getCombotipo().getSelectedItem())) {
                 this.secretaria= new Secretaria();
                 this.secretaria.setCedula(frmUsuarios.getTxtcedula().getText());
                 if (this.secretaria.contarDigitosCedu()==false) {
                     JOptionPane.showMessageDialog(null, "La cedula es invalida");
                     return false;
                 }
            if (comprobarCedulaSecre(frmUsuarios)==true) {
            if (comprobarUsuarioSecre(frmUsuarios)==false) {
                frmUsuarios.setTxtmensaje("El usuario no esta disponible, por favor elija otro");
            }else{
                Date fecha = new Date(frmUsuarios.getTxtFecha().getDate().getTime());
                this.secretaria= new Secretaria(frmUsuarios.getTxtnombre().getText(),frmUsuarios.getTxtcedula().getText(),
                    frmUsuarios.getTxtcorreo().getText(),frmUsuarios.getTxtTelefono().getText(),frmUsuarios.getTxtusuario().getText(),
                    frmUsuarios.getTxtcontra().getText(),fecha);
                this.secretaria.ponerMayusculas();
                if (this.secretaria.contarDigitostel()==false) {
                     JOptionPane.showMessageDialog(null, "El numero de telefono es invalido");
                     return false;
                 }
                   BD bd=new BD("INSERT INTO secretarias VALUES (?,?,?,?,?,?,?)");
                 bd.ejecutar(new Object[]{this.secretaria.getCedula(),this.secretaria.getNombre(),this.secretaria.getFecha(),
                this.secretaria.getCorreo(),this.secretaria.getTelefono(),this.secretaria.getUsuario(),this.secretaria.getPass()});
                 frmUsuarios.setTxtmensaje("");
                  return true;
            }
            }else{
            frmUsuarios.setTxtMensajeC("La cedula ya existe");
            return false;
            }
             }
        }
        
        if ("Medico".equals(frmUsuarios.getCombotipo().getSelectedItem())) {
            this.medico=new Medicos();
            this.medico.setCedula(frmUsuarios.getTxtcedula().getText());
            if (this.medico.contarDigitosCedu()==false) {
                JOptionPane.showMessageDialog(null, "La cedula es invalida");
            }
            if ( comprobarCedulaMedic(frmUsuarios)==true) {              
            if (comprobarUsuarioMedic(frmUsuarios)==false) {
                    frmUsuarios.setTxtmensaje("El usuario no esta disponible, por favor elija otro");
            }else{
                    Date fecha = new Date(frmUsuarios.getTxtFecha().getDate().getTime());
                  this.medico= new Medicos(frmUsuarios.getTxtnombre().getText(),frmUsuarios.getTxtcedula().getText(),
                    frmUsuarios.getTxtcorreo().getText(),frmUsuarios.getTxtTelefono().getText(),frmUsuarios.getTxtusuario().getText(),
                    frmUsuarios.getTxtcontra().getText(), (String) frmUsuarios.getComboespe().getSelectedItem(),frmUsuarios.getTxtCondigo().getText(),
                    Double.parseDouble(frmUsuarios.getTxtSalario().getText()),fecha);
                   this.medico.ponerMayusculas();
                  if (this.medico.contarDigitostel()==false) {
                     JOptionPane.showMessageDialog(null, "El numero de telefono es invalido");
                     return false;
                 }
                    BD bd=new BD("INSERT INTO medicos VALUES (?,?,?,?,?,?,?,?,?,?)");
            bd.ejecutar(new Object[]{this.medico.getCedula(),this.medico.getNombre(),this.medico.getFecha()
                    ,this.medico.getCorreo(),this.medico.getCodigo(),this.medico.getTelefono(),this.medico.getEspecialidad()
                    ,this.medico.getSalario(),this.medico.getUsuario(),this.medico.getPass()});
                    frmUsuarios.setTxtmensaje("");
              return true;
            }
            }else{
                   frmUsuarios.setTxtMensajeC("La cedula ya existe");
                   return false;
                   }
        }
        
         return false;
    }
    /**
     * comprueba el usuario si existe o no para que el usuario se entere de ello
     * @param frmUsuarios
     * @return retorna un estado booleano
     */
    public boolean comprobarUs(Usuarios frmUsuarios){
        if ("Secretaria".equals(frmUsuarios.getCombotipo().getSelectedItem())) {
              this.secretaria= new Secretaria();
              this.secretaria.setUsuario(frmUsuarios.getTxtusuario().getText());
              if (comprobarUsuarioSecre(frmUsuarios)==false) {
                frmUsuarios.setTxtmensaje("El usuario no esta disponible, por favor elija otro");
                return false;
                    }
        }
        
        if ("Medico".equals(frmUsuarios.getCombotipo().getSelectedItem())){
        this.medico= new Medicos();
        this.medico.setUsuario(frmUsuarios.getTxtusuario().getText());
            if (comprobarUsuarioMedic(frmUsuarios)==false) {
                 frmUsuarios.setTxtmensaje("El usuario no esta disponible, por favor elija otro");
                 return false;
            }
        }     
            frmUsuarios.setTxtmensaje("El usuario esta disponible");
        return true;
    }
    
    /**
     * comprueba si el usuario de la secretaria si no existe en la base de datos para poder ser guardarlo en la base de datos
     * @param frmUsuarios
     * @return retorna un estado booleano
     */
    public boolean comprobarUsuarioSecre(Usuarios frmUsuarios){
       this.secretaria= new Secretaria();
       this.secretaria.setUsuario(frmUsuarios.getTxtusuario().getText());
        BD bd= new BD("SELECT `Usuario` FROM `secretarias` WHERE Usuario=?");
        bd.ejecutar(new Object[]{this.secretaria.getUsuario()});
       this.obj=bd.getObject();
        if (this.obj==null) {
            return true;
        }else{
         if (this.obj[0].equals(this.secretaria.getUsuario())) {
          return false;
         }
        }
        return true;
        
    }
    /**
     * comprueba si el usuario del medico si no existe en la base de datos para poder ser agregado a la base de datos
     * @param frmUsuarios
     * @return retonar un estado booleano
     */
    public boolean comprobarUsuarioMedic(Usuarios frmUsuarios){
        this.medico=new Medicos();
        this.medico.setUsuario(frmUsuarios.getTxtusuario().getText());
    BD bd= new BD("SELECT `Usuario` FROM `medicos` WHERE Usuario=?");
    bd.ejecutar(new Object[]{this.medico.getUsuario()});
    this.obj=bd.getObject();
        if (this.obj==null) {
            return true;
        }else{
         if (this.obj[0].equals(this.medico.getUsuario())) {
          return false;
         }
        }
        return true;
    }
    /**
     * comprueba si no existe la cedula de la secretaria en la base datos para poder ser agregada si no existe
     * @param frmUsuarios
     * @return retorna un estado booleano
     */
   public boolean comprobarCedulaSecre(Usuarios frmUsuarios){
    BD bd= new BD("SELECT `Cedula` FROM `secretarias` WHERE Cedula=?");
    this.secretaria=new Secretaria();
    this.secretaria.setCedula(frmUsuarios.getTxtcedula().getText());
    bd.ejecutar(new Object[]{this.secretaria.getCedula()});
    this.obj=bd.getObject();
        if (this.obj==null) {
            return true;
        }else{
         if (this.obj[0].equals(this.secretaria.getCedula())) {
          return false;
         }
        }
        return true;
    }
   /**
    * compruba si no existe la cedula del medico en la base de datos para poder ser agregado si no existe
     * @param frmUsuarios
    * @return retorna un estado booleano
    */
     public boolean comprobarCedulaMedic(Usuarios frmUsuarios){
       BD bd= new BD("SELECT `Cedula` FROM `medicos` WHERE Cedula=?");
       this.medico=new Medicos();
       this.medico.setCedula(frmUsuarios.getTxtcedula().getText());
       bd.ejecutar(new Object[]{this.medico.getCedula()});
        this.obj=bd.getObject();
        if (this.obj==null) {
            return true;
        }else{
         if (this.obj[0].equals(this.medico.getCedula())) {
          return false;
         }
        }
        return true;
    }
     /**
      * busca si el medico tiene un cita pendiente ya que no puede ser eliminado por que debe cumplir con su trabajo
      * @param frmUsuarios
      * @return retorna una estado booleano
      */
     public boolean buscarCitaMedico(Usuarios frmUsuarios){
     BD bd= new BD("SELECT * FROM `medicos` JOIN citas ON medicos.Cedula=citas.Medico  WHERE Cedula=?");
        this.medico= new Medicos();
        this.medico.setCedula(frmUsuarios.getTxtcedula().getText());
        bd.ejecutar(new Object[]{this.medico.getCedula()});
        obj=bd.getObject();
        return obj != null;       
     }
     
     /***
      * elimina un usuario dependiendo su tipo(medico o secretaria) en la base de datos
      * @param frmUsuarios
      * @return retorna un estado booleano
      */
      public boolean eliminar(Usuarios frmUsuarios) {
          if (frmUsuarios.combotipo.getSelectedItem().equals("Secretaria")) {
              BD bd = new BD("DELETE FROM secretarias WHERE Cedula=?");
              this.secretaria=new Secretaria();
              this.secretaria.setCedula(frmUsuarios.getTxtcedula().getText());
            bd.ejecutar(new Object[]{this.secretaria.getCedula()});
            return true;
          }
          
             if (frmUsuarios.combotipo.getSelectedItem().equals("Medico")) {
                BD bd = new BD("DELETE FROM medicos WHERE Cedula=?");
                this.medico=new Medicos();
                this.medico.setCedula(frmUsuarios.getTxtcedula().getText());
            bd.ejecutar(new Object[]{this.medico.getCedula()});
            return true;
          }
          return false;
        }
   /**
    * cambia la contraseña de la secretaria
    * @param frmcambiocont
    * @return retorna un estado booleano
    */
      public boolean cambioContraSec(frmCambioPass frmcambiocont){
      BD bd= new BD("SELECT `Contra` FROM `secretarias` WHERE Usuario=?");
      this.secretaria= new Secretaria();
      this.secretaria.setUsuario(frmcambiocont.getTxtUsuario().getText());
      bd.ejecutar(new Object[]{this.secretaria.getUsuario()});
      this.obj=bd.getObject();
          if (this.obj==null) {
              return false;
          }else{
          if(this.obj[0].equals(frmcambiocont.getTxtContraAnti().getText())){
          JOptionPane.showMessageDialog(null,"Contraseña correcta");
          BD bd2= new BD("UPDATE `secretarias` SET `Contra`=? WHERE Usuario=?");
          if(frmcambiocont.getTxtContraNue().getText().equals(frmcambiocont.getTxtverificontra().getText())){
              bd2.ejecutar(new Object[]{frmcambiocont.getTxtContraNue().getText(),this.secretaria.getUsuario()});
              return true;
          }else{   
          }
          JOptionPane.showMessageDialog(null, "Las contraseña no son iguales");
      }
          }
         return false;
      }
      /**
       * cambia la contraseña del medico
       * @param frmcambiocont
       * @return retorna un estado booleano
       */
     public boolean cambioContraMedic(frmCambioPass frmcambiocont){
          BD bd= new BD("SELECT `Contraseña` FROM `medicos` WHERE Usuario=?");
      this.medico= new Medicos();
      this.medico.setUsuario(frmcambiocont.getTxtUsuario().getText());
      bd.ejecutar(new Object[]{this.medico.getUsuario()});
      this.obj=bd.getObject();
          if (this.obj==null) {
             return false;
         }else{
          if(this.obj[0].equals(frmcambiocont.getTxtContraAnti().getText())){
          JOptionPane.showMessageDialog(null,"Contraseña correcta");
          BD bd2= new BD("UPDATE `medicos` SET `Contraseña`=? WHERE Usuario=?");
          if(frmcambiocont.getTxtContraNue().getText().equals(frmcambiocont.getTxtverificontra().getText())){
              bd2.ejecutar(new Object[]{frmcambiocont.getTxtContraNue().getText(),medico.getUsuario()});
                   return true;
          }   
      }
          }
          return false;
     } 
     /**
      * busca un medico segun su cedula en la base de datos
      * @param frmpbuscar 
      */
       public void buscarMedicoCedu(FrmBuscarUsuario frmpbuscar) {
        if (!"".equals(frmpbuscar.getTxtBuscar().getText())) {
            this.medico= new Medicos();
            this.medico.setCedula(frmpbuscar.getTxtBuscar().getText());
            BD bd = new BD("SELECT *  FROM `medicos` WHERE Cedula=?");
            bd.ejecutar(new Object[]{this.medico.getCedula()});
            DefaultTableModel modelo = (DefaultTableModel) frmpbuscar.getTablaUsuarios().getModel();
            modelo.addRow(bd.getObject());
        }
       }
       /**
        * busca una secretaria segun su cedula en la base de datos
        * @param frmpbuscar 
        */
       public void buscarSecretariaCedu(FrmBuscarUsuario frmpbuscar) {
        if (!"".equals(frmpbuscar.getTxtBuscar().getText())) {
            this.secretaria = new Secretaria();
            this.secretaria.setCedula(frmpbuscar.getTxtBuscar().getText());
            BD bd = new BD("SELECT *  FROM `secretarias` WHERE Cedula=?");
            bd.ejecutar(new Object[]{this.secretaria.getCedula()});
            DefaultTableModel modelo = (DefaultTableModel) frmpbuscar.getTablaUsuarios2().getModel();
            modelo.addRow(bd.getObject());
        }
       }
       /**
        * busca filtrado segun el nombre del medico
        * @param frmpbuscar 
        */
       public void buscarMedicoNom(FrmBuscarUsuario frmpbuscar){
        this.medico= new Medicos();
        this.medico.setNombre(frmpbuscar.getTxtBuscar().getText());
           BD bd = new BD("SELECT * FROM `medicos` WHERE NombreCompleto LIKE ?"); 
             bd.ejecutar(new Object[]{"%"+this.medico.getNombre()+"%"});
              DefaultTableModel modelo = (DefaultTableModel)
                      frmpbuscar.getTablaUsuarios().getModel();
              modelo.setNumRows(0);
             do {
                 this.obj = bd.getObject();
            if (this.obj != null) {
                this.medico = new Medicos(obj);
                modelo.addRow(this.medico.toObject());
            }
        } while (this.obj!=null);
       }
       /**
        * busca filtrando segun el nombre de la secretaria
        * @param frmpbuscar 
        */
       public void buscarSecretariaNom(FrmBuscarUsuario frmpbuscar){
        this.secretaria= new Secretaria();
        this.secretaria.setNombre(frmpbuscar.getTxtBuscar().getText());
           BD bd = new BD("SELECT * FROM `secretarias` WHERE 	`Nombre Completo` LIKE ?"); 
             bd.ejecutar(new Object[]{"%"+this.secretaria.getNombre()+"%"});
              DefaultTableModel modelo = (DefaultTableModel)
                      frmpbuscar.getTablaUsuarios2().getModel();
              modelo.setNumRows(0);
             do {
                 this.obj = bd.getObject();
            if (this.obj != null) {
                this.secretaria = new Secretaria(obj);
                modelo.addRow(this.secretaria.toObject());
            }
        } while (this.obj!=null);
       }
    /**
     * cuenta los medicos para saber si se pueden eliminar por que debe de haber 1 almenos
     * @param frmUsuarios
     * @return retonar un estado booleano
     */
       public boolean contarUsuariosDeMedico(Usuarios frmUsuarios){
           if (frmUsuarios.getCombotipo().getSelectedItem()=="Medico") {
               int cont;
           BD bd= new BD("Select count(*) FROM `medicos` WHERE Cedula=Cedula");
           bd.ejectuar();
           this.obj=bd.getObject();
           cont=Integer.parseInt(obj[0].toString());
               if (cont>0) {
                   return true;
               }
           }
           
           return false;
       }
       /**
        * cuenta las secretarias para saber si se pueden eliminar por que debe de haber 1 almenos
        * @param frmUsuarios
        * @return retorna un estado booleano
        */
       public boolean contarUsuariosDeSecre(Usuarios frmUsuarios){
       if (frmUsuarios.getCombotipo().getSelectedItem()=="Secretaria") {
                    int cont;
           BD bd= new BD("Select count(*) FROM `secretarias` WHERE Cedula=Cedula");
           bd.ejectuar();
           obj=bd.getObject();
           cont=Integer.parseInt(obj[0].toString());
           if (cont>0) {
               return true;
           }
           }
       return false;
       }
       /**
        * calcula el salario neto del medico
        * @param frmUsuarios
        * @return retorna su salario neto
        */
       public String salarioNeto(Usuarios frmUsuarios){
           this.medico= new Medicos();
           this.medico.setSalario(Double.parseDouble(frmUsuarios.getTxtSalario().getText()));
           return this.medico.calcularSalarioNeto();
       }
       /**
        * calcula el salario neto del medico cuando se busca en la base de datos
        * @param frmbuscar
        * @param salario
        * @return retorna su salario
        */
       public String salarioNeto2(FrmBuscarUsuario frmbuscar, String salario){
           this.medico= new Medicos();
           this.medico.setSalario(Double.parseDouble(salario));
           return this.medico.calcularSalarioNeto();
       }
       /**
        * actualiza el usuario segun su tipo(medico o secretaria) en la base de datos
        * @param frmUsuarios
        * @return retorna un estado booleano
        */
       public boolean actualizar(Usuarios frmUsuarios){
        if (frmUsuarios.combotipo.getSelectedItem().equals("Secretaria")) {
              BD bd = new BD("UPDATE `secretarias` SET `Nombre Completo`=?,`Fecha de nacimiento`=?,`Correo electronico`=?,`Telefono`=?,`Usuario`=? WHERE Cedula=?");
                 Date fecha = new Date(frmUsuarios.getTxtFecha().getDate().getTime());
              this.secretaria=new Secretaria(frmUsuarios.getTxtnombre().getText(), frmUsuarios.getTxtcedula().getText(), frmUsuarios.getTxtcorreo().getText(), frmUsuarios.getTxtTelefono().getText(), frmUsuarios.getTxtusuario().getText(), frmUsuarios.getTxtcontra().getText(), fecha);
            bd.ejecutar(new Object[]{this.secretaria.getCedula()});
            return true;
          }
             if (frmUsuarios.combotipo.getSelectedItem().equals("Medico")) {
                BD bd = new BD("UPDATE `medicos` SET `NombreCompleto`=?,`FechaDeNacimiento`=?,`CorreoElectronico`=?,`CodigoDeColegio`=?,`NumeroTelefono`=?,`Especialidad`=?,`Salario`=?,`Usuario`=? WHERE Cedula=?");
               Date fecha = new Date(frmUsuarios.getTxtFecha().getDate().getTime());
                this.medico=new Medicos(frmUsuarios.getTxtnombre().getText(), frmUsuarios.getTxtcedula().getText(), frmUsuarios.getTxtcorreo().getText(), frmUsuarios.getTxtTelefono().getText(), frmUsuarios.getTxtusuario().getText(), frmUsuarios.getTxtcontra().getText(), (String) frmUsuarios.comboespe.getSelectedItem(), frmUsuarios.getTxtCondigo().getText(),Double.parseDouble(frmUsuarios.getTxtSalario().getText()), fecha);
            bd.ejecutar(new Object[]{this.medico.getNombre(),this.medico.getFecha(),this.medico.getCorreo(),this.medico.getCodigo(),this.medico.getTelefono(),this.medico.getEspecialidad(),this.medico.getSalario(),this.medico.getUsuario(),this.medico.getCedula()});
            return true;
          }
          return false;
       }
       /**
        * inicia sesion el medico para poder atender la cita y hacer el expendite
        * @param frmsesion
        * @return retorna un estado booleano
        */
       public boolean iniciarSesion(FrmSesion frmsesion){
          BD bd = new BD("SELECT `Usuario`,`Contraseña` FROM `medicos` WHERE Usuario=? and Contraseña=?");
          this.medico=new Medicos();
          this.medico.setUsuario(frmsesion.getTxtUsuario().getText());
          this.medico.setPass(frmsesion.getTxtContra().getText());
          bd.ejecutar(new Object[]{this.medico.getUsuario(),this.medico.getPass()});
          this.obj=bd.getObject();
           if (this.obj==null) {
               return false;
           }else{
               if (this.obj[0].equals(this.medico.getUsuario())&&this.obj[1].equals(this.medico.getPass())) {
                   return true;
               }
           }
          return false;
       }
       
       /**
        * busca si esta disponible la cedula en la base de datos
        * @param usuarios
        * @return retonar un estado booleano
        */
       public boolean buscarCedulas(Usuarios usuarios){
           if (usuarios.getCombotipo().getSelectedItem()=="Medico") {
        BD bd = new BD("SELECT `Cedula` FROM `medicos` WHERE Cedula=?"); 
        this.medico= new Medicos();
        this.medico.setCedula(usuarios.getTxtcedula().getText());
        if (this.medico.contarDigitosCedu()==true) {
             bd.ejecutar(new Object[]{this.medico.getCedula()});
              this.obj=bd.getObject();
        if (this.obj==null) {
            return false;
        }else{
         if (this.obj[0].equals(this.medico.getCedula())) {
          return true;
         }
        }
        }
           }
           if (usuarios.getCombotipo().getSelectedItem()=="Secretaria") {
                    BD bd = new BD("SELECT `Cedula` FROM `secretarias` WHERE Cedula=?"); 
        this.secretaria= new Secretaria();
        this.secretaria.setCedula(usuarios.getTxtcedula().getText());
        if (this.secretaria.contarDigitosCedu()==true) {
             bd.ejecutar(new Object[]{this.secretaria.getCedula()});
              this.obj=bd.getObject();
        if (this.obj==null) {
            return false;
        }else{
         if (this.obj[0].equals(this.secretaria.getCedula())) {
          return true;
         }
        }
        }
           }
       return false;
    }
}
