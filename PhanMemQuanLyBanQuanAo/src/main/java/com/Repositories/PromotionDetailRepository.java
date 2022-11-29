package com.Repositories;

import com.Models.ProductDetails;
import com.Models.PromotionDetails;
import com.Models.Staff;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class PromotionDetailRepository {

    public boolean checkBoxSanPham(String codeSP, String codeKM) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("from PromotionDetails where productDetails.code =: codeSP and promotion.code =: codeKM");
        query.setParameter("codeSP", codeSP);
        query.setParameter("codeKM", codeKM);
        List<Staff> list = query.getResultList();
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean insert(PromotionDetails promotionDetails) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(promotionDetails);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String code) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("delete PromotionDetails where productDetails.code =: Code");
            query.setParameter("Code", code);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
