/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Services.Implements;

import com.Models.Size;
import com.Repositories.SizeRepository;
import com.Services.SizeService;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class SizeServiceImplement implements SizeService{
    private SizeRepository repository = new SizeRepository();

    @Override
    public List<Size> getList() {
        return repository.getList();
    }

    @Override
    public Boolean insert(Size size) {
        return repository.them(size);
    }

    @Override
    public Boolean update(Size size, String id) {
        return repository.sua(size, id);
    }

    @Override
    public Boolean delete(String id) {
        return  repository.xoa(id);
    }
    //    @Override
//    public List<String> check(String ma) {
//        return repository.check(ma);
//    }  
    
}
