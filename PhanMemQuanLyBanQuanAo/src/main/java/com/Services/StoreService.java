package com.Services;

import com.Models.Store;

import java.util.List;

public interface StoreService {

//    public List<StoreCustomModel> getListCustom();

    public boolean insert(Store st);

    public boolean update(String ma, Store st);

    public List<Store> getList();
    
    public boolean hideOrShow(String code, int status);
}
