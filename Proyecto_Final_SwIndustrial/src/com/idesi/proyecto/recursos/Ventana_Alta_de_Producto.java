package com.idesi.proyecto.recursos;

import javax.swing.JOptionPane;

public class Ventana_Alta_de_Producto extends javax.swing.JFrame {
    
    VentanaRecursos Obj_VentanaRecursos = null;
    Producto[] Obj_Producto;
    ImagenFondo ejemplo = new ImagenFondo();

    boolean Auxiliar = true;
    
    public boolean isAuxiliar() {
        return Auxiliar;
    }
    
    public void setAuxiliar(boolean Auxiliar) {
        this.Auxiliar = Auxiliar;
    }
    
    public Ventana_Alta_de_Producto() {
        initComponents();
    }
    
    Ventana_Alta_de_Producto(VentanaRecursos Obj_VentanaRecursos, Producto[] Obj_Producto) {
        this.Obj_VentanaRecursos = Obj_VentanaRecursos;
        this.Obj_Producto = Obj_Producto;
        this.setContentPane(ejemplo);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Nombre = new javax.swing.JLabel();
        lbl_Codigo = new javax.swing.JLabel();
        lbl_Tipo = new javax.swing.JLabel();
        lbl_Cantidad = new javax.swing.JLabel();
        lbl_Precio = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Codigo = new javax.swing.JTextField();
        txt_Cantidad = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        btn_Aceptar = new javax.swing.JButton();
        box_Tipo = new javax.swing.JComboBox<>();
        btn_Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Nombre.setText("Nombre de producto ");

        lbl_Codigo.setText("Código   ");

        lbl_Tipo.setText("Tipo de producto ");

        lbl_Cantidad.setText("Cantidad en existencia          ");

        lbl_Precio.setText("Precio  ");

        txt_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecioActionPerformed(evt);
            }
        });

        btn_Aceptar.setText("Aceptar");
        btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarActionPerformed(evt);
            }
        });

        box_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analgésico", "Antibiótico", "Preventivo" }));

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idesi/proyecto/recursos/imagenes/Nuevo_Archivo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_Aceptar)
                            .addGap(51, 51, 51)
                            .addComponent(btn_Regresar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbl_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbl_Tipo)
                                    .addGap(33, 33, 33)
                                    .addComponent(box_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Codigo)
                                .addGap(67, 67, 67)
                                .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Cantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Nombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Cantidad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Tipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Precio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Aceptar)
                    .addComponent(btn_Regresar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecioActionPerformed

    }//GEN-LAST:event_txt_PrecioActionPerformed

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed
        
        int posicion = 0;

        // Interfas
        if (Obj_VentanaRecursos == null) {
            Obj_VentanaRecursos = new VentanaRecursos();
        }

        // Encuentra la posición siguiente disponible         
        while (posicion <= Obj_Producto.length) {
            if (Obj_Producto[posicion] == null) {
                Obj_Producto[posicion] = new Producto();
                break;
            } else {
                posicion++;
            }
        }
        // Guarda los datos del nuevo Objeto
        try {       // Compara si algún dato está mal 
            int Tamaño = Obj_VentanaRecursos.getTamaño() + 1;
            Obj_VentanaRecursos.setTamaño(Tamaño);
            this.setAuxiliar(true);
            int Codigo = Integer.parseInt(txt_Codigo.getText());
            int Existencia = Integer.parseInt(txt_Cantidad.getText());
            int Precio = Integer.parseInt(txt_Precio.getText());
            
            Obj_Producto[posicion].setCodigo(Codigo);
            Obj_Producto[posicion].setExistencia(Existencia);
            Obj_Producto[posicion].setPrecio(Precio);
            Obj_Producto[posicion].setNombreProducto(txt_Nombre.getText());
            Obj_Producto[posicion].setTipoProducto(box_Tipo.getSelectedItem().toString());
            
            
        } catch (Exception e) {
            
            this.setAuxiliar(false);
            Obj_Producto[posicion].setCodigo(0);
            Obj_Producto[posicion].setExistencia(0);
            Obj_Producto[posicion].setPrecio(0);
            Obj_Producto[posicion].setNombreProducto("");
            Obj_Producto[posicion].setTipoProducto("");
            limpiar();
            JOptionPane.showMessageDialog(this, "Algún dato no está bien escrito");
            
        } finally {
            if (this.isAuxiliar() == true) {
                JOptionPane.showMessageDialog(this, "El registro se guardó ");                
                limpiar();
                Obj_VentanaRecursos.Enable_Faltantes();
            }
        }
    }//GEN-LAST:event_btn_AceptarActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        this.setVisible(false);
        Obj_VentanaRecursos.setVisible(true);
    }//GEN-LAST:event_btn_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Alta_de_Producto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Alta_de_Producto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Alta_de_Producto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Alta_de_Producto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Alta_de_Producto().setVisible(true);
            }
        });
    }

    private void limpiar() {
        txt_Cantidad.setText("");
        txt_Codigo.setText("");
        txt_Nombre.setText("");
        txt_Precio.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_Tipo;
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Cantidad;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Precio;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Precio;
    // End of variables declaration//GEN-END:variables
}
