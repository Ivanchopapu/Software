package com.idesi.proyecto.clientes;

import com.idesi.proyecto.recursos.ImagenFondo;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristofer
 */
public class VentanaModificar extends javax.swing.JFrame {

    private VentanaClientes vtnClientes;
    private Cliente[] clientes;
    ImagenFondo ejemplo = new ImagenFondo();
    private int posBusqueda = 5;
    private int posModificar = 0;
    protected int posClientes;

    /**
     * Creates new form VentanaBuscar
     */
    public VentanaModificar() {
        initComponents();
    }

    public VentanaModificar(VentanaClientes vtnClientes, Cliente[] clientes) {
        this.vtnClientes = vtnClientes;
        this.clientes = clientes;
        this.setContentPane(ejemplo);
        initComponents();
    }

    private boolean revisarEntrada() {
        if (!(txtBuscado.getText().equals(""))) {
            return true;
        } else {
            btnGuardar.setEnabled(false);
            mn_Guardar_Cambios.setEnabled(false);
            mostrarAviso(2);
            return false;
        }
    }

    private void procesoBuscar() {
        String buscado = txtBuscado.getText();
        for (int i = 0; i < posClientes; i++) {
            if (buscado.equals(clientes[i].getNombre())) {
                posBusqueda = i;
            }
        }

        if (posBusqueda < 5) {
            mostrarEmpleado();
            posModificar = posBusqueda;
            posBusqueda = 5;
            btnGuardar.setEnabled(true);
            mn_Guardar_Cambios.setEnabled(true);
            mn_Buscar.setEnabled(true);
            txtCodigo.setEnabled(true);
            txtNombre.setEnabled(true);
            txtEdad.setEnabled(true);
            txtDomicilio.setEnabled(true);

        } else {
            mostrarAviso(3);
            btnGuardar.setEnabled(false);
            mn_Guardar_Cambios.setEnabled(false);
            limpiarCamposBusquedaNoEncontrada();
        }

    }

    private void mostrarEmpleado() {
        txtCodigo.setText(clientes[posBusqueda].getCódigo_de_cliente());
        txtNombre.setText(clientes[posBusqueda].getNombre());
        txtEdad.setText(String.valueOf(clientes[posBusqueda].getEdad()));
        txtDomicilio.setText(clientes[posBusqueda].getDomicilio());
    }

    private void procesoModificar() {
        clientes[posModificar].setCódigo_de_cliente(txtCodigo.getText());
        clientes[posModificar].setNombre(txtNombre.getText());
        clientes[posModificar].setEdad(Integer.parseInt(txtEdad.getText()));
        clientes[posModificar].setDomicilio(txtDomicilio.getText());
        btnGuardar.setEnabled(false);
        mn_Guardar_Cambios.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtNombre.setEnabled(false);
        txtEdad.setEnabled(false);
        txtDomicilio.setEnabled(false);
        vtnClientes.aplicarCambiosClientes();
        limpiarCampos();
        mostrarAviso(1);

    }

    private boolean revisarCambios() {
        if (!(txtNombre.getText().equals(""))
                && !(txtCodigo.getText().equals(""))
                && !(txtEdad.getText().equals(""))
                && !(txtDomicilio.getText().equals(""))) {
            if (txtEdad.getText().matches("[0-9]+")) {
                return true;
            } else {
                mostrarAviso(5);
                return false;
            }
        } else {
            mostrarAviso(4);
            return false;
        }
    }

    private void procesoRegresar() {
        limpiarCampos();
        btnGuardar.setEnabled(false);
        mn_Guardar_Cambios.setEnabled(false);
        vtnClientes.setVisible(true);
        this.setVisible(false);

    }

    private void limpiarCampos() {
        txtBuscado.setText("");
        txtCodigo.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtDomicilio.setText("");
    }

    private void limpiarCamposBusquedaNoEncontrada() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtDomicilio.setText("");
    }

    private void mostrarAviso(int aviso) {
        switch (aviso) {
            case 1:
                JOptionPane.showMessageDialog(
                        this,
                        "Cambios realizados con exito");
                break;
            case 2:
                JOptionPane.showMessageDialog(
                        this,
                        "Favor de no dejar el campo de busqueda en blanco, revise lo introducido.");
                break;
            case 3:
                JOptionPane.showMessageDialog(
                        this,
                        "El cliente no se encuentra registrado en el sistema");
                break;
            case 4:
                JOptionPane.showMessageDialog(
                        this,
                        "Favor de no dejar ningun campo en blanco, revise lo introducido.");
                break;
            case 5:
                JOptionPane.showMessageDialog(
                        this,
                        "Favor de solo introducir números enteros en el campo de edad.");
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

        lblTitulo = new javax.swing.JLabel();
        lblBuscado = new javax.swing.JLabel();
        txtBuscado = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblDomicilio = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mn_Buscar = new javax.swing.JMenuItem();
        mn_Guardar_Cambios = new javax.swing.JMenuItem();
        mn_Regresar = new javax.swing.JMenuItem();
        mn_borrar = new javax.swing.JMenu();
        mn_Borrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(527, 247));

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setText("Modificar Datos");
        lblTitulo.setAlignmentY(0.0F);

        lblBuscado.setText("Introduzca un nombre:");

        lblCodigo.setText("Codigo:");

        txtCodigo.setEnabled(false);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

        txtNombre.setDragEnabled(true);
        txtNombre.setEnabled(false);

        lblEdad.setText("Edad:");

        txtEdad.setEnabled(false);

        lblDomicilio.setText("Domicilio:");

        txtDomicilio.setEnabled(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar Cambios");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idesi/proyecto/clientes/Imagenes/Editar_Persona.jpg"))); // NOI18N

        jMenu1.setText("Archivo");

        mn_Buscar.setText("Buscar");
        mn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_BuscarActionPerformed(evt);
            }
        });
        jMenu1.add(mn_Buscar);

        mn_Guardar_Cambios.setText("Guardar Cambios");
        mn_Guardar_Cambios.setEnabled(false);
        mn_Guardar_Cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_Guardar_CambiosActionPerformed(evt);
            }
        });
        jMenu1.add(mn_Guardar_Cambios);

        mn_Regresar.setText("Regresar");
        mn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_RegresarActionPerformed(evt);
            }
        });
        jMenu1.add(mn_Regresar);

        jMenuBar1.add(jMenu1);

        mn_borrar.setText("Edicion");

        mn_Borrar.setText("Borrar");
        mn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_BorrarActionPerformed(evt);
            }
        });
        mn_borrar.add(mn_Borrar);

        jMenuBar1.add(mn_borrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBuscado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTitulo)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblCodigo))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDomicilio)
                                    .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtEdad))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscado)
                    .addComponent(txtBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDomicilio)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        procesoRegresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (revisarEntrada()) {
            procesoBuscar();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (revisarCambios()) {
            procesoModificar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void mn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_BuscarActionPerformed
        this.btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_mn_BuscarActionPerformed

    private void mn_Guardar_CambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_Guardar_CambiosActionPerformed
        this.btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_mn_Guardar_CambiosActionPerformed

    private void mn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_RegresarActionPerformed
        this.btnRegresarActionPerformed(evt);
    }//GEN-LAST:event_mn_RegresarActionPerformed

    private void mn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_BorrarActionPerformed
        txtBuscado.setText("");
        txtCodigo.setText("");
        txtDomicilio.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
    }//GEN-LAST:event_mn_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblBuscado;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mn_Borrar;
    private javax.swing.JMenuItem mn_Buscar;
    private javax.swing.JMenuItem mn_Guardar_Cambios;
    private javax.swing.JMenuItem mn_Regresar;
    private javax.swing.JMenu mn_borrar;
    private javax.swing.JTextField txtBuscado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
