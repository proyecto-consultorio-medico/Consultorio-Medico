/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorUsuarios;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jose,Marco,Yuliana,Elver
 */
public class Usuarios extends javax.swing.JInternalFrame {
    private ControladorUsuarios cusuarios;
   
    
    public JComboBox<String> getComboespe() {
        return comboespe;
    }

    public JComboBox<String> getCombotipo() {
        return combotipo;
    }

    public void setTxtMensajeC(String txtMensajeC) {
        this.txtMensajeC.setText(txtMensajeC);
    }

    
    
    public void setTxtmensaje(String txtmensaje) {
        this.txtmensaje.setText(txtmensaje);
    }

 
    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public JTextField getTxtcontra() {
        return txtcontra;
    }

    public JTextField getTxtcorreo() {
        return txtcorreo;
    }

    public JDateChooser getTxtFecha() {
        return txtFecha;
    }

   

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public JTextField getTxtusuario() {
        return txtusuario;
    }

    public JTextField getTxtCondigo() {
        return txtCondigo;
    }


   public JTextField getTxtSalario() {
        return txtSalario;
    }

  
   
    public Usuarios() {
        initComponents();
              this.getContentPane().setBackground(new Color(85,151,248));
        cusuarios = new ControladorUsuarios();
        this.cargar();
           txtSalario.setVisible(false);
             txtCondigo.setVisible(false);
               comboespe.setVisible(false);
                txtSalarioNeto.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtnombre = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        combotipo = new javax.swing.JComboBox<>();
        txtcorreo = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtcontra = new javax.swing.JPasswordField();
        txtCondigo = new javax.swing.JTextField();
        comboespe = new javax.swing.JComboBox<>();
        txtSalario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtmensaje = new javax.swing.JLabel();
        txtMensajeC = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtSalarioNeto = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBackground(new java.awt.Color(85, 151, 248));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Usuarios");

        txtnombre.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nombre completo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtcedula.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtcedula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Numero de cedula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaKeyReleased(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Numero de telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        combotipo.setBackground(new java.awt.Color(255, 255, 255));
        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de usuario" }));
        combotipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combotipoItemStateChanged(evt);
            }
        });

        txtcorreo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtcorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Correo electronico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtusuario.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtusuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nombre de usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusuarioKeyReleased(evt);
            }
        });

        txtcontra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N
        txtcontra.setPreferredSize(new java.awt.Dimension(12, 44));

        txtCondigo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtCondigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Código de colegio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        comboespe.setBackground(new java.awt.Color(255, 255, 255));
        comboespe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especialidad" }));

        txtSalario.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtSalario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Salario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon-merge.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Metro-Save-Blue-256.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtmensaje.setForeground(new java.awt.Color(255, 0, 0));

        txtMensajeC.setForeground(new java.awt.Color(153, 51, 0));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contr-cam.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/57477.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtSalarioNeto.setEditable(false);
        txtSalarioNeto.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtSalarioNeto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Salario neto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/46640.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMensajeC, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSalarioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCondigo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(comboespe, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMensajeC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCondigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboespe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalarioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.txtnombre.setText(null);
       this.txtcedula.setText(null);
       this.txtTelefono.setText(null);
       this.txtcontra.setText(null);
       this.txtcorreo.setText(null);
       this.txtusuario.setText(null);
       this.txtSalarioNeto.setText(null);
       this.txtFecha.setDate(null);
       this.txtSalario.setText(null);
       this.txtCondigo.setText(null);
       this.combotipo.setSelectedIndex(0);
        if (this.combotipo.getSelectedItem()=="Tipo de usuario") {
                 txtSalario.setVisible(false);
             txtCondigo.setVisible(false);
               comboespe.setVisible(false);
                txtSalarioNeto.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ( cusuarios.agregar(this)==false) {
            txtMensajeC.setBackground(new Color(153,51,0));
        }
         this.txtSalarioNeto.setText(cusuarios.salarioNeto(this));
    }//GEN-LAST:event_jButton1ActionPerformed
 public void cargar(){
            combotipo.addItem("Secretaria");
            combotipo.addItem("Medico");
            comboespe.addItem("Medicina General");
            comboespe.addItem("Pediatría");
            comboespe.addItem("Neurología");
            comboespe.addItem("Cardiología");
            comboespe.addItem("Cirugía General");
            comboespe.addItem("Ginecología");        
        }

    private void combotipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combotipoItemStateChanged
        if (combotipo.getSelectedItem()=="Medico") {
            txtSalario.setVisible(true);
             txtCondigo.setVisible(true);
               comboespe.setVisible(true);
               txtSalarioNeto.setVisible(true);
        }else{
            if (combotipo.getSelectedItem()=="Secretaria") {
                  txtSalario.setVisible(false);
                    txtCondigo.setVisible(false);
                     comboespe.setVisible(false);
                       txtSalarioNeto.setVisible(false);
            }
        }
    }//GEN-LAST:event_combotipoItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (combotipo.getSelectedItem()=="Medico") {
               if (cusuarios.buscarCitaMedico(this)==false) {
            if (cusuarios.contarUsuariosDeMedico(this)==true) {
                if (cusuarios.eliminar(this)==true) {
            JOptionPane.showMessageDialog(null, "Se elimino el usuario de la base de datos");
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione el tipo de usuario que desea eliminar");
            }
            }else{
                JOptionPane.showMessageDialog(null, "No se puede eliminar usuario por que no hay nada para eliminar");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El medico no puede ser eliminado por que tiene una o mas citas que antender");
        }
        }
     
        if (combotipo.getSelectedItem()=="Secretaria") {
             if (cusuarios.contarUsuariosDeSecre(this)==true) {
            if (cusuarios.eliminar(this)==true) {
                JOptionPane.showMessageDialog(null, "Se elimino el usuario de la base de datos");
            }else{
            JOptionPane.showMessageDialog(null, "Seleccione el tipo de usuario que desea eliminar");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se puede eliminar usuario por que no hay nada para eliminar");
        }
        }

       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      frmCambioPass cambio= new frmCambioPass();
      FrmConsultorio.Escritorio.add(cambio);
      cambio.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       FrmBuscarUsuario buscar= new FrmBuscarUsuario();
               FrmConsultorio.Escritorio.add(buscar);
               buscar.show();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtusuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyReleased
        if (cusuarios.comprobarUs(this)==true) {
            txtmensaje.setForeground(Color.GREEN);
        }else{
            txtmensaje.setForeground(new Color(153,51,0));
    }
    }//GEN-LAST:event_txtusuarioKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     cusuarios.actualizar(this);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyReleased
        if (combotipo.getSelectedItem()=="Medico") {
            if (cusuarios.buscarCedulas(this)==true) {
           
            txtcedula.setForeground(new Color(153,51,0));
        }else{
               
         txtcedula.setForeground(Color.green);
        } 
        }
         if (combotipo.getSelectedItem()=="Secretaria") {
                if (cusuarios.buscarCedulas(this)==true) {
                       txtcedula.setForeground(new Color(153,51,0));
             }else{
                      txtcedula.setForeground(Color.green);
        } 
            }

    }//GEN-LAST:event_txtcedulaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> comboespe;
    public static javax.swing.JComboBox<String> combotipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtCondigo;
    public static com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JLabel txtMensajeC;
    public static javax.swing.JTextField txtSalario;
    public static javax.swing.JTextField txtSalarioNeto;
    public static javax.swing.JTextField txtTelefono;
    public static javax.swing.JTextField txtcedula;
    public static javax.swing.JPasswordField txtcontra;
    public static javax.swing.JTextField txtcorreo;
    private javax.swing.JLabel txtmensaje;
    protected static javax.swing.JTextField txtnombre;
    public static javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
