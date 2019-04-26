/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCitas;
import Controlador.ControladorExpendiente;
import Modelo.Archivo;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Jose,Marco,Yuliana,Elver
 */
public class ExpedienteSensillo extends javax.swing.JInternalFrame implements Runnable{
        private boolean estado; 
        private Archivo arch;
        private ControladorCitas cCitas;
        private ControladorExpendiente exp;
        
       public synchronized void buscar(){
      while(this.estado){
           try {
             exp.buscarObservaciones(this);
          } catch (Exception e) {
          }
            try {
                this.wait();
            } catch (InterruptedException ex1) {
                
            }
      }
       }
  
    public JTextField getTxtFechaAtencion() {
        return txtFechaAtencion;
    }

    public JTable getTablaObser() {
        return TablaObser;
    }

    public void setTxtFechaAtencion(String txtFechaAtencion) {
        this.txtFechaAtencion.setText(txtFechaAtencion);
    }

    public void setTxtFechaPaciente(String txtFechaPaciente) {
        this.txtFechaPaciente.setText(txtFechaPaciente);
    }

    public void setTxtNombrePaciente(String txtNombrePaciente) {
        this.txtNombrePaciente.setText(txtNombrePaciente);
    }
    
   
    public JTable getTablaCitasDelDia() {
        return TablaCitasDelDia;
    }

  
    public JTextField getTxtCedulaMedic() {
        return txtCedulaMedic;
    }

    public JTextField getTxtCedulaPaciente() {
        return txtCedulaPaciente;
    }

    public JTextArea getTxtComentario() {
        return txtComentario;
    }

    public JTextField getTxtEspecialidad() {
        return txtEspecialidad;
    }

    public JLabel getTxtExpendiente() {
        return txtExpendiente;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public JTextField getTxtFechaPaciente() {
        return txtFechaPaciente;
    }

    public JTextField getTxtHora() {
        return txtHora;
    }

    public JTextField getTxtMedico() {
        return txtMedico;
    }

    public JTextField getTxtNombrePaciente() {
        return txtNombrePaciente;
    }


    public ExpedienteSensillo() {
        initComponents();
        this.estado=true;
           this.getContentPane().setBackground(new Color(85,151,248));
           cCitas=new ControladorCitas();
           exp= new ControladorExpendiente();
       this.rPresente.setVisible(false);
       this.rAusente.setVisible(false);
           Thread h1=new Thread(this);
           h1.start();
    }

    public void setTxtCedulaMedic(String txtCedulaMedic) {
        this.txtCedulaMedic.setText(txtCedulaMedic);
    }

    public void setTxtEspecialidad(String txtEspecialidad) {
        this.txtEspecialidad.setText(txtEspecialidad);
    }

    public void setTxtMedico(String txtMedico) {
        this.txtMedico.setText(txtMedico);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtExpendiente = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        txtNombrePaciente = new javax.swing.JTextField();
        txtFechaPaciente = new javax.swing.JTextField();
        txtCedulaMedic = new javax.swing.JTextField();
        txtCedulaPaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCitasDelDia = new javax.swing.JTable();
        txtMedico = new javax.swing.JTextField();
        txtFechaAtencion = new javax.swing.JTextField();
        rPresente = new javax.swing.JRadioButton();
        rAusente = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaObser = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(85, 151, 248));

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel1.setText("Expediente:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Metro-Save-Blue-256.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtEspecialidad.setEditable(false);
        txtEspecialidad.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Especialdiad del medico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtNombrePaciente.setEditable(false);
        txtNombrePaciente.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtNombrePaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nombre del paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtFechaPaciente.setEditable(false);
        txtFechaPaciente.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtFechaPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha de nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtCedulaMedic.setEditable(false);
        txtCedulaMedic.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtCedulaMedic.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cedula del medico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtCedulaPaciente.setEditable(false);
        txtCedulaPaciente.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtCedulaPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cedula del paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        txtComentario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Descripción de la cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N
        jScrollPane1.setViewportView(txtComentario);

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha de la cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtHora.setEditable(false);
        txtHora.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtHora.setToolTipText("");
        txtHora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hora de la cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        TablaCitasDelDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Cita", "Fecha", "Hora", "Paciente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaCitasDelDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCitasDelDiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCitasDelDia);

        txtMedico.setEditable(false);
        txtMedico.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Medico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtFechaAtencion.setEditable(false);
        txtFechaAtencion.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtFechaAtencion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha de atencion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        buttonGroup1.add(rPresente);
        rPresente.setText("Presente");
        rPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPresenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rAusente);
        rAusente.setText("Ausente");
        rAusente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAusenteActionPerformed(evt);
            }
        });

        TablaObser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaObser);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rPresente)
                        .addGap(127, 127, 127)
                        .addComponent(rAusente))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(txtMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rPresente)
                            .addComponent(rAusente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtCedulaMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtFechaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(txtFechaAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (exp.verificarExistenciaDeExpediente(this)==true) {
            JOptionPane.showMessageDialog(null, "Se guardo el expediente");
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe una observacion y expediente, se le recomienda que actualice mejor");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaCitasDelDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCitasDelDiaMouseClicked
     enviar();
    }//GEN-LAST:event_TablaCitasDelDiaMouseClicked
  public synchronized void enviar(){
   this.txtCedulaPaciente.setText(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 3)));
        exp.buscarpaciente(this);
        String fecha2[]=(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 1))).split("-");
        this.txtFecha.setText(fecha2[2]+"/"+fecha2[1]+"/"+fecha2[0]);
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==7) {
            this.txtHora.setText(7+":00 AM");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==8) {
            this.txtHora.setText(8+":00 AM");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==9) {
            this.txtHora.setText(9+":00 AM");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==10) {
            this.txtHora.setText(10+":00 AM");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==11) {
            this.txtHora.setText(11+":00 AM");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==12) {
            this.txtHora.setText(12+":00 MD");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==13) {
            this.txtHora.setText(13+":00 PM");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==14) {
            this.txtHora.setText(14+":00 PM");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==15) {
            this.txtHora.setText(15+":00 PM");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        if (Integer.parseInt(String.valueOf(this.TablaCitasDelDia.getValueAt(this.TablaCitasDelDia.getSelectedRow(), 2)))==16) {
            this.txtHora.setText(16+":00 PM");
            this.rPresente.setVisible(true);
            this.rAusente.setVisible(true);
        }
        notify();
  }
    private void rPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPresenteActionPerformed
        if (rPresente.isSelected()) {
           this.txtComentario.setText("");
        }
    }//GEN-LAST:event_rPresenteActionPerformed

    private void rAusenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAusenteActionPerformed
        if (rAusente.isSelected()) {
             this.txtComentario.setText("El paciente no se presentó a la cita");
        }
    }//GEN-LAST:event_rAusenteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        exp.acutalizarExpediente(this);
        exp.exportarXML(this);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCitasDelDia;
    private javax.swing.JTable TablaObser;
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rAusente;
    private javax.swing.JRadioButton rPresente;
    private javax.swing.JTextField txtCedulaMedic;
    private javax.swing.JTextField txtCedulaPaciente;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JLabel txtExpendiente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaAtencion;
    private javax.swing.JTextField txtFechaPaciente;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtNombrePaciente;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       buscar();
    }

}
