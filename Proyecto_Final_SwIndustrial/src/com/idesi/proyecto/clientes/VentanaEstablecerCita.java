package com.idesi.proyecto.clientes;

import java.time.Month;
import java.time.YearMonth;
import java.util.Calendar;
import javax.swing.JOptionPane;
import com.idesi.proyecto.recursos.ImagenFondo;

/**
 *
 * @author Cristofer
 */
public class VentanaEstablecerCita extends javax.swing.JFrame {
    
    private VentanaClientes vtnClientes;
    private Cita[] citas;
    ImagenFondo ejemplo = new ImagenFondo();
    protected int posCitas;

    /**
     * Creates new form VentanaAgregar
     */
    public VentanaEstablecerCita() {
        initComponents();
    }
    
    public VentanaEstablecerCita(VentanaClientes vtnClientes, Cita[] citas) {
        this.vtnClientes = vtnClientes;
        this.citas = citas;
        this.setContentPane(ejemplo);
        initComponents();
    }
    
    private boolean revisarAlmacenamiento() {
        if (posCitas == 5) {
            mostrarAviso(3);
            return false;
        } else {
            return true;
        }
    }
    
    private boolean revisarEntrada() {
        if (!(txtCodigo.getText().equals(""))) {
            return true;
        } else {
            mostrarAviso(2);
            return false;
        }
    }
    
    private void procesoGuardar() {
        System.out.println("Hora: " + (cmbHora.getSelectedItem().toString()).split(":")[0]);
        System.out.println("Dia: " + (cmbDia.getSelectedItem().toString()));
        citas[posCitas] = new Cita();
        citas[posCitas].setCodigo(txtCodigo.getText().trim());
        citas[posCitas].setFechaCita(
                Integer.parseInt((cmbHora.getSelectedItem().toString()).split(":")[0]),
                0,
                Integer.parseInt(cmbDia.getSelectedItem().toString()),
                (Integer.parseInt(cmbMes.getSelectedItem().toString()) - 1)
        );
        citas[posCitas].setTipoExamen(cmbTipoExamen.getSelectedItem().toString());
        
        mostrarAviso(1);
        posCitas++;
        vtnClientes.aplicarCambiosCitas(this.posCitas);
        
        limpiarCampos();
    }
    
    private void procesoRegresar() {
        limpiarCampos();
        vtnClientes.setVisible(true);
        this.setVisible(false);
    }
    
    private void limpiarCampos() {
        txtCodigo.setText("");
        cmbDia.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        cmbHora.setSelectedIndex(0);
        cmbTipoExamen.setSelectedIndex(0);
    }
    
    private void mostrarAviso(int aviso) {
        switch (aviso) {
            case 1:
                JOptionPane.showMessageDialog(this,
                        "Cita registrada con exito\n\n"
                        + "Datos:\n"
                        + "Codigo de cliente: " + citas[posCitas].getCodigo() + "\n"
                        + "Fecha: " + citas[posCitas].getFecha() + "\n"
                        + "Hora: " + citas[posCitas].getHora());
                break;
            case 2:
                JOptionPane.showMessageDialog(
                        this,
                        "Favor de no dejar ningun campo en blanco, revise lo introducido.");
                break;
            case 3:
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

        lblRegistro = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        cmbTipoExamen = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        lblHora = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mni_Buscar_Cliente = new javax.swing.JMenuItem();
        mni_Guardar = new javax.swing.JMenuItem();
        mni_Regresar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mni_Borrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblRegistro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRegistro.setText("  Establecer Cita");
        lblRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblCodigo.setText("Codigo del cliente:");

        btnBuscar.setText("Buscar Cliente");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo de examen:");

        cmbTipoExamen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sangre", "Nivel de Azucar", "Orina" }));

        lblFecha.setText("Fecha (DD/MM):");

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"
            , "25", "26", "27", "28", "29", "30", "31", }));

cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
cmbMes.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbMesActionPerformed(evt);
    }
    });
    cmbMes.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            cmbMesPropertyChange(evt);
        }
    });

    lblHora.setText("Hora:");

    cmbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", }));

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

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idesi/proyecto/clientes/Imagenes/Lupita.jpg"))); // NOI18N

    jMenu1.setText("Archivo");

    mni_Buscar_Cliente.setText("Buscar Cliente");
    mni_Buscar_Cliente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            mni_Buscar_ClienteActionPerformed(evt);
        }
    });
    jMenu1.add(mni_Buscar_Cliente);

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
            .addGap(54, 54, 54)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCodigo)
                                .addComponent(lblTipo))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbTipoExamen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFecha)
                            .addGap(31, 31, 31)
                            .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBuscar)
                        .addComponent(jLabel1)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(26, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblRegistro)
                .addComponent(btnBuscar))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigo)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipo)
                        .addComponent(cmbTipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFecha)
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHora)
                        .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel1))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnGuardar)
                .addComponent(btnRegresar))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (revisarAlmacenamiento()) {
            if (revisarEntrada()) {
                procesoGuardar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        procesoRegresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbMesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbMesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesPropertyChange

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        if (!(cmbMes.getSelectedItem().equals(""))) {
            YearMonth mes = YearMonth.of(
                    2020,
                    Integer.parseInt(cmbMes.getSelectedItem().toString())
            );
            cmbDia.removeAllItems();
            int diasMes = mes.lengthOfMonth();
            for (int i = 1; i <= diasMes; i++) {
                if ((i > 0) && (i < 10)) {
                    cmbDia.addItem("0" + String.valueOf(i));
                } else {
                    cmbDia.addItem(String.valueOf(i));
                }
            }
        }
    }//GEN-LAST:event_cmbMesActionPerformed

    private void mni_Buscar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_Buscar_ClienteActionPerformed
        
    }//GEN-LAST:event_mni_Buscar_ClienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mni_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_GuardarActionPerformed
        this.btnBuscarActionPerformed(evt);
    }//GEN-LAST:event_mni_GuardarActionPerformed

    private void mni_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_RegresarActionPerformed
        this.btnRegresarActionPerformed(evt);
    }//GEN-LAST:event_mni_RegresarActionPerformed

    private void mni_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_BorrarActionPerformed
        txtCodigo.setText("");
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
            java.util.logging.Logger.getLogger(VentanaEstablecerCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEstablecerCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEstablecerCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEstablecerCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEstablecerCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbHora;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox<String> cmbTipoExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JMenuItem mni_Borrar;
    private javax.swing.JMenuItem mni_Buscar_Cliente;
    private javax.swing.JMenuItem mni_Guardar;
    private javax.swing.JMenuItem mni_Regresar;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
