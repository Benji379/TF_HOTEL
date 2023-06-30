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
public class pnlConfigProductos extends javax.swing.JPanel {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public pnlConfigProductos() {
        initComponents();
        consultar();
        DiseñoTablas t = new DiseñoTablas();
        t.AspectoContenido(JTProductos);
        t.AspectoEncabezados(JTProductos);
        t.AlinearColumna(0, JTProductos);
        t.AlinearColumna(1, JTProductos);
        t.AlinearColumna(2, JTProductos);
        t.AlinearColumna(3, JTProductos);
        Transparentar();
    }

    private void Transparentar() {
        logica g = new logica();
        g.transTxtField(txtNombre);
        g.transTxtField(txtCantidad);
        g.transTxtField(txtPrecio);
        g.transTxtField(txtCodigo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTProductos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtTipoProducto = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        jLabel8.setText("Lista de Productos");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        JTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Cantidad", "Precio", "Tipo de producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTProductos.setSelectionBackground(new java.awt.Color(39, 39, 39));
        JTProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTProductos);
        if (JTProductos.getColumnModel().getColumnCount() > 0) {
            JTProductos.getColumnModel().getColumn(0).setResizable(false);
            JTProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTProductos.getColumnModel().getColumn(1).setPreferredWidth(120);
            JTProductos.getColumnModel().getColumn(2).setResizable(false);
            JTProductos.getColumnModel().getColumn(2).setPreferredWidth(60);
            JTProductos.getColumnModel().getColumn(3).setResizable(false);
            JTProductos.getColumnModel().getColumn(3).setPreferredWidth(130);
            JTProductos.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 510, -1));

        btnModificar.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 90, 40));

        btnEliminar.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 90, 40));

        btnAgregar.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 90, 40));

        btnNuevo.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 90, 40));

        txtCantidad.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(null);
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 170, 20));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 170, 20));

        txtNombre.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 170, 20));

        txtPrecio.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(null);
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 170, 20));

        txtTipoProducto.setBackground(new java.awt.Color(153, 153, 153));
        txtTipoProducto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTipoProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bebida", "Aperitivo", " " }));
        txtTipoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTipoProducto.setFocusable(false);
        add(txtTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 170, 40));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de producto");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cantidad:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 170, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 170, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 170, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 170, 10));

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Codigo:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRODUCTOS");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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
    void Nuevo() {
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtNombre.requestFocus();
        txtCodigo.setText("");
    }

    private void consultar() {
        String sql = "select * from productos";
        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[5];
            modelo = (DefaultTableModel) JTProductos.getModel();
            while (rs.next()) {
                cliente[0] = rs.getInt("id");
                cliente[1] = rs.getString("nombre");
                cliente[2] = rs.getString("cantidad");
                cliente[3] = rs.getString("precioUnid");
                cliente[4] = rs.getString("tipoProducto");
                modelo.addRow(cliente);
            }
            JTProductos.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void JTProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTProductosMouseClicked
        int fila = JTProductos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            idc = Integer.parseInt((String) JTProductos.getValueAt(fila, 0).toString());
            String codigo = String.valueOf(idc);
            String nombre = (String) JTProductos.getValueAt(fila, 1);
            String cantidad = (String) JTProductos.getValueAt(fila, 2);
            String precio = (String) JTProductos.getValueAt(fila, 3);
            String tipoProducto = (String) JTProductos.getValueAt(fila, 4);

            txtNombre.setText(nombre);
            txtCantidad.setText(cantidad);
            txtPrecio.setText(precio);
            txtTipoProducto.setSelectedItem(tipoProducto);
            txtCodigo.setText(codigo);
        }
    }//GEN-LAST:event_JTProductosMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
    void Eliminar() {

        int fila = JTProductos.getSelectedRow();

        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
                limpiarTabla();
            } else {
                String sql = "delete from productos where id=" + idc;
                conet = con1.conexion();
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                limpiarTabla();
            }

        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    void Modificar() {

        String nombre = txtNombre.getText();
        String cantidad = txtCantidad.getText();
        String precio = txtPrecio.getText();
        String tipoProducto = (String) txtTipoProducto.getSelectedItem();

        try {
            if (nombre.equals("") || cantidad.equals("") || precio.equals("") || tipoProducto.equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "Update productos set id='" + idc + "', nombre='" + nombre + "', cantidad='" + cantidad + "', precioUnid='" + precio + "', tipoProducto='" + tipoProducto + "' where id=" + idc;
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

    void Agregar() {
        String nombre = txtNombre.getText();
        String cantidad = txtCantidad.getText();
        String precio = txtPrecio.getText();
        String tipoProducto = (String) txtTipoProducto.getSelectedItem();

        try {
            if (nombre.equals("") || cantidad.equals("") || precio.equals("") || tipoProducto.equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR: campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "insert into productos(nombre,cantidad,precioUnid,tipoProducto) values ('" + nombre + "','" + cantidad + "','" + precio + "','" + tipoProducto + "')";
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
        for (int i = 0; i < JTProductos.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTProductos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JComboBox txtTipoProducto;
    // End of variables declaration//GEN-END:variables
}
