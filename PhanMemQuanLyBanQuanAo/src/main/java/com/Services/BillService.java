package com.Services;

import com.CustomModels.BillCustomModel;
import com.Models.Bill;

import java.sql.Date;
import java.util.List;

public interface BillService {

    public List<Bill> getList();

    public List<BillCustomModel> getListBill();

    public boolean insert(Bill bill);

    public boolean updateThanhToan(String code, int status, Date ngay);

    public boolean updateGiaoHang(String code, int status, Date ngayThanhToan);

    public boolean updateDaNhan(String code, int status, Date ngayThanhToan);

    public String getByID(String code);

    public List<Integer> getYear();
}
