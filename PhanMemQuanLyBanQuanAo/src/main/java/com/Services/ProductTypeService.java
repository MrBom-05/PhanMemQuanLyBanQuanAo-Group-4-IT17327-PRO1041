/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Services;

import com.Models.ProductType;
import java.util.List;

/**
 *
 * @author khanhnd
 */
public interface ProductTypeService {
    public List<ProductType> getList();

    public boolean insert(ProductType productType);

    public boolean update(ProductType productType, String code);

    public boolean delete(String code);
}
