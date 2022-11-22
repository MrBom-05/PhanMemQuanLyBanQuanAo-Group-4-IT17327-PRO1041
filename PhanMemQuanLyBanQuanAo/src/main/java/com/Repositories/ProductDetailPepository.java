package com.Repositories;

import com.CustomModels.ProductDetailCustomModel;
import com.Models.ProductDetails;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class ProductDetailPepository {

    public List<ProductDetailCustomModel> getListProductDetail(int status) {
        String select = "select new com.CustomModels.ProductDetailCustomModel(pd.code, pd.name, pd.productType.name," +
                "pd.size.name, pd.color.name, pd.substance.name, pd.exportPrice, pd.amount, pd.describe) from com.Models.ProductDetails pd where status = " + status;
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery(select);
        List<ProductDetailCustomModel> list = query.getResultList();
        return list;
    }

    public boolean insert(ProductDetails productDetails) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(productDetails);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<ProductDetails> getList() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("from ProductDetails");
        List<ProductDetails> list = query.getResultList();
        return list;
    }
}
