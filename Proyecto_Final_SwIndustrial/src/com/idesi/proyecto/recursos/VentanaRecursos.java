package com.idesi.proyecto.recursos;

import javax.swing.JOptionPane;

public class VentanaRecursos extends javax.swing.JFrame {

    // Interfaz entre ventanas
    Ventana_Mostrar Obj_Ventana_Mostrar = null;
    Ventana_Alta_de_Producto Obj_Ventana_Alta_de_Producto = null;

    Producto Obj_Producto[] = new Producto[50]; //Arreglo de Productos
    int posArr = 0;     //Controla la cantidad de elementos que hay en el Arreglo

    public VentanaRecursos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Alta = new javax.swing.JButton();
        btn_Buscar_Producto = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();
        btn_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Alta.setText("Dar de alta Productos");
        btn_Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AltaActionPerformed(evt);
            }
        });

        btn_Buscar_Producto.setText("Buscar un Producto");
        btn_Buscar_Producto.setEnabled(false);
        btn_Buscar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Buscar_ProductoActionPerformed(evt);
            }
        });

        btn_Modificar.setText("Modificar Precio de un producto");
        btn_Modificar.setEnabled(false);
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Reporte.setText("Reporte de Productos");
        btn_Reporte.setEnabled(false);

        btn_Regresar.setText("Regresar a la ventana principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Buscar_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Alta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_Regresar)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_Alta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Buscar_Producto)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Reporte)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Regresar)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Genera una nuevo producto con todas sus especificaciones 
    private void btn_AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AltaActionPerformed

        if (Obj_Ventana_Alta_de_Producto == null) {
            Obj_Ventana_Alta_de_Producto = new Ventana_Alta_de_Producto(this, Obj_Producto);

        }
        this.setVisible(false);
        Obj_Ventana_Alta_de_Producto.setVisible(true);
    }//GEN-LAST:event_btn_AltaActionPerformed

    private void btn_Buscar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscar_ProductoActionPerformed
        
        int posicion = 0;
        if (Obj_Ventana_Mostrar == null) {
            Obj_Ventana_Mostrar = new Ventana_Mostrar(this, Obj_Producto);
        }
        
        /*
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del Producto"));
        while (posicion <= Obj_Producto.length) {
            if (Codigo == Obj_Producto[posicion].getCodigo()) {
                break;
            }
            posicion++;
        }
        */
        this.setVisible(false);
        Obj_Ventana_Mostrar.setVisible(true);
        Obj_Ventana_Mostrar.Modo_Buscar();
    }//GEN-LAST:event_btn_Buscar_ProductoActionPerformed

    
    
    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        int posicion = 0;
        if (Obj_Ventana_Mostrar == null) {
            Obj_Ventana_Mostrar = new Ventana_Mostrar(this, Obj_Producto);
        }
        int Codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del Producto"));
        while (posicion <= Obj_Producto.length) {
            if (Codigo == Obj_Producto[posicion].getCodigo()) {
                break;
            }
            posicion++;
        }
        Obj_Ventana_Mostrar.Modo_Modificar(Codigo, posicion);
        this.setVisible(false);
        Obj_Ventana_Mostrar.setVisible(true);
    }//GEN-LAST:event_btn_ModificarActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(VentanaRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRecursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRecursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alta;
    private javax.swing.JButton btn_Buscar_Producto;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_Reporte;
    // End of variables declaration//GEN-END:variables

    void Enable_Faltantes() {
        btn_Buscar_Producto.setEnabled(true);
        btn_Modificar.setEnabled(true);
        btn_Reporte.setEnabled(true);
    }
}
