/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vista.panel;

import presentacion.vista.info.InfoEmpleado;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import presentacion.controlador.Controlador;
import presentacion.controlador.ControladorEmpleadoNuevo;
import presentacion.vista.Main;
import presentacion.vista.VistaHija;
import static presentacion.vista.info.InfoEmpleado.crearInfoEmpleado;

/**
 *
 * @author marces
 */
public class PanelEmpleadoNuevo
        extends javax.swing.JPanel
        implements VistaHija {

    private ControladorEmpleadoNuevo controlador;
    private Long id = null;

    /**
     * Creamos una nueva instancia de PanelNuevoCliente
     * Ésta vista se utiliza tanto para el alta de un cliente,
     * como también para su modificación.
     */   
    public PanelEmpleadoNuevo() {
        initComponents();
        localInit();
    }
    
    /**
     * Nuestro propio método de inicialización local.
     */ 
    private void localInit() {
        
        // Le pasamos los textFields que no deben estar vacíos.
        ValidadorDeCampos validador = new ValidadorDeCampos(
                txtApellido, txtNombre, txtDocumento, txtCelular, txtEmail,
                dateNacimiento.getComponentDateTextField()
        );
        
        /* Le pasamos el botón que estará habilitado solo si dichos 
        campos no estan vacíos */
        validador.setBoton(btnGuardar);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        dateNacimiento = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtTelefonoFijo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDepto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        txtDocumento.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel5.setText("Nombre *");

        jLabel1.setText("Documento *");

        jLabel6.setText("Apellido *");

        jLabel8.setText("Fecha de nacimiento * ");

        jLabel3.setText("Teléfono celular *");

        txtCelular.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        txtTelefonoFijo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel9.setText("Email *");

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel2.setText("Calle");

        txtCalle.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel4.setText("Altura / Depto");

        txtDepto.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel10.setText("Barrio");

        txtBarrio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel13.setText("Teléfono fijo ");

        jLabel11.setText("(dd/mm/aaaa)");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCelular)
                        .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDepto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addContainerGap())
                    .addComponent(txtCalle)
                    .addComponent(txtTelefonoFijo)
                    .addComponent(dateNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtBarrio)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDepto, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtBarrio))
                .addGap(20, 20, 20))
        );

        txtApellido.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
 
    // <editor-fold defaultstate="collapsed" desc="Nuestro código">   
    @Override
    public void setControlador(Controlador controlador) {
        this.controlador = (ControladorEmpleadoNuevo) controlador;
    }

    @Override
    public void setDatos(Object campos) {
        
        // Doloroso pero necesario cast
        InfoEmpleado info = (InfoEmpleado) campos;
        
        // Necesitamos el id para luego actualizar el cliente adecuado.
        this.id = info.getId();
        
        // Seteamos los campos. Los nulos quedarán vacíos.
        txtApellido.setText(info.getApellido());
        txtNombre.setText(info.getNombre());
        txtDocumento.setText(info.getDocumento());
        dateNacimiento.setDate(info.getNacimiento());
        txtCelular.setText(info.getCelular());
        txtTelefonoFijo.setText(info.getTelefono());
        txtEmail.setText(info.getEmail());
        txtCalle.setText(info.getCalle());
        txtDepto.setText(info.getAltura());
        txtBarrio.setText(info.getBarrio());
    }
    
    @Override
    public void mostrarMensaje(String st) {
        JOptionPane.showMessageDialog(new JFrame(), st);
    }
     //</editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Manejamos eventos">  
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Main.getInstance().cerrarDialogAux();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 
        controlador.crearNuevoRegistro(crearInfoEmpleado()
                .withId(id)
                .withApellido(txtApellido.getText())
                .withNombre(txtNombre.getText())
                .withDocumento(txtDocumento.getText())
                .withNacimiento(dateNacimiento.getDate())
                .withTelefono(txtTelefonoFijo.getText())
                .withCelular(txtCelular.getText())
                .withEmail(txtEmail.getText())
                .withCalle(txtCalle.getText())
                .withAltura(txtDepto.getText())
                .withBarrio(txtBarrio.getText()));
    }//GEN-LAST:event_btnGuardarActionPerformed
    //</editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Variables generadas por el editor">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private com.github.lgooddatepicker.components.DatePicker dateNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDepto;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefonoFijo;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>  
}
