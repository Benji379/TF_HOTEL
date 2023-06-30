package vistas;

import ConexionBd.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodosDAO.DiseñoTablas;
import metodosDAO.logica;

/**
 *
 * @author Martin
 */

public class pnl_Habitaciones extends javax.swing.JPanel {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public pnl_Habitaciones() {
        initComponents();
        consultar();

        /*
            LE DAMOS DISEÑO A LAS TABLAS CON EL METODO 
            "Aspecto contenido" DEL PAQUETE DISEÑODE TABLAS
         */
        DiseñoTablas t = new DiseñoTablas();
        t.AspectoContenido(TablaHabitaciones);
        t.AspectoEncabezados(TablaHabitaciones);
        t.AlinearColumna(0, TablaHabitaciones);
        t.AlinearColumna(1, TablaHabitaciones);
        t.AlinearColumna(2, TablaHabitaciones);
        t.AlinearColumna(3, TablaHabitaciones);
        Transparentar();
    }

    private void Transparentar() {
        logica g = new logica();
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        g.transTxtField(txtNumeroHabitacion);
        g.transTxtField(txtPiso);
        g.transTxtField(txtPrecioDiario);
        g.transTxtField(txtCaracteristicas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtPiso = new javax.swing.JTextField();
        txtCaracteristicas = new javax.swing.JTextField();
        txtNumeroHabitacion = new javax.swing.JTextField();
        txtPrecioDiario = new javax.swing.JTextField();
        txtTipoHabitacion = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHabitaciones = new javax.swing.JTable();
        txtEstado = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIcons/Archivo.png"))); // NOI18N
        jMenuItem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuItem1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jPopupMenu1.add(jMenuItem2);

        setBackground(new java.awt.Color(51, 51, 51));
        setComponentPopupMenu(jPopupMenu1);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtCaracteristicas.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCaracteristicas.setForeground(new java.awt.Color(255, 255, 255));
        txtCaracteristicas.setBorder(null);
        add(txtCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 170, 20));

        txtNumeroHabitacion.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNumeroHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroHabitacion.setBorder(null);
        add(txtNumeroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, 20));

        txtPrecioDiario.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtPrecioDiario.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioDiario.setBorder(null);
        add(txtPrecioDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 170, 20));

        txtTipoHabitacion.setBackground(new java.awt.Color(153, 153, 153));
        txtTipoHabitacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Individual", "Matrimonial", "Familiar", "Presidencial" }));
        txtTipoHabitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTipoHabitacion.setFocusable(false);
        add(txtTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 170, 40));

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
            TablaHabitaciones.getColumnModel().getColumn(0).setMinWidth(50);
            TablaHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaHabitaciones.getColumnModel().getColumn(0).setMaxWidth(50);
            TablaHabitaciones.getColumnModel().getColumn(1).setMinWidth(90);
            TablaHabitaciones.getColumnModel().getColumn(1).setPreferredWidth(90);
            TablaHabitaciones.getColumnModel().getColumn(1).setMaxWidth(90);
            TablaHabitaciones.getColumnModel().getColumn(2).setMinWidth(60);
            TablaHabitaciones.getColumnModel().getColumn(2).setPreferredWidth(60);
            TablaHabitaciones.getColumnModel().getColumn(2).setMaxWidth(60);
            TablaHabitaciones.getColumnModel().getColumn(3).setMinWidth(80);
            TablaHabitaciones.getColumnModel().getColumn(3).setPreferredWidth(80);
            TablaHabitaciones.getColumnModel().getColumn(3).setMaxWidth(80);
            TablaHabitaciones.getColumnModel().getColumn(4).setMinWidth(130);
            TablaHabitaciones.getColumnModel().getColumn(4).setPreferredWidth(130);
            TablaHabitaciones.getColumnModel().getColumn(4).setMaxWidth(130);
            TablaHabitaciones.getColumnModel().getColumn(5).setMinWidth(140);
            TablaHabitaciones.getColumnModel().getColumn(5).setPreferredWidth(140);
            TablaHabitaciones.getColumnModel().getColumn(5).setMaxWidth(140);
            TablaHabitaciones.getColumnModel().getColumn(6).setMinWidth(150);
            TablaHabitaciones.getColumnModel().getColumn(6).setPreferredWidth(150);
            TablaHabitaciones.getColumnModel().getColumn(6).setMaxWidth(200);
            TablaHabitaciones.getColumnModel().getColumn(7).setMinWidth(150);
            TablaHabitaciones.getColumnModel().getColumn(7).setPreferredWidth(150);
            TablaHabitaciones.getColumnModel().getColumn(7).setMaxWidth(200);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 760, 430));

        txtEstado.setBackground(new java.awt.Color(153, 153, 153));
        txtEstado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", "Mantenimiento" }));
        txtEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEstado.setFocusable(false);
        add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, 40));

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HABITACIONES");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

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

        jLabel13.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Descripción:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Características:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel15.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio diario:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Estado");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, 10));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 170, 70));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 170, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 170, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 170, 10));

        jLabel17.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Registro de Habitaciones");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    void Agregar() {
        String numHabita = txtNumeroHabitacion.getText();
        String piso = txtPiso.getText();
        String precioDiario = txtPrecioDiario.getText();
        String estado = (String) txtEstado.getSelectedItem();
        String tipo = (String) txtTipoHabitacion.getSelectedItem();
        String caracteristica = txtCaracteristicas.getText();
        String descripcion = txtDescripcion.getText();

        try {
            if (numHabita.equals("") || piso.equals("") || precioDiario.equals("") || estado.equals("")
                    || tipo.equals("") || caracteristica.equals("") || descripcion.equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "insert into habitaciones(numero,piso,precio_diario,estado,tipo_habitacion,caracteristicas,descripcion) values ('" + numHabita + "','" + piso + "','" + precioDiario + "','" + estado + "','" + tipo + "','" + caracteristica + "','" + descripcion + "')";
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Nuevo producto");
                limpiarTabla();
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < TablaHabitaciones.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }

    void Eliminar() {

        int fila = TablaHabitaciones.getSelectedRow();

        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
                limpiarTabla();
            } else {
                String sql = "delete from habitaciones where id=" + idc;
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

    void Nuevo() {
        txtNumeroHabitacion.setText("");
        txtPiso.setText("");
        txtPrecioDiario.setText("");
        txtCaracteristicas.setText("");
        txtDescripcion.setText("");
        txtNumeroHabitacion.requestFocus();
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
        consultar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            Agregar();
            consultar();
            Nuevo();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
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

    private void TablaHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaHabitacionesMouseClicked
        int fila = TablaHabitaciones.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            idc = Integer.parseInt((String) TablaHabitaciones.getValueAt(fila, 0).toString());
            String numHabita = (String) TablaHabitaciones.getValueAt(fila, 1);
            String piso = (String) TablaHabitaciones.getValueAt(fila, 2);
            String precioDiario = (String) TablaHabitaciones.getValueAt(fila, 3);
            String estado = (String) TablaHabitaciones.getValueAt(fila, 4);
            String tipo = (String) TablaHabitaciones.getValueAt(fila, 5);
            String caracteristica = (String) TablaHabitaciones.getValueAt(fila, 6);
            String descripcion = (String) TablaHabitaciones.getValueAt(fila, 7);

            txtNumeroHabitacion.setText(numHabita);
            txtPiso.setText(piso);
            txtPrecioDiario.setText(precioDiario);
            txtEstado.setSelectedItem(estado);
            txtTipoHabitacion.setSelectedItem(tipo);
            txtCaracteristicas.setText(caracteristica);
            txtDescripcion.setText(descripcion);
        }
    }//GEN-LAST:event_TablaHabitacionesMouseClicked

    void Modificar() {

        String numHabita = txtNumeroHabitacion.getText();
        String piso = txtPiso.getText();
        String precioDiario = txtPrecioDiario.getText();
        String estado = (String) txtEstado.getSelectedItem();
        String tipo = (String) txtTipoHabitacion.getSelectedItem();
        String caracteristica = txtCaracteristicas.getText();
        String descripcion = txtDescripcion.getText();

        try {
            if (numHabita.equals("") || piso.equals("") || precioDiario.equals("") || estado.equals("") || tipo.equals("") || caracteristica.equals("") || descripcion.equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "Update habitaciones set id='" + idc + "', numero='" + numHabita + "', piso='" + piso + "', precio_diario='" + precioDiario + "', estado='" + estado + "', tipo_habitacion='" + tipo + "', caracteristicas='" + caracteristica + "', descripcion='" + descripcion + "' where id=" + idc;
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Datos de servicio Modificados");
                limpiarTabla();
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void consultar() {
        String sql = "select * from habitaciones";
        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[8];
            modelo = (DefaultTableModel) TablaHabitaciones.getModel();
            while (rs.next()) {
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
            TablaHabitaciones.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaHabitaciones;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtCaracteristicas;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JComboBox txtEstado;
    private javax.swing.JTextField txtNumeroHabitacion;
    private javax.swing.JTextField txtPiso;
    private javax.swing.JTextField txtPrecioDiario;
    private javax.swing.JComboBox txtTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
