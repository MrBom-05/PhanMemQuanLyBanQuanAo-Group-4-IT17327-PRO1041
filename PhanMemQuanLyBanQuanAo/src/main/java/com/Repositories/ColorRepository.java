package com.Repositories;

import com.Models.Color;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class ColorRepository {
    public List<Color> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("select c from Color c");
        List<Color> lst = query.getResultList();
        return lst;

    }
    public Boolean them(Color color) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
           transaction = session.beginTransaction();
           session.save(color);
           transaction.commit();
           return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean sua(Color color, String id) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
           transaction = session.beginTransaction();
            Query query = session.createQuery("update Color set code =:Code, name =:Name where id = :Id");
            query.setParameter("Code",color.getCode());
            query.setParameter("Name",color.getName());
            query.setParameter("Id",id);
            query.executeUpdate();
           transaction.commit();
           return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean xoa(String id) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
           transaction = session.beginTransaction();
            Query query = session.createQuery("delete from Color where  id = :Id");
            query.setParameter("Id", id);
            query.executeUpdate();
           transaction.commit();
           return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
  
//    public List<String> check(String ma) {
//        Session session = HibernateUtil.getFACTORY().openSession();
//        Query query = session.createQuery("select Code from  Color  where Code=:Code");
//        query.setParameter("Code",ma);
//        List<String> results = query.getResultList();
//        return results;
//    }
}
