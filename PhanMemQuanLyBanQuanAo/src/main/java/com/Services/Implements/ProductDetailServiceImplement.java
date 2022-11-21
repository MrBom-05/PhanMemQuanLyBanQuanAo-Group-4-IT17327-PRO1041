package com.Services.Implements;

import com.CustomModels.ProductDetailCustomModel;
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
}
