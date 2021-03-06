/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Interface de Usuario
 *
 * @author cristianyeis
 */
public class GUI extends javax.swing.JFrame {

    public List<Object> arregloNumeros = new ArrayList<>();

    /**
     * Creates new form GUI Inicializa todos lo componentes.
     */
    public GUI() {
        initComponents();
        
        btnInvertirVector.setVisible(false);
        btnguardarVector.setVisible(false);
        btnCambiar.setVisible(false);
        btnInterCambiar.setVisible(false);
        checkManual.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtsizeVector = new javax.swing.JTextField();
        btncrearVector = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vector2DArray = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnguardarVector = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPosA = new javax.swing.JTextField();
        txtPosB = new javax.swing.JTextField();
        btnInterCambiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtposCambiar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDatoCambiar = new javax.swing.JTextField();
        btnInvertirVector = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        checkManual = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese el tamaño del Vector que desea Crear :");

        btncrearVector.setText("CrearVector");
        btncrearVector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncrearVectorMouseClicked(evt);
            }
        });

        vector2DArray.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posiciones", "Elementos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vector2DArray);

        jLabel2.setText("PRACTICA #4 LAB. LÓGICA & REPRESENTACIÓN I");

        btnguardarVector.setText("Guardar_Vector");
        btnguardarVector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarVectorMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Si desea inter-cambiar posiciones del Vector :");

        jLabel4.setText("Posición A :");

        jLabel5.setText("Posición B :");

        btnInterCambiar.setText("InterCambiar");
        btnInterCambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInterCambiarMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Si desea cambiar algun elemento en determinada posicion :  ");

        jLabel7.setText("Posición a Cambiar :");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Como desea agregar el dato? ");

        jLabel9.setText("Dato que desea Ingresar :");

        txtDatoCambiar.setEnabled(false);

        btnInvertirVector.setText("Invertir_Vector");
        btnInvertirVector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvertirVectorMouseClicked(evt);
            }
        });

        btnCambiar.setText("Cambiar");
        btnCambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarMouseClicked(evt);
            }
        });

        checkManual.setText("Manual");
        checkManual.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkManualStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(checkManual)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtPosB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtsizeVector, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtposCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(205, 205, 205)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(btncrearVector))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnInvertirVector)
                                            .addComponent(btnguardarVector)
                                            .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnInterCambiar)
                                        .addGap(28, 28, 28)))))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtPosA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatoCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInvertirVector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnguardarVector))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtsizeVector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncrearVector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtposCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(checkManual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDatoCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPosB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInterCambiar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para crear Vector segun especifique el usuario
     *
     * @param evt Al dar click sobre el Boton CrearVector ejecuta las acciones
     * internar
     */
    private void btncrearVectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncrearVectorMouseClicked
        // TODO add your handling code here:
        btnInvertirVector.setVisible(true);
        btnguardarVector.setVisible(true);
        btnCambiar.setVisible(true);
        btnInterCambiar.setVisible(true);
        checkManual.setVisible(true);
        
        if (txtsizeVector.getText().equals("") || !esNumero(txtsizeVector.getText())) {
            JOptionPane.showMessageDialog(null, "SEÑOR USUARIO POR FAVOR INGRESE UN NUMERO ANTES DE INICIAR");
            this.txtsizeVector.setText(String.valueOf(""));
        } else {

            int input = JOptionPane.showConfirmDialog(this, "Desea un vector aleatorio?");
            switch (input) {
                case JOptionPane.YES_OPTION:
//                JOptionPane.showMessageDialog(null, "Si");
                    fillTable();
                    break;
                case JOptionPane.NO_OPTION:
//                JOptionPane.showMessageDialog(null, "No");
                    manualFillTable();
                    break;
                default:
//                JOptionPane.showMessageDialog(null, "Cancelada"
            }
        }
    }//GEN-LAST:event_btncrearVectorMouseClicked

    /**
     * Metodo para intercambiar 2 posiciones del arreglo.
     */
    private void interCambiarPos() {
        int posA = Integer.parseInt(txtPosA.getText());
        int posB = Integer.parseInt(txtPosA.getText());
        //int sizeVector = Integer.parseInt(txtsizeVector.getText());
        DefaultTableModel model = (DefaultTableModel) vector2DArray.getModel();
        Vector fila1 = (Vector) model.getDataVector().get(posA - 1);
        Vector fila2 = (Vector) model.getDataVector().get(posB - 1);
        Integer aux1 = (Integer) fila1.get(1);
        Integer aux2 = (Integer) fila2.get(1);

        arregloNumeros.add(posA, aux1);
        arregloNumeros.add(posB, aux2);
    }

    /**
     * Metodo para determinar si un dato es del tipo Numerico
     *
     * @param numero se le da un dato y retorno "true" si es Numerico.
     * @return "true" si es Numerico el dato numero.
     */
    public boolean esNumero(String numero) {
        for (int i = 0; i < numero.length(); i++) {
            if (!Character.isDigit(numero.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo para guardar los cambios en un Vector desde una JTable
     *
     * @param evt al dar click sobre el boton guardarVector sobre escribe los
     * datos ingresados por el usuario.
     */
    private void btnguardarVectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarVectorMouseClicked
        // TODO add your handling code here:
        int sizeVector = Integer.parseInt(txtsizeVector.getText());
        DefaultTableModel model = (DefaultTableModel) vector2DArray.getModel();
        arregloNumeros.clear();

        for (int i = 0; i < sizeVector; i++) {
            Vector fila = (Vector) model.getDataVector().get(i);
            Integer elemento = (Integer) fila.get(1);
            arregloNumeros.add(i, elemento);
        }
        System.out.println(arregloNumeros); //Verficar que si guarde bien el vector con los cambios que haga el usuario
    }//GEN-LAST:event_btnguardarVectorMouseClicked

    /**
     * Metodo para cambiar un dato dado por el usuario o generado aleatoriamente
     * y escrito en el arreglo.
     *
     * @param evt al dar click sobre el boton cambiarVector sobre escribe los
     * datos ingresados por el usuario.
     */
    private void btnInterCambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInterCambiarMouseClicked
        // TODO add your handling code here:
        if (txtPosA.getText().equals("") || !esNumero(txtPosA.getText()) || txtPosB.getText().equals("") || !esNumero(txtPosB.getText())) {
            JOptionPane.showMessageDialog(null, "SEÑOR USUARIO POR FAVOR INGRESE LAS DOS POSICIONES PARA PODER HACER EL CAMBIO");
            this.txtPosA.setText(String.valueOf(""));
            this.txtPosB.setText(String.valueOf(""));
        } else {
            int sizeVector = Integer.parseInt(txtsizeVector.getText());
            int posA = Integer.parseInt(txtPosA.getText());
            int posB = Integer.parseInt(txtPosB.getText());

            if ((posA > sizeVector) || (posB > sizeVector)) {
                JOptionPane.showMessageDialog(null, "SEÑOR USUARIO, POR FAVOR INGRESE UN NUMERO MENOR AL TAMANO DEL VECTOR");
                this.txtPosA.setText(String.valueOf(""));
                this.txtPosB.setText(String.valueOf(""));
            } else {
                Integer aux1 = (Integer) arregloNumeros.get(posA - 1);
                Integer aux2 = (Integer) arregloNumeros.get(posB - 1);
                arregloNumeros.set(posA - 1, aux2);
                arregloNumeros.set(posB - 1, aux1);
                sincronizarTabla();
            }
        }
    }//GEN-LAST:event_btnInterCambiarMouseClicked

    /**
     * Metodo para sincronizar la Tabla de JFrame Form con los cambios elusuario desee realizar.
     */
    private void sincronizarTabla() {
        DefaultTableModel model = (DefaultTableModel) vector2DArray.getModel();
        model.getDataVector().removeAllElements();
        for (int i = 0; i < arregloNumeros.size(); i++) {
            Object elemento = arregloNumeros.get(i);
            int posicion = i + 1;
            model.addRow(new Object[]{posicion, elemento});
        }
    }

    /**
     * Metodo que invierte las posiciones del vector existente en la JTable
     *
     * @param evt al dar click sobre el boton invertirVector cambia todas las
     * posiciones de los elementos del Vector en la JTable.
     */
    private void btnInvertirVectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvertirVectorMouseClicked

        Collections.reverse(arregloNumeros);
        sincronizarTabla();

    }//GEN-LAST:event_btnInvertirVectorMouseClicked

    /**
     * Metodo que habilita el ingreso manual del dato que se desea cambiar en
     * una posicion dada por el usuario.
     *
     * @param evt al selecionar el check "checkManueal" habita el ingreso del
     * dato manualmente.
     */
    private void checkManualStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkManualStateChanged
        // TODO add your handling code here:
        AbstractButton abstractButton = (AbstractButton) evt.getSource();
        boolean selected = abstractButton.getModel().isSelected();
        txtDatoCambiar.setEnabled(selected);
    }//GEN-LAST:event_checkManualStateChanged

    /**
     * Metodo que cambiar el elemento de una posicion dada por el usuario
     *
     * @param evt al selecionar el boton "Cambiar" habita el ingreso del dato
     * manualmente.
     */
    private void btnCambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarMouseClicked
        // TODO add your handling code here:

        boolean selected = checkManual.isSelected();
        if (selected) {
            if (txtDatoCambiar.getText().equals("") || !esNumero(txtDatoCambiar.getText())) {
                JOptionPane.showMessageDialog(null, "SEÑOR USUARIO POR FAVOR INGRESE UN DATO NUMERICO ANTES DE INICIAR");
                this.txtDatoCambiar.setText(String.valueOf(""));
            } else {
                int sizeVector = Integer.parseInt(txtsizeVector.getText());
                int pos = Integer.parseInt(txtposCambiar.getText());

                if (pos > sizeVector) {
                    JOptionPane.showMessageDialog(null, "SEÑOR USUARIO, POR FAVOR INGRESE UN NUMERO MENOR AL TAMANO DEL VECTOR");
                    this.txtposCambiar.setText(String.valueOf(""));
                } else {
                    int datoCambiar = Integer.parseInt(txtDatoCambiar.getText());
                    arregloNumeros.set(pos - 1, datoCambiar);
                    sincronizarTabla();
                }
            }
        } else {    //ACA SE DEBE GENERAR EL ALEATORIO
            if (txtposCambiar.getText().equals("") || !esNumero(txtposCambiar.getText())) {
                JOptionPane.showMessageDialog(null, "SEÑOR USUARIO POR FAVOR INGRESE UN DATO NUMERICO ANTES DE INICIAR");
                this.txtposCambiar.setText(String.valueOf(""));
            } else {
                Random aleatorio = new Random();
                int numeroAleatorio = aleatorio.nextInt(1000);
                int sizeVector = Integer.parseInt(txtsizeVector.getText());
                int pos = Integer.parseInt(txtposCambiar.getText());
                arregloNumeros.set(pos - 1, numeroAleatorio);
                sincronizarTabla();
            }
        }
    }//GEN-LAST:event_btnCambiarMouseClicked

    /**
     * Metodo para llenar JTable (vector2DArray) con datos enternos y aleatorios
     * hasta el 1000.
     */
    private void fillTable() {
        int sizeVector = Integer.parseInt(txtsizeVector.getText());
        Random aleatorio = new Random();
        DefaultTableModel model = (DefaultTableModel) vector2DArray.getModel();
        model.getDataVector().removeAllElements();
        for (int i = 0; i < sizeVector; i++) {
            int numeroAleatorio = aleatorio.nextInt(1000);
            int posicion = i + 1;
            model.addRow(new Object[]{posicion, numeroAleatorio});
            arregloNumeros.add(numeroAleatorio);
        }
    }

    /**
     * Metodo para llenar JTable (vector2DArray) con datos Manueales por el
     * usuario y los que NO los llena con ceros "0".
     */
    private void manualFillTable() {
        int sizeVector = Integer.parseInt(txtsizeVector.getText());
        for (int i = 0; i < sizeVector; i++) {
            int posicion = i + 1;
            DefaultTableModel model = (DefaultTableModel) vector2DArray.getModel();
            model.addRow(new Object[]{posicion, 0});
            arregloNumeros.add(0);
        }
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnInterCambiar;
    private javax.swing.JButton btnInvertirVector;
    private javax.swing.JButton btncrearVector;
    private javax.swing.JButton btnguardarVector;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox checkManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDatoCambiar;
    private javax.swing.JTextField txtPosA;
    private javax.swing.JTextField txtPosB;
    private javax.swing.JTextField txtposCambiar;
    private javax.swing.JTextField txtsizeVector;
    private javax.swing.JTable vector2DArray;
    // End of variables declaration//GEN-END:variables
}
