package com.Services.Implements;

import com.CustomModels.StoreCustomModel;
import com.Models.Store;
import com.Repositories.StoreRepository;
import com.Services.StoreService;
import java.util.ArrayList;
import java.util.List;

public class StoreServiceImplement implements StoreService {

    private StoreRepository storeRepository = new StoreRepository();

//    @Override
//    public List<StoreCustomModel> getListCustom() {
//        return storeRepository.getListCustom();
//    }

    @Override
    public boolean insert(Store store) {
        return storeRepository.insert(store);
    }

    @Override
    public boolean sua(String ma, Store store) {
        return storeRepository.update(ma, store);
    }

    @Override
    public List<Store> getList() {
        return storeRepository.getList();
    }


}
