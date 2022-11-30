package com.Repositories;

import com.CustomModels.BillCustomModel;
import com.CustomModels.ProductDetailCustomModel;
import com.Models.Bill;
import com.Models.Color;
import com.Models.Staff;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class BillRepository {
    
    public List<Bill> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("from Bill order by id desc");
        List<Bill> list = query.getResultList();
        return list;

    }

    public List<BillCustomModel> getListBill() {
        String select = "select new com.CustomModels.BillCustomModel(b.code, b.nameCustomer, concat(b.staff.lastName, ' ', b.staff.firstName), b.dateCreated, b.status) from com.Models.Bill b ";
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(select);
        List<BillCustomModel> list = query.getResultList();
        return list;
    }

    public boolean insert(Bill bill) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(bill);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(String code, int status) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update Bill set status =: status where code =: code");
            query.setParameter("status", status);
            query.setParameter("code", code);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
