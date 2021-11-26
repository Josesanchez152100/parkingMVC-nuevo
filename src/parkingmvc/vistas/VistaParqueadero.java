/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmvc.vistas;

import java.awt.Color;
import parkingmvc.controladores.ControladorActualizarParqueadero;
import parkingmvc.modelos.ModeloParqueadero;

/**
 *
 * @author Alejandro
 */
public class VistaParqueadero extends javax.swing.JFrame {

    /* Coordenadas del puntero */
    int xMouse, yMouse;
    
    public VistaParqueadero() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTarifa = new javax.swing.JPanel();
        labelTarifa = new javax.swing.JLabel();
        labelDescripcionTarifa = new javax.swing.JLabel();
        fieldTarifa = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        labelResultadotarifa = new javax.swing.JLabel();
        btnConsultarTarifa = new javax.swing.JButton();
        btnActualizarTarifa = new javax.swing.JButton();
        panelNavigation = new javax.swing.JPanel();
        btnVehiculo = new javax.swing.JPanel();
        btnVehiculoLabel = new javax.swing.JLabel();
        btnCliente = new javax.swing.JPanel();
        btnClienteLabel = new javax.swing.JLabel();
        btnTarifa = new javax.swing.JPanel();
        btnTarifaLabel = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JPanel();
        btnConsultaLabel = new javax.swing.JLabel();
        btnClose = new javax.swing.JPanel();
        btnCloseLabel = new javax.swing.JLabel();
        btnHome = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);

        panelTarifa.setBackground(new java.awt.Color(255, 255, 255));
        panelTarifa.setMaximumSize(new java.awt.Dimension(800, 500));
        panelTarifa.setMinimumSize(new java.awt.Dimension(800, 500));
        panelTarifa.setPreferredSize(new java.awt.Dimension(800, 500));
        panelTarifa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTarifa.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelTarifa.setForeground(new java.awt.Color(33, 40, 48));
        labelTarifa.setText("Tarifa");
        panelTarifa.add(labelTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        labelDescripcionTarifa.setForeground(new java.awt.Color(153, 153, 153));
        labelDescripcionTarifa.setText("Ingresa el valor de la tarifa actual (minuto o fracción)");
        panelTarifa.add(labelDescripcionTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        fieldTarifa.setBackground(new java.awt.Color(237, 237, 237));
        fieldTarifa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fieldTarifa.setForeground(new java.awt.Color(153, 153, 153));
        fieldTarifa.setBorder(null);
        panelTarifa.add(fieldTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 300, 30));
        panelTarifa.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 300, 20));

        labelResultadotarifa.setForeground(new java.awt.Color(0, 174, 181));
        labelResultadotarifa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResultadotarifa.setText(" ");
        panelTarifa.add(labelResultadotarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 300, -1));

        btnConsultarTarifa.setBackground(new java.awt.Color(33, 40, 48));
        btnConsultarTarifa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsultarTarifa.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarTarifa.setText("Consultar");
        btnConsultarTarifa.setBorder(null);
        panelTarifa.add(btnConsultarTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 140, 35));

        btnActualizarTarifa.setBackground(new java.awt.Color(0, 174, 181));
        btnActualizarTarifa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnActualizarTarifa.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTarifa.setText("Actualizar");
        btnActualizarTarifa.setBorder(null);
        btnActualizarTarifa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarTarifaMouseClicked(evt);
            }
        });
        panelTarifa.add(btnActualizarTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, 35));

        panelNavigation.setBackground(new java.awt.Color(56, 61, 69));
        panelNavigation.setMaximumSize(new java.awt.Dimension(800, 60));
        panelNavigation.setMinimumSize(new java.awt.Dimension(800, 60));
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

        btnVehiculo.setBackground(new java.awt.Color(56, 61, 69));
        btnVehiculo.setMaximumSize(new java.awt.Dimension(120, 60));

        btnVehiculoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVehiculoLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnVehiculoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVehiculoLabel.setText("Vehiculo");
        btnVehiculoLabel.setAlignmentY(0.0F);
        btnVehiculoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVehiculoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVehiculoLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVehiculoLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVehiculoLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnVehiculoLayout = new javax.swing.GroupLayout(btnVehiculo);
        btnVehiculo.setLayout(btnVehiculoLayout);
        btnVehiculoLayout.setHorizontalGroup(
            btnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVehiculoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnVehiculoLayout.setVerticalGroup(
            btnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVehiculoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        btnCliente.setBackground(new java.awt.Color(56, 61, 69));
        btnCliente.setMaximumSize(new java.awt.Dimension(120, 60));

        btnClienteLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClienteLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnClienteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClienteLabel.setText("Cliente");
        btnClienteLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClienteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClienteLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClienteLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnClienteLayout = new javax.swing.GroupLayout(btnCliente);
        btnCliente.setLayout(btnClienteLayout);
        btnClienteLayout.setHorizontalGroup(
            btnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnClienteLayout.setVerticalGroup(
            btnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        btnTarifa.setBackground(new java.awt.Color(56, 61, 69));
        btnTarifa.setMaximumSize(new java.awt.Dimension(120, 60));

        btnTarifaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTarifaLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnTarifaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTarifaLabel.setText("Parqueadero");
        btnTarifaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTarifaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarifaLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTarifaLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTarifaLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnTarifaLayout = new javax.swing.GroupLayout(btnTarifa);
        btnTarifa.setLayout(btnTarifaLayout);
        btnTarifaLayout.setHorizontalGroup(
            btnTarifaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTarifaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTarifaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnTarifaLayout.setVerticalGroup(
            btnTarifaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTarifaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        btnConsulta.setBackground(new java.awt.Color(56, 61, 69));
        btnConsulta.setMaximumSize(new java.awt.Dimension(120, 60));

        btnConsultaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultaLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConsultaLabel.setText("Consulta");
        btnConsultaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultaLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultaLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultaLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnConsultaLayout = new javax.swing.GroupLayout(btnConsulta);
        btnConsulta.setLayout(btnConsultaLayout);
        btnConsultaLayout.setHorizontalGroup(
            btnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnConsultaLayout.setVerticalGroup(
            btnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnClose.setBackground(new java.awt.Color(33, 40, 48));
        btnClose.setMaximumSize(new java.awt.Dimension(60, 60));
        btnClose.setMinimumSize(new java.awt.Dimension(60, 60));
        btnClose.setPreferredSize(new java.awt.Dimension(45, 60));

        btnCloseLabel.setBackground(new java.awt.Color(33, 40, 48));
        btnCloseLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCloseLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnCloseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseLabel.setText("X");
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
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        btnHome.setBackground(new java.awt.Color(33, 40, 48));

        labelLogo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(255, 255, 255));
        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/car-park-white.png"))); // NOI18N
        labelLogo.setText("ParkIn MVC");
        labelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelLogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelNavigationLayout = new javax.swing.GroupLayout(panelNavigation);
        panelNavigation.setLayout(panelNavigationLayout);
        panelNavigationLayout.setHorizontalGroup(
            panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavigationLayout.createSequentialGroup()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        panelNavigationLayout.setVerticalGroup(
            panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavigationLayout.createSequentialGroup()
                .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelNavigationLayout.createSequentialGroup()
                        .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelTarifa.add(panelNavigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVehiculoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculoLabelMouseClicked
        VistaVehiculo abrir = new VistaVehiculo();
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVehiculoLabelMouseClicked

    private void btnVehiculoLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculoLabelMouseEntered
        btnVehiculo.setBackground(Color.decode("#00AEB5"));
    }//GEN-LAST:event_btnVehiculoLabelMouseEntered

    private void btnVehiculoLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculoLabelMouseExited
        btnVehiculo.setBackground(Color.decode("#383D45"));
    }//GEN-LAST:event_btnVehiculoLabelMouseExited

    private void btnClienteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteLabelMouseClicked
        VistaCliente abrir = new VistaCliente();
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnClienteLabelMouseClicked

    private void btnClienteLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteLabelMouseEntered
        btnCliente.setBackground(Color.decode("#00AEB5"));
    }//GEN-LAST:event_btnClienteLabelMouseEntered

    private void btnClienteLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteLabelMouseExited
        btnCliente.setBackground(Color.decode("#383D45"));
    }//GEN-LAST:event_btnClienteLabelMouseExited

    private void btnTarifaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaLabelMouseClicked
        VistaParqueadero abrir = new VistaParqueadero();
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTarifaLabelMouseClicked

    private void btnTarifaLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaLabelMouseEntered
        btnTarifa.setBackground(Color.decode("#00AEB5"));
    }//GEN-LAST:event_btnTarifaLabelMouseEntered

    private void btnTarifaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarifaLabelMouseExited
        btnTarifa.setBackground(Color.decode("#383D45"));
    }//GEN-LAST:event_btnTarifaLabelMouseExited

    private void btnConsultaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaLabelMouseClicked
        VistaConsulta abrir = new VistaConsulta();
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConsultaLabelMouseClicked

    private void btnConsultaLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaLabelMouseEntered
        btnConsulta.setBackground(Color.decode("#00AEB5"));
    }//GEN-LAST:event_btnConsultaLabelMouseEntered

    private void btnConsultaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaLabelMouseExited
        btnConsulta.setBackground(Color.decode("#383D45"));
    }//GEN-LAST:event_btnConsultaLabelMouseExited

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

    private void labelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoMouseClicked
        VistaHome abrir = new VistaHome();
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelLogoMouseClicked

    private void labelLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoMouseEntered
        btnHome.setBackground(Color.decode("#00AEB5"));
    }//GEN-LAST:event_labelLogoMouseEntered

    private void labelLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoMouseExited
        btnHome.setBackground(Color.decode("#212830"));
    }//GEN-LAST:event_labelLogoMouseExited

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

    private void btnActualizarTarifaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTarifaMouseClicked
        // TODO add your handling code here:
        VistaParqueadero abrir = new VistaParqueadero();
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
        this.setVisible(false);
        
        ModeloParqueadero modeloParqueadero = new ModeloParqueadero();
        ControladorActualizarParqueadero controladorActualizarParqueadero = new ControladorActualizarParqueadero(abrir, modeloParqueadero);
    }//GEN-LAST:event_btnActualizarTarifaMouseClicked

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
            java.util.logging.Logger.getLogger(VistaParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VistaParqueadero().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarTarifa;
    private javax.swing.JPanel btnCliente;
    public javax.swing.JLabel btnClienteLabel;
    private javax.swing.JPanel btnClose;
    public javax.swing.JLabel btnCloseLabel;
    private javax.swing.JPanel btnConsulta;
    public javax.swing.JLabel btnConsultaLabel;
    public javax.swing.JButton btnConsultarTarifa;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnTarifa;
    public javax.swing.JLabel btnTarifaLabel;
    private javax.swing.JPanel btnVehiculo;
    public javax.swing.JLabel btnVehiculoLabel;
    public javax.swing.JTextField fieldTarifa;
    private javax.swing.JLabel labelDescripcionTarifa;
    public javax.swing.JLabel labelLogo;
    public javax.swing.JLabel labelResultadotarifa;
    private javax.swing.JLabel labelTarifa;
    private javax.swing.JPanel panelNavigation;
    private javax.swing.JPanel panelTarifa;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
