package com.Services;

import com.CustomModels.ProductDetailCustomModel;

import java.util.List;

public interface ProductDetailService {
    public List<ProductDetailCustomModel> getListProductDetal();

    public List<ProductDetailCustomModel> getListProductDetalHide();
}