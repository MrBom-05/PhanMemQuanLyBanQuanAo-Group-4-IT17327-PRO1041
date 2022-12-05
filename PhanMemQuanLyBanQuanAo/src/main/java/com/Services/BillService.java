package com.Services;

import com.CustomModels.BillCustomModel;
import com.Models.Bill;

import java.sql.Date;
import java.util.List;

public interface BillService {

    public List<Bill> getList();

    public List<Bill> getList(String code);

    public List<BillCustomModel> getListBill();

    public List<BillCustomModel> getListBill(String code);

    public boolean insert(Bill bill);

    public boolean updateThanhToan(String code, int status, Date ngay);

    public boolean updateGiaoHang(String code, int status, Date ngayThanhToan);

    public boolean updateDaNhan(String code, int status, Date ngayThanhToan);

    public String getByID(String code);

    public List<Integer> getYear();

    public boolean checkStatus(String code);
}
