
package com.mycompany.qlbatdongsan.ui;
import com.mycompany.qlbatdongsan.utils.PanelRound;
import com.mycompany.qlbatdongsan.utils.Auth;
import com.mycompany.qlbatdongsan.utils.MsgBox;
import com.mycompany.qlbatdongsan.utils.XImage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author HO VAN DAT
 */
public class Main extends javax.swing.JFrame {

    private int[] status = {0, 1, 0, 0, 0, 0};
    private int indexForMenuMain = 1;

    public Main() {
        initComponents();      
        ClickEffectForPanel();
//        btnNotes1.setForeground(Color.BLUE);
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("/com/mycompany/qlbatdongsan/images/icon/icons8-mouse-40.png")).getImage(), new Point(0, 0), "Custom cursor");
        setCursor(cursor);
        panelTransactionAllMain.display(new NotesFrame());
        init(); 
    }
    void init(){
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("HỆ THỐNG QUẢN LÝ BẤT ĐỘNG SẢN DVPTP");
        setBounds(this.getX(), this.getY()-50, this.getWidth(), this.getHeight()+100);
    }
    void ketThuc(){
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc ?")) {
            System.exit(0);
        }
    }
    void openGioiThieu(){
        new    GioiThieuJDialog(this, true).setVisible(true);
    }

    //Hover for Label
    public void HoverForLabel(JLabel label) {
        label.setForeground(Color.BLUE);
    }
    //Hover effect for ImageAvatar
    public void HoverForImageAvatarEntered(int index){
        JComponent[] comp ={lblExit,lblNontification,lblChart,lblCloud,lblFavorate,lblHomePage};
        JPanel[] Panels ={btnExit,btnNontification,btnChart,btnCloud,btnFavorate,btnHomePage};
        Panels[index].setBounds(Panels[index].getX()-5, Panels[index].getY()-5,Panels[index].getWidth()+10,  Panels[index].getHeight()+10);
        comp[index].setBounds(comp[index].getX(), comp[index].getY(),comp[index].getWidth()+10,  comp[index].getHeight()+10);         
    }
    public void HoverForImageAvatarExited(int index){
        JComponent[] comp ={lblExit,lblNontification,lblChart,lblCloud,lblFavorate,lblHomePage};
        JPanel[] Panels ={btnExit,btnNontification,btnChart,btnCloud,btnFavorate,btnHomePage};
        Panels[index].setBounds(Panels[index].getX()+5, Panels[index].getY()+5,Panels[index].getWidth()-10,  Panels[index].getHeight()-10);
        comp[index].setBounds(comp[index].getX(), comp[index].getY(),comp[index].getWidth()-10,  comp[index].getHeight()-10);         
    }
    //Exited Effect
    public void ExitedForLabel(JLabel label, int statusID) {
        if (status[statusID] == 1) {
            label.setForeground(Color.BLUE);
        } else {
            label.setForeground(new Color(153,153,153));
        }
    }
    
    // Click Effect for panel
    public void ClickEffectForPanel() {

        JPanel[] panel = {btnDashBoard, btnNotes, btnEmail, btnFiles, btnSetting, btnCalendar};
         JLabel[] label = {btnDashBoard1, btnNotes1, btnEmail1, btnFiles1, btnSetting1, btnCalendar1};
        for (int i = 0; i < 6; i++) {
            if (indexForMenuMain == i) {
                panel[i].setBackground(new Color(255, 255, 255));
                label[i].setForeground(Color.BLUE);
            } else {
                panel[i].setBackground(new Color(204,204,204));
                label[i].setForeground(new Color(153,153,153));
            }
        }
        for (int i = 0; i < status.length; i++) {
            status[i] = 0;
        }
        status[indexForMenuMain]=1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pal_Head = new javax.swing.JPanel();
        btn_VeChungToi = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        btnChinhSachNguoiDung = new javax.swing.JLabel();
        btnReport = new javax.swing.JLabel();
        btnUserName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        palSettingLeft = new javax.swing.JPanel();
        pal_AllMain = new javax.swing.JPanel();
        lblNameUser = new javax.swing.JLabel();
        lblEmailUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pal_Head.setBackground(new java.awt.Color(204, 204, 204));
        pal_Head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pal_HeadMouseClicked(evt);
            }
        });

        btn_VeChungToi.setBackground(new java.awt.Color(153, 153, 153));
        btn_VeChungToi.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_VeChungToi.setForeground(new java.awt.Color(102, 102, 102));
        btn_VeChungToi.setText("Về chúng tôi");
        btn_VeChungToi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VeChungToiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_VeChungToiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_VeChungToiMouseExited(evt);
            }
        });

        lblChucVu.setBackground(new java.awt.Color(153, 153, 153));
        lblChucVu.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(102, 102, 102));
        lblChucVu.setText("Quản lý");
        lblChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChucVuMouseClicked(evt);
            }
        });

        btnChinhSachNguoiDung.setBackground(new java.awt.Color(153, 153, 153));
        btnChinhSachNguoiDung.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnChinhSachNguoiDung.setForeground(new java.awt.Color(102, 102, 102));
        btnChinhSachNguoiDung.setText("Chính sách người dùng");
        btnChinhSachNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChinhSachNguoiDungMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChinhSachNguoiDungMouseExited(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(153, 153, 153));
        btnReport.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnReport.setForeground(new java.awt.Color(102, 102, 102));
        btnReport.setText("Báo lỗi");
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportMouseExited(evt);
            }
        });

        btnUserName.setBackground(new java.awt.Color(102, 102, 102));
        btnUserName.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnUserName.setForeground(new java.awt.Color(102, 102, 102));
        btnUserName.setText("Đạt Hồ");
        btnUserName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUserNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUserNameMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/qlbatdongsan/images/icon/user-circle.256x256.png"))); // NOI18N

        javax.swing.GroupLayout pal_HeadLayout = new javax.swing.GroupLayout(pal_Head);
        pal_Head.setLayout(pal_HeadLayout);
        pal_HeadLayout.setHorizontalGroup(
            pal_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pal_HeadLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btn_VeChungToi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnReport)
                .addGap(20, 20, 20)
                .addComponent(btnChinhSachNguoiDung)
                .addGap(692, 692, 692)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pal_HeadLayout.setVerticalGroup(
            pal_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pal_HeadLayout.createSequentialGroup()
                .addGroup(pal_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pal_HeadLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pal_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pal_HeadLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pal_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChucVu)
                            .addComponent(btn_VeChungToi)
                            .addComponent(btnReport)
                            .addComponent(btnChinhSachNguoiDung))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        palSettingLeft.setBackground(new java.awt.Color(204, 204, 204));
        palSettingLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout palSettingLeftLayout = new javax.swing.GroupLayout(palSettingLeft);
        palSettingLeft.setLayout(palSettingLeftLayout);
        palSettingLeftLayout.setHorizontalGroup(
            palSettingLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        palSettingLeftLayout.setVerticalGroup(
            palSettingLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pal_AllMain.setBackground(new java.awt.Color(204, 204, 204));
        pal_AllMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblNameUser.setFont(new java.awt.Font("Roboto Slab Thin", 1, 14)); // NOI18N
        lblNameUser.setForeground(new java.awt.Color(51, 51, 51));
        lblNameUser.setText("Hello Trần Thanh Vỵ");

        lblEmailUser.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        lblEmailUser.setForeground(new java.awt.Color(102, 102, 102));
        lblEmailUser.setText("thanhvy2411@gmail.com");

        javax.swing.GroupLayout pal_AllMainLayout = new javax.swing.GroupLayout(pal_AllMain);
        pal_AllMain.setLayout(pal_AllMainLayout);
        pal_AllMainLayout.setHorizontalGroup(
            pal_AllMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pal_AllMainLayout.createSequentialGroup()
                .addGroup(pal_AllMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pal_AllMainLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblNameUser))
                    .addGroup(pal_AllMainLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblEmailUser)))
                .addContainerGap(1465, Short.MAX_VALUE))
        );
        pal_AllMainLayout.setVerticalGroup(
            pal_AllMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pal_AllMainLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(lblNameUser)
                .addGap(18, 18, 18)
                .addComponent(lblEmailUser)
                .addGap(567, 567, 567))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pal_Head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(palSettingLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addComponent(pal_AllMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pal_Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(palSettingLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pal_AllMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NotesMouseClicked
        // TODO add your handling code here:
//        switchPanels(palNotes);
    }//GEN-LAST:event_btn_NotesMouseClicked

    private void btn_SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SettingMouseClicked
        // TODO add your handling code here:
//        switchPanels(palSettings);
    }//GEN-LAST:event_btn_SettingMouseClicked

    private void btnDashBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashBoardMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDashBoardMouseClicked

    private void btnNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNotesMouseClicked

    private void btnFilesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilesMouseEntered

    private void btnFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFilesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilesMouseClicked

    private void btnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSettingMouseClicked

    private void btnCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalendarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalendarMouseClicked

    private void btn_VeChungToiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VeChungToiMouseEntered
        // TODO add your handling code here:
        HoverForLabel(btn_VeChungToi);
    }//GEN-LAST:event_btn_VeChungToiMouseEntered

    private void btnReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseEntered
        // TODO add your handling code here:
        HoverForLabel(btnReport);
    }//GEN-LAST:event_btnReportMouseEntered

    private void btnChinhSachNguoiDungMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChinhSachNguoiDungMouseEntered
        // TODO add your handling code here:
        HoverForLabel(btnChinhSachNguoiDung);
    }//GEN-LAST:event_btnChinhSachNguoiDungMouseEntered

    private void btn_VeChungToiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VeChungToiMouseExited
        // TODO add your handling code here:
        btn_VeChungToi.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn_VeChungToiMouseExited

    private void btnReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseExited
        // TODO add your handling code here:
        btnReport.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnReportMouseExited

    private void btnChinhSachNguoiDungMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChinhSachNguoiDungMouseExited
        // TODO add your handling code here:
        btnChinhSachNguoiDung.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnChinhSachNguoiDungMouseExited

    private void btnUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserNameMouseClicked

    private void btnUserNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserNameMouseEntered
        // TODO add your handling code here:
        HoverForLabel(btnUserName);
    }//GEN-LAST:event_btnUserNameMouseEntered

    private void btnUserNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserNameMouseExited
        // TODO add your handling code here:
        btnUserName.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnUserNameMouseExited

    private void lblNontificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNontificationMouseClicked
        // TODO add your handling code here:
  

    }//GEN-LAST:event_lblNontificationMouseClicked

    private void imageAvatarUser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarUser1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imageAvatarUser1MouseEntered

    private void imageAvatarUser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarUser1MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imageAvatarUser1MouseExited

    private void imageAvatarUser2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarUser2MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imageAvatarUser2MouseEntered

    private void imageAvatarUser2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarUser2MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imageAvatarUser2MouseExited

    private void imageAvatarUser3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarUser3MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imageAvatarUser3MouseEntered

    private void imageAvatarUser3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarUser3MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_imageAvatarUser3MousePressed

    private void imageAvatarUser3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarUser3MouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_imageAvatarUser3MouseExited

    private void imageAvatarUser4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarUser4MouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_imageAvatarUser4MouseEntered

    private void imageAvatarUser4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarUser4MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imageAvatarUser4MouseExited

    private void palSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palSearchMouseEntered
        // TODO add your handling code here:
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("/com/mycompany/qlbatdongsan/images/icon/icons8-text-cursor-24.png")).getImage(), new Point(0, 0), "Custom cursor");
        setCursor(cursor);
    }//GEN-LAST:event_palSearchMouseEntered

    private void palSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palSearchMouseExited
        // TODO add your handling code here:
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("/com/mycompany/qlbatdongsan/images/icon/icons8-mouse-40.png")).getImage(), new Point(0, 0), "Custom cursor");
        setCursor(cursor);
    }//GEN-LAST:event_palSearchMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        // TODO add your handling code here:
        if (MsgBox.confirm(this, "Bạn có chắc chắn muốn thoát ứng dụng?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblExitMouseClicked

    private void btn_VeChungToiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VeChungToiMouseClicked
        // TODO add your handling code here:
        new GioiThieuJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btn_VeChungToiMouseClicked

    private void pal_HeadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pal_HeadMouseClicked
            // TODO add your handling code here:
    }//GEN-LAST:event_pal_HeadMouseClicked

    private void lblChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChucVuMouseClicked
        // TODO add your handling code here:
         new GioiThieuJDialog(this,true).setVisible(true);
   
    }//GEN-LAST:event_lblChucVuMouseClicked

    private void imageAvatar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar4MouseEntered
        // TODO add your handling code here:
         imageAvatar4.setBounds(imageAvatar4.getX()-5, imageAvatar4.getY()-5,imageAvatar4.getWidth()+10,  imageAvatar4.getHeight()+10);
    }//GEN-LAST:event_imageAvatar4MouseEntered

    private void imageAvatar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar4MouseExited
        // TODO add your handling code here:
        imageAvatar4.setBounds(imageAvatar4.getX()+5, imageAvatar4.getY()+5,imageAvatar4.getWidth()-10,  imageAvatar4.getHeight()-10);
    }//GEN-LAST:event_imageAvatar4MouseExited

    private void imageAvatar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar3MouseEntered
        // TODO add your handling code here:
        imageAvatar3.setBounds(imageAvatar3.getX()-5, imageAvatar3.getY()-5,imageAvatar3.getWidth()+10,  imageAvatar3.getHeight()+10);
    }//GEN-LAST:event_imageAvatar3MouseEntered

    private void imageAvatar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar3MouseExited
        // TODO add your handling code here:
         imageAvatar3.setBounds(imageAvatar3.getX()+5, imageAvatar3.getY()+5,imageAvatar3.getWidth()-10,  imageAvatar3.getHeight()-10);
    }//GEN-LAST:event_imageAvatar3MouseExited

    private void imageAvatar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar2MouseEntered
        // TODO add your handling code here:
        imageAvatar2.setBounds(imageAvatar2.getX()-5, imageAvatar2.getY()-5,imageAvatar2.getWidth()+10,  imageAvatar2.getHeight()+10);
    }//GEN-LAST:event_imageAvatar2MouseEntered

    private void imageAvatar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar2MouseExited
        // TODO add your handling code here:
        imageAvatar2.setBounds(imageAvatar2.getX()+5, imageAvatar2.getY()+5,imageAvatar2.getWidth()-10,  imageAvatar2.getHeight()-10);
    }//GEN-LAST:event_imageAvatar2MouseExited

    private void imageAvatar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseEntered
        // TODO add your handling code here:
        imageAvatar1.setBounds(imageAvatar1.getX()-5, imageAvatar1.getY()-5,imageAvatar1.getWidth()+10,  imageAvatar1.getHeight()+10);
    }//GEN-LAST:event_imageAvatar1MouseEntered

    private void imageAvatar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseExited
        // TODO add your handling code here:
        imageAvatar1.setBounds(imageAvatar1.getX()+5, imageAvatar1.getY()+5,imageAvatar1.getWidth()-10,  imageAvatar1.getHeight()-10);
    }//GEN-LAST:event_imageAvatar1MouseExited

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnChinhSachNguoiDung;
    private javax.swing.JLabel btnReport;
    private javax.swing.JLabel btnUserName;
    private javax.swing.JLabel btn_VeChungToi;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblEmailUser;
    private javax.swing.JLabel lblNameUser;
    private javax.swing.JPanel palSettingLeft;
    private javax.swing.JPanel pal_AllMain;
    private javax.swing.JPanel pal_Head;
    // End of variables declaration//GEN-END:variables
}