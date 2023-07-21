package VISTA_EMPLEADO;

import VISTA.*;
import CONTROLADORES.proceso;
import java.awt.BorderLayout;
import java.awt.Toolkit;

/**
 *
 * @author Martin
 */
public final class frm_Principal_EMPLEADO extends javax.swing.JFrame {

    public frm_Principal_EMPLEADO() {
        initComponents();
        this.setLocationRelativeTo(null);
        irPaginaPrincipal();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENES/icono.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuReservas = new javax.swing.JMenu();
        moduloReservasYConsumos = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        moduloConsultaHabitaciones = new javax.swing.JMenuItem();
        jMenuHerramientas = new javax.swing.JMenu();
        btnCalculadora = new javax.swing.JMenuItem();
        btnBlockNotas = new javax.swing.JMenuItem();
        btnExploradorArchivos = new javax.swing.JMenuItem();
        btnExcel = new javax.swing.JMenuItem();
        btnMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(51, 51, 51));
        contenedor.setFocusable(false);
        contenedor.setMaximumSize(new java.awt.Dimension(1200, 650));
        contenedor.setMinimumSize(new java.awt.Dimension(1200, 650));
        contenedor.setLayout(new java.awt.CardLayout());
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 620));

        jMenuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Inicio.png"))); // NOI18N
        jMenuInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuInicio.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jMenuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuInicio);

        jMenuReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Reservas.png"))); // NOI18N
        jMenuReservas.setText("Reservas");
        jMenuReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuReservas.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        moduloReservasYConsumos.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        moduloReservasYConsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/reservas-consumos.png"))); // NOI18N
        moduloReservasYConsumos.setText("Reservas y Consumos");
        moduloReservasYConsumos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moduloReservasYConsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloReservasYConsumosActionPerformed(evt);
            }
        });
        jMenuReservas.add(moduloReservasYConsumos);

        jMenuBar1.add(jMenuReservas);

        jMenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Consultas.png"))); // NOI18N
        jMenuConsultas.setText("Consultas");
        jMenuConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuConsultas.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        moduloConsultaHabitaciones.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        moduloConsultaHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/habitaciones.png"))); // NOI18N
        moduloConsultaHabitaciones.setText("Consulta Habitaciones");
        moduloConsultaHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moduloConsultaHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloConsultaHabitacionesActionPerformed(evt);
            }
        });
        jMenuConsultas.add(moduloConsultaHabitaciones);

        jMenuBar1.add(jMenuConsultas);

        jMenuHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Herramientas.png"))); // NOI18N
        jMenuHerramientas.setText("Herramientas");
        jMenuHerramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuHerramientas.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        btnCalculadora.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCalculadora.setText("Calculadora");
        btnCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(btnCalculadora);

        btnBlockNotas.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnBlockNotas.setText("Block de Notas");
        btnBlockNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBlockNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlockNotasActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(btnBlockNotas);

        btnExploradorArchivos.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnExploradorArchivos.setText("Explorador Archivos");
        btnExploradorArchivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExploradorArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExploradorArchivosActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(btnExploradorArchivos);

        btnExcel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnExcel.setText("Excel");
        btnExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(btnExcel);

        btnMenu.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnMenu.setText("Navegador");
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(btnMenu);

        jMenuBar1.add(jMenuHerramientas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void irPaginaPrincipal() {

        pnl_principal p = new pnl_principal();

        p.setSize(1200, 620);
        p.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    private void jMenuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInicioMouseClicked
        irPaginaPrincipal();

        String nombre = frm_Login.NOMBRE;
        String apellido = frm_Login.APELLIDO;
        String correo = frm_Login.CORREO;

        pnl_principal.txtNombre.setText(nombre);
        pnl_principal.txtApellido.setText(apellido);
        pnl_principal.txtCorreo.setText(correo);
    }//GEN-LAST:event_jMenuInicioMouseClicked

    private void moduloReservasYConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloReservasYConsumosActionPerformed
        pnl_ReservasYConsumos p = new pnl_ReservasYConsumos();

        p.setSize(1200, 620);
        p.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_moduloReservasYConsumosActionPerformed

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
        proceso.AccederEnlace("calc");
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    private void btnBlockNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlockNotasActionPerformed
        proceso.AccederEnlace("notepad");
    }//GEN-LAST:event_btnBlockNotasActionPerformed

    private void btnExploradorArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExploradorArchivosActionPerformed
        proceso.AccederEnlace("explorer");
    }//GEN-LAST:event_btnExploradorArchivosActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        proceso.AccederEnlace("excel");
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        proceso.AccederEnlace("Chrome");
    }//GEN-LAST:event_btnMenuActionPerformed

    private void moduloConsultaHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloConsultaHabitacionesActionPerformed
        habitacionDisponibles p = new habitacionDisponibles();
        p.setSize(1200, 620);
        p.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_moduloConsultaHabitacionesActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Principal_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Principal_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Principal_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Principal_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_Principal_EMPLEADO().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnBlockNotas;
    private javax.swing.JMenuItem btnCalculadora;
    private javax.swing.JMenuItem btnExcel;
    private javax.swing.JMenuItem btnExploradorArchivos;
    private javax.swing.JMenuItem btnMenu;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuHerramientas;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenu jMenuReservas;
    private javax.swing.JMenuItem moduloConsultaHabitaciones;
    private javax.swing.JMenuItem moduloReservasYConsumos;
    // End of variables declaration//GEN-END:variables
}
