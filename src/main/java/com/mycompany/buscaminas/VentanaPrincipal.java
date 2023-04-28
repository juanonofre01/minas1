package com.mycompany.buscaminas;

/**
 * Integrantes Juan Goyes Josue Cardona Esneyder Ibarra Juan Achicanoy Esteban
 * Riacos Nicolas Benavides
 *
 */
/**
 * InterazPrincipal
 *
 * interfaz donde se ejecuta la jugabilidad del juego
 */
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener {

    static VentanaPrincipal getVentanaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int miliseg = 0;
    int seg = 0;
    int min = 0;
    int hor = 0;
    boolean estado = false;

    int contadorMinas = 0;
    int numeroCuadros = 0;
    int contador = 0;
    private Object content;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();

    }

    public void actionPerformed(ActionEvent e) {

        Cuadro temp2 = (Cuadro) e.getSource();
        if (temp2.estaMinado()) {
            javax.swing.JOptionPane.showMessageDialog(this, "le diste a una mina, perdedor");
            this.contador = 0;
        } else {
            temp2.setBackground(Color.GREEN);
            contador++;
            if ((numeroCuadros - contadorMinas) == contador) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ganaste");
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Filas = new javax.swing.JTextField();
        Columnas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panel_juego = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Filas");

        jLabel2.setText("Columnas");

        Filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilasActionPerformed(evt);
            }
        });

        Columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColumnasActionPerformed(evt);
            }
        });

        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb1.setText("00 : 00 : 00");

        jButton2.setText("Perdedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ganador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Filas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jButton3)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_juegoLayout = new javax.swing.GroupLayout(panel_juego);
        panel_juego.setLayout(panel_juegoLayout);
        panel_juegoLayout.setHorizontalGroup(
            panel_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_juegoLayout.setVerticalGroup(
            panel_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilasActionPerformed

    private void ColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColumnasActionPerformed
    /**
     * Metodo contador
     * @param evt 
     * Este metodo sirve para contar el tiempo que se ejecuta al
     * jugar
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        estado = true;
        Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (estado == true) {
                        try {
                            sleep(1);
                            if (miliseg >= 1000) {
                                miliseg = 0;
                                seg++;
                            }
                            if (seg >= 60) {
                                miliseg = 0;
                                seg = 0;
                                min++;
                            }
                            if (min >= 60) {
                                miliseg = 0;
                                seg = 0;
                                min = 0;
                                hor++;

                            }
                            lb1.setText(hor + " : " + min + " : " + seg + " : ");
                            miliseg++;
                        } catch (Exception e) {

                        }
                    } else {
                        break;
                    }
                }
            }

        };
        hilo.start();

        iniciar();
        this.paintAll(this.getGraphics());

    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * metodo para hacer visible el mensaje emergente "perdedor"
     *
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Perdedor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Metodo para hacer visible el mensaje emergente "ganador"
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Ganador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * Metodo iniciar Metodo para crear las filas y columnas que digite el
     * usuario
     */
    private void iniciar() {
        this.panel_juego.removeAll();
        int nFilas, nCol;
        nFilas = Integer.parseInt(this.Filas.getText());
        nCol = Integer.parseInt(this.Columnas.getText());

        this.panel_juego.setLayout(new java.awt.GridLayout(nFilas, nCol));

        this.numeroCuadros = nFilas * nCol;
        this.contadorMinas = 0;

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {

                Cuadro temp = new Cuadro();
                temp.addActionListener(this);
                if (temp.estaMinado()) {
                    this.contadorMinas++;
                }
                temp.setVisible(true);
                this.panel_juego.add(temp);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Columnas;
    private javax.swing.JTextField Filas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JPanel panel_juego;
    // End of variables declaration//GEN-END:variables

    private Perdedor newPerdedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
