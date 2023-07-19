package VISTA;

import DAO.ConexionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import FORMATOS.DiseñoTablas;
import DAO.filtrarDatos;

/**
 *
 * @author Martin
 */
public class habitacionDisponibles extends javax.swing.JPanel {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public habitacionDisponibles() {
        initComponents();
        consultar("disponible");
        DiseñoTablas t = new DiseñoTablas();
        t.AspectoContenido(TablaHabitaciones);
        t.AspectoEncabezados(TablaHabitaciones);
        t.AlinearColumna(0, TablaHabitaciones);
        t.AlinearColumna(1, TablaHabitaciones);
        t.AlinearColumna(2, TablaHabitaciones);
        t.AlinearColumna(3, TablaHabitaciones);
    }

    private void consultar(String estadoPredeterminado) {
        String sql = "select * from habitaciones";
        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[8];
            modelo = (DefaultTableModel) TablaHabitaciones.getModel();
            String estado;
            while (rs.next()) {
                estado = rs.getString("estado");
                if (estado.equalsIgnoreCase(estadoPredeterminado)) {
                    cliente[0] = rs.getInt("id");
                    cliente[1] = rs.getString("numero");
                    cliente[2] = rs.getString("piso");
                    cliente[3] = rs.getString("precio_diario");
                    cliente[4] = rs.getString("estado");
                    cliente[5] = rs.getString("tipo_habitacion");
                    cliente[6] = rs.getString("caracteristicas");
                    cliente[7] = rs.getString("descripcion");
                    modelo.addRow(cliente);
                }
            }
            TablaHabitaciones.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHabitaciones = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnMantenimiento = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnDisponible1 = new javax.swing.JButton();
        btnOcupado = new javax.swing.JButton();
        txtFiltrarTipo = new javax.swing.JTextField();
        txtFiltrarEstado = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Numero", "Piso", "Precio", "Estado", "Tipo habitacion", "Caracteristicas", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaHabitaciones.setAlignmentX(0.0F);
        TablaHabitaciones.setAlignmentY(0.0F);
        TablaHabitaciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TablaHabitaciones.setRequestFocusEnabled(false);
        TablaHabitaciones.setSelectionBackground(new java.awt.Color(39, 39, 39));
        TablaHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaHabitaciones);
        if (TablaHabitaciones.getColumnModel().getColumnCount() > 0) {
            TablaHabitaciones.getColumnModel().getColumn(4).setPreferredWidth(130);
            TablaHabitaciones.getColumnModel().getColumn(5).setPreferredWidth(140);
            TablaHabitaciones.getColumnModel().getColumn(6).setPreferredWidth(200);
            TablaHabitaciones.getColumnModel().getColumn(7).setPreferredWidth(250);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 990, 370));

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seleccione el estado de la habitacion");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        btnMantenimiento.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnMantenimiento.setText("MANTENIMIENTO");
        btnMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMantenimiento.setFocusPainted(false);
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });
        add(btnMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 140, 40));

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CONSULTA DE HABITACIONES");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        btnDisponible1.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnDisponible1.setText("DISPONIBLE");
        btnDisponible1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisponible1.setFocusPainted(false);
        btnDisponible1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponible1ActionPerformed(evt);
            }
        });
        add(btnDisponible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 130, 40));

        btnOcupado.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnOcupado.setText("OCUPADO");
        btnOcupado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOcupado.setFocusPainted(false);
        btnOcupado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcupadoActionPerformed(evt);
            }
        });
        add(btnOcupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 130, 40));

        txtFiltrarTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarTipoKeyTyped(evt);
            }
        });
        add(txtFiltrarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, 120, 30));

        txtFiltrarEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarEstadoKeyTyped(evt);
            }
        });
        add(txtFiltrarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 90, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void TablaHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaHabitacionesMouseClicked
        int fila = TablaHabitaciones.getSelectedRow();
    }//GEN-LAST:event_TablaHabitacionesMouseClicked

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        modelo.setRowCount(0);
        TablaHabitaciones.revalidate();
        TablaHabitaciones.repaint();
        consultar("mantenimiento");
    }//GEN-LAST:event_btnMantenimientoActionPerformed

    private void btnDisponible1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponible1ActionPerformed
        modelo.setRowCount(0);
        TablaHabitaciones.revalidate();
        TablaHabitaciones.repaint();
        consultar("disponible");
    }//GEN-LAST:event_btnDisponible1ActionPerformed

    private void btnOcupadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcupadoActionPerformed
        modelo.setRowCount(0);
        TablaHabitaciones.revalidate();
        TablaHabitaciones.repaint();
        consultar("ocupado");
    }//GEN-LAST:event_btnOcupadoActionPerformed

    private Map<String, String> obtenerColumnFilters() {
        Map<String, String> columnFilters = new HashMap<>();
        columnFilters.put("estado", txtFiltrarEstado.getText());
        columnFilters.put("tipo_habitacion", txtFiltrarTipo.getText());
        return columnFilters;
    }
    
    private void txtFiltrarEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarEstadoKeyTyped
        filtrarDatos.filterAndPopulateTable("habitaciones", TablaHabitaciones, obtenerColumnFilters());
    }//GEN-LAST:event_txtFiltrarEstadoKeyTyped

    private void txtFiltrarTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarTipoKeyTyped
        filtrarDatos.filterAndPopulateTable("habitaciones", TablaHabitaciones, obtenerColumnFilters());
    }//GEN-LAST:event_txtFiltrarTipoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaHabitaciones;
    private javax.swing.JButton btnDisponible1;
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnOcupado;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFiltrarEstado;
    private javax.swing.JTextField txtFiltrarTipo;
    // End of variables declaration//GEN-END:variables
}
