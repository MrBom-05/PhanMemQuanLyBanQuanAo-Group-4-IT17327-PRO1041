/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Services;

import com.Models.Size;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface SizeService {
        public List<Size> getList();
    public Boolean insert(Size size);
//   public List<String> check(String ma);
    public Boolean update(Size size, String id);
    public Boolean delete(String id);
}
