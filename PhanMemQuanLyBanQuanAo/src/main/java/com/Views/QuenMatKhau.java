package com.Views;


public class QuenMatKhau extends javax.swing.JFrame {

    
    public QuenMatKhau() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLoadCaptchaPanelDoiMatKhau = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        btnLuuPanelDoiMatKhau = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        btnThoatPanelDoiMatKhau = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txtTaiKhoanPanelDoiMatKhau = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtMatKhauMoiPanelDoiMatKhau = new javax.swing.JPasswordField();
        txtXBMatKhauPanelDoiMatKhau = new javax.swing.JPasswordField();
        txtMatKhauCuPanelDoiMatKhau = new javax.swing.JPasswordField();
        txtCaptchaPanelDoiMatKhau = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtLoadCaptchaPanelDoiMatKhau = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(246, 248, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLoadCaptchaPanelDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        btnLoadCaptchaPanelDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadCaptchaPanelDoiMatKhauActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("Mật khẩu cũ");

        btnLuuPanelDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLuuPanelDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/luu.png"))); // NOI18N
        btnLuuPanelDoiMatKhau.setText("Lưu Thay Đổi");
        btnLuuPanelDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuPanelDoiMatKhauActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel44.setText("Mật Khẩu Mới");

        btnThoatPanelDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoatPanelDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangxuat.png"))); // NOI18N
        btnThoatPanelDoiMatKhau.setText("Thoát");
        btnThoatPanelDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatPanelDoiMatKhauActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setText("Xác Nhận Mật Khẩu");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel59.setText("Lưu ý: Mật khẩu ít nhất 8 ký tự");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setText("Mã Captcha");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel60.setText("Mật khẩu có ký tự viết hoa, các chữ cái từ a-z, số 0-9");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel61.setText("Và một số ký tự đặc biệt như \"@, !, #, *\"");

        txtCaptchaPanelDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setText("Quên Mật Khẩu");

        txtLoadCaptchaPanelDoiMatKhau.setEditable(false);
        txtLoadCaptchaPanelDoiMatKhau.setBackground(new java.awt.Color(0, 153, 0));
        txtLoadCaptchaPanelDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setText("Tài khoản");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnLuuPanelDoiMatKhau)
                        .addGap(130, 130, 130)
                        .addComponent(btnThoatPanelDoiMatKhau))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46)
                            .addComponent(jLabel44)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTaiKhoanPanelDoiMatKhau)
                                .addComponent(txtMatKhauMoiPanelDoiMatKhau)
                                .addComponent(txtMatKhauCuPanelDoiMatKhau)
                                .addComponent(txtXBMatKhauPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLoadCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnLoadCaptchaPanelDoiMatKhau)))
                            .addComponent(jLabel60)
                            .addComponent(jLabel59)
                            .addComponent(jLabel61))))
                .addGap(20, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addGap(19, 19, 19)
                .addComponent(jLabel59)
                .addGap(18, 18, 18)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel61)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtTaiKhoanPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtMatKhauCuPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtMatKhauMoiPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtXBMatKhauPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoadCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(txtCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLoadCaptchaPanelDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuuPanelDoiMatKhau)
                    .addComponent(btnThoatPanelDoiMatKhau))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadCaptchaPanelDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadCaptchaPanelDoiMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoadCaptchaPanelDoiMatKhauActionPerformed

    private void btnLuuPanelDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuPanelDoiMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuPanelDoiMatKhauActionPerformed

    private void btnThoatPanelDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatPanelDoiMatKhauActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnThoatPanelDoiMatKhauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadCaptchaPanelDoiMatKhau;
    private javax.swing.JButton btnLuuPanelDoiMatKhau;
    private javax.swing.JButton btnThoatPanelDoiMatKhau;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCaptchaPanelDoiMatKhau;
    private javax.swing.JTextField txtLoadCaptchaPanelDoiMatKhau;
    private javax.swing.JPasswordField txtMatKhauCuPanelDoiMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoiPanelDoiMatKhau;
    private javax.swing.JTextField txtTaiKhoanPanelDoiMatKhau;
    private javax.swing.JPasswordField txtXBMatKhauPanelDoiMatKhau;
    // End of variables declaration//GEN-END:variables
}
