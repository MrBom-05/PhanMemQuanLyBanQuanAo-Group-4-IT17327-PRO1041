package com.Services.Implements;

import com.CustomModels.StaffCustomModel;
import com.Models.Staff;
import com.Models.Store;
import com.Repositories.StaffRepository;
import com.Services.StaffService;

import java.util.List;

public class StaffServiceImplement implements StaffService {

    private StaffRepository staffRepository = new StaffRepository();

    @Override
    public boolean insert(Staff staff) {
        return staffRepository.insert(staff);
    }

    @Override
    public boolean update(String code, Staff staff) {
        return staffRepository.update(code, staff);
    }

    @Override
    public List<StaffCustomModel> getList() {
        return staffRepository.getList(1);
    }

    @Override
    public List<StaffCustomModel> getListStaffOff() {
        return staffRepository.getList(0);
    }

    @Override
    public String getByFisrtName(String code) {
        return staffRepository.getByName(code, staffRepository.getByFirstName);
    }

    @Override
    public String getByLastName(String code) {
        return staffRepository.getByName(code, staffRepository.getByLastName);
    }

    @Override
    public boolean hideOrShow(String code, int status) {
        return staffRepository.hideOrShow(code, status);
    }

    @Override
    public List<Store> getNameStore() {
        return staffRepository.getNameStore();
    }


}
