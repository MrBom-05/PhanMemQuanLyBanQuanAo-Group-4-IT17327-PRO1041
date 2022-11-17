package com.Services;

import com.Models.Store;
import java.util.ArrayList;
import java.util.List;

public interface StoreService {

    public boolean them(Store st);

    public boolean sua(String ma, Store st);
    
    ArrayList<Store> timKiem(String ten);

    public List<Store> getList();
}
