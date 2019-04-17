/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCitas;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author kille
 */
public class Citas extends javax.swing.JInternalFrame {
    private ControladorCitas cCitas;
    public JComboBox<String> getHoras() {
        return horas;
    }

    public JTextField getTxtCedulaMedic() {
        return txtCedulaMedic;
    }

    public JTextField getTxtCedulaPaciente() {
        return txtCedulaPaciente;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void cargarHora(){
            horas.addItem("7:00 am"); 
            horas.addItem("8:00 am");        
            horas.addItem("9:00 am");  
            horas.addItem("10:00 am");    
            horas.addItem("11:00 am");          
            horas.addItem("12:00 pm");        
            horas.addItem("1:00 pm");        
            horas.addItem("2:00 pm");           
            horas.addItem("3:00 pm");
            horas.addItem("4:00 pm");       
        }
    public Citas() {
        initComponents();
        cCitas= new ControladorCitas(this);
         this.getContentPane().setBackground(new Color(85,151,248));
        cargarHora();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFecha = new javax.swing.JTextField();
        txtCedulaMedic = new javax.swing.JTextField();
        txtCedulaPaciente = new javax.swing.JTextField();
        horas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);

        txtFecha.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fecha dia/mes/año", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N

        txtCedulaMedic.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtCedulaMedic.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cedula del medico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N
        txtCedulaMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMedicActionPerformed(evt);
            }
        });
        txtCedulaMedic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaMedicKeyReleased(evt);
            }
        });

        txtCedulaPaciente.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        txtCedulaPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cedula del paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 0, 12))); // NOI18N
        txtCedulaPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaPacienteKeyReleased(evt);
            }
        });

        horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horas" }));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha)
                    .addComponent(horas)
                    .addComponent(txtCedulaMedic)
                    .addComponent(txtCedulaPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMedicActionPerformed
        
    }//GEN-LAST:event_txtCedulaMedicActionPerformed

    private void txtCedulaMedicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMedicKeyReleased
        if (cCitas.buscarMedico()== true) {
            txtCedulaMedic.setForeground(Color.GREEN);
        }else{
        txtCedulaMedic.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtCedulaMedicKeyReleased

    private void txtCedulaPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaPacienteKeyReleased
       if (cCitas.buscarPaciente()== true) {
            txtCedulaPaciente.setForeground(Color.GREEN);
        }else{
        txtCedulaPaciente.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtCedulaPacienteKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cCitas.guardarCita();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> horas;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtCedulaMedic;
    private javax.swing.JTextField txtCedulaPaciente;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
