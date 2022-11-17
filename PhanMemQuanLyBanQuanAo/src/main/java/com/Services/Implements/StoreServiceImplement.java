package com.Services.Implements;

import com.Models.Store;
import com.Repositories.StoreRepository;
import com.Services.StoreService;
import java.util.ArrayList;
import java.util.List;

public class StoreServiceImplement implements StoreService {

    private StoreRepository lstRepo = new StoreRepository();

    @Override
    public boolean them(Store st) {
        return lstRepo.them(st);
    }

    @Override
    public boolean sua(String ma, Store st) {
        return lstRepo.sua(ma, st);
    }

    @Override
    public List<Store> getList() {
        return lstRepo.getList();
    }

    @Override
    public ArrayList<Store> timKiem(String ten) {
        return lstRepo.timKiem(ten);
    }

}
