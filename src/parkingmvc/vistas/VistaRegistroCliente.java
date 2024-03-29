/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmvc.vistas;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import parkingmvc.modelos.FixedSizeDocument;

/**
 *
 * @author Alejandro
 */
public class VistaRegistroCliente extends javax.swing.JFrame {

    /* Coordenadas del puntero */
    int xMouse, yMouse;
    
    public VistaRegistroCliente() {
        initComponents();
        fieldIngresodocumento.setDocument(new FixedSizeDocument(10));
        fieldIngresotelefono.setDocument(new FixedSizeDocument(45));
        fieldIngresonombre.setDocument(new FixedSizeDocument(45));
        fieldIngresodireccion.setDocument(new FixedSizeDocument(45));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        separador3 = new javax.swing.JSeparator();
        fieldIngresodireccion = new javax.swing.JTextField();
        labelIngresaDireccion = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        fieldIngresonombre = new javax.swing.JTextField();
        labelIngresaNombre = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        fieldIngresocorreo = new javax.swing.JTextField();
        labelIngresaCorreo = new javax.swing.JLabel();
        separador4 = new javax.swing.JSeparator();
        fieldIngresodocumento = new javax.swing.JTextField();
        labelDescripcion = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        labelResultadocliente = new javax.swing.JLabel();
        labelIngresaDocumento = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        btnVolverLabel = new javax.swing.JLabel();
        labelIngresaTelefono = new javax.swing.JLabel();
        fieldIngresotelefono = new javax.swing.JTextField();
        separador5 = new javax.swing.JSeparator();
        panelNavigation = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        btnCloseLabel = new javax.swing.JLabel();
        btnRegistrarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);

        panelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistro.setMaximumSize(new java.awt.Dimension(800, 500));
        panelRegistro.setMinimumSize(new java.awt.Dimension(800, 500));
        panelRegistro.setPreferredSize(new java.awt.Dimension(800, 500));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRegistro.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 300, 20));

        fieldIngresodireccion.setBackground(new java.awt.Color(237, 237, 237));
        fieldIngresodireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fieldIngresodireccion.setForeground(new java.awt.Color(153, 153, 153));
        fieldIngresodireccion.setBorder(null);
        panelRegistro.add(fieldIngresodireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 300, 30));

        labelIngresaDireccion.setForeground(new java.awt.Color(153, 153, 153));
        labelIngresaDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelIngresaDireccion.setText("Dirección");
        panelRegistro.add(labelIngresaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 300, -1));
        panelRegistro.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 300, 20));

        fieldIngresonombre.setBackground(new java.awt.Color(237, 237, 237));
        fieldIngresonombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fieldIngresonombre.setForeground(new java.awt.Color(153, 153, 153));
        fieldIngresonombre.setBorder(null);
        fieldIngresonombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldIngresonombreKeyTyped(evt);
            }
        });
        panelRegistro.add(fieldIngresonombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 300, 30));

        labelIngresaNombre.setForeground(new java.awt.Color(153, 153, 153));
        labelIngresaNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelIngresaNombre.setText("Nombre completo");
        panelRegistro.add(labelIngresaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 300, -1));
        panelRegistro.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 300, 20));

        fieldIngresocorreo.setBackground(new java.awt.Color(237, 237, 237));
        fieldIngresocorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fieldIngresocorreo.setForeground(new java.awt.Color(153, 153, 153));
        fieldIngresocorreo.setBorder(null);
        fieldIngresocorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldIngresocorreoFocusLost(evt);
            }
        });
        panelRegistro.add(fieldIngresocorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 300, 30));

        labelIngresaCorreo.setForeground(new java.awt.Color(153, 153, 153));
        labelIngresaCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelIngresaCorreo.setText("Correo electrónico");
        panelRegistro.add(labelIngresaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 300, -1));
        panelRegistro.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 300, 20));

        fieldIngresodocumento.setBackground(new java.awt.Color(237, 237, 237));
        fieldIngresodocumento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fieldIngresodocumento.setForeground(new java.awt.Color(153, 153, 153));
        fieldIngresodocumento.setBorder(null);
        fieldIngresodocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldIngresodocumentoKeyTyped(evt);
            }
        });
        panelRegistro.add(fieldIngresodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 300, 30));

        labelDescripcion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        labelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcion.setText("Por favor ingresa la información completa del cliente");
        panelRegistro.add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 620, -1));

        labelCliente.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(33, 40, 48));
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("Registrar cliente");
        panelRegistro.add(labelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 620, -1));

        labelResultadocliente.setForeground(new java.awt.Color(0, 174, 181));
        labelResultadocliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResultadocliente.setText(" ");
        panelRegistro.add(labelResultadocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 620, -1));

        labelIngresaDocumento.setForeground(new java.awt.Color(153, 153, 153));
        labelIngresaDocumento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelIngresaDocumento.setText("Documento / Cédula");
        panelRegistro.add(labelIngresaDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 300, -1));

        btnVolver.setBackground(new java.awt.Color(33, 40, 48));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnVolverLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolverLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolverLabel.setText("Regresar");
        btnVolverLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolverLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panelRegistro.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        labelIngresaTelefono.setForeground(new java.awt.Color(153, 153, 153));
        labelIngresaTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelIngresaTelefono.setText("Teléfono");
        panelRegistro.add(labelIngresaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 300, -1));

        fieldIngresotelefono.setBackground(new java.awt.Color(237, 237, 237));
        fieldIngresotelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fieldIngresotelefono.setForeground(new java.awt.Color(153, 153, 153));
        fieldIngresotelefono.setBorder(null);
        fieldIngresotelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldIngresotelefonoKeyTyped(evt);
            }
        });
        panelRegistro.add(fieldIngresotelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 300, 30));
        panelRegistro.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 300, 20));

        panelNavigation.setBackground(new java.awt.Color(56, 61, 69));
        panelNavigation.setMaximumSize(new java.awt.Dimension(800, 60));
        panelNavigation.setOpaque(false);
        panelNavigation.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelNavigationMouseDragged(evt);
            }
        });
        panelNavigation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelNavigationMousePressed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(33, 40, 48));
        btnClose.setMaximumSize(new java.awt.Dimension(120, 60));

        btnCloseLabel.setBackground(new java.awt.Color(33, 40, 48));
        btnCloseLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCloseLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnCloseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseLabel.setText("X");
        btnCloseLabel.setAlignmentY(0.0F);
        btnCloseLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCloseLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnCloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelNavigationLayout = new javax.swing.GroupLayout(panelNavigation);
        panelNavigation.setLayout(panelNavigationLayout);
        panelNavigationLayout.setHorizontalGroup(
            panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                .addGap(0, 740, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelNavigationLayout.setVerticalGroup(
            panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigationLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelRegistro.add(panelNavigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        btnRegistrarCliente.setBackground(new java.awt.Color(0, 174, 181));
        btnRegistrarCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Registrar");
        btnRegistrarCliente.setBorder(null);
        panelRegistro.add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 150, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverLabelMouseEntered
        btnVolver.setBackground(Color.decode("#383D45"));
    }//GEN-LAST:event_btnVolverLabelMouseEntered

    private void btnVolverLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverLabelMouseExited
        btnVolver.setBackground(Color.decode("#212830"));
    }//GEN-LAST:event_btnVolverLabelMouseExited

    private void btnVolverLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverLabelMouseClicked
        VistaHome abrir = new VistaHome();
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverLabelMouseClicked

    private void btnCloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseLabelMouseClicked

    private void btnCloseLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseLabelMouseEntered
        // Hover
        btnClose.setBackground(Color.RED);
    }//GEN-LAST:event_btnCloseLabelMouseEntered

    private void btnCloseLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseLabelMouseExited
        // Unhover
        btnClose.setBackground(Color.decode("#212830"));
    }//GEN-LAST:event_btnCloseLabelMouseExited

    private void panelNavigationMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNavigationMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        // Ubicación de la ventana
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelNavigationMouseDragged

    private void panelNavigationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNavigationMousePressed
        // Ubicación del puntero
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelNavigationMousePressed

    private void fieldIngresodocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIngresodocumentoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if((c<'0' || c>'9') && (c!=(char)KeyEvent.VK_BACKSPACE)){
            evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admiten números","Validar números",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_fieldIngresodocumentoKeyTyped

    private void fieldIngresonombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIngresonombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c!=(char)KeyEvent.VK_SPACE)) 
            evt.consume();
    }//GEN-LAST:event_fieldIngresonombreKeyTyped

    private void fieldIngresocorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldIngresocorreoFocusLost
        // TODO add your handling code here:
        if (isEmail(fieldIngresocorreo.getText())){
        
        }else{
            JOptionPane.showMessageDialog(null, "Email incorrecto","Validar Email", JOptionPane.INFORMATION_MESSAGE);
            fieldIngresocorreo.requestFocus();
        }
    }//GEN-LAST:event_fieldIngresocorreoFocusLost

    private void fieldIngresotelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIngresotelefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if((c<'0' || c>'9') && (c!=(char)KeyEvent.VK_BACKSPACE)){
            evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admiten números","Validar números",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_fieldIngresotelefonoKeyTyped

    public boolean isEmail(String correo){
            Pattern pat = null;
            Matcher mat=null;
            pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
            mat = pat.matcher(correo);
            if(mat.find()){
                return true;
            }else{
                return false;
            }            
        }
    
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
            java.util.logging.Logger.getLogger(VistaRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VistaRegistroCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClose;
    public javax.swing.JLabel btnCloseLabel;
    public javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JPanel btnVolver;
    public javax.swing.JLabel btnVolverLabel;
    public javax.swing.JTextField fieldIngresocorreo;
    public javax.swing.JTextField fieldIngresodireccion;
    public javax.swing.JTextField fieldIngresodocumento;
    public javax.swing.JTextField fieldIngresonombre;
    public javax.swing.JTextField fieldIngresotelefono;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelIngresaCorreo;
    private javax.swing.JLabel labelIngresaDireccion;
    private javax.swing.JLabel labelIngresaDocumento;
    private javax.swing.JLabel labelIngresaNombre;
    private javax.swing.JLabel labelIngresaTelefono;
    public javax.swing.JLabel labelResultadocliente;
    private javax.swing.JPanel panelNavigation;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JSeparator separador5;
    // End of variables declaration//GEN-END:variables
}
