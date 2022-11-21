/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Services.Implements;

import com.Models.Promotion;
import com.Repositories.PromotionRepository;
import com.Repositories.StaffRepository;
import com.Services.PromotionService;

/**
 *
 * @author Dang Trung
 */
public class PromotionServiceImplement implements PromotionService{

    private PromotionRepository promotionRepository = new PromotionRepository();
    @Override
    public boolean insert(Promotion promotion) {
        return promotionRepository.insert(promotion);
    }

    @Override
    public boolean update(String code, Promotion promotion) {
        return promotionRepository.update(code, promotion);
    }

    @Override
    public boolean hideOrShow(String code, int status) {
        return promotionRepository.hideOrShow(code, status);
    }
}
