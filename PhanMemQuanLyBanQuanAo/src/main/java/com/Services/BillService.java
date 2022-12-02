package com.Services;

import com.CustomModels.BillCustomModel;
import com.Models.Bill;

import java.sql.Date;
import java.util.List;

public interface BillService {

    public List<Bill> getList();

    public List<BillCustomModel> getListBill();

    public boolean insert(Bill bill);

    public boolean update(String code, int status, Date ngayThanhToan);

    public String getByID(String code);

    public List<Integer> getYear();
}
