/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIB.Inloggning;

import MIB.Inloggning.Sidor.AndraLosenord;
import MIB.Inloggning.Sidor.RegistreraAliens;
import MIB.JFAndraAlien;
import MIB.JFRegistreraAliens;
import MIB.JFRegistreraUtrustning;
import MIB.JFSokAliensMellanDatum;
import MIB.JFVisaAlienOmrade;
import MIB.JFVisaAlienRas;
import MIB.JFVisaAllInfoAlien;
import MIB.JFVisaChefOmrade;
import MIB.MainFrameAgent;
import javax.swing.JFrame;
import oru.inf.InfDB;

/**
 *
 * @author Hampus
 */
public class MenyAgent extends javax.swing.JPanel {
    AndraLosenord andraLosen;
    MainFrameAgent mainFrame;
    JFRegistreraAliens regAlien;
    JFRegistreraUtrustning regUtrustning;
    JFAndraAlien andraAlien;
    JFSokAliensMellanDatum sokAliensDatum;
    JFVisaAlienOmrade visaAlienOmrade;
    JFVisaAlienRas visaAlienRas;
    JFVisaAllInfoAlien visaAllInfoAlien;
    JFVisaChefOmrade visaChefOmrade;
    
    private static InfDB idb;

    /**
     * Creates new form MenyAgent
     */
    public MenyAgent(InfDB databas) {
        initComponents();
        idb = databas;
        visaAllInfoAlien = new JFVisaAllInfoAlien(idb);
        andraLosen = new AndraLosenord(idb, "hej");
        regAlien = new JFRegistreraAliens(idb);
        regUtrustning = new JFRegistreraUtrustning();
        andraAlien = new JFAndraAlien(idb);
        visaChefOmrade = new JFVisaChefOmrade(idb);
        visaAlienOmrade = new JFVisaAlienOmrade(idb);
        sokAliensDatum = new JFSokAliensMellanDatum(idb);
        //mainFrame = new MainFrameAgent(idb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistreraUtrustning = new javax.swing.JButton();
        btnRegistreraAliens = new javax.swing.JButton();
        btnAndraAlien = new javax.swing.JButton();
        btnSokAliensDatum = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnVisaAlienRas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnVisaChefOmrade = new javax.swing.JButton();

        btnRegistreraUtrustning.setText("Registrera Utrustning");
        btnRegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraUtrustningActionPerformed(evt);
            }
        });

        btnRegistreraAliens.setText("Registrera Alien");
        btnRegistreraAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAliensActionPerformed(evt);
            }
        });

        btnAndraAlien.setText("Ändra Alien");
        btnAndraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAlienActionPerformed(evt);
            }
        });

        btnSokAliensDatum.setText("Sök Alien (Datum)");
        btnSokAliensDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAliensDatumActionPerformed(evt);
            }
        });

        jButton3.setText("Sök Alien (Område)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ändra Lösenord");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnVisaAlienRas.setText("Sök Alien (Ras)");
        btnVisaAlienRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAlienRasActionPerformed(evt);
            }
        });

        jButton1.setText("Visa All Info (Alien)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnVisaChefOmrade.setText("Visa Områdeschef");
        btnVisaChefOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaChefOmradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistreraAliens)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistreraUtrustning)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(btnSokAliensDatum)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnVisaAlienRas))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnVisaChefOmrade)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnAndraAlien)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistreraAliens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistreraUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAndraAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSokAliensDatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisaAlienRas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisaChefOmrade)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraUtrustningActionPerformed
        regUtrustning = new JFRegistreraUtrustning();
        regUtrustning.setVisible(true);
         
        
    }//GEN-LAST:event_btnRegistreraUtrustningActionPerformed

    private void btnRegistreraAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAliensActionPerformed
        // TODO add your handling code here:
        regAlien = new JFRegistreraAliens(idb);
        regAlien.setVisible(true);
    }//GEN-LAST:event_btnRegistreraAliensActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        andraLosen = new AndraLosenord(idb, "");
        andraLosen.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAndraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAlienActionPerformed
        // TODO add your handling code here:
        andraAlien = new JFAndraAlien(idb);
        andraAlien.setVisible(true);
    }//GEN-LAST:event_btnAndraAlienActionPerformed

    private void btnSokAliensDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAliensDatumActionPerformed
        // TODO add your handling code here:
        sokAliensDatum = new JFSokAliensMellanDatum(idb);
        sokAliensDatum.setVisible(true);
    }//GEN-LAST:event_btnSokAliensDatumActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        visaAlienOmrade = new JFVisaAlienOmrade(idb);
        visaAlienOmrade.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnVisaAlienRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAlienRasActionPerformed
        // TODO add your handling code here:
        visaAlienRas = new JFVisaAlienRas(idb);
        visaAlienRas.setVisible(true);
    }//GEN-LAST:event_btnVisaAlienRasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        visaAllInfoAlien = new JFVisaAllInfoAlien(idb);
        visaAllInfoAlien.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVisaChefOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaChefOmradeActionPerformed
        // TODO add your handling code here:
        visaChefOmrade = new JFVisaChefOmrade(idb);
        visaChefOmrade.setVisible(true);
    }//GEN-LAST:event_btnVisaChefOmradeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraAlien;
    private javax.swing.JButton btnRegistreraAliens;
    private javax.swing.JButton btnRegistreraUtrustning;
    private javax.swing.JButton btnSokAliensDatum;
    private javax.swing.JButton btnVisaAlienRas;
    private javax.swing.JButton btnVisaChefOmrade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}