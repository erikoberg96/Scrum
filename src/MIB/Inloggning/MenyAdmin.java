/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIB.Inloggning;

import MIB.Inloggning.Sidor.AndraAgent;
import MIB.Inloggning.Sidor.AndraLosenord;
import MIB.JFAndraAlien;
import MIB.JFGeAgentAdmin;
import MIB.JFRegistreraAliens;
import MIB.JFRegistreraUtrustning;
import MIB.JFSokAliensMellanDatum;
import MIB.JFVisaAlienOmrade;
import MIB.JFVisaAlienRas;
import MIB.JFVisaAllInfoAlien;
import MIB.JFVisaChefOmrade;
import MIB.MainFrameAgent;
import oru.inf.InfDB;

/**
 *
 * @author Hampus
 */
public class MenyAdmin extends javax.swing.JPanel {
    AndraLosenord andraLosen;
    MainFrameAgent mainFrame;
    JFRegistreraAliens regAlien;
    JFRegistreraUtrustning regUtrustning;
    JFAndraAlien andraAlien;
    JFSokAliensMellanDatum sokAliensDatum;
    JFVisaAlienOmrade visaAlienOmrade;
    public static JFVisaAlienRas visaAlienRas;
    JFVisaAllInfoAlien visaAllInfoAlien;
    JFVisaChefOmrade visaChefOmrade;
    JFGeAgentAdmin geAgentAdmin;
    AndraAgent andraAgent;
    private String inloggad;
    
    private static InfDB idb;

    /**
     * Creates new form MenyAdmin
     */
    public MenyAdmin(InfDB databas, String inloggadAgent) {
        initComponents();
        inloggad = inloggadAgent;
        idb = databas;
        andraLosen = new AndraLosenord(idb, inloggad);
        regAlien = new JFRegistreraAliens(idb);
        regUtrustning = new JFRegistreraUtrustning();
        andraAlien = new JFAndraAlien(idb);
        visaChefOmrade = new JFVisaChefOmrade(idb);
        visaAlienOmrade = new JFVisaAlienOmrade(idb);
        geAgentAdmin = new JFGeAgentAdmin(idb);
        andraAgent = new AndraAgent(idb);
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
        jButton4 = new javax.swing.JButton();
        btnRegistreraAliens = new javax.swing.JButton();
        btnRegistreraUtrustning = new javax.swing.JButton();
        btnAndraAlien = new javax.swing.JButton();
        btnSokAliensDatum = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnVisaAlienRas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnVisaChefOmrade = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnGeAgentAdmin = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        jButton4.setText("??ndra L??senord");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnRegistreraAliens.setText("Registrera Alien");
        btnRegistreraAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAliensActionPerformed(evt);
            }
        });

        btnRegistreraUtrustning.setText("Registrera Utrustning");
        btnRegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraUtrustningActionPerformed(evt);
            }
        });

        btnAndraAlien.setText("??ndra Alien");
        btnAndraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAlienActionPerformed(evt);
            }
        });

        btnSokAliensDatum.setText("S??k Alien (Datum)");
        btnSokAliensDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAliensDatumActionPerformed(evt);
            }
        });

        jButton3.setText("S??k Alien (Omr??de)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnVisaAlienRas.setText("S??k Alien (Ras)");
        btnVisaAlienRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAlienRasActionPerformed(evt);
            }
        });

        jButton2.setText("Visa All Info (Alien)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnVisaChefOmrade.setText("Visa Omr??deschef");
        btnVisaChefOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaChefOmradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistreraAliens)
                    .addComponent(jButton4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAndraAlien)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSokAliensDatum)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnVisaChefOmrade)
                        .addComponent(jButton2))
                    .addComponent(btnRegistreraUtrustning)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnVisaAlienRas)))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistreraAliens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAndraAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisaAlienRas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisaChefOmrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSokAliensDatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistreraUtrustning)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton7.setText("> Registrera Agent");

        btnGeAgentAdmin.setText("Ge agent adminstatus");
        btnGeAgentAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeAgentAdminActionPerformed(evt);
            }
        });

        jButton9.setText(">??ndra Agent ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setText("> Ta bort agent");

        jButton6.setText("> Ta bort utrustning");

        jButton5.setText(">Ta bort Alien");

        jButton10.setText("> ??ndra omr??deschef");

        jButton11.setText("> ??ndra kontorschef");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(btnGeAgentAdmin)
                    .addComponent(jButton1)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGeAgentAdmin)
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        andraLosen = new AndraLosenord(idb, inloggad);
        andraLosen.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnRegistreraAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAliensActionPerformed
        // TODO add your handling code here:
        regAlien = new JFRegistreraAliens(idb);
        regAlien.setVisible(true);
    }//GEN-LAST:event_btnRegistreraAliensActionPerformed

    private void btnRegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraUtrustningActionPerformed
        regUtrustning = new JFRegistreraUtrustning();
        regUtrustning.setVisible(true);

    }//GEN-LAST:event_btnRegistreraUtrustningActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        visaAllInfoAlien = new JFVisaAllInfoAlien(idb);
        visaAllInfoAlien.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVisaChefOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaChefOmradeActionPerformed
        // TODO add your handling code here:
        visaChefOmrade = new JFVisaChefOmrade(idb);
        visaChefOmrade.setVisible(true);
    }//GEN-LAST:event_btnVisaChefOmradeActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        andraAgent = new AndraAgent(idb);
        andraAgent.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnGeAgentAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeAgentAdminActionPerformed
        // TODO add your handling code here:
        geAgentAdmin = new JFGeAgentAdmin(idb);
        geAgentAdmin.setVisible(true);
    }//GEN-LAST:event_btnGeAgentAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraAlien;
    private javax.swing.JButton btnGeAgentAdmin;
    private javax.swing.JButton btnRegistreraAliens;
    private javax.swing.JButton btnRegistreraUtrustning;
    private javax.swing.JButton btnSokAliensDatum;
    private javax.swing.JButton btnVisaAlienRas;
    private javax.swing.JButton btnVisaChefOmrade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
