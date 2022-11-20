package com.Services;

import com.CustomModels.StoreCustomModel;
import com.Models.Store;

import java.util.List;

public interface StoreService {

    public List<StoreCustomModel> getListCustom();

    public boolean insert(Store st);

    public boolean sua(String ma, Store st);

    public List<Store> getList();
}
