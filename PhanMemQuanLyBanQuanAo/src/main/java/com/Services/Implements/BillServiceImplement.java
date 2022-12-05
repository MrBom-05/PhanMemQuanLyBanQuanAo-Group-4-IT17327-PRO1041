package com.Services.Implements;

import com.CustomModels.BillCustomModel;
import com.Models.Bill;
import com.Repositories.BillRepository;
import com.Services.BillService;

import java.sql.Date;
import java.util.List;

public class BillServiceImplement implements BillService {

    private BillRepository billRepository = new BillRepository();

    @Override
    public List<Bill> getList() {
        return billRepository.getList();
    }

    @Override
    public List<Bill> getList(String code) {
        return billRepository.getList(code);
    }

    @Override
    public List<BillCustomModel> getListBill() {
        return billRepository.getListBill();
    }

    @Override
    public List<BillCustomModel> getListBill(String code) {
        return billRepository.getListBill(code);
    }

    @Override
    public boolean insert(Bill bill) {
        return billRepository.insert(bill);
    }

    @Override
    public boolean updateThanhToan(String code, int status, Date ngay) {
        return billRepository.update(code, status, ngay, billRepository.ngayThanhToan);
    }

    @Override
    public boolean updateGiaoHang(String code, int status, Date ngayThanhToan) {
        return billRepository.update(code, status, ngayThanhToan, billRepository.ngayVanChuyen);
    }

    @Override
    public boolean updateDaNhan(String code, int status, Date ngayThanhToan) {
        return billRepository.update(code, status, ngayThanhToan, billRepository.ngayNhan);
    }


    @Override
    public String getByID(String code) {
        return billRepository.getByID(code);
    }


    @Override
    public List<Integer> getYear() {
        return billRepository.getYear();
    }

    @Override
    public boolean checkStatus(String code) {
        int check = billRepository.checkStatus(code);
        if (check != 1){
            return false;
        }
        return true;
    }
}
