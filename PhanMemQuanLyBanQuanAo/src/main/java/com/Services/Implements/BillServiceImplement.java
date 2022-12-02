package com.Services.Implements;

import com.CustomModels.BillCustomModel;
import com.Models.Bill;
import com.Repositories.BillRepository;
import com.Services.BillService;

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

    @Override
    public String getByID(String code) {
        return billRepository.getByID(code);
    }

    @Override
    public List<String> getYear() {
        return billRepository.getYear();
    }
}
