package vistas;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Martin
 */
public final class Boleta extends javax.swing.JFrame {

    public Boleta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imgIcons/icono.png")));
        cerrar();
    }

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    setVisible(false);
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        txtDni = new javax.swing.JLabel();
        txtHabitacion = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMontoHabitacion = new javax.swing.JLabel();
        txtProductos = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boleta");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BOLETA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Apellido:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Dni");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Habitacion");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombre: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtNombre.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText(" ");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 160, -1));

        txtApellido.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setText(" ");
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, -1));

        txtDni.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setText(" ");
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, -1));

        txtHabitacion.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        txtHabitacion.setText(" ");
        jPanel1.add(txtHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 160, -1));

        txtTipo.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(255, 255, 255));
        txtTipo.setText(" ");
        jPanel1.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 160, -1));

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tipo");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        txtTotal.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setText("0.0");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 350, 20));

        txtMontoHabitacion.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtMontoHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoHabitacion.setText("0.0");
        jPanel1.add(txtMontoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, 20));

        txtProductos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtProductos.setForeground(new java.awt.Color(255, 255, 255));
        txtProductos.setText("0.0");
        jPanel1.add(txtProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, 20));

        jLabel19.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Productos: S/.");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel18.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Habitacion: S/.");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 350, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 350, 20));

        jLabel20.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("TOTAL: S/.");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Boleta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JLabel txtApellido;
    public static javax.swing.JLabel txtDni;
    public static javax.swing.JLabel txtHabitacion;
    public static javax.swing.JLabel txtMontoHabitacion;
    public static javax.swing.JLabel txtNombre;
    public static javax.swing.JLabel txtProductos;
    public static javax.swing.JLabel txtTipo;
    public static javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

}
