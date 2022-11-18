package com.CustomModels;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StaffCustomModel {
    private String maNv;
    private String ho;
    private String ten;
    private Date ngaySinh;
    private String gioiTinh;
    private String sdt;
    private String email;
    private String diaChi;
    private int chucVu;
    private String tenCuaHang;



    @Override
    public String toString() {
        return "StaffCustomModel{" +
                "maNv='" + maNv + '\'' +
                ", ho='" + ho + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", chucVu=" + chucVu +
                ", tenCuaHang='" + tenCuaHang + '\'' +
                '}';
    }
}
