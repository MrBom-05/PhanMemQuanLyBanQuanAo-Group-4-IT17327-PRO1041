package com.Services;

import com.Models.Promotion;

import java.util.List;

public interface PromotionService {
    public List<Promotion> getList();

    public boolean insert(Promotion promotion);

    public boolean update(String code, Promotion promotion);

    public boolean hideOrShow(String code, int status);
}
