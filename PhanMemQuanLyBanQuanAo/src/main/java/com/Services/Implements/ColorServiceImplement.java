package com.Services.Implements;

import com.Models.Color;
import com.Repositories.ColorRepository;
import com.Services.ColorService;

import java.util.List;

public class ColorServiceImplement implements ColorService {
    private ColorRepository colorRepository = new ColorRepository();

    @Override
    public List<Color> getList() {
        return colorRepository.getList();
    }

    @Override
    public boolean insert(Color color) {
        return colorRepository.insert(color);
    }

    @Override
    public boolean update(Color color, String id) {
        return colorRepository.update(color, id);
    }

    @Override
    public boolean delete(String id) {
        return colorRepository.delete(id);
    }

//    @Override
//    public List<String> check(String ma) {
//        return repository.check(ma);
//    }
}
