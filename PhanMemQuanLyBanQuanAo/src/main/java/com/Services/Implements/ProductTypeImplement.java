/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Services.Implements;


import com.Models.ProductType;
import com.Repositories.ProductTypeRepository;
import com.Services.ProductTypeService;
import java.util.List;

/**
 *
 * @author khanhnd
 */
public class ProductTypeImplement implements ProductTypeService{
    private ProductTypeRepository productTypeRepository = new ProductTypeRepository();
    @Override
    public List<ProductType> getList() {
       return productTypeRepository.getList();
    }

    @Override
    public boolean insert(ProductType productType) {
       return productTypeRepository.insert(productType);
    }

    @Override
    public boolean update(ProductType productType, String code) {
    return productTypeRepository.update(productType, code);
    }

    @Override
    public boolean delete(String code) {
        return productTypeRepository.delete(code);
    }
    
}
