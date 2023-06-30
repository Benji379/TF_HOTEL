/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import ConexionBd.ConexionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import metodosDAO.DiseñoTablas;

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
        consultar();
        DiseñoTablas t = new DiseñoTablas();
        t.AspectoContenido(TablaHabitaciones);
        t.AspectoEncabezados(TablaHabitaciones);
        t.AlinearColumna(0, TablaHabitaciones);
        t.AlinearColumna(1, TablaHabitaciones);
        t.AlinearColumna(2, TablaHabitaciones);
        t.AlinearColumna(3, TablaHabitaciones);
    }

    private void consultar() {
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
                if (estado.equalsIgnoreCase("Disponible")) {
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 990, 430));

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HABITACIONES DISPONIBLES");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TablaHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaHabitacionesMouseClicked
        int fila = TablaHabitaciones.getSelectedRow();

    }//GEN-LAST:event_TablaHabitacionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaHabitaciones;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
