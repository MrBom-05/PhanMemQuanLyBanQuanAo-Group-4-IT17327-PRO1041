package com.Services;

import com.CustomModels.ProductDetailCustomModel;
import com.Models.ProductDetails;

import java.util.List;

public interface ProductDetailService {
    public List<ProductDetailCustomModel> getListProductDetal();

    public List<ProductDetailCustomModel> getListProductDetalHide();

    public boolean insert(ProductDetails productDetails);

    public List<ProductDetails> getList();
}
