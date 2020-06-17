package com.idesi.proyecto.recursos;

import javax.swing.JOptionPane;

public class Ventana_Mostrar extends javax.swing.JFrame {

    //Interfaz entre ventanas
    VentanaRecursos Obj_VentanaRecursos = null;
    Producto[] Obj_Producto = null;
    ImagenFondo ejemplo = new ImagenFondo();

    int posicion;

    public Ventana_Mostrar() {
        initComponents();
    }

    Ventana_Mostrar(VentanaRecursos Obj_VentanaRecursos, Producto[] Obj_Producto) {
        this.Obj_VentanaRecursos = Obj_VentanaRecursos;
        this.Obj_Producto = Obj_Producto;
        this.setContentPane(ejemplo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_Codigo = new javax.swing.JLabel();
        lbl_Tipo = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_Cantidad = new javax.swing.JLabel();
        lbl_Precio = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();
        btn_Aceptar = new javax.swing.JButton();
        txt_Codigo = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Tipo = new javax.swing.JTextField();
        txt_Cantidad = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mni_Regresar = new javax.swing.JMenuItem();
        mni_Aceptar = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Codigo.setText("Código                                 >");

        lbl_Tipo.setText("Tipo de Producto                  >");

        lbl_Nombre.setText("Nombre                               >");

        lbl_Cantidad.setText("Cantidad en existencia        >");

        lbl_Precio.setText("Precio                             >");

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        btn_Aceptar.setText("Aceptar");
        btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarActionPerformed(evt);
            }
        });

        txt_Codigo.setEditable(false);

        txt_Nombre.setEditable(false);

        txt_Tipo.setEditable(false);

        txt_Cantidad.setEditable(false);
        txt_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CantidadActionPerformed(evt);
            }
        });

        txt_Precio.setEditable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idesi/proyecto/recursos/imagenes/Esculapio.jpg"))); // NOI18N

        jMenu1.setText("File");

        mni_Regresar.setText("Regresar");
        mni_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_RegresarActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Regresar);

        mni_Aceptar.setText("Aceptar");
        mni_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_AceptarActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Aceptar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_Precio)
                                .addGap(36, 36, 36)
                                .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Codigo)
                                    .addComponent(lbl_Nombre))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(txt_Codigo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(196, 196, 196)
                                    .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbl_Tipo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_Cantidad)
                                .addGap(39, 39, 39)
                                .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btn_Regresar)
                        .addGap(70, 70, 70)
                        .addComponent(btn_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Codigo)
                            .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Tipo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Cantidad)
                            .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Precio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Aceptar)
                            .addComponent(btn_Regresar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CantidadActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        this.setVisible(false);
        Obj_VentanaRecursos.setVisible(true);

    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed

        int Precio = Integer.parseInt(txt_Precio.getText());
        Obj_Producto[posicion].setPrecio(Precio);
        JOptionPane.showMessageDialog(this, "El nuevo precio del producto se ha actualizado");
    }//GEN-LAST:event_btn_AceptarActionPerformed

    private void mni_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_RegresarActionPerformed
        this.btn_RegresarActionPerformed(evt);
    }//GEN-LAST:event_mni_RegresarActionPerformed

    private void mni_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_AceptarActionPerformed
        this.btn_AceptarActionPerformed(evt);
    }//GEN-LAST:event_mni_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_Cantidad;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Precio;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JMenuItem mni_Aceptar;
    private javax.swing.JMenuItem mni_Regresar;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_Tipo;
    // End of variables declaration//GEN-END:variables

    void Modo_Buscar(String respuerta, int posicion) {
        mni_Aceptar.setVisible(false);
        btn_Aceptar.setVisible(false);
        this.posicion = posicion;
        String Existencia = String.valueOf(Obj_Producto[posicion].getExistencia());
        String Codigo = String.valueOf(Obj_Producto[posicion].getCodigo());
        String Precio = String.valueOf(Obj_Producto[posicion].getPrecio());

        txt_Cantidad.setText(Existencia);
        txt_Codigo.setText(Codigo);
        txt_Nombre.setText(Obj_Producto[posicion].getNombreProducto());
        txt_Precio.setText(Precio);
        txt_Tipo.setText(Obj_Producto[posicion].getTipoProducto());
    }

    void Modo_Modificar(int Codigo, int posicion) {
        this.posicion = posicion;
        btn_Aceptar.setVisible(true);
        mni_Aceptar.setVisible(true);
        txt_Precio.setEditable(true);
        Mostrar_Datos(posicion);
    }

    public void Mostrar_Datos(int posicion) {
        this.posicion = posicion;
        String Existencia = String.valueOf(Obj_Producto[posicion].getExistencia());
        String Codigo = String.valueOf(Obj_Producto[posicion].getCodigo());
        String Precio = String.valueOf(Obj_Producto[posicion].getPrecio());

        txt_Cantidad.setText(Existencia);
        txt_Codigo.setText(Codigo);
        txt_Nombre.setText(Obj_Producto[posicion].getNombreProducto());
        txt_Precio.setText(Precio);
        txt_Tipo.setText(Obj_Producto[posicion].getTipoProducto());
    }
}
