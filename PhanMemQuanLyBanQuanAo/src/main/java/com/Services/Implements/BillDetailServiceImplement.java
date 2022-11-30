package com.Services.Implements;

import com.CustomModels.BillDetailCustomModel;
import com.Models.BillDetails;
import com.Repositories.BillDetailRepository;
import com.Services.BillDetailService;

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
    public boolean checkProducts(String codeSp, String codeHd) {
        return billDetailRepository.checkProducts(codeSp, codeHd);
    }

    @Override
    public Integer getSoLuong(String codeSp, String codeHd) {
        return billDetailRepository.getSoLuong(codeSp, codeHd);
    }

    @Override
    public boolean update(String codeSp, String codeHd, int soLuong) {
        return billDetailRepository.update(codeSp,codeHd,soLuong);
    }
}
