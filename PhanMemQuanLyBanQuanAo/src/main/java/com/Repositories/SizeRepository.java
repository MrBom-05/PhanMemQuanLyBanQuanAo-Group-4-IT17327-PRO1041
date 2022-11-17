/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Repositories;

import com.Models.Size;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class SizeRepository {
    public List<Size> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("select s from Size s");
        List<Size> lst = query.getResultList();
        return lst;

    }
    public Boolean them(Size size) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
           transaction = session.beginTransaction();
           session.save(size);
           transaction.commit();
           return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean sua(Size size, String id) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()) {
           transaction = session.beginTransaction();
            Query query = session.createQuery("update Size set code =:Code, name =:Name where id = :Id");
            query.setParameter("Code",size.getCode());
            query.setParameter("Name",size.getName());
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
  
//    public List<String> check(String ma) {
//        Session session = HibernateUtil.getFACTORY().openSession();
//        Query query = session.createQuery("select Code from  Color  where Code=:Code");
//        query.setParameter("Code",ma);
//        List<String> results = query.getResultList();
//        return results;
//    }
}
