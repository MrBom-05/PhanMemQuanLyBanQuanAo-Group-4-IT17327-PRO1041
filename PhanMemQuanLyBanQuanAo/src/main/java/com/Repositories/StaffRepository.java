package com.Repositories;

import com.CustomModels.StaffCustomModel;
import com.Models.Staff;
import com.Models.Store;
import com.Utilities.HibernateUtil;
import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StaffRepository {

    public List<StaffCustomModel> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(
                "select  new com.CustomModels.StaffCustomModel("
                + " s.code,s.lastName,s.firstName,s.dateOfBirth,s.sex,s.phoneNumber,s.email,s.address,s.role,s.store.name ) "
                + " from com.Models.Staff s where s.status = 1");
        List<StaffCustomModel> list = query.getResultList();
        return list;
    }
    public List<Store> getNameStore() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(
                "select s.name from Store s");
        List<Store> list = query.getResultList();
        return list;
    }
    public List<StaffCustomModel> getListStaffOff() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(
                "select  new com.CustomModels.StaffCustomModel("
                + " s.code,s.lastName,s.firstName,s.dateOfBirth,s.sex,s.phoneNumber,s.email,s.address,s.role,s.store.name ) "
                + " from com.Models.Staff s where s.status = 0");
        List<StaffCustomModel> list = query.getResultList();
        return list;
    }

    public boolean insert(Staff staff) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(staff);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(String code, Staff staff) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update Staff set  firstName =: fname , lastName =: lname"
                    + ", dateOfBirth =: ngaySinh, phoneNumber=:sdt, email=:email, address=:diaChi,"
                    + " role=:chucVu, store.id=:id"
                    + " where code =: code");
            query.setParameter("fname", staff.getFirstName());
            query.setParameter("lname", staff.getLastName());
            query.setParameter("ngaySinh", staff.getDateOfBirth());
            query.setParameter("sdt", staff.getPhoneNumber());
            query.setParameter("email", staff.getEmail());
            query.setParameter("diaChi", staff.getAddress());
            query.setParameter("chucVu", staff.getRole());
            query.setParameter("id", staff.getStore().getId());
            query.setParameter("code", code);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean hide(String code) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update Staff set  status = 0 "
                    + " where code =: code");
            query.setParameter("code", code);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



    public static void main(String[] args) {
        List<StaffCustomModel> list = new StaffRepository().getList();
        for (StaffCustomModel s : list) {
            System.out.println(s.toString());
        }
    }
}
