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
    private String maHd;
    private String tenKh;
    private String tenNv;
    private Date ngayTao;
    private int trangThai;

    public String trangThaiHD(int trangThai) {
        if (trangThai == 1) {
            return "Đã thanh toán";
        } else if (trangThai == 2) {
            return "Đã hủy";
        } else if (trangThai == 3) {
            return "Đang giao hàng";
        } else if (trangThai == 4) {
            return "Giao hàng thành công";
        } else if (trangThai == 0) {
            return "Chờ thanh toán";
        }
        return null;
    }
}
