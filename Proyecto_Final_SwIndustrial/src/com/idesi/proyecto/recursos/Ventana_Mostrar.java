
package com.idesi.proyecto.recursos;

public class Ventana_Mostrar extends javax.swing.JFrame {
    
    //Interfaz entre ventanas
    VentanaRecursos Obj_VentanaRecursos = null;
    Producto[] Obj_Producto = null;

    public Ventana_Mostrar() {
        initComponents();
    }

    Ventana_Mostrar(VentanaRecursos Obj_VentanaRecursos, Producto[] Obj_Producto) {
        this.Obj_VentanaRecursos = Obj_VentanaRecursos;
        this.Obj_Producto = Obj_Producto;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Codigo)
                            .addComponent(lbl_Nombre))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Nombre)
                            .addComponent(txt_Codigo)
                            .addComponent(txt_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Tipo)
                                    .addComponent(lbl_Cantidad))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lbl_Precio)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Codigo)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Tipo))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cantidad)
                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Precio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Aceptar)
                .addContainerGap())
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
    private javax.swing.JLabel lbl_Cantidad;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Precio;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_Tipo;
    // End of variables declaration//GEN-END:variables

    void Modo_Buscar() {
        btn_Aceptar.setVisible(false);
    }

    void Modo_Modificar(int Codigo, int posicion) {
        btn_Aceptar.setVisible(true);
        Mostrar_Datos(posicion);
    }
    public void Mostrar_Datos(int posicion){
        
        String Existencia = String.valueOf(Obj_Producto[posicion].getExistencia());
        String Codigo = String.valueOf(Obj_Producto[posicion].getCodigo());
        String Producto() = String.valueOf(entero);
        
        txt_Cantidad.setText(Existencia);
        txt_Codigo.setText(Codigo));
        txt_Nombre.setText(Obj_Producto[posicion].getNombreProducto());
        txt_Precio.setText(t);
        txt_Tipo.setText(Obj_Producto[posicion].getTipoProducto());
    }
}
