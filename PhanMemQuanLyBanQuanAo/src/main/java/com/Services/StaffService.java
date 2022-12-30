package com.Services;

import com.CustomModels.StaffCustomModel;
import com.Models.Staff;
import java.util.List;

public interface StaffService {

    public boolean insert(Staff staff);

    public boolean update(String code, Staff staff);

    public boolean hideOrShow(String code, int status);

    public List<StaffCustomModel> getList();

    public List<StaffCustomModel> getListStaffOff();

    public String getByFisrtName(String code);

    public String getByLastName(String code);

    public List<Staff> getAccountStaff(String email, String password);

    public boolean checkAccountStaff(String email);

    public String getByPasswordEmail(String email);

    public String getByPasswordID(String id);

    public boolean checkAccountStaffQR(String code);

    public List<Staff> getAccountStaffQR(String code);

    public boolean updatePassword(String id, String password);

    public String getByID(String code);

    public List<Staff> getListByID(String id);

    public boolean updatePanelViewAccount(String code, Staff staff);

}
