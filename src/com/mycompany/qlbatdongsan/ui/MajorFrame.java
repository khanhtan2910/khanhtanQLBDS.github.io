/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlbatdongsan.ui;

import com.mycompany.qlbatdongsan.DAO.ChuyenNhuongDAO;
import com.mycompany.qlbatdongsan.DAO.HopDongDAO;
import com.mycompany.qlbatdongsan.DAO.PhieuDAO;
import com.mycompany.qlbatdongsan.Entity.ChuyenNhuong;
import com.mycompany.qlbatdongsan.Entity.HopDong;
import com.mycompany.qlbatdongsan.Entity.Phieu;
import com.mycompany.qlbatdongsan.utils.MsgBox;
import com.mycompany.qlbatdongsan.utils.XDate;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HO VAN DAT
 */
public class MajorFrame extends javax.swing.JPanel {

    PhieuDAO daoPh = new PhieuDAO();
    HopDongDAO daoHD = new HopDongDAO();
    ChuyenNhuongDAO daoCN = new ChuyenNhuongDAO();
    DefaultTableModel model;

    /**
     * Creates new form MajorFrame
     */
    public MajorFrame() {
        initComponents();
        initTableHopDong();
        initTablePhieu();
        fillToTableHopDong();
        fillToTablePhieu();
    }

    private void initTablePhieu() {
        model = new DefaultTableModel();
        Object[] column = {"Mã phiếu", "Ngày ghi phiếu", "Mã sản phẩm dự án", "Đơn giá", "Diện tích", "Số lô", "Thành tiền", "Số tiền", "Mã nhân viên", "Mã khách hàng", "Loại phiếu"};
        model.setColumnIdentifiers(column);
        model.setRowCount(0);
        tblPhieu.setModel(model);
    }

    private void initTableHopDong() {
        model = new DefaultTableModel();
        Object[] column = {"STT", "Mã hợp đồng", "Ngày ký", "Mã phiếu", "Trạng thái", "Mã chuyển nhượng", "Khách hàng", "Mã sản phẩm", "Chiết khấu", "Thời hạn", "Loại hợp đồng"};
        model.setColumnIdentifiers(column);
        model.setRowCount(0);
        tblHopDong.setModel(model);
    }

    private void fillToTablePhieu() {
        DefaultTableModel model = (DefaultTableModel) tblPhieu.getModel();
        model.setRowCount(0);
        try {
            List<Phieu> list = daoPh.selectAll();
            for (Phieu ph : list) {
                Object[] row = {
                    ph.getMaPhieu(),
                    XDate.toString(ph.getNgayCoc(), "dd/mm/yyyy"),
                    ph.getMaSPDA(),
                    ph.getDonGia(),
                    ph.getDienTich(),
                    ph.getSoLoCoc(),
                    ph.getThanhTien(),
                    ph.getTienCoc(),
                    ph.getMaNV(),
                    ph.getMaKH(),
                    ph.getLoaiPhieu()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    private void fillToTableHopDong() {
        DefaultTableModel model = (DefaultTableModel) tblHopDong.getModel();
        model.setRowCount(0);
        try {
            List<HopDong> list = daoHD.selectAll();
            for (HopDong hd : list) {
                ChuyenNhuong cn = daoCN.selectBysoHopDong(hd.getSoHopDong());
                Object[] row = {
                    hd.getSTT(),
                    hd.getSoHopDong(),
                    XDate.toString(hd.getNgayKy(), "MM/dd/yyyy"),
                    hd.getSoPhieu(),
                    hd.getTrangThai(),
                    cn.getMaCN(),
                    hd.getMaKH(),
                    hd.getMaSPDA(),
                    cn.getChietKhau(),
                    cn.getThoiHan(),};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    public static void Search(String str) {
        if (str.length() > 0) {
            if (tblHopDong != null) {
                DefaultTableModel model = (DefaultTableModel) tblHopDong.getModel();
                TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
                tblHopDong.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter(str));
            } else {
                return;
            }
            //Table Phieu va Hơp Dong
            if (tblPhieu != null) {
                DefaultTableModel model1 = (DefaultTableModel) tblPhieu.getModel();
                TableRowSorter<DefaultTableModel> trs1 = new TableRowSorter<>(model1);
                tblPhieu.setRowSorter(trs1);
                trs1.setRowFilter(RowFilter.regexFilter(str));
            } else {
                return;
            }
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

        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHopDong = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAddMajor = new com.mycompany.qlbatdongsan.utils.PanelRound();
        lblAddMajor = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblHopDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblHopDong);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Hợp đồng", jPanel2);

        tblPhieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPhieu.setFocusable(false);
        jScrollPane1.setViewportView(tblPhieu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Phiếu", jPanel1);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("NGHIỆP VỤ");

        btnAddMajor.setRoundBottonLeft(30);
        btnAddMajor.setRoundBottonRight(30);
        btnAddMajor.setRoundTopLeft(30);
        btnAddMajor.setRoundTopRight(30);

        lblAddMajor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddMajor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlbatdongsan/images/icon/icons8-add-new-64.png"))); // NOI18N
        lblAddMajor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMajorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddMajorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddMajorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAddMajorLayout = new javax.swing.GroupLayout(btnAddMajor);
        btnAddMajor.setLayout(btnAddMajorLayout);
        btnAddMajorLayout.setHorizontalGroup(
            btnAddMajorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddMajorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddMajor, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAddMajorLayout.setVerticalGroup(
            btnAddMajorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddMajor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabs))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(572, 572, 572)
                .addComponent(btnAddMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnAddMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddMajorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMajorMouseClicked
        // TODO add your handling code here:
        if (tabs.getSelectedIndex() == 2) {
            AddMajorFrame addMajorFrame = new AddMajorFrame();
            addMajorFrame.setVisible(true);
        } else {
            AddMajorFrame1 addMajorFrame1 = new AddMajorFrame1();
            addMajorFrame1.setVisible(true);
        }
    }//GEN-LAST:event_lblAddMajorMouseClicked

    private void lblAddMajorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMajorMouseEntered
        // TODO add your handling code here:
        btnAddMajor.setBounds(btnAddMajor.getX() - 5, btnAddMajor.getY() - 5, btnAddMajor.getWidth() + 10, btnAddMajor.getHeight() + 10);
        lblAddMajor.setBounds(lblAddMajor.getX(), lblAddMajor.getY(), lblAddMajor.getWidth() + 10, lblAddMajor.getHeight() + 10);
    }//GEN-LAST:event_lblAddMajorMouseEntered

    private void lblAddMajorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMajorMouseExited
        // TODO add your handling code here:
        btnAddMajor.setBounds(btnAddMajor.getX() + 5, btnAddMajor.getY() + 5, btnAddMajor.getWidth() - 10, btnAddMajor.getHeight() - 10);
        lblAddMajor.setBounds(lblAddMajor.getX(), lblAddMajor.getY(), lblAddMajor.getWidth() - 10, lblAddMajor.getHeight() - 10);
    }//GEN-LAST:event_lblAddMajorMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.qlbatdongsan.utils.PanelRound btnAddMajor;
    private com.mycompany.qlbatdongsan.utils.PanelRound btnAddProject;
    private com.mycompany.qlbatdongsan.utils.PanelRound btnAddProject1;
    private com.mycompany.qlbatdongsan.utils.PanelRound btnAddProject2;
    private com.mycompany.qlbatdongsan.utils.PanelRound btnAddProject3;
    private com.mycompany.qlbatdongsan.utils.PanelRound btnAddProject4;
    private com.mycompany.qlbatdongsan.utils.PanelRound btnAddProject5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddMajor;
    private javax.swing.JLabel lblAddProject;
    private javax.swing.JLabel lblAddProject1;
    private javax.swing.JLabel lblAddProject2;
    private javax.swing.JLabel lblAddProject3;
    private javax.swing.JLabel lblAddProject4;
    private javax.swing.JLabel lblAddProject5;
    private javax.swing.JTabbedPane tabs;
    private static javax.swing.JTable tblHopDong;
    private static javax.swing.JTable tblPhieu;
    // End of variables declaration//GEN-END:variables
}