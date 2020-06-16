/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idesi.proyecto.personal;

import com.idesi.proyecto.clientes.*;
import com.idesi.proyecto.recursos.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristofer
 */
public class VentanaAgregarProducto extends javax.swing.JFrame {

    private VentanaPersonal vtnPersonal;
    private Empleado[] empleados;
    private Producto[] productos;
    protected int posEmp;
    protected int posProd;

    /**
     * Creates new form VentanaAgregar
     */
    public VentanaAgregarProducto() {
        initComponents();
    }

    public VentanaAgregarProducto(VentanaPersonal vtnPersonal, Empleado[] empleados, Producto[] productos) {
        this.vtnPersonal = vtnPersonal;
        this.empleados = empleados;
        this.productos = productos;
        initComponents();
    }

    private boolean revisarAlmacenamiento() {
        if (posProd == 5) {
            mostrarAviso(5);
            return false;
        } else {
            return true;
        }
    }

    private boolean revisarEntrada() {
        if (!(txtCodigoEmp.getText().equals(""))) {
            return true;
        } else {
            mostrarAviso(6);
            return false;
        }
    }

    private boolean revisarEntradas() {
        if (!(txtNombre.getText().equals(""))
                && !(txtCodigo.getText().equals(""))
                && !(txtExistencia.getText().equals(""))
                && !(txtPrecio.getText().equals(""))) {
            if (txtExistencia.getText().matches("[0-9]+")) {
                if (txtPrecio.getText().matches("[0-9]+")) {
                    return true;
                } else {
                    mostrarAviso(4);
                    return false;
                }

            } else {
                mostrarAviso(3);
                return false;
            }
        } else {
            mostrarAviso(2);
            return false;
        }
    }

    private void procesoValidar() {
        String buscado = txtCodigoEmp.getText();
        Boolean valido = false;
        for (int i = 0; i < posEmp; i++) {
            if (buscado.equals(empleados[i].getCodigoEmpleado()) && (empleados[i].getTipoEmpleado().equals("Laboratorista"))) {
                
                valido = true;
                break;
            }
            System.out.println(buscado.equals(empleados[i].getCodigoEmpleado()));
            System.out.println((empleados[i].getTipoEmpleado().equals("Laboratorista")));
            System.out.println("Empleado: " + empleados[i].getCodigoEmpleado() + "Rol: " + empleados[i].getTipoEmpleado());
        }

        if (valido) {
            txtCodigo.setEnabled(true);
            cmbTipo.setEnabled(true);
            txtNombre.setEnabled(true);
            txtExistencia.setEnabled(true);
            txtPrecio.setEnabled(true);
        } else {
            txtCodigo.setEnabled(false);
            cmbTipo.setEnabled(false);
            txtNombre.setEnabled(false);
            txtExistencia.setEnabled(false);
            txtPrecio.setEnabled(false);
            mostrarAviso(6);
        }

    }

    private void procesoGuardar() {
        productos[posProd] = new Producto();
        productos[posProd].setCodigo(Integer.parseInt(txtCodigoEmp.getText().trim()));
        productos[posProd].setTipoProducto(cmbTipo.getSelectedItem().toString());
        productos[posProd].setNombreProducto(txtNombre.getText().trim());
        productos[posProd].setExistencia(Integer.parseInt(txtExistencia.getText().trim()));
        productos[posProd].setPrecio(Integer.parseInt(txtPrecio.getText().trim()));

        posProd++;
        //AjustarCambiosEnTodosPerrosLados
        mostrarAviso(1);
        limpiarCampos();

    }

    private void procesoRegresar() {
        limpiarCampos();
        vtnPersonal.setVisible(true);
        this.setVisible(false);

    }

    private void limpiarCampos() {
        txtCodigoEmp.setText("");
        txtNombre.setText("");
        txtExistencia.setText("");
        txtPrecio.setText("");
    }

    private void mostrarAviso(int aviso) {
        switch (aviso) {
            case 1:
                JOptionPane.showMessageDialog(this,
                        "Producto registrado con exito.");
                break;
            case 2:
                JOptionPane.showMessageDialog(
                        this,
                        "Favor de no dejar ningun campo en blanco, revise lo introducido.");
                break;
            case 3:
                JOptionPane.showMessageDialog(
                        this,
                        "Favor de solo introducir números enteros en el campo de existencia.");
                break;
            case 4:
                JOptionPane.showMessageDialog(
                        this,
                        "Favor de solo introducir números enteros en el campo de precio.");
                break;
            case 5:
                JOptionPane.showMessageDialog(
                        this,
                        "Almacenamiento completo, no se pueden guardar más.");
                break;
            case 6:
                JOptionPane.showMessageDialog(
                        this,
                        "El codigo de empleado introducido no coincide con ninguno de los registrados o el empleado no es laboratista.");
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

        jScrollBar1 = new javax.swing.JScrollBar();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblExistencia = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        lblCodigoEmp = new javax.swing.JLabel();
        txtCodigoEmp = new javax.swing.JTextField();
        lblRegistro = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblPrecio = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnValidar = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        txtNombre.setEnabled(false);

        lblExistencia.setText("Existencia:");

        txtExistencia.setEnabled(false);

        txtPrecio.setEnabled(false);

        lblCodigoEmp.setText("Codigo de Empleado:");

        lblRegistro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRegistro.setText("Agregar Productos");

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
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

        lblPrecio.setText("Precio:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Laboratorista"}));
        cmbTipo.setEnabled(false);

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo de producto:");

        lblCodigo.setText("Código:");

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCodigo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblExistencia)
                                    .addComponent(lblPrecio))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtExistencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtPrecio))))
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblRegistro)
                            .addGap(116, 116, 116))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(102, 102, 102)
                                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCodigoEmp)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCodigoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(12, 12, 12)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblRegistro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoEmp)
                    .addComponent(txtCodigoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExistencia)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnRegresar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (revisarAlmacenamiento()) {
            if (revisarEntradas()) {
                procesoGuardar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        procesoRegresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        if(revisarEntrada()){
            procesoValidar();
        }
    }//GEN-LAST:event_btnValidarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoEmp;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoEmp;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
