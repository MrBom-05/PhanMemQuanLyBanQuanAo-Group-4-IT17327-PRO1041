package com.Repositories;

import com.CustomModels.BillCustomModel;
import com.Models.Bill;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.sql.Date;
import java.util.List;

public class BillRepository {

    public List<Bill> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("from Bill");
        List<Bill> list = query.getResultList();
        return list;

    }
    public List<Bill> getList(String code) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("from Bill where code = :code");
        query.setParameter("code", code);
        List<Bill> list = query.getResultList();
        return list;

    }

    public List<BillCustomModel> getListBill() {
        String select = "select new com.CustomModels.BillCustomModel(b.code, b.nameCustomer, concat(b.staff.lastName, ' ', b.staff.firstName), b.dateCreated, b.status) from com.Models.Bill b order by b.code desc";
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(select);
        List<BillCustomModel> list = query.getResultList();
        return list;
    }

    public List<BillCustomModel> getListBill(String code) {
        String select = "select new com.CustomModels.BillCustomModel(b.code, b.nameCustomer, concat(b.staff.lastName, ' ', b.staff.firstName), b.dateCreated, b.status) from com.Models.Bill b where b.code = :code order by b.code desc";
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(select);
        query.setParameter("code", code);
        List<BillCustomModel> list = query.getResultList();
        return list;
    }

    public boolean insert(Bill bill) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(bill);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String ngayThanhToan = "update Bill set status =: status, dateOfPayment =: ngay where code =: code";

    public String ngayVanChuyen = "update Bill set status =: status, deliveryDate =: ngay where code =: code";

    public String ngayNhan = "update Bill set status =: status, receivedDate =: ngay where code =: code";

    public boolean update(String code, int status, Date ngay, String select) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery(select);
            query.setParameter("ngay", ngay);
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

    public String getByID(String code) {
        String id;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            TypedQuery<String> query = session.createQuery("select id from Bill where code =: code", String.class);
            query.setParameter("code", code);
            id = query.getSingleResult();
        }
        return id;
    }
    public List<Integer> getYear() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("select distinct year(dateOfPayment) from Bill where dateOfPayment is not null");
        List<Integer> list = query.getResultList();
        return list;
    }
}
