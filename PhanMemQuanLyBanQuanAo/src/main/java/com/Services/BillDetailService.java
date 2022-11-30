package com.Services;

import com.CustomModels.BillDetailCustomModel;
import com.Models.BillDetails;

import java.util.List;

public interface BillDetailService {
    public boolean insert(BillDetails billDetails);

    public List<BillDetailCustomModel> getListBill(String code);

    public boolean checkProducts(String codeSp, String codeHd);

    public Integer getSoLuong(String codeSp, String codeHd);

    public boolean update(String codeSp, String codeHd, int soLuong);

}
