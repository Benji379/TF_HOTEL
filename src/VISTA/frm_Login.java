package VISTA;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import DAO.ConexionSQL;
import java.sql.Connection;
import DAO.logica;
import FORMATOS.formato;
import VISTA_EMPLEADO.frm_Principal_EMPLEADO;

/**
 *
 * @author Martin
 */
public class frm_Login extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();

    public frm_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        formato lg = new formato();
        lg.transTxtField(txtUsuario);
        lg.transTxtField(txtContraseña);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGENES/icono.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        btnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 110, 40));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, 60));

        txtUsuario.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 150, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 150, 10));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 80, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 150, 10));

        txtContraseña.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(null);
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 150, 20));

        btnEnter.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        btnEnter.setText("ENTER");
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setFocusPainted(false);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void validarUsuario() {
        int resultado;
        String DNI = txtUsuario.getText();
        String buscarUsuario = "select * from empleados  where dni='" + DNI + "'   ";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(buscarUsuario);

            if (rs.next()) {
                resultado = 1;
                if (resultado == 1) {
                    int result;
                    String PASSWORD = txtContraseña.getText();
                    String buscarContraseña = "select * from empleados where dni='" + DNI + "' and contraseña='" + PASSWORD + "'  ";
                    try {
                        Statement stC = con.createStatement();
                        ResultSet rsC = stC.executeQuery(buscarContraseña);
                        if (rsC.next()) {
                            result = 1;
                            if (result == 1) {
                                if (txtUsuario.getText().equalsIgnoreCase("Admin")) {
                                    frm_Principal abrir = new frm_Principal();
                                    abrir.setVisible(true);
                                    this.hide();
                                    mandarDatosPantallaInicio();
                                } else {
                                    frm_Principal_EMPLEADO abrir = new frm_Principal_EMPLEADO();
                                    abrir.setVisible(true);
                                    this.hide();
                                    mandarDatosPantallaInicio();
                                }

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no registrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario no registrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    /*DECLARO MIS VARIABLES DE FORMA STATICA, PARA PODER TENER ACCESO A MIS VARIABLES
    DESDE OTRA VENTANA
     */
    public static String NOMBRE, APELLIDO, CORREO;

    public void mandarDatosPantallaInicio() {

        logica lg = new logica();

        //CAPTURA LOS DATOS DEL METODO getter "mostrarDatos"
        String nombre = lg.mostrarDatos("empleados", "dni", txtUsuario.getText(), "nombre");
        String apellido = lg.mostrarDatos("empleados", "dni", txtUsuario.getText(), "apellido");
        String correo = lg.mostrarDatos("empleados", "dni", txtUsuario.getText(), "correo");

        //MUESTRA LOS DATOS CAPTURADOS EN LOS RESPECTIVO TEXTFIELD DEL PANEL PRINCIPAL
        pnl_principal.txtNombre.setText(nombre);
        pnl_principal.txtApellido.setText(apellido);
        pnl_principal.txtCorreo.setText(correo);

        //GUARDAR DATOS DEL EMPLEADO EN TODO EL SISTEMA
        NOMBRE = nombre;
        APELLIDO = apellido;
        CORREO = correo;
    }


    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        validarUsuario();
    }//GEN-LAST:event_btnEnterActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
