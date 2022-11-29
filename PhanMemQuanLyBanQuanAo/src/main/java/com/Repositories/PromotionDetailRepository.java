package com.Repositories;

import com.Models.Staff;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class PromotionDetailRepository {
    public boolean checkBoxSanPham(String code) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("from PromotionDetails where productDetails.code =: code");
        query.setParameter("code", code);
        List<Staff> list = query.getResultList();
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }
}
