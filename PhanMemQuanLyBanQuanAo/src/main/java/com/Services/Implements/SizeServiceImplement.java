package com.Services.Implements;

import com.Models.Size;
import com.Repositories.SizeRepository;
import com.Services.SizeService;

import java.util.List;


public class SizeServiceImplement implements SizeService {
    private SizeRepository repository = new SizeRepository();

    @Override
    public List<Size> getList() {
        return repository.getList();
    }

    @Override
    public boolean insert(Size size) {
        return repository.insert(size);
    }

    @Override
    public boolean update(Size size, String id) {
        return repository.update(size, id);
    }

    @Override
    public boolean delete(String id) {
        return repository.delete(id);
    }

//    @Override
//    public List<String> check(String ma) {
//        return repository.check(ma);
//    }

}
