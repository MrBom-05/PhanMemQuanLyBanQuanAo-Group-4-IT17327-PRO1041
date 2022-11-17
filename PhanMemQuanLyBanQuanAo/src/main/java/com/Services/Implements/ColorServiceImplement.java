package com.Services.Implements;

import com.Models.Color;
import com.Repositories.ColorRepository;
import com.Services.ColorService;

import java.util.List;

public class ColorServiceImplement implements ColorService {
    private ColorRepository repository = new ColorRepository();

    @Override
    public List<Color> getList() {
        return repository.getList();
    }

   @Override
    public Boolean insert(Color color) {
        return repository.them(color);
    }

    @Override
    public Boolean update(Color color, String id) {
       return repository.sua(color, id);
    }
//
    @Override
    public Boolean delete(String id) {
        return repository.xoa(id);
    }

//    @Override
//    public List<String> check(String ma) {
//        return repository.check(ma);
//    }  
}
