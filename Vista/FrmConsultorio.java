/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorConexion;
import Modelo.BD;
import Modelo.ImagenFondo;

/**
 *
 * @author Jose,Marco,Yuliana,Elver
 */
public class FrmConsultorio extends javax.swing.JFrame {
    /**
     * Creates new form FrmConsultorio
     */
    public FrmConsultorio() {
        initComponents();
        Escritorio.setBorder(new ImagenFondo());
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.Expendientes.setEnabled(false);
        this.RegistroCitas.setEnabled(false);
        this.RegistroPaci.setEnabled(false);
        this.RegistroUsu.setEnabled(false);
        BD bd=new BD();
        bd.setRuta("C:\\Users\\kille\\Documents\\NetBeansProjects\\Consultorio Medico\\Configuracion.ini");
        if (bd.comprobar().equals("Encendido")) {
        estado.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accept-database-icon.png")));
            FrmConsultorio.Expendientes.setEnabled(true);
            FrmConsultorio.RegistroUsu.setEnabled(true);
            FrmConsultorio.RegistroPaci.setEnabled(true);
            FrmConsultorio.RegistroCitas.setEnabled(true);
        }else{
        estado.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error-base-datos-wordpress.png")));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        conectar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        RegistroUsu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        RegistroPaci = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        RegistroCitas = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        Expendientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        estado = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 915, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos-01.png"))); // NOI18N
        jMenu1.setText("Opciones");

        conectar.setText("Conectar al servidor");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });
        jMenu1.add(conectar);
        jMenu1.add(jSeparator1);

        RegistroUsu.setText("Usuarios");
        RegistroUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroUsuActionPerformed(evt);
            }
        });
        jMenu1.add(RegistroUsu);
        jMenu1.add(jSeparator2);

        RegistroPaci.setText("Pacientes");
        RegistroPaci.setOpaque(true);
        RegistroPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroPaciActionPerformed(evt);
            }
        });
        jMenu1.add(RegistroPaci);
        jMenu1.add(jSeparator3);

        RegistroCitas.setText("Registro de citas");
        RegistroCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroCitasActionPerformed(evt);
            }
        });
        jMenu1.add(RegistroCitas);
        jMenu1.add(jSeparator6);

        Expendientes.setText("Expedientes");
        Expendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpendientesActionPerformed(evt);
            }
        });
        jMenu1.add(Expendientes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Estado del servidor:");
        jMenu2.setContentAreaFilled(false);
        jMenu2.setEnabled(false);
        jMenuBar1.add(jMenu2);

        estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error-base-datos-wordpress.png"))); // NOI18N
        estado.setContentAreaFilled(false);
        estado.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error-base-datos-wordpress.png"))); // NOI18N
        estado.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/error-base-datos-wordpress.png"))); // NOI18N
        estado.setEnabled(false);
        jMenuBar1.add(estado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroPaciActionPerformed
        FrmPacientes pacientes = new FrmPacientes();
        Escritorio.add(pacientes);
        pacientes.show();
    }//GEN-LAST:event_RegistroPaciActionPerformed

    private void RegistroUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroUsuActionPerformed
        Usuarios usuarios = new Usuarios();
        Escritorio.add(usuarios);
        usuarios.show();
    }//GEN-LAST:event_RegistroUsuActionPerformed

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        FrmServidor servidor = new FrmServidor();
        Escritorio.add(servidor);
        servidor.show();
    }//GEN-LAST:event_conectarActionPerformed

    private void RegistroCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroCitasActionPerformed
       Citas cita= new Citas();
       Escritorio.add(cita);
       cita.show();
    }//GEN-LAST:event_RegistroCitasActionPerformed

    private void ExpendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpendientesActionPerformed
     FrmSesion sesion= new FrmSesion();
     Escritorio.add(sesion);
     sesion.show();
    }//GEN-LAST:event_ExpendientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmConsultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    public static javax.swing.JMenuItem Expendientes;
    public static javax.swing.JMenuItem RegistroCitas;
    public static javax.swing.JMenuItem RegistroPaci;
    public static javax.swing.JMenuItem RegistroUsu;
    public static javax.swing.JMenuItem conectar;
    public static javax.swing.JMenu estado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
