package com.Services;

import com.CustomModels.StaffCustomModel;
import com.Models.Staff;
import com.Models.Store;

import java.util.List;

public interface StaffService {

    public boolean insert(Staff staff);

    public boolean update(String code, Staff staff);

    public boolean hideOrShow(String code, int status);

    public List<StaffCustomModel> getList();

    public List<Store> getNameStore();

    public List<StaffCustomModel> getListStaffOff();
}
