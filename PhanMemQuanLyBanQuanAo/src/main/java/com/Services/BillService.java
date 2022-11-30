package com.Services;

import com.CustomModels.BillCustomModel;
import com.Models.Bill;

import java.util.List;

public interface BillService {

    public List<Bill> getList();

    public List<BillCustomModel> getListBill();

    public boolean insert(Bill bill);

    public boolean update(String code, int status);

    public String getByID(String code);
}
