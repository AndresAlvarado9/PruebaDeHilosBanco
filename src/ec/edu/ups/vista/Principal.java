/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.Hilo10;
import ec.edu.ups.controlador.Hilo2;
import ec.edu.ups.controlador.Hilo3;
import ec.edu.ups.controlador.Hilo4;
import ec.edu.ups.controlador.Hilo5;
import ec.edu.ups.controlador.Hilo6;
import ec.edu.ups.controlador.Hilo7;
import ec.edu.ups.controlador.Hilo8;
import ec.edu.ups.controlador.Hilo9;
import ec.edu.ups.modelo.Cliente;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres
 */
public class Principal extends javax.swing.JFrame {
private List<JLabel> cliente;
private Cliente cli;
private ControladorCliente controladorCliente;
private Hilo2 h2;
private Hilo3 h3;
private Hilo4 h4;
private Hilo5 h5;
private Hilo6 h6;
private Hilo7 h7;
private Hilo8 h8;
private Hilo9 h9;
private Hilo10 h10;

    private Thread hilo1;
    private Thread hilo2;
    private Thread hilo3;
    private Thread hilo4;
    private Thread hilo5;
    private Thread hilo6;
    private Thread hilo7;
    private Thread hilo8;
    private Thread hilo9;
    private Thread hilo10;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
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
        jCaja1 = new javax.swing.JLabel();
        jCaja2 = new javax.swing.JLabel();
        jCaja3 = new javax.swing.JLabel();
        jCliente1 = new javax.swing.JLabel();
        jCliente2 = new javax.swing.JLabel();
        jCliente3 = new javax.swing.JLabel();
        jCliente4 = new javax.swing.JLabel();
        jCliente5 = new javax.swing.JLabel();
        jCliente6 = new javax.swing.JLabel();
        jCliente7 = new javax.swing.JLabel();
        jCliente8 = new javax.swing.JLabel();
        jCliente9 = new javax.swing.JLabel();
        jCliente10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCaja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/banco.png"))); // NOI18N

        jCaja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/banco.png"))); // NOI18N

        jCaja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/banco.png"))); // NOI18N

        jCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente1.setText("1");

        jCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente2.setText("2");

        jCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente3.setText("3");

        jCliente4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente4.setText("4");

        jCliente5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente5.setText("5");

        jCliente6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente6.setText("6");

        jCliente7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente7.setText("7");

        jCliente8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente8.setText("8");

        jCliente9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente9.setText("9");

        jCliente10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/clientela.png"))); // NOI18N
        jCliente10.setText("10");

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("100");

        jLabel2.setText("En caja hay");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jCaja1)
                                .addGap(30, 30, 30)
                                .addComponent(jCaja2)
                                .addGap(39, 39, 39)
                                .addComponent(jCaja3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(36, 36, 36)))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCliente1)
                                .addGap(18, 18, 18)
                                .addComponent(jCliente2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCliente3)
                                .addGap(18, 18, 18)
                                .addComponent(jCliente4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCliente5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCliente6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCliente7)
                                .addGap(18, 18, 18)
                                .addComponent(jCliente8)
                                .addGap(18, 18, 18)
                                .addComponent(jCliente9)
                                .addGap(18, 18, 18)
                                .addComponent(jCliente10)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCliente6)
                            .addComponent(jCliente7)
                            .addComponent(jCliente8)
                            .addComponent(jCliente9)
                            .addComponent(jCliente10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCliente1)
                    .addComponent(jCliente2)
                    .addComponent(jCliente3)
                    .addComponent(jCliente4)
                    .addComponent(jCliente5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCaja1)
                            .addComponent(jCaja2)
                            .addComponent(jCaja3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
controladorCliente = new ControladorCliente(1, jCliente1, "Cliente", 1, jTextArea1, jLabel1);
hilo1=new Thread(controladorCliente);
     hilo1.start();
h2 =new Hilo2(1, jCliente2, "Cliente", 2, jTextArea1, jLabel1);             
      hilo2=new Thread(h2);
      hilo2.start();
h3 =new Hilo3(1, jCliente3, "Cliente", 3, jTextArea1, jLabel1);             
      hilo3=new Thread(h3);
      hilo3.start(); 
h4 =new Hilo4(1, jCliente4, "Cliente", 4, jTextArea1, jLabel1);             
      hilo4=new Thread(h4);
      hilo4.start();
h5 =new Hilo5(1, jCliente5, "Cliente", 5, jTextArea1, jLabel1);             
      hilo5=new Thread(h5);
      hilo5.start(); 
h6 =new Hilo6(1, jCliente6, "Cliente", 6, jTextArea1, jLabel1);             
      hilo6=new Thread(h6);
      hilo6.start(); 
h7 =new Hilo7(1, jCliente7, "Cliente", 7, jTextArea1, jLabel1);             
      hilo7=new Thread(h7);
      hilo7.start(); 
h8 =new Hilo8(1, jCliente8, "Cliente", 8, jTextArea1, jLabel1);             
      hilo8=new Thread(h8);
      hilo8.start(); 
h9 =new Hilo9(1, jCliente9, "Cliente", 9, jTextArea1, jLabel1);             
      hilo9=new Thread(h9);
      hilo9.start(); 
h10 =new Hilo10(1, jCliente10, "Cliente", 10, jTextArea1, jLabel1);             
      hilo10=new Thread(h10);
      hilo10.start();       
      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jCaja1;
    private javax.swing.JLabel jCaja2;
    private javax.swing.JLabel jCaja3;
    private javax.swing.JLabel jCliente1;
    private javax.swing.JLabel jCliente10;
    private javax.swing.JLabel jCliente2;
    private javax.swing.JLabel jCliente3;
    private javax.swing.JLabel jCliente4;
    private javax.swing.JLabel jCliente5;
    private javax.swing.JLabel jCliente6;
    private javax.swing.JLabel jCliente7;
    private javax.swing.JLabel jCliente8;
    private javax.swing.JLabel jCliente9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
