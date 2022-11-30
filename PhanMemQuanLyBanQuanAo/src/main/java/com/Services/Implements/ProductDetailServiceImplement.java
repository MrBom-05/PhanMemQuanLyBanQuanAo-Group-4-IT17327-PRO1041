package com.Services.Implements;

import com.CustomModels.ProductDetailCustomModel;
import com.Models.ProductDetails;
import com.Repositories.ProductDetailPepository;
import com.Services.ProductDetailService;

import java.util.List;

public class ProductDetailServiceImplement implements ProductDetailService {

    private ProductDetailPepository productDetailPepository = new ProductDetailPepository();

    @Override
    public List<ProductDetailCustomModel> getListProductDetal() {
        return productDetailPepository.getListProductDetail(1);
    }

    @Override
    public List<ProductDetailCustomModel> getListProductDetalHide() {
        return productDetailPepository.getListProductDetail(0);
    }

    @Override
    public boolean insert(ProductDetails productDetails) {
        return productDetailPepository.insert(productDetails);
    }

    @Override
    public boolean update(ProductDetails productDetails, String code) {
        return productDetailPepository.update(productDetails, code);
    }

    @Override
    public boolean hideOrShow(String code, int status) {
        return productDetailPepository.hideOrShow(code, status);
    }

    @Override
    public List<ProductDetails> getList() {
        return productDetailPepository.getList();
    }

    @Override
    public String getByID(String code) {
        return productDetailPepository.getByID(code);
    }

    @Override
    public boolean updateSoLuong(String code, int soLuong) {
        return productDetailPepository.updateSoLuong(code, soLuong);
    }

    @Override
    public Float getByDonGia(String code) {
        return productDetailPepository.getByDonGia(code);
    }
}
