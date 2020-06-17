package com.idesi.proyecto.recursos;

import com.idesi.proyecto.VentanaPrincipal;
import javax.swing.JOptionPane;

public class VentanaRecursos extends javax.swing.JFrame {

    // Interfaz entre ventanas
    private VentanaPrincipal vtnPrincipal = null;
    private Ventana_Mostrar Obj_Ventana_Mostrar = null;
    private Ventana_Reporte Obj_Ventana_Reporte = null;
    ImagenFondo ejemplo = new ImagenFondo();

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
        this.vtnPrincipal.ajustarCambiosProductos(this.Tamaño);
    }
    Ventana_Alta_de_Producto Obj_Ventana_Alta_de_Producto = null;

    Producto Obj_Producto[]; //Arreglo de Productos
    public int posArr = 0;     //Controla la cantidad de elementos que hay en el Arreglo
    public int Tamaño;

    public VentanaRecursos() {
        initComponents();
    }

    public VentanaRecursos(VentanaPrincipal vtnPrincipal, Producto[] productos) {
        this.vtnPrincipal = vtnPrincipal;
        this.Obj_Producto = productos;
        this.setContentPane(ejemplo);
        initComponents();

    }

    private void procesoRegresar() {
        vtnPrincipal.setVisible(true);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Alta = new javax.swing.JButton();
        btn_Buscar_Producto = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();
        btn_Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mni_Dar_de_Alta_Producto = new javax.swing.JMenuItem();
        mni_Buscar_un_Producto = new javax.swing.JMenuItem();
        mni_Reporte_de_Producto = new javax.swing.JMenuItem();
        mni_Modificar_Precio_de_un_Producto = new javax.swing.JMenuItem();
        mni_Regresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Alta.setText("Dar de Alta Producto");
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
        btn_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReporteActionPerformed(evt);
            }
        });

        btn_Regresar.setText("Regresar a la ventana principal");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idesi/proyecto/recursos/imagenes/Editar.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idesi/proyecto/recursos/imagenes/Inventario.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idesi/proyecto/recursos/imagenes/Nuevo_Archivo.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idesi/proyecto/recursos/imagenes/Lupita.jpg"))); // NOI18N

        jMenu1.setText("Archivo");

        mni_Dar_de_Alta_Producto.setText("Dar de Alta Producto");
        mni_Dar_de_Alta_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_Dar_de_Alta_ProductoActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Dar_de_Alta_Producto);

        mni_Buscar_un_Producto.setText("Buscar un Producto");
        mni_Buscar_un_Producto.setEnabled(false);
        mni_Buscar_un_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_Buscar_un_ProductoActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Buscar_un_Producto);

        mni_Reporte_de_Producto.setText("Reporte de Producto");
        mni_Reporte_de_Producto.setEnabled(false);
        mni_Reporte_de_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_Reporte_de_ProductoActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Reporte_de_Producto);

        mni_Modificar_Precio_de_un_Producto.setText("Modificar Precio de un Producto");
        mni_Modificar_Precio_de_un_Producto.setEnabled(false);
        mni_Modificar_Precio_de_un_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_Modificar_Precio_de_un_ProductoActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Modificar_Precio_de_un_Producto);

        mni_Regresar.setText("Regresar a la ventana Principal");
        mni_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_RegresarActionPerformed(evt);
            }
        });
        jMenu1.add(mni_Regresar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btn_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Reporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar_Producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Regresar)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Reporte)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btn_Regresar)
                .addGap(19, 19, 19))
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

        String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");

        while (posicion <= this.getTamaño() - 1) {
            if (Obj_Producto[posicion].getNombreProducto().equalsIgnoreCase(respuesta)) {
                this.setVisible(false);
                Obj_Ventana_Mostrar.setVisible(true);
                Obj_Ventana_Mostrar.Modo_Buscar(respuesta, posicion);
                break;
            }
            if (respuesta == null) {
                break;
            }
            if (posicion == this.getTamaño() - 1) {
                JOptionPane.showMessageDialog(this, "No se encontró el Registo -> " + respuesta);
                break;
            }
            System.out.println("Posicion -> " + posicion);
            System.out.println("Length -> " + this.getTamaño());
            System.out.println(" _________");
            posicion++;
        }
    }//GEN-LAST:event_btn_Buscar_ProductoActionPerformed


    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        int posicion = 0;
        if (Obj_Ventana_Mostrar == null) {
            Obj_Ventana_Mostrar = new Ventana_Mostrar(this, Obj_Producto);
        }
        int Codigo = 0;
        try {
            Codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del Producto"));

        } catch (Exception e) {

        } finally {

        }
        while (posicion <= this.getTamaño() - 1) {
            if (Codigo == Obj_Producto[posicion].getCodigo()) {
                Obj_Ventana_Mostrar.Modo_Modificar(Codigo, posicion);
                this.setVisible(false);
                Obj_Ventana_Mostrar.setVisible(true);
                break;
            }

            if (posicion == this.getTamaño() - 1) {
                JOptionPane.showMessageDialog(this, "No se encontró el Codigo -> " + Codigo);
            }

            posicion++;
        }

    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReporteActionPerformed
        if (Obj_Ventana_Reporte == null) {
            Obj_Ventana_Reporte = new Ventana_Reporte(this, Obj_Producto);
        }
        this.setVisible(false);
        Obj_Ventana_Reporte.setVisible(true);
        Obj_Ventana_Reporte.Actualizar(0);
    }//GEN-LAST:event_btn_ReporteActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        procesoRegresar();
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void mni_Dar_de_Alta_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_Dar_de_Alta_ProductoActionPerformed
        this.btn_AltaActionPerformed(evt);
    }//GEN-LAST:event_mni_Dar_de_Alta_ProductoActionPerformed

    private void mni_Buscar_un_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_Buscar_un_ProductoActionPerformed
        this.btn_Buscar_ProductoActionPerformed(evt);
    }//GEN-LAST:event_mni_Buscar_un_ProductoActionPerformed

    private void mni_Reporte_de_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_Reporte_de_ProductoActionPerformed
        this.btn_ReporteActionPerformed(evt);
    }//GEN-LAST:event_mni_Reporte_de_ProductoActionPerformed

    private void mni_Modificar_Precio_de_un_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_Modificar_Precio_de_un_ProductoActionPerformed
        this.btn_ModificarActionPerformed(evt);
    }//GEN-LAST:event_mni_Modificar_Precio_de_un_ProductoActionPerformed

    private void mni_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_RegresarActionPerformed
        this.btn_RegresarActionPerformed(evt);
    }//GEN-LAST:event_mni_RegresarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mni_Buscar_un_Producto;
    private javax.swing.JMenuItem mni_Dar_de_Alta_Producto;
    private javax.swing.JMenuItem mni_Modificar_Precio_de_un_Producto;
    private javax.swing.JMenuItem mni_Regresar;
    private javax.swing.JMenuItem mni_Reporte_de_Producto;
    // End of variables declaration//GEN-END:variables

    public void Enable_Faltantes() {
        if (Tamaño > 0) {
            btn_Buscar_Producto.setEnabled(true);
            btn_Modificar.setEnabled(true);
            btn_Reporte.setEnabled(true);
            mni_Buscar_un_Producto.setEnabled(true);
            mni_Reporte_de_Producto.setEnabled(true);
            mni_Modificar_Precio_de_un_Producto.setEnabled(true);      
        }
    }
}
