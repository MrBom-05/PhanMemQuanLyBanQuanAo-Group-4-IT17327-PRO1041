package com.Repositories;

import com.Models.Size;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;


public class SizeRepository {
    
    public List<Size> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("from Size");
        List<Size> list = query.getResultList();
        return list;
    }

    public Boolean insert(Size size) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(size);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Size size, String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update Size set code =:Code, name =:Name where id = :Id");
            query.setParameter("Code", size.getCode());
            query.setParameter("Name", size.getName());
            query.setParameter("Id", id);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("delete from Size where  id = :Id");
            query.setParameter("Id", id);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
