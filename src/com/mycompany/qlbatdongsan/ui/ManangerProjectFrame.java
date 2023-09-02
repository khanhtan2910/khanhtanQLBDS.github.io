/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlbatdongsan.ui;

import com.mycompany.qlbatdongsan.DAO.SanPhamDuAnDAO;
import com.mycompany.qlbatdongsan.Entity.QuanLyDuAn;
import com.mycompany.qlbatdongsan.Entity.SanPhamDuAn;
import static com.mycompany.qlbatdongsan.ui.ProjectFrame.daoDA;
import com.mycompany.qlbatdongsan.utils.XImage;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HO VAN DAT
 */
public class ManangerProjectFrame extends javax.swing.JFrame {
    private int row = -1;
    QuanLyDuAn da;
    static SanPhamDuAnDAO daoSP = new SanPhamDuAnDAO();
    DefaultTableModel model;
    /**
     * Creates new form ManangerProjectFrame
     */
    public ManangerProjectFrame(QuanLyDuAn entity) {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(XImage.getAppIcon());
        setTitle("QUẢN LÝ SẢN PHẨM DỰ ÁN BẤT ĐỘNG SẢN DVPTP");
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.da = entity;
        initTableProject();
        fillToTable();
    }
    public void edit(){
        SanPhamDuAn spDA = daoSP.selectById(tblSPProject.getValueAt(row, 0).toString());
        SeeSPProjectFrame seeSPProjectFrame = new SeeSPProjectFrame(spDA);
        seeSPProjectFrame.setVisible(true);
    }
    public void initTableProject() {
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int j) {
                return false;
            }
        };
        Object[] column = {"Mã sản phẩm dự án","Mã dự án","Tên sản phẩm dự án", "Địa chỉ", "Diện tích", "Số giấy phép", "Ngày cấp", "Nơi cấp", "Loại DA", "Ngày đăng","Trạng thái","NV phụ trách","Mã sàn giao dich"};
        model.setColumnIdentifiers(column);
        model.setRowCount(0);
        tblSPProject.setModel(model);
    }
    public static void fillToTable(){
        DefaultTableModel model = (DefaultTableModel) tblSPProject.getModel();
        model.setRowCount(0);
        try {
            List<SanPhamDuAn> list = daoSP.selectAll();
            for (SanPhamDuAn da : list) {
                Object[] row = {
                    da.getMaSPDA(),
                    da.getMaDA(),
                    da.getTenDA(),
                    da.getDiaChi(),
                    da.getDienTich(),
                    da.getSoGiayPhep(),
                    da.getNgayCap(),
                    da.getNoiCap(),
                    da.getLoaiDA(),
                    da.getNgayDang(),
                    da.getTrangThai(),
                    da.getMaNVPhuTrach(),
                    da.getMaSGD()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn dữ liệu!");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSPProject = new javax.swing.JTable();
        btnAddSPProject = new com.mycompany.qlbatdongsan.utils.PanelRound();
        lblAddSPProject = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("SẢN PHẨM DỰ ÁN");

        tblSPProject.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSPProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPProjectMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSPProjectMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSPProject);

        btnAddSPProject.setBackground(new java.awt.Color(204, 204, 204));
        btnAddSPProject.setRoundBottonLeft(30);
        btnAddSPProject.setRoundBottonRight(30);
        btnAddSPProject.setRoundTopLeft(30);
        btnAddSPProject.setRoundTopRight(30);

        lblAddSPProject.setBackground(new java.awt.Color(204, 204, 204));
        lblAddSPProject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddSPProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlbatdongsan/images/icon/icons8-add-new-64.png"))); // NOI18N
        lblAddSPProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddSPProjectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddSPProjectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddSPProjectMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAddSPProjectLayout = new javax.swing.GroupLayout(btnAddSPProject);
        btnAddSPProject.setLayout(btnAddSPProjectLayout);
        btnAddSPProjectLayout.setHorizontalGroup(
            btnAddSPProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddSPProjectLayout.createSequentialGroup()
                .addComponent(lblAddSPProject, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAddSPProjectLayout.setVerticalGroup(
            btnAddSPProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddSPProject, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddSPProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(552, 552, 552))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAddSPProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSPProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSPProjectMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSPProjectMouseClicked

    private void btnAddSPProjectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSPProjectMouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnAddSPProjectMouseEntered

    private void btnAddSPProjectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSPProjectMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAddSPProjectMouseExited

    private void tblSPProjectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPProjectMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount()==2) {
            this.row = tblSPProject.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblSPProjectMousePressed

    private void lblAddSPProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddSPProjectMouseClicked
        // TODO add your handling code here:
        AddSPProjectFrame addSPProjectFrame = new AddSPProjectFrame(da);
        addSPProjectFrame.setVisible(true);
    }//GEN-LAST:event_lblAddSPProjectMouseClicked

    private void lblAddSPProjectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddSPProjectMouseEntered
        // TODO add your handling code here:
         btnAddSPProject.setBounds(btnAddSPProject.getX() - 5, btnAddSPProject.getY() - 5, btnAddSPProject.getWidth() + 10, btnAddSPProject.getHeight() + 10);
        lblAddSPProject.setBounds(lblAddSPProject.getX(), lblAddSPProject.getY(), lblAddSPProject.getWidth() + 10, lblAddSPProject.getHeight() + 10);
    }//GEN-LAST:event_lblAddSPProjectMouseEntered

    private void lblAddSPProjectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddSPProjectMouseExited
        // TODO add your handling code here:
        btnAddSPProject.setBounds(btnAddSPProject.getX() + 5, btnAddSPProject.getY() + 5, btnAddSPProject.getWidth() - 10, btnAddSPProject.getHeight() - 10);
        lblAddSPProject.setBounds(lblAddSPProject.getX(), lblAddSPProject.getY(), lblAddSPProject.getWidth() - 10, lblAddSPProject.getHeight() - 10);
    }//GEN-LAST:event_lblAddSPProjectMouseExited

    private void tblSPProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPProjectMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tblSPProjectMouseClicked

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
            java.util.logging.Logger.getLogger(ManangerProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManangerProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManangerProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManangerProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.qlbatdongsan.utils.PanelRound btnAddSPProject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddSPProject;
    private static javax.swing.JTable tblSPProject;
    // End of variables declaration//GEN-END:variables
}