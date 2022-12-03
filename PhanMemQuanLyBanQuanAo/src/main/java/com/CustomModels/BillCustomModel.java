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
public class BillCustomModel {

    private String maHD;
    private String tenKH;
    private String tenNV;
    private Date ngayTao;
    private int trangThai;

    public String trangThaiHD(int trangThai) {
        if (trangThai == 1) {
            return "Thành Công";
        } else if (trangThai == 2) {
            return "Đã hủy";
        } else if (trangThai == 3) {
            return "Đang giao hàng";
        } else if (trangThai == 0) {
            return "Chờ thanh toán";
        }
        return null;
    }
}
