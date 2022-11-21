/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Services;

import com.Models.Promotion;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PromotionService {
    public List<Promotion> getList();

    public boolean insert(Promotion promotion);
//Hi
    public boolean update(String code, Promotion promotion);

    public boolean hideOrShow(String code, int status);
}
