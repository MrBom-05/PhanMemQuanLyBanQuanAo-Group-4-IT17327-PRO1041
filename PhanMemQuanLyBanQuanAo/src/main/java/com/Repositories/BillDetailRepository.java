package com.Repositories;

import com.CustomModels.BillCustomModel;
import com.CustomModels.BillDetailCustomModel;
import com.Models.Bill;
import com.Models.BillDetails;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class BillDetailRepository {

    public boolean insert(BillDetails billDetails) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(billDetails);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(String codeSP, String codeHD, int soLuong) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update BillDetails set amount =:soLuong where productDetails.code =: codeSP and bill.code =: codeHD");
            query.setParameter("codeSP", codeSP);
            query.setParameter("codeHD", codeHD);
            query.setParameter("soLuong", soLuong);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<BillDetailCustomModel> getListBill(String code) {
        String select = "select new com.CustomModels.BillDetailCustomModel(b.productDetails.code, b.productDetails.name, b.amount, b.productDetails.exportPrice, b.amount * b.productDetails.exportPrice) from com.Models.BillDetails b where b.bill.code =: code";
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(select);
        query.setParameter("code", code);
        List<BillDetailCustomModel> list = query.getResultList();
        return list;
    }

    public boolean checkProducts(String codeSP, String codeHD) {
        String select = "from BillDetails where productDetails.code =: codeSP and bill.code =: codeHP";
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(select);
        query.setParameter("codeSP", codeSP);
        query.setParameter("codeHD", codeHD);
        List<BillDetails> list = query.getResultList();
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }

    public Integer getSoLuong(String codeSP, String codeHD) {
        Integer id;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            TypedQuery<Integer> query = session.createQuery("select amount from BillDetails where productDetails.code =: codeSP and bill.code =: codeHD", Integer.class);
            query.setParameter("codeSP", codeSP);
            query.setParameter("codeHD", codeHD);
            id = query.getSingleResult();
        }
        return id;
    }

}
