/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Services;

import com.Models.Size;

import java.util.List;

/**
 * @author ASUS
 */
public interface SizeService {
    public List<Size> getList();

    public boolean insert(Size size);

//    public List<String> check(String ma);

    public boolean update(Size size, String id);

    public boolean delete(String id);
}
