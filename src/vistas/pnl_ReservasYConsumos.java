package vistas;

import ConexionBd.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodosDAO.DiseñoTablas;
import metodosDAO.logica;

/**
 *
 * @author Martin
 */
public class pnl_ReservasYConsumos extends javax.swing.JPanel {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    public static double totalConsumo = 0;

    public pnl_ReservasYConsumos() {
        initComponents();
        consultar();
        DiseñoTablas t = new DiseñoTablas();
        t.AspectoContenido(JTReservas);
        t.AspectoEncabezados(JTReservas);
        t.AlinearColumna(0, JTReservas);
        t.AlinearColumna(1, JTReservas);
        t.AlinearColumna(2, JTReservas);
        t.AlinearColumna(3, JTReservas);
        Transparentar();
    }

    private void Transparentar() {
        logica g = new logica();
        g.transTxtField(txtNumeroHabitacion);
        g.transTxtField(txtPiso);
        g.transTxtField(txtDni);
        g.transTxtField(txtTrabajador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTReservas = new javax.swing.JTable();
        btnConsumos = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtPiso = new javax.swing.JTextField();
        txtTrabajador = new javax.swing.JTextField();
        txtNumeroHabitacion = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTipoHabitacion = new javax.swing.JComboBox();
        txtCancelado = new javax.swing.JComboBox();
        jlLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotalConsumo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lista de reservas");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        JTReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Habitacion", "Piso", "DNI", "Trabajador", "Tipo", "Pag.", "Consumos", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTReservas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTReservas.setSelectionBackground(new java.awt.Color(39, 39, 39));
        JTReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTReservas);
        if (JTReservas.getColumnModel().getColumnCount() > 0) {
            JTReservas.getColumnModel().getColumn(0).setResizable(false);
            JTReservas.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTReservas.getColumnModel().getColumn(1).setResizable(false);
            JTReservas.getColumnModel().getColumn(1).setPreferredWidth(90);
            JTReservas.getColumnModel().getColumn(2).setResizable(false);
            JTReservas.getColumnModel().getColumn(2).setPreferredWidth(60);
            JTReservas.getColumnModel().getColumn(3).setResizable(false);
            JTReservas.getColumnModel().getColumn(3).setPreferredWidth(130);
            JTReservas.getColumnModel().getColumn(4).setMinWidth(130);
            JTReservas.getColumnModel().getColumn(4).setPreferredWidth(130);
            JTReservas.getColumnModel().getColumn(4).setMaxWidth(300);
            JTReservas.getColumnModel().getColumn(5).setResizable(false);
            JTReservas.getColumnModel().getColumn(5).setPreferredWidth(110);
            JTReservas.getColumnModel().getColumn(6).setResizable(false);
            JTReservas.getColumnModel().getColumn(6).setPreferredWidth(50);
            JTReservas.getColumnModel().getColumn(7).setResizable(false);
            JTReservas.getColumnModel().getColumn(7).setPreferredWidth(90);
            JTReservas.getColumnModel().getColumn(8).setResizable(false);
            JTReservas.getColumnModel().getColumn(8).setPreferredWidth(90);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 710, -1));

        btnConsumos.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnConsumos.setText("Consumos");
        btnConsumos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsumos.setFocusPainted(false);
        btnConsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsumosActionPerformed(evt);
            }
        });
        add(btnConsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 120, 40));

        btnModificar.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 40));

        btnEliminar.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 90, 40));

        btnAgregar.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 90, 40));

        btnNuevo.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 90, 40));

        txtPiso.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtPiso.setForeground(new java.awt.Color(255, 255, 255));
        txtPiso.setBorder(null);
        add(txtPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, 20));

        txtTrabajador.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        txtTrabajador.setBorder(null);
        add(txtTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 170, 20));

        txtNumeroHabitacion.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNumeroHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroHabitacion.setBorder(null);
        add(txtNumeroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, 20));

        txtDni.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 170, 20));

        txtTipoHabitacion.setBackground(new java.awt.Color(153, 153, 153));
        txtTipoHabitacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Individual", "Matrimonial", "Familiar", "Presidencial" }));
        txtTipoHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTipoHabitacion.setFocusable(false);
        add(txtTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 170, 40));

        txtCancelado.setBackground(new java.awt.Color(153, 153, 153));
        txtCancelado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCancelado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        txtCancelado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCancelado.setFocusable(false);
        add(txtCancelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, 40));

        jlLabel.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jlLabel.setForeground(new java.awt.Color(255, 255, 255));
        jlLabel.setText("S/.");
        add(jlLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 30, 40));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de habitación");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Número: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Piso:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtTotalConsumo.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtTotalConsumo.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalConsumo.setText("0.0");
        add(txtTotalConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 140, 40));

        jLabel15.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("DNI:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cancelado");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 170, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 170, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 170, 10));

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Trabajador");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RESERVAS");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
        consultar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        logica g = new logica();
        String disponible = g.mostrarDatos("habitaciones", "numero", txtNumeroHabitacion.getText(), "estado");

        if (disponible.equalsIgnoreCase("disponible")) {
            try {
                Agregar();
                consultar();
                Nuevo();
                //en proceso.
//                g.modificarDato("habitaciones", "numero", txtNumeroHabitacion.getText(), "estado", "Ocupado");
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Habitacion no disponible");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btnModificarActionPerformed
    void Nuevo() {
        txtNumeroHabitacion.setText("");
        txtPiso.setText("");
        txtCancelado.setSelectedIndex(1);
        txtDni.setText("");
        txtNumeroHabitacion.requestFocus();
        txtTotalConsumo.setText("0.0");
        txtTrabajador.setText("");
    }

    private void consultar() {
        String sql = "select * from reservas";
        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[9];
            modelo = (DefaultTableModel) JTReservas.getModel();
            while (rs.next()) {
                cliente[0] = rs.getInt("id");
                cliente[1] = rs.getString("habitacion");
                cliente[2] = rs.getString("piso");
                cliente[3] = rs.getString("dni");
                cliente[4] = rs.getString("trabajador");
                cliente[5] = rs.getString("tipo");
                cliente[6] = rs.getString("pag");
                cliente[7] = rs.getString("consumos");
                cliente[8] = rs.getString("fecha");
                modelo.addRow(cliente);
            }
            JTReservas.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void JTReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTReservasMouseClicked
        int fila = JTReservas.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            idc = Integer.parseInt((String) JTReservas.getValueAt(fila, 0).toString());
            String numHabita = (String) JTReservas.getValueAt(fila, 1);
            String piso = (String) JTReservas.getValueAt(fila, 2);
            String dni = (String) JTReservas.getValueAt(fila, 3);
            String trabajador = (String) JTReservas.getValueAt(fila, 4);
            String tipo = (String) JTReservas.getValueAt(fila, 5);
            String cancelado = (String) JTReservas.getValueAt(fila, 6);
            String consumo = (String) JTReservas.getValueAt(fila, 7);

            txtNumeroHabitacion.setText(numHabita);
            txtPiso.setText(piso);
            txtDni.setText(dni);
            txtCancelado.setSelectedItem(cancelado);
            txtTipoHabitacion.setSelectedItem(tipo);
            txtTrabajador.setText(trabajador);
            txtTotalConsumo.setText(consumo);
        }
    }//GEN-LAST:event_JTReservasMouseClicked
    void Eliminar() {

        int fila = JTReservas.getSelectedRow();

        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
                limpiarTabla();
            } else {
                String sql = "delete from reservas where id=" + idc;
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Habitacion Eliminada");
                limpiarTabla();
            }

        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    void Modificar() {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String numHabita = txtNumeroHabitacion.getText();
        String piso = txtPiso.getText();
        String dni = txtDni.getText();
        String trabajador = txtTrabajador.getText();
        String tipo = (String) txtTipoHabitacion.getSelectedItem();
        String pagado = (String) txtCancelado.getSelectedItem();
        String consumo = txtTotalConsumo.getText();
        String fecha = formatoFecha.format(fechaActual);

        try {
            if (numHabita.equals("") || piso.equals("") || dni.equals("") || trabajador.equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "Update reservas set id='" + idc + "', habitacion='" + numHabita + "', piso='" + piso + "', dni='" + dni + "', trabajador='" + trabajador + "', tipo='" + tipo + "', pag='" + pagado + "', consumos='" + consumo + "', fecha='" + fecha + "' where id=" + idc;
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Datos Modificados");
                limpiarTabla();
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void btnConsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsumosActionPerformed
        Consumos abrir = new Consumos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConsumosActionPerformed

    void Agregar() {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String numHabita = txtNumeroHabitacion.getText();
        String piso = txtPiso.getText();
        String dni = txtDni.getText();
        String trabajador = txtTrabajador.getText();
        String tipo = (String) txtTipoHabitacion.getSelectedItem();
        String pagado = (String) txtCancelado.getSelectedItem();
        String consumo = txtTotalConsumo.getText();
        String fecha = formatoFecha.format(fechaActual);

        try {
            if (numHabita.equals("") || piso.equals("") || dni.equals("") || trabajador.equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "insert into reservas(habitacion,piso,dni,trabajador,tipo,pag,consumos,fecha) values ('" + numHabita + "','" + piso + "','" + dni + "','" + trabajador + "','" + tipo + "','" + pagado + "','" + consumo + "','" + fecha + "')";
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Nueva Reserva");
                limpiarTabla();
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < JTReservas.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTReservas;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsumos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public static javax.swing.JLabel jlLabel;
    private javax.swing.JComboBox txtCancelado;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNumeroHabitacion;
    private javax.swing.JTextField txtPiso;
    private javax.swing.JComboBox txtTipoHabitacion;
    public static javax.swing.JLabel txtTotalConsumo;
    private javax.swing.JTextField txtTrabajador;
    // End of variables declaration//GEN-END:variables
}
