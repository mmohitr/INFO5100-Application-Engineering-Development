/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerServiceRepresentative;

import java.awt.CardLayout;
import java.sql.*;
/**
 *
 * @author mahith
 */
public class csrPanel extends javax.swing.JPanel {
    Connection connection;
    /**
     * Creates new form csrPanel
     */
    public csrPanel(Connection connection) {
        this.connection =connection;
        
        initComponents();
        
        homeCSRPanel chatHome = new homeCSRPanel(connection);
        rightCSRPanel.add("chatPanel", chatHome);
        CardLayout layout = (CardLayout) rightCSRPanel.getLayout();
        layout.next(rightCSRPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        csrHome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rightCSRPanel = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(215, 81, 81));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        csrHome.setBackground(new java.awt.Color(215, 81, 81));
        csrHome.setToolTipText("");
        csrHome.setPreferredSize(new java.awt.Dimension(264, 48));
        csrHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                csrHomeMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(215, 81, 81));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Home Page.png"))); // NOI18N

        homeLabel.setBackground(new java.awt.Color(215, 81, 81));
        homeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        homeLabel.setText("Home");
        homeLabel.setAutoscrolls(true);

        javax.swing.GroupLayout csrHomeLayout = new javax.swing.GroupLayout(csrHome);
        csrHome.setLayout(csrHomeLayout);
        csrHomeLayout.setHorizontalGroup(
            csrHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(csrHomeLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        csrHomeLayout.setVerticalGroup(
            csrHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, csrHomeLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(csrHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(csrHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 10));

        jLabel1.setBackground(new java.awt.Color(215, 81, 81));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Customer Support Agent");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 10));

        rightCSRPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightCSRPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightCSRPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightCSRPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightCSRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void csrHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csrHomeMousePressed
        // TODO add your handling code here:
        homeCSRPanel home = new homeCSRPanel(connection);
        rightCSRPanel.add("chat home Panel", home);
        
        CardLayout layout = (CardLayout) rightCSRPanel.getLayout();
        layout.next(rightCSRPanel);
        
    }//GEN-LAST:event_csrHomeMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel csrHome;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel rightCSRPanel;
    // End of variables declaration//GEN-END:variables
}