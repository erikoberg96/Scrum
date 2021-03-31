/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIB.Inloggning;

import java.awt.BorderLayout;
import oru.inf.InfDB;

/**
 *
 * @author Hampus
 */
public class LoggaIn extends javax.swing.JFrame {
    private static InfDB idb;
    Inloggning loggain;

    /**
     * Creates new form LoggaIn
     */
    public LoggaIn(InfDB databas) {
        idb = databas;
        initComponents();
        loggain = new Inloggning(idb);
        pnlInloggning.setLayout(new BorderLayout());
        pnlInloggning.add(loggain);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInloggning = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlInloggningLayout = new javax.swing.GroupLayout(pnlInloggning);
        pnlInloggning.setLayout(pnlInloggningLayout);
        pnlInloggningLayout.setHorizontalGroup(
            pnlInloggningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        pnlInloggningLayout.setVerticalGroup(
            pnlInloggningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInloggning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInloggning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlInloggning;
    // End of variables declaration//GEN-END:variables
}