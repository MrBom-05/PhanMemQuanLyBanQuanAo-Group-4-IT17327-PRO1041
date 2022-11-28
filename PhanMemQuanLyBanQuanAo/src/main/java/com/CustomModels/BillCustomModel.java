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


}
