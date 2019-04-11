/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorConexion;
import Modelo.ArchivosIniL;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jose,Marco,Yuliana,Elver
 */
public class FrmServidor extends javax.swing.JInternalFrame {
    ControladorConexion conexion;

    public JTextField getTxtIP() {
        return txtIP;
    }

    public JTextField getTxtPass() {
        return txtPass;
    }

    public JTextField getTxtUsu() {
        return txtUsu;
    }

    public JTextField getTxtbd() {
        return txtbd;
    }


    
    
     
    
    public FrmServidor() {
        initComponents();
            ArchivosIniL ini= new ArchivosIniL();
            ini.leerArchivo("C:\\Users\\kille\\Documents\\NetBeansProjects\\Consultorio Medico\\Configuracion.ini");
           conexion = new ControladorConexion(this);
           txtIP.setText(ini.getProperties().getProperty("IP","default value"));
           txtPass.setText(ini.getProperties().getProperty("Pass","default value"));
           txtUsu.setText(ini.getProperties().getProperty("Usuario","default value"));
           txtbd.setText(ini.getProperties().getProperty("BD","default value"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtIP = new javax.swing.JTextField();
        txtUsu = new javax.swing.JTextField();
        txtbd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtPass = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Configuración");

        jPanel1.setBackground(new java.awt.Color(85, 151, 248));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/565148.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 72, -1));

        txtIP.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtIP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Direccion IP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N
        jPanel1.add(txtIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 6, 137, 62));

        txtUsu.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtUsu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N
        jPanel1.add(txtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 6, 151, 62));

        txtbd.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtbd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Base de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 12))); // NOI18N
        txtbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbdActionPerformed(evt);
            }
        });
        jPanel1.add(txtbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 6, 150, 62));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-19-283x300.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 6, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Metro-Shut-Down-Blue-256.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 6, 66, -1));

        txtPass.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 12))); // NOI18N
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 6, 158, 62));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (conexion.comprobar()==true) {
            FrmConsultorio.estado.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accept-database-icon.png")));
            FrmConsultorio.Expendientes.setEnabled(true);
            FrmConsultorio.RegistroUsu.setEnabled(true);
            FrmConsultorio.RegistroPaci.setEnabled(true);
            FrmConsultorio.RegistroCitas.setEnabled(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No hay conexion a la Base de Datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (this.conexion.conectar()==true) {
            FrmConsultorio.estado.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accept-database-icon.png")));
            FrmConsultorio.Expendientes.setEnabled(true);
            FrmConsultorio.RegistroUsu.setEnabled(true);
            FrmConsultorio.RegistroPaci.setEnabled(true);
            FrmConsultorio.RegistroCitas.setEnabled(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (conexion.desconectar()==true) {
           FrmConsultorio.estado.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error-base-datos-wordpress.png")));
           FrmConsultorio.Expendientes.setEnabled(false);
           FrmConsultorio.RegistroUsu.setEnabled(false);
           FrmConsultorio.RegistroPaci.setEnabled(false);
           FrmConsultorio.RegistroCitas.setEnabled(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsu;
    private javax.swing.JTextField txtbd;
    // End of variables declaration//GEN-END:variables
}
