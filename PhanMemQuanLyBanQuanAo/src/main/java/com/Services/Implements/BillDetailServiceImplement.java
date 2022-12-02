package com.Services.Implements;

import com.CustomModels.BillDetailCustomModel;
import com.CustomModels.BillDetailWithProductDetailCustomModel;
import com.Models.BillDetails;
import com.Repositories.BillDetailRepository;
import com.Services.BillDetailService;

import java.sql.Date;
import java.util.List;

public class BillDetailServiceImplement implements BillDetailService {

    private BillDetailRepository billDetailRepository = new BillDetailRepository();

    @Override
    public boolean insert(BillDetails billDetails) {
        return billDetailRepository.insert(billDetails);
    }

    @Override
    public List<BillDetailCustomModel> getListBill(String code) {
        return billDetailRepository.getListBill(code);
    }

    @Override
    public boolean checkProducts(String codeSP, String codeHD) {
        return billDetailRepository.checkProducts(codeSP, codeHD);
    }

    @Override
    public Integer getSoLuong(String codeSP, String codeHD) {
        return billDetailRepository.getSoLuong(codeSP, codeHD);
    }

    @Override
    public boolean update(String codeSp, String codeHd, int soLuong) {
        return billDetailRepository.update(codeSp, codeHd, soLuong);
    }

    @Override
    public Double sumDonGia(String codeHD) {
        return billDetailRepository.sumDonGia(codeHD);
    }

    @Override
    public List<BillDetailWithProductDetailCustomModel> getListThongKe(Date ngayBatDau, Date ngayKeThuc) {
        return billDetailRepository.getListThongKe(ngayBatDau, ngayKeThuc);
    }

    @Override
    public boolean delete(String idBill, String idProduct) {
        return billDetailRepository.delete(idBill, idProduct);
    }

    @Override
    public List<Double> sumDate(Date date) {
        return billDetailRepository.sumDate(date);
    }

    @Override
    public List<BillDetails> getList() {
        return billDetailRepository.getList();
    }
}
