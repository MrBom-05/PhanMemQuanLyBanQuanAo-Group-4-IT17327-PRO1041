package com.Services;

import com.CustomModels.ProductDetailCustomModel;
import com.Models.ProductDetails;

import java.util.List;

public interface ProductDetailService {
    public List<ProductDetailCustomModel> getListProductDetal();

    public List<ProductDetailCustomModel> getListProductDetalHide();

    public boolean insert(ProductDetails productDetails);

    public boolean update(ProductDetails productDetails, String code);

    public boolean hideOrShow(String code, int status);


    public List<ProductDetails> getList();
}
