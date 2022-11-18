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
        return staffRepository.getList();
    }

    @Override
    public List<StaffCustomModel> getListStaffOff() {
         return staffRepository.getListStaffOff();
    }

    @Override
    public boolean hide(String code) {
        return staffRepository.hide(code);
    }

    @Override
    public List<Store> getNameStore() {
        return staffRepository.getNameStore();
    }


}
