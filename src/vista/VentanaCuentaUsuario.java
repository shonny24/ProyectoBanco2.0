/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import logica.Banco;
import logica.Cliente;
import static vista.VentanaCrearCuenta.*;
import static vista.VentanaPrincipal.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Ahorro;
import logica.CDTs;
import logica.Corriente;
import logica.Nomina;
import static vista.VentanaCuentaEmpresa.jTableNominaEmpresa;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Carlos
 */
public class VentanaCuentaUsuario extends javax.swing.JFrame {

    private Banco miBanco;
    private Cliente miCliente;

    /**
     * Creates new form CuentaUsuario
     * @param ban
     */
    public VentanaCuentaUsuario(Banco ban) {
        miBanco = ban;
        initComponents();
        setLocationRelativeTo(null);

        //llenar el textArea
        jTextArea1.setText(clienteSesion.toString());
        
        //llenar tablas
        llenarTablaCDT();
        llenarTablaAhorro();
        llenarTablaCorriente();
        llenarTablaNomina();
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
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAhorro = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCorriente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNomina = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCDT = new javax.swing.JTable();
        jBCrearCuenta = new javax.swing.JButton();
        jBCDT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente"));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas"));

        jTableAhorro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Cuenta", "Monto", "Fecha Retiro", "Fecha Creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableAhorro);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ahorros", jPanel4);

        jTableCorriente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Cuenta", "Monto", "Fecha Creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableCorriente);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Corriente", jPanel6);

        jTableNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Cuenta", "Monto", "Nombre Empresa", "Fecha Creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNominaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNomina);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nomina", jPanel3);

        jTableCDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# de CDT", "Monto  inversión", "% de interés", "Tipo mensual", "Fecha creación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableCDT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CDT", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBCrearCuenta.setText("Crear Cuenta");
        jBCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearCuentaActionPerformed(evt);
            }
        });

        jBCDT.setText("Crear un CDT");
        jBCDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jBCrearCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCDT)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCrearCuenta)
                    .addComponent(jBCDT))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearCuentaActionPerformed
        // TODO add your handling code here:
        VentanaCrearCuenta ventanaCrearCuenta = new VentanaCrearCuenta(miBanco);
        ventanaCrearCuenta.setVisible(true);
    }//GEN-LAST:event_jBCrearCuentaActionPerformed

    private void jBCDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCDTActionPerformed
        // TODO add your handling code here:
        VentanaCDT ventanaCDT = new VentanaCDT(miBanco);
        ventanaCDT.setVisible(true);
    }//GEN-LAST:event_jBCDTActionPerformed

    private void jTableNominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNominaMouseClicked
        // TODO add your handling code here:
        
        int filSelec;
        String id;
        filSelec = jTableNomina.getSelectedRow();//obtiene la fila selccionada retorna -1 cuando no tiene selecionado nada
        //if para vericar el doble click de mouse
        if (evt.getClickCount() == 2 && filSelec != -1) {
            //obtengo los datos de la columna 0 y la fila seleccionada
            id = jTableNomina.getValueAt(filSelec, 0).toString();
            
            VentanaConsignarNomina ventanaConsignarNomina = new VentanaConsignarNomina(miBanco, id);
            ventanaConsignarNomina.setVisible(true);
        }
    }//GEN-LAST:event_jTableNominaMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaCuentaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCuentaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCuentaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCuentaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCuentaUsuario(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCDT;
    private javax.swing.JButton jBCrearCuenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTableAhorro;
    public static javax.swing.JTable jTableCDT;
    public static javax.swing.JTable jTableCorriente;
    public static javax.swing.JTable jTableNomina;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    public static void llenarTablaAhorro() {
        DefaultTableModel dtm = (DefaultTableModel) jTableAhorro.getModel();//se usa DefaultTableModel para manipular facilmente el Tablemodel
        dtm.setRowCount(0);//eliminando la s filas que ya hay. para agregar desde el principio.
        //los datos se agregan la defaultTableModel.

        ArrayList<Ahorro> ahorros = clienteSesion.getAhorros();//sacando al informacion a agregar en la tabla.

        //como se va a llenar una tabla de 5 columnas, se crea un vector de 3 elementos.
        //se usa un arreglo de Object para poder agregar a la tabla cualquier tipo de datos.
        Object[] datos = new Object[4];

        for (Ahorro ahorro : ahorros) {
            if (ahorro != null) {
                datos[0] = ahorro.getNumeroBancario();
                datos[1] = ahorro.getMonto();
                datos[2] = ahorro.getFechaRetiroAhorros();
                datos[3] = ahorro.getFechaCreacion();

                dtm.addRow(datos);
            }
        }
//        //metodo que modifica las celdas de la tabla
//        dtm.addTableModelListener(new TableModelListener() {
//            //metodo que verifica si existe un cambio en la tabla
//
//            @Override
//            public void tableChanged(TableModelEvent e) {
//                //if que verifica si existe cambio
//                if (e.getType() == TableModelEvent.UPDATE) {
//                    //se obtiene la columna en la cual se modifico la celda
//                    int columna = e.getColumn();
//                    //se obtiene la dila en la cual se modifico la celda
//                    int fila = e.getFirstRow();
//                    //se obtiene el id del jugador de la fila seleccionada 
//                    String id = jTableAhorro.getValueAt(fila, 0).toString();
//                    //se obtiene el elemento modificado
//                    String dato = jTableAhorro.getValueAt(fila, columna).toString();
//
//                    clienteSesion.modificarAhorro(id, dato, columna);
//                }
//            }
//
//        });
//        //**************************************************

    }

    /**
     *
     */
    public static void llenarTablaCorriente() {
        DefaultTableModel dtm = (DefaultTableModel) jTableCorriente.getModel();//se usa DefaultTableModel para manipular facilmente el Tablemodel
        dtm.setRowCount(0);//eliminando la s filas que ya hay. para agregar desde el principio.
        //los datos se agregan la defaultTableModel.

        ArrayList<Corriente> corrientes = clienteSesion.getCorrientes();//sacando al informacion a agregar en la tabla.

        //como se va a llenar una tabla de 5 columnas, se crea un vector de 3 elementos.
        //se usa un arreglo de Object para poder agregar a la tabla cualquier tipo de datos.
        Object[] datos = new Object[3];

        for (Corriente corriente : corrientes) {
            if (corriente != null) {
                datos[0] = corriente.getNumeroBancario();
                datos[1] = corriente.getMonto();
                datos[2] = corriente.getFechaCreacion();

                dtm.addRow(datos);
            }
        }
//        //metodo que modifica las celdas de la tabla
//        dtm.addTableModelListener(new TableModelListener() {
//            //metodo que verifica si existe un cambio en la tabla
//
//            @Override
//            public void tableChanged(TableModelEvent e) {
//                //if que verifica si existe cambio
//                if (e.getType() == TableModelEvent.UPDATE) {
//                    //se obtiene la columna en la cual se modifico la celda
//                    int columna = e.getColumn();
//                    //se obtiene la dila en la cual se modifico la celda
//                    int fila = e.getFirstRow();
//                    //se obtiene el id del jugador de la fila seleccionada 
//                    String id = jTableCorriente.getValueAt(fila, 0).toString();
//                    //se obtiene el elemento modificado
//                    String dato = jTableCorriente.getValueAt(fila, columna).toString();
//
//                    clienteSesion.modificarCorriente(id, dato, columna);
//                }
//            }
//
//        });
//        //**************************************************

    }

    /**
     *
     */
    public static void llenarTablaCDT() {
        DefaultTableModel dtm = (DefaultTableModel) jTableCDT.getModel();//se usa DefaultTableModel para manipular facilmente el Tablemodel
        dtm.setRowCount(0);//eliminando la s filas que ya hay. para agregar desde el principio.
        //los datos se agregan la defaultTableModel.

        ArrayList<CDTs> cdts = clienteSesion.getCdts();//sacando al informacion a agregar en la tabla.

        //como se va a llenar una tabla de 5 columnas, se crea un vector de 3 elementos.
        //se usa un arreglo de Object para poder agregar a la tabla cualquier tipo de datos.
        Object[] datos = new Object[5];

        for (CDTs cdt : cdts) {
            if (cdt != null) {
                datos[0] = cdt.getNumeroBancario();
                datos[1] = cdt.getMontoInversion();
                datos[2] = cdt.getPorcentajeInteresPagado();
                datos[3] = cdt.isPagoMensual();
                datos[4] = cdt.getFechaCreacion();

                dtm.addRow(datos);
            }
        }
//        //metodo que modifica las celdas de la tabla
//        dtm.addTableModelListener(new TableModelListener() {
//            //metodo que verifica si existe un cambio en la tabla
//
//            @Override
//            public void tableChanged(TableModelEvent e) {
//                //if que verifica si existe cambio
//                if (e.getType() == TableModelEvent.UPDATE) {
//                    //se obtiene la columna en la cual se modifico la celda
//                    int columna = e.getColumn();
//                    //se obtiene la dila en la cual se modifico la celda
//                    int fila = e.getFirstRow();
//                    //se obtiene el id del jugador de la fila seleccionada 
//                    String id = jTableCDT.getValueAt(fila, 0).toString();
//                    //se obtiene el elemento modificado
//                    String dato = jTableCDT.getValueAt(fila, columna).toString();
//
//                    clienteSesion.modificarCDT(id, dato, columna);
//                }
//            }
//
//        });
//        //**************************************************

    }

    /**
     *
     */
    public static void llenarTablaNomina() {
        DefaultTableModel dtm = (DefaultTableModel) jTableNomina.getModel();//se usa DefaultTableModel para manipular facilmente el Tablemodel
        dtm.setRowCount(0);//eliminando la s filas que ya hay. para agregar desde el principio.
        //los datos se agregan la defaultTableModel.

        ArrayList<Nomina> nominas = clienteSesion.getNominasCliente();//sacando al informacion a agregar en la tabla.

        //como se va a llenar una tabla de 5 columnas, se crea un vector de 3 elementos.
        //se usa un arreglo de Object para poder agregar a la tabla cualquier tipo de datos.
        Object[] datos = new Object[4];

        for (Nomina nomina : nominas) {
            if (nomina != null) {
                datos[0] = nomina.getNumeroBancario();
                datos[1] = nomina.getMonto();
                datos[2] = nomina.getEmpresa().getRazonSocial();
                datos[3] = nomina.getFechaCreacion();

                dtm.addRow(datos);
            }
        }
//        //metodo que modifica las celdas de la tabla
//        dtm.addTableModelListener(new TableModelListener() {
//            //metodo que verifica si existe un cambio en la tabla
//
//            @Override
//            public void tableChanged(TableModelEvent e) {
//                //if que verifica si existe cambio
//                if (e.getType() == TableModelEvent.UPDATE) {
//                    //se obtiene la columna en la cual se modifico la celda
//                    int columna = e.getColumn();
//                    //se obtiene la dila en la cual se modifico la celda
//                    int fila = e.getFirstRow();
//                    //se obtiene el id del jugador de la fila seleccionada 
//                    String id = jTableCDT.getValueAt(fila, 0).toString();
//                    //se obtiene el elemento modificado
//                    String dato = jTableCDT.getValueAt(fila, columna).toString();
//
//                    clienteSesion.modificarCDT(id, dato, columna);
//                }
//            }
//
//        });
//        //**************************************************

    }

}