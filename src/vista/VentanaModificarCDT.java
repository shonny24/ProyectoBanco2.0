/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Date;
import javax.swing.JOptionPane;
import logica.Banco;
import logica.CDTs;
import logica.Cliente;
import static vista.VentanaPrincipal.*;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Carlos
 */
public class VentanaModificarCDT extends javax.swing.JFrame {

    private Banco miBanco;
    private CDTs miCDT;
    private Cliente miCliente;
    private String idCuenta;
    private String idCliente;

    /**
     * Creates new form VentanaCDT
     *
     * @param ban
     */
    public VentanaModificarCDT(Banco ban, String idCliente, String idCuenta) {
        miBanco = ban;
        this.idCuenta = idCuenta;
        this.idCliente = idCliente;
        initComponents();
        setLocationRelativeTo(null);
         miCliente = miBanco.buscarCliente(idCliente);
        inicializarCampos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTMontoCDT = new javax.swing.JTextField();
        jTIntereCDT = new javax.swing.JTextField();
        jBAgregarCDT = new javax.swing.JButton();
        jCheckBoxMensualOAnual = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jTnumeroCuentaCDT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear CDT"));

        jLabel1.setText("Monto de inversión:");

        jLabel2.setText("% de interés:");

        jBAgregarCDT.setText("Modificar CDT");
        jBAgregarCDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarCDTActionPerformed(evt);
            }
        });

        jCheckBoxMensualOAnual.setText("Pago mensual?");
        jCheckBoxMensualOAnual.setToolTipText("Seleccione si quiere que se pague mensual, de lo contrario se pagara anual");

        jLabel3.setText("# Cuenta:");

        jTnumeroCuentaCDT.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(jTnumeroCuentaCDT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTIntereCDT)
                                    .addComponent(jTMontoCDT, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBoxMensualOAnual)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jBAgregarCDT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTnumeroCuentaCDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTMontoCDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTIntereCDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxMensualOAnual)
                .addGap(18, 18, 18)
                .addComponent(jBAgregarCDT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarCDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarCDTActionPerformed
        // TODO add your handling code here:
        double montoInversion = Double.parseDouble(jTMontoCDT.getText());
        int porcentajeInteres = Integer.parseInt(jTIntereCDT.getText());
        boolean mensualOAnual = jCheckBoxMensualOAnual.isSelected();//true es mensual false es anual

        String numeroCDT = jTnumeroCuentaCDT.getText();

        boolean agregarCDT = miCliente.modificarCuentaCDT(idCuenta, montoInversion, porcentajeInteres, mensualOAnual);
        clienteSesion.setNumeroBancario(numeroCDT);

        //Mostramos mensaje de que se agrego o no el CDT
        if (agregarCDT) {
            JOptionPane.showMessageDialog(null, "El CDT se modifico");

        } else {
            JOptionPane.showMessageDialog(null, "No se puede modificar el CDT");
        }

    }//GEN-LAST:event_jBAgregarCDTActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaModificarCDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarCDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarCDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarCDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificarCDT(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarCDT;
    private javax.swing.JCheckBox jCheckBoxMensualOAnual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTIntereCDT;
    private javax.swing.JTextField jTMontoCDT;
    private javax.swing.JTextField jTnumeroCuentaCDT;
    // End of variables declaration//GEN-END:variables
    public void inicializarCampos() {
        miCDT = miCliente.buscarCDT(idCuenta);
        jTnumeroCuentaCDT.setText(miCDT.getNumeroBancario());
        jTMontoCDT.setText(miCDT.getMontoInversion()+"");
        jTIntereCDT.setText(miCDT.getPorcentajeInteresPagado()+"");
        jCheckBoxMensualOAnual.setSelected(miCDT.isPagoMensual());

    }
}

