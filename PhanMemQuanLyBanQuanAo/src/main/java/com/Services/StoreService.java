package com.Services;

import com.CustomModels.StoreCustomModel;
import com.Models.Store;

import java.util.List;

public interface StoreService {

    public boolean insert(Store st);

    public boolean sua(String ma, Store st);

    List<Store> search(String ten);

    public List<StoreCustomModel> getList();
}
