/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Enumeracion.Permiso;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.Banco;
import logica.Empresa;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Carlos
 */
public class VentanaCrearEmpresa extends javax.swing.JFrame {

    private Banco miBanco;
    private Empresa miEmpresa;

    /**
     * Creates new form VentanaCrearEmpresa
     * @param ban
     */
    public VentanaCrearEmpresa(Banco ban) {
        miBanco = ban;
        initComponents();
        setLocationRelativeTo(null);

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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTusuarioEmpresa = new javax.swing.JTextField();
        jTrespuestaCrearEmpresa = new javax.swing.JTextField();
        jTrazonSocial = new javax.swing.JTextField();
        jTNIT = new javax.swing.JTextField();
        jBAgregarEmpresa = new javax.swing.JButton();
        jPcontraseniaEmpresa = new javax.swing.JPasswordField();
        jElegirPregunta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Empresa"));

        jLabel1.setText("Razon Social:");

        jLabel2.setText("NIT:");

        jLabel8.setText("Usuario:");

        jLabel9.setText("Contraseña:");

        jLabel10.setText("Pregunta:");

        jLabel11.setText("Respuesta:");

        jTrazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTrazonSocialKeyTyped(evt);
            }
        });

        jTNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNITKeyTyped(evt);
            }
        });

        jBAgregarEmpresa.setText("Crear Empresa");
        jBAgregarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarEmpresaActionPerformed(evt);
            }
        });

        jElegirPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cómo se llama su mascota?", "¿Cuál es el nombre de su madre?", "¿Nombre de su mejor amig@?", "¿Cuál es su comida favorita?", "¿Primer nombre de su padre?" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBAgregarEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jElegirPregunta, javax.swing.GroupLayout.Alignment.TRAILING, 0, 262, Short.MAX_VALUE)
                            .addComponent(jPcontraseniaEmpresa)
                            .addComponent(jTrespuestaCrearEmpresa)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTrazonSocial)
                            .addComponent(jTNIT)
                            .addComponent(jTusuarioEmpresa))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTrazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTusuarioEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPcontraseniaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jElegirPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTrespuestaCrearEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBAgregarEmpresa)
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

    private void jTrazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTrazonSocialKeyTyped
        // TODO add your handling code here:
        validarLetras(jTrazonSocial, evt);
    }//GEN-LAST:event_jTrazonSocialKeyTyped

    private void jTNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNITKeyTyped
        // TODO add your handling code here:
        validarNumeros(jTNIT, evt);
    }//GEN-LAST:event_jTNITKeyTyped

    private void jBAgregarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarEmpresaActionPerformed
        // TODO add your handling code here:
        if (validarDatosAgregarEmpresa().equals("")) {
            String razoSocial = jTrazonSocial.getText();
            String nitEmpresa = jTNIT.getText();
            String usuarioEmpre = jTusuarioEmpresa.getText();

            char[] obtenerPassword = jPcontraseniaEmpresa.getPassword();
            String password = "";
            for (int i = 0; i < obtenerPassword.length; i++) {
                password += obtenerPassword[i];
            }
            String preguntaSeguEmpresa = (String) jElegirPregunta.getSelectedItem();
            String respuestaEmpresa = jTrespuestaCrearEmpresa.getText();

            miEmpresa = new Empresa(razoSocial, nitEmpresa, usuarioEmpre, password, preguntaSeguEmpresa, respuestaEmpresa, Permiso.EMPRESA);

            boolean agregarEmpresa = miBanco.agregarEmpresa(miEmpresa);

            if (agregarEmpresa) {
                JOptionPane.showMessageDialog(null, "La empresa se registró");
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede registrar la empresa");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! \n" + validarDatosAgregarEmpresa(), "Validando Datos",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jBAgregarEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCrearEmpresa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearEmpresa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearEmpresa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearEmpresa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCrearEmpresa(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarEmpresa;
    private javax.swing.JComboBox<String> jElegirPregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPcontraseniaEmpresa;
    private javax.swing.JTextField jTNIT;
    private javax.swing.JTextField jTrazonSocial;
    private javax.swing.JTextField jTrespuestaCrearEmpresa;
    private javax.swing.JTextField jTusuarioEmpresa;
    // End of variables declaration//GEN-END:variables
     /**
     *
     * @param campo
     * @param evt
     */
    public void validarLetras(JTextField campo, KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Validando Datos",
                    JOptionPane.INFORMATION_MESSAGE);
            campo.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar simbolos!!!", "Validando Datos",
                    JOptionPane.INFORMATION_MESSAGE);
            campo.setCursor(null);
        }
    }

    /**
     * Metodo para validar que el usuario no ingrese una letra
     *
     * @param campo campo al cual se aplica la validacion
     * @param evt evento de teclado
     */
    public void validarNumeros(JTextField campo, KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
                    JOptionPane.INFORMATION_MESSAGE);
            campo.setCursor(null);
        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar simbolos!!!", "Validando Datos",
                    JOptionPane.INFORMATION_MESSAGE);
            campo.setCursor(null);
        }
    }

    /**
     *
     * @return
     */
    public String validarDatosAgregarEmpresa() {//Metodo para comprobar que los datos esten completos
        String msj = "";
        if (jTrazonSocial.getText().equals("")) {//Si jTrazonSocial está vacio
            msj += "Por favor digite la razón social. \n";
        }
        if (jTNIT.getText().equals("")) {//Si jTNIT está vacio
            msj += "Por favor digite el Nit de su empresa. \n";
        }
        if (jTusuarioEmpresa.getText().equals("")) {//Si jTusuarioEmpresa vacio
            msj += "Por favor digite su usuario (Empresa). \n";
        }
        if (jPcontraseniaEmpresa.getPassword().length == 0) {//Si jPcontraseniaEmpresa esta vacio
            msj += "Por favor digite su contraseña . \n";
        }
        if (jTrespuestaCrearEmpresa.getText().equals("")) {//Si jTrespuestaCrearEmpresa esta vacio
            msj += "Por favor digite su respuesta. \n";

        }
        return msj;//devuelve msj
    }

}
