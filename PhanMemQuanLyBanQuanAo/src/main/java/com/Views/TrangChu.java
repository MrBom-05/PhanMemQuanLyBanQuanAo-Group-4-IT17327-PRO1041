package com.Views;

import com.CustomModels.StaffCustomModel;
import com.Models.Staff;
import com.Models.Store;
import com.Services.Implements.StaffServiceImplement;
import com.Services.Implements.StoreServiceImplement;
import com.Services.StaffService;
import com.Services.StoreService;
import com.Utilities.LogicUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.sql.Date;
import java.util.List;

public class TrangChu extends javax.swing.JFrame {

    private StaffService staffService = new StaffServiceImplement();

    private StoreService storeService = new StoreServiceImplement();

    private DefaultTableModel defaultTableModel;

    private DefaultComboBoxModel defaultComboBoxModel;

    Color colorXanh = new Color(0,153,153);
    Color colorTrang = new Color(246,248,250);

    private LogicUtil logicUtil = new LogicUtil();

    public TrangChu() {
        initComponents();
        btnThongKe.setBackground(colorXanh);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelThongKe);
        panelMain.repaint();
        panelMain.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnLichSu = new javax.swing.JButton();
        btnKhuyenMai = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnCuaHang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDoiMatKhau = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        panelThongKe = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        panelSanPham = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblChiTietSanPhamPanelSanPham = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtMaSPPanelSanPham = new javax.swing.JTextField();
        txtTenSPPanelSanPham = new javax.swing.JTextField();
        txtGiaPanelSanPham = new javax.swing.JTextField();
        spnSoLuongPanelSanPham = new javax.swing.JSpinner();
        cbbLoaiSPPanelSanPham = new javax.swing.JComboBox<>();
        cbbKichCoPanelSanPham = new javax.swing.JComboBox<>();
        cbbMauSac = new javax.swing.JComboBox<>();
        cbbChatLieuPanelSanPham = new javax.swing.JComboBox<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtMoTaPanelSanPham = new javax.swing.JTextArea();
        txtTimKiemSPPanelSanPham = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        btnXoaFormPanelSanPhamCT = new javax.swing.JButton();
        btnThemPanelSanPhamCT = new javax.swing.JButton();
        btnSuaPanelSanPhamCT = new javax.swing.JButton();
        btnAnPanelSanPhamCT = new javax.swing.JButton();
        btnXemAnPanelSanPhamCT = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txtTenThuocTinhPanelSanPham = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        rdoLoaiSanPhamPanelSanPham = new javax.swing.JRadioButton();
        rdoMauSacPanelSanPham = new javax.swing.JRadioButton();
        rdoKichCoPanelSanPham = new javax.swing.JRadioButton();
        rdoChatLieuPanelSanPham = new javax.swing.JRadioButton();
        btnThemPanelSanPham = new javax.swing.JButton();
        btnSuaPanelSanPham = new javax.swing.JButton();
        btnXoaPanelSanPham = new javax.swing.JButton();
        txtMaThuocTinhPanelSanPham = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblThuocTinhPanelSanPham = new javax.swing.JTable();
        panelHoaDon = new javax.swing.JPanel();
        panelLichSu = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblHoaDonPanelLichSu2 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblSanPhamPanelLichSu = new javax.swing.JTable();
        panelKhuyenMai = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblKhuyenMaiPanelKhuyenMai = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtMaKhuyenMaiPanelKhuyenMai = new javax.swing.JTextField();
        txtTenChuongTrinhPanelKhuyenMai = new javax.swing.JTextField();
        txtNgayBatDauPanelKhuyenMai = new com.toedter.calendar.JDateChooser();
        txtNgayKetThucPanelKhuyenMai = new com.toedter.calendar.JDateChooser();
        spnPhanTramKhuyenMaiPanelKhuyenMai = new javax.swing.JSpinner();
        btnXemKhuyenMaiPanelKhuyenMai = new javax.swing.JButton();
        btnXoaFormPanelKhuyenMai = new javax.swing.JButton();
        btnThemPanelKhuyenMai = new javax.swing.JButton();
        btnSuaPanelKhuyenMai = new javax.swing.JButton();
        btnAnPanelKhuyenMai = new javax.swing.JButton();
        panelNhanVien = new javax.swing.JPanel();
        rdoNamPanelNhanVien = new javax.swing.JRadioButton();
        rdoNuPanelNhanVien = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtHoPanelNhanVien = new javax.swing.JTextField();
        txtTenPanelNhanVien = new javax.swing.JTextField();
        txtMaNhanVienPanelNhanVien = new javax.swing.JTextField();
        txtEmailPanelNhanVien = new javax.swing.JTextField();
        txtSDTPanelNhanVien = new javax.swing.JTextField();
        cbbChucVuPanelNhanVien = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiaChiPanelNhanVien = new javax.swing.JTextArea();
        cbbCuaHangPanelNhanVien = new javax.swing.JComboBox<>();
        txtMatKhauPanelNhanVien = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnXemNhanVienDaNghiPanelNV = new javax.swing.JButton();
        txtNgaySinhNhanVienPanelNhanVien = new com.toedter.calendar.JDateChooser();
        btnXoaFormPanelNhanVien = new javax.swing.JButton();
        btnThemPanelNhanVien = new javax.swing.JButton();
        btnSuaPanelNhanVien = new javax.swing.JButton();
        btnAnPanelNhanVien = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNhanVienPanelNhanVien = new javax.swing.JTable();
        panelKhachHang = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblKhachHangPanelKhachHang = new javax.swing.JTable();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txtHoPanelNhanVien1 = new javax.swing.JTextField();
        txtTenPanelNhanVien1 = new javax.swing.JTextField();
        txtMaNhanVienPanelNhanVien1 = new javax.swing.JTextField();
        txtSDTPanelNhanVien1 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        txtEmailPanelNhanVien1 = new javax.swing.JTextField();
        btnXoaFormPanelKhachHang = new javax.swing.JButton();
        btnThemPanelKhachHang = new javax.swing.JButton();
        btnSuaPanelKhachHang = new javax.swing.JButton();
        txtTimKiemKhachHangPanelKH = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        panelCuaHang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuaHangPanelCuaHang = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtMaCuaHangPanelCuaHang = new javax.swing.JTextField();
        txtTenCuaHangPanelCuaHang = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChiPanelCuaHang = new javax.swing.JTextArea();
        btnXoaFormPanelCuaHang = new javax.swing.JButton();
        btnThemPanelCuaHang = new javax.swing.JButton();
        btnSuaPanelCuaHang = new javax.swing.JButton();
        btnChuyenTrangThaiPanelCuaHang = new javax.swing.JButton();
        cbbChuCuaHangPanelCuaHang = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        cbbTrangThaiPanelCuaHang = new javax.swing.JComboBox<>();
        panelDoiMatKhau = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtTaiKhoanPanelDoiMatKhau = new javax.swing.JTextField();
        txtMatKhauMoiPanelDoiMatKhau = new javax.swing.JPasswordField();
        txtXBMatKhauPanelDoiMatKhau = new javax.swing.JPasswordField();
        txtMatKhauCuPanelDoiMatKhau = new javax.swing.JPasswordField();
        txtCaptchaPanelDoiMatKhau = new javax.swing.JTextField();
        txtLoadCaptchaPanelDoiMatKhau = new javax.swing.JTextField();
        btnLoadCaptchaPanelDoiMatKhau = new javax.swing.JButton();
        btnLuuPanelDoiMatKhau = new javax.swing.JButton();
        btnThoatPanelDoiMatKhau = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1330, 765));

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(246, 248, 250));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thongke.png"))); // NOI18N
        btnThongKe.setText("Thống Kê");
        btnThongKe.setToolTipText("");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnSanPham.setBackground(new java.awt.Color(246, 248, 250));
        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sanpham.png"))); // NOI18N
        btnSanPham.setText("Sản Phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnHoaDon.setBackground(new java.awt.Color(246, 248, 250));
        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hoadon.png"))); // NOI18N
        btnHoaDon.setText("Hóa Đơn");
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnLichSu.setBackground(new java.awt.Color(246, 248, 250));
        btnLichSu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLichSu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lichsu.png"))); // NOI18N
        btnLichSu.setText("Lịch Sử");
        btnLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuActionPerformed(evt);
            }
        });

        btnKhuyenMai.setBackground(new java.awt.Color(246, 248, 250));
        btnKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/khuyenmai.png"))); // NOI18N
        btnKhuyenMai.setText("Khuyến Mãi");
        btnKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenMaiActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(246, 248, 250));
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nhanvien.png"))); // NOI18N
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnKhachHang.setBackground(new java.awt.Color(246, 248, 250));
        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/khachhang.png"))); // NOI18N
        btnKhachHang.setText("Khách Hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnCuaHang.setBackground(new java.awt.Color(246, 248, 250));
        btnCuaHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cuahang.png"))); // NOI18N
        btnCuaHang.setText("Cửa Hàng");
        btnCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuaHangActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.jpg"))); // NOI18N

        btnDoiMatKhau.setBackground(new java.awt.Color(246, 248, 250));
        btnDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/doimatkhau.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(246, 248, 250));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangxuat.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        panelMain.setBackground(new java.awt.Color(246, 248, 250));
        panelMain.setLayout(new java.awt.CardLayout());

        panelThongKe.setBackground(new java.awt.Color(246, 248, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tổng Doanh Thu Ngày");

        jLabel3.setText("Thành Công:");

        jLabel4.setText("Bị Hủy:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ngay.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(127, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tổng Đơn Hàng");

        jLabel7.setText("Thành Công:");

        jLabel8.setText("Bị Hủy:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/giohang.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Tổng Doanh Thu Tháng");

        jLabel11.setText("Thành Công:");

        jLabel12.setText("Bị Hủy:");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thang.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(122, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(14, 14, 14))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Tổng Doanh Thu Năm");

        jLabel15.setText("Thành Công:");

        jLabel16.setText("Bị Hủy:");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nam.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(14, 14, 14))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1142, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Doanh Thu", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1142, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sản Phẩm", jPanel7);

        javax.swing.GroupLayout panelThongKeLayout = new javax.swing.GroupLayout(panelThongKe);
        panelThongKe.setLayout(panelThongKeLayout);
        panelThongKeLayout.setHorizontalGroup(
            panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(panelThongKeLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelThongKeLayout.setVerticalGroup(
            panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMain.add(panelThongKe, "card2");

        panelSanPham.setBackground(new java.awt.Color(246, 248, 250));

        jPanel8.setBackground(new java.awt.Color(246, 248, 250));

        jPanel14.setBackground(new java.awt.Color(246, 248, 250));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sản Phẩm"));

        tblChiTietSanPhamPanelSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Loại SP", "Kích Cỡ", "Màu Sắc", "Chất Liệu", "Giá Bán", "Số Lượng", "Mô Tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblChiTietSanPhamPanelSanPham);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(246, 248, 250));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Quản Lý Sản Phẩm"));

        jLabel49.setText("Mã SP");

        jLabel50.setText("Tên SP");

        jLabel51.setText("Giá Bán");

        jLabel52.setText("Số Lượng");

        jLabel53.setText("Loại SP");

        jLabel54.setText("Kích Cỡ");

        jLabel55.setText("Màu Sắc");

        jLabel56.setText("Chất Liệu");

        jLabel57.setText("Mô Tả");

        spnSoLuongPanelSanPham.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        txtMoTaPanelSanPham.setColumns(20);
        txtMoTaPanelSanPham.setRows(5);
        jScrollPane11.setViewportView(txtMoTaPanelSanPham);

        jLabel58.setText("Tìm Kiếm SP");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSPPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSPPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGiaPanelSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(spnSoLuongPanelSanPham))))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbLoaiSPPanelSanPham, 0, 135, Short.MAX_VALUE)
                            .addComponent(cbbKichCoPanelSanPham, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel55))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbChatLieuPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel58)
                        .addGap(28, 28, 28)
                        .addComponent(txtTimKiemSPPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel53)
                    .addComponent(jLabel55)
                    .addComponent(jLabel57)
                    .addComponent(txtMaSPPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLoaiSPPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(txtTenSPPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jLabel54)
                            .addComponent(jLabel56)
                            .addComponent(txtGiaPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbKichCoPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbChatLieuPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(spnSoLuongPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimKiemSPPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11)))
                .addGap(18, 18, 18))
        );

        btnXoaFormPanelSanPhamCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaFormPanelSanPhamCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        btnXoaFormPanelSanPhamCT.setText("Xóa Form");

        btnThemPanelSanPhamCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemPanelSanPhamCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThemPanelSanPhamCT.setText("Thêm");

        btnSuaPanelSanPhamCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaPanelSanPhamCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnSuaPanelSanPhamCT.setText("Sửa");

        btnAnPanelSanPhamCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAnPanelSanPhamCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        btnAnPanelSanPhamCT.setText("Ẩn");

        btnXemAnPanelSanPhamCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXemAnPanelSanPhamCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/an.png"))); // NOI18N
        btnXemAnPanelSanPhamCT.setText("Xem Sản Phẩm Đã Ẩn");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnXoaFormPanelSanPhamCT)
                .addGap(69, 69, 69)
                .addComponent(btnThemPanelSanPhamCT)
                .addGap(31, 31, 31)
                .addComponent(btnSuaPanelSanPhamCT)
                .addGap(22, 22, 22)
                .addComponent(btnAnPanelSanPhamCT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXemAnPanelSanPhamCT)
                .addGap(29, 29, 29))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaFormPanelSanPhamCT)
                    .addComponent(btnThemPanelSanPhamCT)
                    .addComponent(btnSuaPanelSanPhamCT)
                    .addComponent(btnAnPanelSanPhamCT)
                    .addComponent(btnXemAnPanelSanPhamCT))
                .addGap(14, 14, 14))
        );

        jTabbedPane2.addTab("Thông Tin Chi Tiết", jPanel8);

        jPanel9.setBackground(new java.awt.Color(246, 248, 250));

        jPanel10.setBackground(new java.awt.Color(246, 248, 250));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Thuộc Tính Sản Phẩm"));

        jLabel48.setText("Tên Thuộc Tính");

        buttonGroup2.add(rdoLoaiSanPhamPanelSanPham);
        rdoLoaiSanPhamPanelSanPham.setSelected(true);
        rdoLoaiSanPhamPanelSanPham.setText("Loại Sản Phẩm");

        buttonGroup2.add(rdoMauSacPanelSanPham);
        rdoMauSacPanelSanPham.setText("Màu Sắc");

        buttonGroup2.add(rdoKichCoPanelSanPham);
        rdoKichCoPanelSanPham.setText("Kích Cỡ");

        buttonGroup2.add(rdoChatLieuPanelSanPham);
        rdoChatLieuPanelSanPham.setText("Chất Liệu");

        btnThemPanelSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemPanelSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThemPanelSanPham.setText("Thêm");

        btnSuaPanelSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaPanelSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnSuaPanelSanPham.setText("Sửa");

        btnXoaPanelSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaPanelSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        btnXoaPanelSanPham.setText("Xóa");

        txtMaThuocTinhPanelSanPham.setEditable(false);

        jLabel62.setText("Mã Thuộc Tính");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addComponent(txtMaThuocTinhPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(txtTenThuocTinhPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(rdoLoaiSanPhamPanelSanPham)
                .addGap(46, 46, 46)
                .addComponent(rdoMauSacPanelSanPham)
                .addGap(42, 42, 42)
                .addComponent(rdoKichCoPanelSanPham)
                .addGap(35, 35, 35)
                .addComponent(rdoChatLieuPanelSanPham)
                .addGap(39, 39, 39))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnThemPanelSanPham)
                .addGap(31, 31, 31)
                .addComponent(btnSuaPanelSanPham)
                .addGap(22, 22, 22)
                .addComponent(btnXoaPanelSanPham)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel62)
                        .addComponent(txtMaThuocTinhPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48)
                        .addComponent(txtTenThuocTinhPanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdoLoaiSanPhamPanelSanPham)
                        .addComponent(rdoMauSacPanelSanPham)
                        .addComponent(rdoKichCoPanelSanPham)
                        .addComponent(rdoChatLieuPanelSanPham)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemPanelSanPham)
                    .addComponent(btnSuaPanelSanPham)
                    .addComponent(btnXoaPanelSanPham))
                .addGap(33, 33, 33))
        );

        jPanel11.setBackground(new java.awt.Color(246, 248, 250));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Thuộc Tính"));

        tblThuocTinhPanelSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Loại", "Tên Loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblThuocTinhPanelSanPham);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Thuộc Tính Sản Phẩm", jPanel9);

        javax.swing.GroupLayout panelSanPhamLayout = new javax.swing.GroupLayout(panelSanPham);
        panelSanPham.setLayout(panelSanPhamLayout);
        panelSanPhamLayout.setHorizontalGroup(
            panelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        panelSanPhamLayout.setVerticalGroup(
            panelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        panelMain.add(panelSanPham, "card3");

        javax.swing.GroupLayout panelHoaDonLayout = new javax.swing.GroupLayout(panelHoaDon);
        panelHoaDon.setLayout(panelHoaDonLayout);
        panelHoaDonLayout.setHorizontalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1148, Short.MAX_VALUE)
        );
        panelHoaDonLayout.setVerticalGroup(
            panelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );

        panelMain.add(panelHoaDon, "card4");

        panelLichSu.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane8.setViewportView(jTextArea2);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Tên Nhân Viên");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("Tên Khách Hàng");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("Số Điện Thoại");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("Địa Chỉ");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Tổng Tiền Hàng");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Ngày Tạo");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("Trạng Thái");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("Lý Do Hủy");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("Mã Nhân Viên");

        jPanel12.setBackground(new java.awt.Color(246, 248, 250));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Hóa Đơn"));

        tblHoaDonPanelLichSu2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Hóa Đơn", "Tên Nhân Viên", "Tên Khách Hàng", "Ngày Tạo", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblHoaDonPanelLichSu2);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(246, 248, 250));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sản Phẩm"));

        tblSanPhamPanelLichSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Màu Sắc", "Size", "Số Lượng", "Đơn Giá", "Giảm Giá", "Thành Tiền", "Trạng Thái", "Lý Do Hủy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tblSanPhamPanelLichSu);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelLichSuLayout = new javax.swing.GroupLayout(panelLichSu);
        panelLichSu.setLayout(panelLichSuLayout);
        panelLichSuLayout.setHorizontalGroup(
            panelLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLichSuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLichSuLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLichSuLayout.createSequentialGroup()
                        .addGroup(panelLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8))
                .addGap(17, 17, 17))
        );
        panelLichSuLayout.setVerticalGroup(
            panelLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLichSuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLichSuLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel33)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel34)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel35)
                        .addGap(30, 30, 30)
                        .addGroup(panelLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel37)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel38))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelLichSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLichSuLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMain.add(panelLichSu, "card9");

        panelKhuyenMai.setBackground(new java.awt.Color(246, 248, 250));

        tblKhuyenMaiPanelKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Khuyến Mãi", "Tên Chương Trình", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Phần Trăm Khuyến Mãi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhuyenMaiPanelKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiPanelKhuyenMaiMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tblKhuyenMaiPanelKhuyenMai);

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel70.setText("Mã Khuyến Mãi");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setText("Tên Chương Trình");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel72.setText("Ngày Bắt Đầu");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel73.setText("Ngày Kết Thúc");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel74.setText("Phần Trăm Khuyến Mãi");

        txtMaKhuyenMaiPanelKhuyenMai.setEditable(false);

        btnXemKhuyenMaiPanelKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXemKhuyenMaiPanelKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/an.png"))); // NOI18N
        btnXemKhuyenMaiPanelKhuyenMai.setText("Xem Chương Trình Đã Kết Thúc");
        btnXemKhuyenMaiPanelKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemKhuyenMaiPanelKhuyenMaiActionPerformed(evt);
            }
        });

        btnXoaFormPanelKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaFormPanelKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        btnXoaFormPanelKhuyenMai.setText("Xóa Form");
        btnXoaFormPanelKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormPanelKhuyenMaiActionPerformed(evt);
            }
        });

        btnThemPanelKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemPanelKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThemPanelKhuyenMai.setText("Thêm");
        btnThemPanelKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPanelKhuyenMaiActionPerformed(evt);
            }
        });

        btnSuaPanelKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaPanelKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnSuaPanelKhuyenMai.setText("Sửa");
        btnSuaPanelKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPanelKhuyenMaiActionPerformed(evt);
            }
        });

        btnAnPanelKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAnPanelKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        btnAnPanelKhuyenMai.setText("Kết Thúc Trương Trình");
        btnAnPanelKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnPanelKhuyenMaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKhuyenMaiLayout = new javax.swing.GroupLayout(panelKhuyenMai);
        panelKhuyenMai.setLayout(panelKhuyenMaiLayout);
        panelKhuyenMaiLayout.setHorizontalGroup(
            panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhuyenMaiLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKhuyenMaiLayout.createSequentialGroup()
                        .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71))
                        .addGap(54, 54, 54)
                        .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKhuyenMaiPanelKhuyenMai)
                            .addComponent(txtTenChuongTrinhPanelKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(jLabel73))
                        .addGap(24, 24, 24)
                        .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayBatDauPanelKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(txtNgayKetThucPanelKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel74)
                        .addGap(18, 18, 18)
                        .addComponent(spnPhanTramKhuyenMaiPanelKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelKhuyenMaiLayout.createSequentialGroup()
                        .addComponent(btnXoaFormPanelKhuyenMai)
                        .addGap(69, 69, 69)
                        .addComponent(btnThemPanelKhuyenMai)
                        .addGap(31, 31, 31)
                        .addComponent(btnSuaPanelKhuyenMai)
                        .addGap(22, 22, 22)
                        .addComponent(btnAnPanelKhuyenMai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                        .addComponent(btnXemKhuyenMaiPanelKhuyenMai)
                        .addGap(47, 47, 47))))
            .addGroup(panelKhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13)
                .addContainerGap())
        );
        panelKhuyenMaiLayout.setVerticalGroup(
            panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKhuyenMaiLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70)
                        .addComponent(jLabel72)
                        .addComponent(jLabel74)
                        .addComponent(txtMaKhuyenMaiPanelKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnPhanTramKhuyenMaiPanelKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNgayBatDauPanelKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel71)
                        .addComponent(jLabel73)
                        .addComponent(txtTenChuongTrinhPanelKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNgayKetThucPanelKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaFormPanelKhuyenMai)
                    .addComponent(btnThemPanelKhuyenMai)
                    .addComponent(btnSuaPanelKhuyenMai)
                    .addComponent(btnAnPanelKhuyenMai)
                    .addComponent(btnXemKhuyenMaiPanelKhuyenMai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(panelKhuyenMai, "card6");

        panelNhanVien.setBackground(new java.awt.Color(246, 248, 250));

        buttonGroup3.add(rdoNamPanelNhanVien);
        rdoNamPanelNhanVien.setText("Nam");

        buttonGroup3.add(rdoNuPanelNhanVien);
        rdoNuPanelNhanVien.setText("Nữ");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Mã NV");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Họ");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Tên");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Giới Tính");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Ngày Sinh");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("SDT");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Email");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Chức Vụ");

        txtMaNhanVienPanelNhanVien.setEditable(false);

        cbbChucVuPanelNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên", "Quản Lý" }));

        txtDiaChiPanelNhanVien.setColumns(20);
        txtDiaChiPanelNhanVien.setRows(5);
        jScrollPane4.setViewportView(txtDiaChiPanelNhanVien);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Địa Chỉ");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Cửa Hàng");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("Mật Khẩu");

        btnXemNhanVienDaNghiPanelNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXemNhanVienDaNghiPanelNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/an.png"))); // NOI18N
        btnXemNhanVienDaNghiPanelNV.setText("Xem Nhân Viên Đã Nghỉ");
        btnXemNhanVienDaNghiPanelNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemNhanVienDaNghiPanelNVActionPerformed(evt);
            }
        });

        txtNgaySinhNhanVienPanelNhanVien.setDateFormatString("yyyy-MM-dd"); // NOI18N

        btnXoaFormPanelNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaFormPanelNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        btnXoaFormPanelNhanVien.setText("Xóa Form");
        btnXoaFormPanelNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormPanelNhanVienActionPerformed(evt);
            }
        });

        btnThemPanelNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemPanelNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThemPanelNhanVien.setText("Thêm");
        btnThemPanelNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPanelNhanVienActionPerformed(evt);
            }
        });

        btnSuaPanelNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaPanelNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnSuaPanelNhanVien.setText("Sửa");
        btnSuaPanelNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPanelNhanVienActionPerformed(evt);
            }
        });

        btnAnPanelNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAnPanelNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        btnAnPanelNhanVien.setText("Ẩn");
        btnAnPanelNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnPanelNhanVienActionPerformed(evt);
            }
        });

        tblNhanVienPanelNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã NV", "Họ và Tên", "Ngày Sinh", "Giới Tính", "SDT", "Email", "Địa Chỉ", "Chức Vụ", "Cửa Hàng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVienPanelNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienPanelNhanVienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblNhanVienPanelNhanVien);

        javax.swing.GroupLayout panelNhanVienLayout = new javax.swing.GroupLayout(panelNhanVien);
        panelNhanVien.setLayout(panelNhanVienLayout);
        panelNhanVienLayout.setHorizontalGroup(
            panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhanVienLayout.createSequentialGroup()
                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21))
                            .addComponent(jLabel24))
                        .addGap(52, 52, 52)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelNhanVienLayout.createSequentialGroup()
                                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaNhanVienPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhanVienLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rdoNamPanelNhanVien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdoNuPanelNhanVien)
                                .addGap(45, 45, 45)))
                        .addGap(102, 102, 102)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel25))
                        .addGap(48, 48, 48)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaySinhNhanVienPanelNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSDTPanelNhanVien)
                            .addComponent(txtEmailPanelNhanVien)
                            .addComponent(cbbChucVuPanelNhanVien, 0, 158, Short.MAX_VALUE))
                        .addGap(45, 45, 45))
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnXoaFormPanelNhanVien)
                        .addGap(69, 69, 69)
                        .addComponent(btnThemPanelNhanVien)
                        .addGap(31, 31, 31)
                        .addComponent(btnSuaPanelNhanVien)
                        .addGap(22, 22, 22)
                        .addComponent(btnAnPanelNhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btnXemNhanVienDaNghiPanelNV))
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31))
                        .addGap(41, 41, 41)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbCuaHangPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhauPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        panelNhanVienLayout.setVerticalGroup(
            panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhanVienLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNgaySinhNhanVienPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(jLabel25)
                                .addComponent(txtMaNhanVienPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhanVienLayout.createSequentialGroup()
                                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel26)
                                    .addComponent(txtHoPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel27)
                                    .addComponent(txtTenPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel28)
                                    .addComponent(rdoNamPanelNhanVien)
                                    .addComponent(rdoNuPanelNhanVien)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhanVienLayout.createSequentialGroup()
                                .addComponent(txtSDTPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(txtEmailPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(cbbChucVuPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbCuaHangPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGap(26, 26, 26)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtMatKhauPanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXemNhanVienDaNghiPanelNV)
                            .addComponent(btnXoaFormPanelNhanVien)
                            .addComponent(btnThemPanelNhanVien)
                            .addComponent(btnSuaPanelNhanVien)
                            .addComponent(btnAnPanelNhanVien))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(panelNhanVien, "card9");

        panelKhachHang.setBackground(new java.awt.Color(246, 248, 250));

        tblKhachHangPanelKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Khách Hàng", "Họ và Tên", "Email", "SDT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHangPanelKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangPanelKhachHangMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblKhachHangPanelKhachHang);

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel64.setText("Mã KH");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setText("Họ");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel66.setText("Tên");

        txtMaNhanVienPanelNhanVien1.setEditable(false);

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setText("SDT");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setText("Email");

        btnXoaFormPanelKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaFormPanelKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        btnXoaFormPanelKhachHang.setText("Xóa Form");
        btnXoaFormPanelKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormPanelKhachHangActionPerformed(evt);
            }
        });

        btnThemPanelKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemPanelKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThemPanelKhachHang.setText("Thêm");
        btnThemPanelKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPanelKhachHangActionPerformed(evt);
            }
        });

        btnSuaPanelKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaPanelKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnSuaPanelKhachHang.setText("Sửa");
        btnSuaPanelKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPanelKhachHangActionPerformed(evt);
            }
        });

        txtTimKiemKhachHangPanelKH.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemKhachHangPanelKHCaretUpdate(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel69.setText("Tìm Kiếm Bằng SDT");

        javax.swing.GroupLayout panelKhachHangLayout = new javax.swing.GroupLayout(panelKhachHang);
        panelKhachHang.setLayout(panelKhachHangLayout);
        panelKhachHangLayout.setHorizontalGroup(
            panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12)
                .addContainerGap())
            .addGroup(panelKhachHangLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKhachHangLayout.createSequentialGroup()
                        .addComponent(btnXoaFormPanelKhachHang)
                        .addGap(69, 69, 69)
                        .addComponent(btnThemPanelKhachHang)
                        .addGap(31, 31, 31)
                        .addComponent(btnSuaPanelKhachHang)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelKhachHangLayout.createSequentialGroup()
                        .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel64))
                        .addGap(52, 52, 52)
                        .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenPanelNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelKhachHangLayout.createSequentialGroup()
                                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoPanelNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaNhanVienPanelNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel68))
                                .addGap(48, 48, 48)
                                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSDTPanelNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(txtEmailPanelNhanVien1))))
                        .addGap(169, 169, 169)
                        .addComponent(jLabel69)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiemKhachHangPanelKH, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        panelKhachHangLayout.setVerticalGroup(
            panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKhachHangLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel64)
                        .addComponent(txtMaNhanVienPanelNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSDTPanelNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel67)
                        .addComponent(txtTimKiemKhachHangPanelKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel69)))
                .addGap(18, 18, 18)
                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(txtHoPanelNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(txtEmailPanelNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(txtTenPanelNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaFormPanelKhachHang)
                    .addComponent(btnThemPanelKhachHang)
                    .addComponent(btnSuaPanelKhachHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(panelKhachHang, "card8");

        panelCuaHang.setBackground(new java.awt.Color(246, 248, 250));

        tblCuaHangPanelCuaHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Của Hàng", "Tên Cửa Hàng", "Địa Chỉ", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCuaHangPanelCuaHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuaHangPanelCuaHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCuaHangPanelCuaHang);
        if (tblCuaHangPanelCuaHang.getColumnModel().getColumnCount() > 0) {
            tblCuaHangPanelCuaHang.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblCuaHangPanelCuaHang.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblCuaHangPanelCuaHang.getColumnModel().getColumn(3).setPreferredWidth(250);
        }

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Mã Cửa Hàng");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Tên Cửa Hàng");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Địa Chỉ");

        txtMaCuaHangPanelCuaHang.setEditable(false);
        txtMaCuaHangPanelCuaHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTenCuaHangPanelCuaHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDiaChiPanelCuaHang.setColumns(20);
        txtDiaChiPanelCuaHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChiPanelCuaHang.setRows(5);
        jScrollPane2.setViewportView(txtDiaChiPanelCuaHang);

        btnXoaFormPanelCuaHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaFormPanelCuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        btnXoaFormPanelCuaHang.setText("Xóa Form");
        btnXoaFormPanelCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormPanelCuaHangActionPerformed(evt);
            }
        });

        btnThemPanelCuaHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemPanelCuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThemPanelCuaHang.setText("Thêm");
        btnThemPanelCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPanelCuaHangActionPerformed(evt);
            }
        });

        btnSuaPanelCuaHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaPanelCuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnSuaPanelCuaHang.setText("Sửa");
        btnSuaPanelCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPanelCuaHangActionPerformed(evt);
            }
        });

        btnChuyenTrangThaiPanelCuaHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChuyenTrangThaiPanelCuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        btnChuyenTrangThaiPanelCuaHang.setText("Chuyển Trạng Thái");
        btnChuyenTrangThaiPanelCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenTrangThaiPanelCuaHangActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Chủ Cửa Hàng");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setText("Trạng Thái");

        cbbTrangThaiPanelCuaHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Hoạt Động", "Dừng Hoạt Động" }));

        javax.swing.GroupLayout panelCuaHangLayout = new javax.swing.GroupLayout(panelCuaHang);
        panelCuaHang.setLayout(panelCuaHangLayout);
        panelCuaHangLayout.setHorizontalGroup(
            panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuaHangLayout.createSequentialGroup()
                .addGroup(panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuaHangLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18))
                        .addGap(26, 26, 26)
                        .addGroup(panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCuaHangLayout.createSequentialGroup()
                                .addComponent(txtMaCuaHangPanelCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel19)
                                .addGap(77, 77, 77)
                                .addComponent(txtTenCuaHangPanelCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelCuaHangLayout.createSequentialGroup()
                                    .addComponent(btnXoaFormPanelCuaHang)
                                    .addGap(33, 33, 33)
                                    .addComponent(btnThemPanelCuaHang)
                                    .addGap(48, 48, 48)
                                    .addComponent(btnSuaPanelCuaHang)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnChuyenTrangThaiPanelCuaHang))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuaHangLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(295, 295, 295))
                            .addComponent(cbbChuCuaHangPanelCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCuaHangLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(18, 18, 18)
                                .addComponent(cbbTrangThaiPanelCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelCuaHangLayout.setVerticalGroup(
            panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuaHangLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(txtMaCuaHangPanelCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenCuaHangPanelCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGap(48, 48, 48)
                .addGroup(panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCuaHangLayout.createSequentialGroup()
                        .addComponent(cbbChuCuaHangPanelCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(cbbTrangThaiPanelCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(panelCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaFormPanelCuaHang)
                    .addComponent(btnThemPanelCuaHang)
                    .addComponent(btnSuaPanelCuaHang)
                    .addComponent(btnChuyenTrangThaiPanelCuaHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(panelCuaHang, "card9");

        panelDoiMatKhau.setBackground(new java.awt.Color(246, 248, 250));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setText("Đổi Mật Khẩu");

        jLabel42.setText("Tài khoản");

        jLabel43.setText("Mật khẩu cũ");

        jLabel44.setText("Mật Khẩu Mới");

        jLabel45.setText("Xác Nhận Mật Khẩu");

        jLabel46.setText("Mã Captcha");

        txtCaptchaPanelDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtLoadCaptchaPanelDoiMatKhau.setEditable(false);
        txtLoadCaptchaPanelDoiMatKhau.setBackground(new java.awt.Color(0, 153, 0));
        txtLoadCaptchaPanelDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnLoadCaptchaPanelDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnLoadCaptchaPanelDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadCaptchaPanelDoiMatKhauActionPerformed(evt);
            }
        });

        btnLuuPanelDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLuuPanelDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/luu.png"))); // NOI18N
        btnLuuPanelDoiMatKhau.setText("Lưu Thay Đổi");
        btnLuuPanelDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuPanelDoiMatKhauActionPerformed(evt);
            }
        });

        btnThoatPanelDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoatPanelDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangxuat.png"))); // NOI18N
        btnThoatPanelDoiMatKhau.setText("Thoát");
        btnThoatPanelDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatPanelDoiMatKhauActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel59.setText("Lưu ý: Mật khẩu ít nhất 8 ký tự");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel60.setText("Mật khẩu có ký tự viết hoa, các chữ cái từ a-z, số 0-9");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel61.setText("Và một số ký tự đặc biệt như \"@, !, #, *\"");

        javax.swing.GroupLayout panelDoiMatKhauLayout = new javax.swing.GroupLayout(panelDoiMatKhau);
        panelDoiMatKhau.setLayout(panelDoiMatKhauLayout);
        panelDoiMatKhauLayout.setHorizontalGroup(
            panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoiMatKhauLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDoiMatKhauLayout.createSequentialGroup()
                        .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel41))
                        .addGap(602, 602, 602))
                    .addGroup(panelDoiMatKhauLayout.createSequentialGroup()
                        .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46))
                        .addGap(55, 55, 55)
                        .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTaiKhoanPanelDoiMatKhau)
                            .addComponent(txtMatKhauMoiPanelDoiMatKhau)
                            .addComponent(txtMatKhauCuPanelDoiMatKhau)
                            .addComponent(txtXBMatKhauPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDoiMatKhauLayout.createSequentialGroup()
                                .addComponent(txtCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLoadCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLoadCaptchaPanelDoiMatKhau)))
                        .addGap(177, 177, 177)
                        .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel59)
                            .addComponent(jLabel61))
                        .addGap(0, 211, Short.MAX_VALUE))))
            .addGroup(panelDoiMatKhauLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnLuuPanelDoiMatKhau)
                .addGap(130, 130, 130)
                .addComponent(btnThoatPanelDoiMatKhau)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelDoiMatKhauLayout.setVerticalGroup(
            panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoiMatKhauLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel41)
                .addGap(52, 52, 52)
                .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtTaiKhoanPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtMatKhauCuPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(18, 18, 18)
                .addComponent(jLabel60)
                .addGap(3, 3, 3)
                .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtMatKhauMoiPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel61)
                .addGap(18, 18, 18)
                .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtXBMatKhauPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoadCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(txtCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLoadCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuuPanelDoiMatKhau)
                    .addComponent(btnThoatPanelDoiMatKhau))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        panelMain.add(panelDoiMatKhau, "card10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDoiMatKhau)
                        .addGap(31, 31, 31)
                        .addComponent(btnDangXuat)
                        .addGap(43, 43, 43)
                        .addComponent(btnExit)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                            .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDoiMatKhau)
                            .addComponent(btnDangXuat)
                            .addComponent(btnExit))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnThongKe)
                        .addGap(30, 30, 30)
                        .addComponent(btnSanPham)
                        .addGap(30, 30, 30)
                        .addComponent(btnHoaDon)
                        .addGap(32, 32, 32)
                        .addComponent(btnLichSu)
                        .addGap(32, 32, 32)
                        .addComponent(btnKhuyenMai)
                        .addGap(34, 34, 34)
                        .addComponent(btnNhanVien)
                        .addGap(38, 38, 38)
                        .addComponent(btnKhachHang)
                        .addGap(34, 34, 34)
                        .addComponent(btnCuaHang)
                        .addContainerGap(127, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn muốn thoát không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_btnExitActionPerformed


    // Panel Thống Kê
    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        btnThongKe.setBackground(colorXanh);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelThongKe);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnThongKeActionPerformed


    // Panel Sản Phẩm
    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        btnThongKe.setBackground(colorTrang);
        btnSanPham.setBackground(colorXanh);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelSanPham);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnSanPhamActionPerformed


    // Panel Hóa Đơn
    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        btnThongKe.setBackground(colorTrang);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorXanh);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelHoaDon);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnHoaDonActionPerformed


    // Panel Lịch Sử
    private void btnLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuActionPerformed
        btnThongKe.setBackground(colorTrang);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorXanh);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelLichSu);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnLichSuActionPerformed


    // Panel Khuyến Mãi
    private void btnKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenMaiActionPerformed
        btnThongKe.setBackground(colorTrang);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorXanh);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelKhuyenMai);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnKhuyenMaiActionPerformed

    private void btnXemKhuyenMaiPanelKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemKhuyenMaiPanelKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXemKhuyenMaiPanelKhuyenMaiActionPerformed

    private void btnXoaFormPanelKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormPanelKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaFormPanelKhuyenMaiActionPerformed

    private void btnThemPanelKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPanelKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemPanelKhuyenMaiActionPerformed

    private void btnSuaPanelKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPanelKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaPanelKhuyenMaiActionPerformed

    private void btnAnPanelKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnPanelKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnPanelKhuyenMaiActionPerformed

    private void tblKhuyenMaiPanelKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiPanelKhuyenMaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblKhuyenMaiPanelKhuyenMaiMouseClicked


    // Panel Nhân Viên
    public void loadDataNhanVienAn() {
        loadDataNhanVien(staffService.getList());
    }

    private void loadDataNhanVien(List<StaffCustomModel> list) {
        defaultTableModel = (DefaultTableModel) tblNhanVienPanelNhanVien.getModel();
        defaultTableModel.setRowCount(0);
        int count = 1;
        for (StaffCustomModel staffCustomModel : list) {
            defaultTableModel.addRow(new Object[]{count++, staffCustomModel.getMaNV(), staffCustomModel.getHoTen(), staffCustomModel.getNgaySinh(), staffCustomModel.getGioiTinh(), staffCustomModel.getSdt(), staffCustomModel.getEmail(), staffCustomModel.getDiaChi(), staffCustomModel.getChucVu() == 1 ? "Quản Lý" : "Nhân Viên", staffCustomModel.getTenCuaHang()});
        }
    }

    private void clearPanelNhanVien() {
        txtMaNhanVienPanelNhanVien.setText("");
        txtHoPanelNhanVien.setText("");
        txtTenPanelNhanVien.setText("");
        rdoNamPanelNhanVien.setSelected(true);
        txtNgaySinhNhanVienPanelNhanVien.setDateFormatString("yyyy-MM-dd");
        txtSDTPanelNhanVien.setText("");
        txtEmailPanelNhanVien.setText("");
        cbbChucVuPanelNhanVien.setSelectedIndex(0);
        txtDiaChiPanelNhanVien.setText("");
        txtMatKhauPanelNhanVien.setText("");
    }

    private void addCbbCuaHangPanelNhanVien(List<Store> list) {
        defaultComboBoxModel = (DefaultComboBoxModel) cbbCuaHangPanelNhanVien.getModel();
        for (Store store : list) {
            defaultComboBoxModel.addElement(store);
        }
    }
    
    private void setIndexCbbCuaHangPanelNhanVien(String ten) {
        int count = -1;
        List<Store> list = storeService.getList();
        for (Store store : list) {
            count++;
            if (store.getName().equals(ten)) {
                cbbCuaHangPanelNhanVien.setSelectedIndex(count);
            }
        }
    }

    private String codeStaffTangDan() {
        String code = "";
        List<StaffCustomModel> list = staffService.getList();
        if (list.isEmpty()) {
            code = "NV0001";
        } else {
            int max = 0;
            for (StaffCustomModel staffCustomModel : list) {
                int so = Integer.parseInt(staffCustomModel.getMaNV().substring(2));
                if (so > max) {
                    max = so;
                }
            }
            max++;
            if (max < 10) {
                code = "NV000" + max;
            } else if (max < 100) {
                code = "NV00" + max;
            } else if (max < 1000) {
                code = "NV0" + max;
            } else {
                code = "NV" + max;
            }
        }
        return code;
    }

    private Staff getPanelNhanVien() {
        String maNV = codeStaffTangDan();
        String ho = txtHoPanelNhanVien.getText();
        String ten = txtTenPanelNhanVien.getText();
        String gioiTinh = rdoNamPanelNhanVien.isSelected() ? "Nam" : "Nữ";
        String ngaySinh = ((JTextField) txtNgaySinhNhanVienPanelNhanVien.getDateEditor().getUiComponent()).getText();
        String sdt = txtSDTPanelNhanVien.getText();
        String email = txtEmailPanelNhanVien.getText();
        int chucVu = cbbChucVuPanelNhanVien.getSelectedIndex();
        String diaChi = txtDiaChiPanelNhanVien.getText();
        Store store = (Store) cbbCuaHangPanelNhanVien.getSelectedItem();
        String matKhau = logicUtil.taoMaHoa(txtMatKhauPanelNhanVien.getText());

        if (ho.equals("") || ten.equals("") || ngaySinh.equals("") || sdt.equals("") || email.equals("") || diaChi.equals("") || matKhau.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
            return null;
        } else if (email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$") == false) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng email");
            return null;
        } else if (sdt.matches("^[0-9]{10}$") == false) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng số điện thoại");
            return null;
        } else if (ngaySinh.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$") == false) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng ngày sinh");
            return null;
        }

        Date date = Date.valueOf(ngaySinh);
        return new Staff("newid()", maNV, ten, ho, gioiTinh, date, diaChi, sdt, email, matKhau, 1, store, chucVu);
    }

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        btnThongKe.setBackground(colorTrang);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorXanh);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelNhanVien);
        panelMain.repaint();
        panelMain.revalidate();
        cbbCuaHangPanelNhanVien.removeAllItems();
        addCbbCuaHangPanelNhanVien(storeService.getList());
        loadDataNhanVien(staffService.getList());
        rdoNamPanelNhanVien.setSelected(true);
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnXoaFormPanelNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormPanelNhanVienActionPerformed
        clearPanelNhanVien();
    }//GEN-LAST:event_btnXoaFormPanelNhanVienActionPerformed

    private void btnThemPanelNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPanelNhanVienActionPerformed
        Staff staff = getPanelNhanVien();
        if (staff == null) return;
        logicUtil.taoMaQR(codeStaffTangDan());
        if (staffService.insert(staff)) {
            loadDataNhanVien(staffService.getList());
            clearPanelNhanVien();
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
        }
    }//GEN-LAST:event_btnThemPanelNhanVienActionPerformed

    private void btnSuaPanelNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPanelNhanVienActionPerformed
        if (txtMaNhanVienPanelNhanVien.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Chưa chọn nhân viên nào trên table");
            return;
        }
        Staff staff = getPanelNhanVien();
        if (staff == null) return;
        if (staffService.update(txtMaNhanVienPanelNhanVien.getText(), staff)) {
            loadDataNhanVien(staffService.getList());
            clearPanelNhanVien();
            JOptionPane.showMessageDialog(this, "Cập Nhật Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Cập Nhật Thất Bại");
        }
    }//GEN-LAST:event_btnSuaPanelNhanVienActionPerformed

    private void btnAnPanelNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnPanelNhanVienActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn muốn ẩn Nhân Viên này không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (staffService.hideOrShow(txtMaNhanVienPanelNhanVien.getText(), 0)) {
                loadDataNhanVien(staffService.getList());
                clearPanelNhanVien();
                JOptionPane.showMessageDialog(this, "Ẩn Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Ẩn Thất Bại");
            }
        } else {
            return;
        }
    }//GEN-LAST:event_btnAnPanelNhanVienActionPerformed

    private void btnXemNhanVienDaNghiPanelNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemNhanVienDaNghiPanelNVActionPerformed
        new XemNhanVienAn().setVisible(true);
    }//GEN-LAST:event_btnXemNhanVienDaNghiPanelNVActionPerformed

    private void tblNhanVienPanelNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienPanelNhanVienMouseClicked
        int row = tblNhanVienPanelNhanVien.getSelectedRow();
        if (row == -1) return;
        txtMaNhanVienPanelNhanVien.setText(tblNhanVienPanelNhanVien.getValueAt(row, 1).toString());
        txtHoPanelNhanVien.setText(staffService.getByLastName(tblNhanVienPanelNhanVien.getValueAt(row, 1).toString()));
        txtTenPanelNhanVien.setText(staffService.getByFisrtName(tblNhanVienPanelNhanVien.getValueAt(row, 1).toString()));
        txtNgaySinhNhanVienPanelNhanVien.setDate(Date.valueOf(tblNhanVienPanelNhanVien.getValueAt(row, 3).toString()));
        rdoNamPanelNhanVien.setSelected(tblNhanVienPanelNhanVien.getValueAt(row, 4).toString().equals("Nam"));
        rdoNuPanelNhanVien.setSelected(tblNhanVienPanelNhanVien.getValueAt(row, 4).toString().equals("Nữ"));
        txtSDTPanelNhanVien.setText(tblNhanVienPanelNhanVien.getValueAt(row, 5).toString());
        txtEmailPanelNhanVien.setText(tblNhanVienPanelNhanVien.getValueAt(row, 6).toString());
        txtDiaChiPanelNhanVien.setText(tblNhanVienPanelNhanVien.getValueAt(row, 7).toString());
        cbbChucVuPanelNhanVien.setSelectedItem(tblNhanVienPanelNhanVien.getValueAt(row, 8).toString());
        setIndexCbbCuaHangPanelNhanVien(tblNhanVienPanelNhanVien.getValueAt(row, 9).toString());
//        defaultComboBoxModel = (DefaultComboBoxModel) cbbCuaHangPanelNhanVien.getModel();
//        defaultComboBoxModel.setSelectedItem(staffService.getList().get(row).getTenCuaHang());
    }//GEN-LAST:event_tblNhanVienPanelNhanVienMouseClicked


    // Panel Khách Hàng

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        btnThongKe.setBackground(colorTrang);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorXanh);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelKhachHang);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnXoaFormPanelKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormPanelKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaFormPanelKhachHangActionPerformed

    private void btnThemPanelKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPanelKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemPanelKhachHangActionPerformed

    private void btnSuaPanelKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPanelKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaPanelKhachHangActionPerformed

    private void txtTimKiemKhachHangPanelKHCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemKhachHangPanelKHCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemKhachHangPanelKHCaretUpdate

    private void tblKhachHangPanelKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangPanelKhachHangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblKhachHangPanelKhachHangMouseClicked


    // Panel Cửa Hàng

    private void loadDataCuaHang(List<Store> list) {
        defaultTableModel = (DefaultTableModel) tblCuaHangPanelCuaHang.getModel();
        defaultTableModel.setRowCount(0);
        int count = 1;
        for (Store store : list) {
            defaultTableModel.addRow(new Object[]{count++, store.getCode(), store.getName(), store.getAddress(), store.getStatus() == 1 ? "Đang Hoạt Động" : "Dừng Hoạt Động"});
        }
    }

    private void clearPanelCuaHang() {
        txtMaCuaHangPanelCuaHang.setText("");
        txtTenCuaHangPanelCuaHang.setText("");
        txtDiaChiPanelCuaHang.setText("");
        cbbChuCuaHangPanelCuaHang.setSelectedIndex(0);
        cbbTrangThaiPanelCuaHang.setSelectedIndex(0);
    }

    private void addCbbNhanVienPanelCuaHang(List<Staff> list) {
        defaultComboBoxModel = (DefaultComboBoxModel) cbbChuCuaHangPanelCuaHang.getModel();
        for (Staff staff : list) {
            defaultComboBoxModel.addElement(staff);
        }
    }

    private String codeStoreTangDan() {
        String code = "";
        List<Store> list = storeService.getList();
        if (list.isEmpty()) {
            code = "CH0001";
        } else {
            int max = 0;
            for (Store store : list) {
                int so = Integer.parseInt(store.getCode().substring(2));
                if (so > max) {
                    max = so;
                }
            }
            max++;
            if (max < 10) {
                code = "CH000" + max;
            } else if (max < 100) {
                code = "CH00" + max;
            } else if (max < 1000) {
                code = "CH0" + max;
            } else {
                code = "CH" + max;
            }
        }
        return code;
    }

    private Store getPanelCuaHang() {
        String maCH = codeStoreTangDan();
        String tenCH = txtTenCuaHangPanelCuaHang.getText();
        String diaChi = txtDiaChiPanelCuaHang.getText();
        Staff staff = (Staff) cbbChuCuaHangPanelCuaHang.getSelectedItem();

        return new Store(maCH, tenCH, diaChi, staff, 1);
    }

    private void btnCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuaHangActionPerformed
        btnThongKe.setBackground(colorTrang);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorXanh);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelCuaHang);
        panelMain.repaint();
        panelMain.revalidate();
        loadDataCuaHang(storeService.getList());
        cbbChuCuaHangPanelCuaHang.removeAllItems();
        addCbbNhanVienPanelCuaHang(staffService.getListStaff());
    }//GEN-LAST:event_btnCuaHangActionPerformed

    private void btnXoaFormPanelCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormPanelCuaHangActionPerformed
//        JFileChooser fileChooser = new JFileChooser();
//        int returnValue = fileChooser.showOpenDialog(null);
//        if (returnValue == JFileChooser.APPROVE_OPTION) {
//            File selectedFile = fileChooser.getSelectedFile();
//
//            //in thu duong dan file
//            System.out.println("getPath : " + selectedFile.getPath());
//            System.out.println("getAbsolutePath : " + selectedFile.getAbsolutePath());
//            System.out.println("getName : " + selectedFile.getName());
//
//            System.out.println("getName : " + fileChooser.getCurrentDirectory().getPath());
//            String st = selectedFile.getPath();
//            System.out.print("lay duong dan: " + st);
//        }
        clearPanelCuaHang();
    }//GEN-LAST:event_btnXoaFormPanelCuaHangActionPerformed

    private void btnThemPanelCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPanelCuaHangActionPerformed
        Store store = getPanelCuaHang();
        if (store == null) return;
        if (storeService.insert(store)) {
            loadDataCuaHang(storeService.getList());
            clearPanelCuaHang();
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
        }
    }//GEN-LAST:event_btnThemPanelCuaHangActionPerformed

    private void btnSuaPanelCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPanelCuaHangActionPerformed
        if (txtMaCuaHangPanelCuaHang.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Chưa chọn cửa hàng nào trên table");
            return;
        }
        Store store = getPanelCuaHang();
        if (store == null) return;
        if (storeService.update(txtMaCuaHangPanelCuaHang.getText(), store)) {
            loadDataCuaHang(storeService.getList());
            clearPanelCuaHang();
            JOptionPane.showMessageDialog(this, "Cập Nhật Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Cập Nhật Thất Bại");
        }
    }//GEN-LAST:event_btnSuaPanelCuaHangActionPerformed

    private void btnChuyenTrangThaiPanelCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenTrangThaiPanelCuaHangActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn muốn đổi trạng thái Cửa Hàng này không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (staffService.hideOrShow(txtMaNhanVienPanelNhanVien.getText(), 0)) {
                loadDataNhanVien(staffService.getList());
                clearPanelNhanVien();
                JOptionPane.showMessageDialog(this, "Chuyển Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Chuyển Thất Bại");
            }
        } else {
            return;
        }
    }//GEN-LAST:event_btnChuyenTrangThaiPanelCuaHangActionPerformed

    private void tblCuaHangPanelCuaHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuaHangPanelCuaHangMouseClicked
        int row = tblCuaHangPanelCuaHang.getSelectedRow();
        txtMaCuaHangPanelCuaHang.setText(tblCuaHangPanelCuaHang.getValueAt(row, 1).toString());
        txtTenCuaHangPanelCuaHang.setText(tblCuaHangPanelCuaHang.getValueAt(row, 2).toString());
        txtDiaChiPanelCuaHang.setText(tblCuaHangPanelCuaHang.getValueAt(row, 3).toString());
        cbbChuCuaHangPanelCuaHang.setSelectedItem(tblCuaHangPanelCuaHang.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblCuaHangPanelCuaHangMouseClicked

    // Panel Đổi mật khẩu
    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        btnThongKe.setBackground(colorTrang);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorXanh);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelDoiMatKhau);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnLoadCaptchaPanelDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadCaptchaPanelDoiMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoadCaptchaPanelDoiMatKhauActionPerformed

    private void btnLuuPanelDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuPanelDoiMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuPanelDoiMatKhauActionPerformed

    private void btnThoatPanelDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatPanelDoiMatKhauActionPerformed
        btnThongKe.setBackground(colorXanh);
        btnSanPham.setBackground(colorTrang);
        btnHoaDon.setBackground(colorTrang);
        btnLichSu.setBackground(colorTrang);
        btnKhuyenMai.setBackground(colorTrang);
        btnNhanVien.setBackground(colorTrang);
        btnKhachHang.setBackground(colorTrang);
        btnCuaHang.setBackground(colorTrang);
        btnDoiMatKhau.setBackground(colorTrang);
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();
        panelMain.add(panelThongKe);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnThoatPanelDoiMatKhauActionPerformed

    // Panel Đăng xuất
    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed




    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new TrangChu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnPanelKhuyenMai;
    private javax.swing.JButton btnAnPanelNhanVien;
    private javax.swing.JButton btnAnPanelSanPhamCT;
    private javax.swing.JButton btnChuyenTrangThaiPanelCuaHang;
    private javax.swing.JButton btnCuaHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnKhuyenMai;
    private javax.swing.JButton btnLichSu;
    private javax.swing.JButton btnLoadCaptchaPanelDoiMatKhau;
    private javax.swing.JButton btnLuuPanelDoiMatKhau;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnSuaPanelCuaHang;
    private javax.swing.JButton btnSuaPanelKhachHang;
    private javax.swing.JButton btnSuaPanelKhuyenMai;
    private javax.swing.JButton btnSuaPanelNhanVien;
    private javax.swing.JButton btnSuaPanelSanPham;
    private javax.swing.JButton btnSuaPanelSanPhamCT;
    private javax.swing.JButton btnThemPanelCuaHang;
    private javax.swing.JButton btnThemPanelKhachHang;
    private javax.swing.JButton btnThemPanelKhuyenMai;
    private javax.swing.JButton btnThemPanelNhanVien;
    private javax.swing.JButton btnThemPanelSanPham;
    private javax.swing.JButton btnThemPanelSanPhamCT;
    private javax.swing.JButton btnThoatPanelDoiMatKhau;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnXemAnPanelSanPhamCT;
    private javax.swing.JButton btnXemKhuyenMaiPanelKhuyenMai;
    private javax.swing.JButton btnXemNhanVienDaNghiPanelNV;
    private javax.swing.JButton btnXoaFormPanelCuaHang;
    private javax.swing.JButton btnXoaFormPanelKhachHang;
    private javax.swing.JButton btnXoaFormPanelKhuyenMai;
    private javax.swing.JButton btnXoaFormPanelNhanVien;
    private javax.swing.JButton btnXoaFormPanelSanPhamCT;
    private javax.swing.JButton btnXoaPanelSanPham;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbbChatLieuPanelSanPham;
    private javax.swing.JComboBox<String> cbbChuCuaHangPanelCuaHang;
    private javax.swing.JComboBox<String> cbbChucVuPanelNhanVien;
    private javax.swing.JComboBox<String> cbbCuaHangPanelNhanVien;
    private javax.swing.JComboBox<String> cbbKichCoPanelSanPham;
    private javax.swing.JComboBox<String> cbbLoaiSPPanelSanPham;
    private javax.swing.JComboBox<String> cbbMauSac;
    private javax.swing.JComboBox<String> cbbTrangThaiPanelCuaHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel panelCuaHang;
    private javax.swing.JPanel panelDoiMatKhau;
    private javax.swing.JPanel panelHoaDon;
    private javax.swing.JPanel panelKhachHang;
    private javax.swing.JPanel panelKhuyenMai;
    private javax.swing.JPanel panelLichSu;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelNhanVien;
    private javax.swing.JPanel panelSanPham;
    private javax.swing.JPanel panelThongKe;
    private javax.swing.JRadioButton rdoChatLieuPanelSanPham;
    private javax.swing.JRadioButton rdoKichCoPanelSanPham;
    private javax.swing.JRadioButton rdoLoaiSanPhamPanelSanPham;
    private javax.swing.JRadioButton rdoMauSacPanelSanPham;
    private javax.swing.JRadioButton rdoNamPanelNhanVien;
    private javax.swing.JRadioButton rdoNuPanelNhanVien;
    private javax.swing.JSpinner spnPhanTramKhuyenMaiPanelKhuyenMai;
    private javax.swing.JSpinner spnSoLuongPanelSanPham;
    private javax.swing.JTable tblChiTietSanPhamPanelSanPham;
    private javax.swing.JTable tblCuaHangPanelCuaHang;
    private javax.swing.JTable tblHoaDonPanelLichSu2;
    private javax.swing.JTable tblKhachHangPanelKhachHang;
    private javax.swing.JTable tblKhuyenMaiPanelKhuyenMai;
    private javax.swing.JTable tblNhanVienPanelNhanVien;
    private javax.swing.JTable tblSanPhamPanelLichSu;
    private javax.swing.JTable tblThuocTinhPanelSanPham;
    private javax.swing.JTextField txtCaptchaPanelDoiMatKhau;
    private javax.swing.JTextArea txtDiaChiPanelCuaHang;
    private javax.swing.JTextArea txtDiaChiPanelNhanVien;
    private javax.swing.JTextField txtEmailPanelNhanVien;
    private javax.swing.JTextField txtEmailPanelNhanVien1;
    private javax.swing.JTextField txtGiaPanelSanPham;
    private javax.swing.JTextField txtHoPanelNhanVien;
    private javax.swing.JTextField txtHoPanelNhanVien1;
    private javax.swing.JTextField txtLoadCaptchaPanelDoiMatKhau;
    private javax.swing.JTextField txtMaCuaHangPanelCuaHang;
    private javax.swing.JTextField txtMaKhuyenMaiPanelKhuyenMai;
    private javax.swing.JTextField txtMaNhanVienPanelNhanVien;
    private javax.swing.JTextField txtMaNhanVienPanelNhanVien1;
    private javax.swing.JTextField txtMaSPPanelSanPham;
    private javax.swing.JTextField txtMaThuocTinhPanelSanPham;
    private javax.swing.JPasswordField txtMatKhauCuPanelDoiMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoiPanelDoiMatKhau;
    private javax.swing.JPasswordField txtMatKhauPanelNhanVien;
    private javax.swing.JTextArea txtMoTaPanelSanPham;
    private com.toedter.calendar.JDateChooser txtNgayBatDauPanelKhuyenMai;
    private com.toedter.calendar.JDateChooser txtNgayKetThucPanelKhuyenMai;
    private com.toedter.calendar.JDateChooser txtNgaySinhNhanVienPanelNhanVien;
    private javax.swing.JTextField txtSDTPanelNhanVien;
    private javax.swing.JTextField txtSDTPanelNhanVien1;
    private javax.swing.JTextField txtTaiKhoanPanelDoiMatKhau;
    private javax.swing.JTextField txtTenChuongTrinhPanelKhuyenMai;
    private javax.swing.JTextField txtTenCuaHangPanelCuaHang;
    private javax.swing.JTextField txtTenPanelNhanVien;
    private javax.swing.JTextField txtTenPanelNhanVien1;
    private javax.swing.JTextField txtTenSPPanelSanPham;
    private javax.swing.JTextField txtTenThuocTinhPanelSanPham;
    private javax.swing.JTextField txtTimKiemKhachHangPanelKH;
    private javax.swing.JTextField txtTimKiemSPPanelSanPham;
    private javax.swing.JPasswordField txtXBMatKhauPanelDoiMatKhau;
    // End of variables declaration//GEN-END:variables
}
