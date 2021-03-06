/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omar.swing.win_button;

import com.omar.swing.PanelBackground;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Omar
 */
public class WinButton extends javax.swing.JPanel {

    /**
     * Creates new form WinButton
     */
    public WinButton() {
        initComponents();
        setOpaque(false);
    }
    
    
    public void initEvent(JFrame fram, PanelBackground panel) {
        
        cmdClo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        cmdMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fram.setState(JFrame.ICONIFIED);
            }
        });
        
        cmdRe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                    
                    fram.setVisible(false);
                    panel.setRound(15);
                    fram.setExtendedState(JFrame.NORMAL);
                    fram.setVisible(true);
                    
                } else {
                    fram.setVisible(false);
                    panel.setRound(0);
//                    fram.setVisible(false);
                    fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    fram.setVisible(true);
                    
                }
                
            }
        });
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMi = new com.omar.swing.win_button.Button();
        cmdRe = new com.omar.swing.win_button.Button();
        cmdClo = new com.omar.swing.win_button.Button();

        cmdMi.setBackground(new java.awt.Color(226, 224, 70));
        cmdMi.setToolTipText("Minimize");
        cmdMi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMiActionPerformed(evt);
            }
        });

        cmdRe.setBackground(new java.awt.Color(68, 198, 51));
        cmdRe.setToolTipText("Maximize");

        cmdClo.setBackground(new java.awt.Color(240, 62, 62));
        cmdClo.setToolTipText("Close");
        cmdClo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdClo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCloActionPerformed

    private void cmdMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.omar.swing.win_button.Button cmdClo;
    private com.omar.swing.win_button.Button cmdMi;
    private com.omar.swing.win_button.Button cmdRe;
    // End of variables declaration//GEN-END:variables
}
