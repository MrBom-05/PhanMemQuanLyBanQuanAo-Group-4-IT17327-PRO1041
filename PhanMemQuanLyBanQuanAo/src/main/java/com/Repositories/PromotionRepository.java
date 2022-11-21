/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Repositories;
import com.Models.Promotion;
import java.util.List;
import org.hibernate.Session;
import com.Utilities.HibernateUtil;
import javax.persistence.Query;
import org.hibernate.Transaction;

/**
 * @author Dang Trung
 */
public class PromotionRepository {

    public List<Promotion> getListPromotion() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("from Promotion ");
        List<Promotion> list = query.getResultList();
        return list;
    }

    public boolean insert(Promotion promotion) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(promotion);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(String code, Promotion promotion) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update Promotion set code =: code, name =: name"
                    + ", DecreaseNumber =: DecreaseNumber, startDay =: startDay, endDay =: endDay, status =: status where code =: code");
            query.setParameter("code", promotion.getCode());
            query.setParameter("name", promotion.getName());
            query.setParameter("DecreaseNumber", promotion.getDecreaseNumber());
            query.setParameter("startDay", promotion.getStartDay());
            query.setParameter("endDay", promotion.getEndDay());
            query.setParameter("status", promotion.getStatus());
            query.setParameter("code", code);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean hideOrShow(String code, int status) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update Promotion set status =: status where code =: code");
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
