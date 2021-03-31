/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIB.Inloggning.Sidor;

import MIB.Inloggning.MenyAdmin;
import MIB.Inloggning.MenyAgent;
import MIB.JFVisaAlienRas;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Hampus
 */
public class VisaAlienRas extends javax.swing.JPanel {
    private InfDB idb;
    JFVisaAlienRas visaAlienRas;
    /**
     * Creates new form VisaAlienRas
     */
    public VisaAlienRas(InfDB databas) {
        initComponents();
        idb = databas;
        sattVardeCbValjRas();
        
    }
    
    private void sattVardeCbValjRas(){
    
    cbValjRas.addItem("Ingen ras");
    cbValjRas.addItem("Boglodite");
    cbValjRas.addItem("Squid");
    cbValjRas.addItem("Worm");
    
    }
    
    private void printInfo(){
        
        taResultat.setText("");
    
        String valdRas = cbValjRas.getSelectedItem().toString();
        
        try{
            
            if(valdRas.equals("Boglodite")) {
                
                ArrayList<HashMap<String, String>> boglodite = new ArrayList<>();
            
                String hamtaBoglodite = "select alien.NAMN, alien.TELEFON, omrade.BENAMNING from alien join omrade on omrade.OMRADES_ID = alien.PLATS join boglodite on boglodite.ALIEN_ID = alien.ALIEN_ID";
                boglodite = idb.fetchRows(hamtaBoglodite);
               
                for(HashMap<String, String> skrivUtBoglodite : boglodite) {
                   
                    taResultat.append(skrivUtBoglodite.get("NAMN") + "\t");
                    taResultat.append(skrivUtBoglodite.get("TELEFON") + "\t");
                    taResultat.append(skrivUtBoglodite.get("BENAMNING") + "\n");
                   
               }
            } else if(valdRas.equals("Squid")) {
            
                ArrayList<HashMap<String, String>> squid = new ArrayList<>();
            
                String hamtaSquid = "select alien.NAMN, alien.TELEFON, omrade.BENAMNING from alien join omrade on omrade.OMRADES_ID = alien.PLATS join squid on squid.ALIEN_ID = alien.ALIEN_ID";
                squid = idb.fetchRows(hamtaSquid);
               
                for(HashMap<String, String> skrivUtSquid : squid) {
                   
                    taResultat.append(skrivUtSquid.get("NAMN") + "\t");
                    taResultat.append(skrivUtSquid.get("TELEFON") + "\t");
                    taResultat.append(skrivUtSquid.get("BENAMNING") + "\n");
                   
               }
                
            } else if(valdRas.equals("Worm")) {
            
                ArrayList<HashMap<String, String>> worm = new ArrayList<>();
            
                String hamtaWorm = "select alien.NAMN, alien.TELEFON, omrade.BENAMNING from alien join omrade on omrade.OMRADES_ID = alien.PLATS join worm on worm.ALIEN_ID = alien.ALIEN_ID";

                worm = idb.fetchRows(hamtaWorm);
               
                for(HashMap<String, String> skrivUtWorm : worm) {
                   
                    taResultat.append(skrivUtWorm.get("NAMN") + "\t");
                    taResultat.append(skrivUtWorm.get("TELEFON") + "\t");
                    taResultat.append(skrivUtWorm.get("BENAMNING") + "\n");
                   
               }
            }
        }
        
        catch(InfException e) {
             JOptionPane.showMessageDialog(null, "Databasfel");
        }
        catch(IndexOutOfBoundsException e) {
             JOptionPane.showMessageDialog(null, "Något gick fel");
        }
        catch(NullPointerException e) {
            JOptionPane.showMessageDialog(null, "null-fel");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbValjRas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResultat = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Visa alla aliens av en viss ras");

        jLabel2.setText("Välj ras nedan:");

        cbValjRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjRasActionPerformed(evt);
            }
        });

        taResultat.setColumns(20);
        taResultat.setRows(5);
        jScrollPane1.setViewportView(taResultat);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbValjRas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton1)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbValjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbValjRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjRasActionPerformed
        // TODO add your handling code here:
        printInfo();
    }//GEN-LAST:event_cbValjRasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenyAdmin.visaAlienRas.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbValjRas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taResultat;
    // End of variables declaration//GEN-END:variables
}
