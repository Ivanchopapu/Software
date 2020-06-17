/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idesi.proyecto.personal;

import com.idesi.proyecto.clientes.*;
import javax.swing.JOptionPane;
import com.idesi.proyecto.recursos.ImagenFondo;

/**
 *
 * @author Cristofer
 */
public class VentanaAgregar extends javax.swing.JFrame {

    private VentanaPersonal vtnPersonal;
    private Empleado[] empleados;
    ImagenFondo ejemplo = new ImagenFondo();

    protected int posEmp;

    /**
     * Creates new form VentanaAgregar
     */
    public VentanaAgregar() {
        initComponents();
    }

    public VentanaAgregar(VentanaPersonal vtnPersonal, Empleado[] clientes) {
        this.vtnPersonal = vtnPersonal;
        this.empleados = clientes;
        this.setContentPane(ejemplo);
        initComponents();
    }

    private boolean revisarAlmacenamiento() {
        if (posEmp == 5) {
            mostrarAviso(4);
            return false;
        } else {
            return true;
        }
    }

    private boolean revisarEntradas() {
        if (!(txtNombre.getText().equals(""))
                && !(txtCodigo.getText().equals(""))
                && !(txtEdad.getText().equals(""))
                && !(txtRFC.getText().equals(""))) {
            if (txtEdad.getText().matches("[0-9]+")) {
                return true;
            } else {
                mostrarAviso(3);
                return false;
            }
        } else {
            mostrarAviso(2);
            return false;
        }
    }

    private void procesoGuardar() {
        empleados[posEmp] = new Empleado();
        empleados[posEmp].setCodigoEmpleado(txtCodigo.getText().trim());
        empleados[posEmp].setNombre(txtNombre.getText().trim());
        empleados[posEmp].setEdad(Integer.parseInt(txtEdad.getText().trim()));
        empleados[posEmp].setTipoEmpleado(cmbTipo.getSelectedItem().toString());
        empleados[posEmp].setRFC(txtRFC.getText().trim());

        posEmp++;
        mostrarAviso(1);
        limpiarCampos();

    }

    private void procesoRegresar() {
        limpiarCampos();
        vtnPersonal.setVisible(true);
        this.setVisible(false);

    }

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtRFC.setText("");
    }

    private void mostrarAviso(int aviso) {
        switch (aviso) {
            case 1:
                JOptionPane.showMessageDialog(this,
                        "Empleado registrado con exito.");
                break;
            case 2:
                JOptionPane.showMessageDialog(
                        this,
                        "Favor de no dejar ningun campo en blanco, revise lo introducido.");
                break;
            case 3:
                JOptionPane.showMessageDialog(
                        this,
                        "Favor de solo introducir números enteros en el campo de edad.");
                break;
            case 4:
                JOptionPane.showMessageDialog(
                        this,
                        "Almacenamiento completo, no se pueden guardar más.");
                break;
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

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblDomicilio = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblRegistro = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblRFC = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mni_Guardar = new javax.swing.JMenuItem();
        mni_Regresar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mni_Borrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        lblEdad.setText("Edad:");

        lblDomicilio.setText("Tipo de empleado:");

        lblCodigo.setText("Codigo:");

        lblRegistro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRegistro.setText("Registro de Empleados");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblRFC.setText("RFC:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Laboratorista"}));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idesi/proyecto/personal/Imagenes/Personal.jpg"))); // NOI18N

        jMenu1.setText("Archivo");

        mni_Guardar.setText("Guardar");
        mni_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_GuardarActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Guardar);

        mni_Regresar.setText("Regresar");
        mni_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_RegresarActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Regresar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");

        mni_Borrar.setText("Borrar");
        mni_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_BorrarActionPerformed(evt);
            }
        });
        jMenu2.add(mni_Borrar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(73, 73, 73)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEdad)
                                    .addComponent(lblNombre)
                                    .addComponent(lblRFC))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDomicilio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRFC, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(txtEdad)
                            .addComponent(txtNombre)
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(lblRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistro)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRFC)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDomicilio)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnRegresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (revisarAlmacenamiento()) {
            if (revisarEntradas()) {
                procesoGuardar();
                vtnPersonal.aplicarCambiosPersonal(this.posEmp);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        procesoRegresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void mni_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_GuardarActionPerformed
        this.btnGuardarActionPerformed(evt);
    }//GEN-LAST:event_mni_GuardarActionPerformed

    private void mni_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_RegresarActionPerformed
        this.btnRegresarActionPerformed(evt);
    }//GEN-LAST:event_mni_RegresarActionPerformed

    private void mni_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_BorrarActionPerformed
        txtCodigo.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
        txtRFC.setText("");
    }//GEN-LAST:event_mni_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JMenuItem mni_Borrar;
    private javax.swing.JMenuItem mni_Guardar;
    private javax.swing.JMenuItem mni_Regresar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
