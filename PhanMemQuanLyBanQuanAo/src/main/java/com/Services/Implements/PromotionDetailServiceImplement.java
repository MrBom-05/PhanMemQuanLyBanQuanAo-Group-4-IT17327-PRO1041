package com.Services.Implements;

import com.Repositories.PromotionDetailRepository;
import com.Services.PromotionDetailService;

public class PromotionDetailServiceImplement implements PromotionDetailService {

    private PromotionDetailRepository promotionDetailRepository = new PromotionDetailRepository();


    @Override
    public boolean checkBoxSanPham(String code) {
        return promotionDetailRepository.checkBoxSanPham(code);
    }
}
