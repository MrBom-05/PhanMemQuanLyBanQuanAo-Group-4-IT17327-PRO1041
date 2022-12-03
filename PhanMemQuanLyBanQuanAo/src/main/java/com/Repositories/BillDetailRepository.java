package com.Repositories;

import com.CustomModels.BillDetailCustomModel;
import com.CustomModels.BillDetailWithProductDetailCustomModel;
import com.Models.BillDetails;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.sql.Date;
import java.util.List;

public class BillDetailRepository {

    public boolean insert(BillDetails billDetails) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(billDetails);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String idBill, String idProduct) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("delete from BillDetails where bill.id =: idBill and productDetails.id =: idProduct");
            query.setParameter("idBill", idBill);
            query.setParameter("idProduct", idProduct);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(String codeSP, String codeHD, int soLuong) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update BillDetails set amount =:soLuong where productDetails.id =: codeSP and bill.id =: codeHD");
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
    public List<BillDetails> getList() {
        String select = "from BillDetails ";
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(select);
        List<BillDetails> list = query.getResultList();
        return list;
    }

    public boolean checkProducts(String codeSP, String codeHD) {
        String select = "from BillDetails where productDetails.code =: codeSP and bill.code =: codeHD";
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
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            TypedQuery<Integer> query = session.createQuery("select amount from BillDetails where productDetails.code =: codeSP and bill.code =: codeHD", Integer.class);
            query.setParameter("codeSP", codeSP);
            query.setParameter("codeHD", codeHD);
            id = query.getSingleResult();
        }
        return id;
    }

    public Double sumDonGia(String codeHD) {
        Double id;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            TypedQuery<Double> query = session.createQuery("select sum(amount * unitPrice) from BillDetails where bill.code =: codeHD", Double.class);
            query.setParameter("codeHD", codeHD);
            id = query.getSingleResult();
        }
        return id;
    }

    public List<BillDetailWithProductDetailCustomModel> getListThongKe(Date ngayBatDau, Date ngayKetThuc) {
        String select = "select new com.CustomModels.BillDetailWithProductDetailCustomModel(b.productDetails.code, b.productDetails.name, b.productDetails.productType.name, b.productDetails.size.name, b.productDetails.color.name, b.productDetails.substance.name, b.amount) from com.Models.BillDetails b where b.bill.dateOfPayment between " + ngayBatDau + " and " + ngayKetThuc;
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(select);
        List<BillDetailWithProductDetailCustomModel> list = query.getResultList();
        return list;
    }

    public List<Double> sumDate(Date date) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("select sum (b.amount * b.unitPrice) from BillDetails b where b.bill.dateOfPayment =: date");
        query.setParameter("date", date);
        List<Double> list = query.getResultList();
        return list;
    }

    public String sumMonth = "select sum (b.amount * b.unitPrice) from BillDetails b where month(b.bill.dateOfPayment) = ";

    public String sumYear = "select sum (b.amount * b.unitPrice) from BillDetails b where year(b.bill.dateOfPayment) = ";

    public List<Double> sum(int date, String select) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(select + date);
        List<Double> list = query.getResultList();
        return list;
    }
}
