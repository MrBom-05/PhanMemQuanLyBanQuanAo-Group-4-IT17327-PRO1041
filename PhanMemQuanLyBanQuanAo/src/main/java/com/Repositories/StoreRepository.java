package com.Repositories;

import com.Models.Store;
import com.Utilities.HibernateUtil;
import java.util.List;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StoreRepository {

    public List<Store> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("from Store");
        List<Store> list = query.getResultList();
        return list;
    }

    public boolean insert(Store store) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(store);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // Đây là code của Trung nhé :D
    public boolean update(String ma, Store store) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update Store set code =: code, name =: name , diaChi =: diachi, status =: status where code =: code");
            query.setParameter("code", store.getCode());
            query.setParameter("name", store.getName());
            query.setParameter("diachi", store.getDiaChi());
            query.setParameter("status", store.getStatus());
            query.setParameter("code", ma);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

//    public ArrayList<Store> timKiem(String ten) {
//        Session session = HibernateUtil.getFACTORY().openSession();
//        javax.persistence.Query query = session.createQuery(
//                "select code, name, diaChi, status from Store where code =: code ");
//        query.setParameter("code", ten);
//        ArrayList<Store> list = (ArrayList<Store>) query.getResultList();
//
//        return list;
//    }

    public List<String> check(String ma) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("select code from  Store  where code =: code");
        query.setParameter("code", ma);
        List<String> results = query.getResultList();
        return results;
    }
}

