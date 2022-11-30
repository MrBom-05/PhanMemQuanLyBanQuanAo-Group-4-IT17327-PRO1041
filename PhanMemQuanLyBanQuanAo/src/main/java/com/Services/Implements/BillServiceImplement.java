package com.Services.Implements;

import com.CustomModels.BillCustomModel;
import com.Models.Bill;
import com.Models.Color;
import com.Repositories.BillRepository;
import com.Repositories.ColorRepository;
import com.Services.BillService;
import com.Services.ColorService;

import java.util.List;

public class BillServiceImplement implements BillService {
    private BillRepository billRepository = new BillRepository();
    @Override
    public List<Bill> getList() {
        return billRepository.getList();
    }

    @Override
    public List<BillCustomModel> getListBill() {
        return billRepository.getListBill();
    }

    @Override
    public boolean insert(Bill bill) {
        return billRepository.insert(bill);
    }

    @Override
    public boolean update(String code, int status) {
        return billRepository.update(code, status);
    }
}


