package com.Services;

import com.CustomModels.BillDetailCustomModel;
import com.Models.BillDetails;

import java.util.List;

public interface BillDetailService {

    public boolean insert(BillDetails billDetails);

    public List<BillDetailCustomModel> getListBill(String code);

    public boolean checkProducts(String codeSP, String codeHD);

    public Integer getSoLuong(String codeSP, String codeHD);

    public boolean update(String codeSp, String codeHd, int soLuong);

}
