package com.Repositories;

import com.Models.Staff;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;

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
}
