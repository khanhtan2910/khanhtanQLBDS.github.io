/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlbatdongsan.ui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HO VAN DAT
 */
public class EmailFrame extends javax.swing.JPanel {
    DefaultTableModel model;
    /**
     * Creates new form EmailFrame
     */
    public EmailFrame() {
        initComponents();
        initTableEmail();
    }
    private  void initTableEmail(){
        //model = (DefaultTableModel) tblEmail.getModel();
        Object[] column ={"Mã Email","Nội dung","Người gữi","Người nhận","Ngày gữi"};
        model.setColumnIdentifiers(column);
        model.setRowCount(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
