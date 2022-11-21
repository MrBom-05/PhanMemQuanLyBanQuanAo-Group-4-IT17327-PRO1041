package com.Repositories;

import com.CustomModels.ProductDetailCustomModel;
import com.Utilities.HibernateUtil;
import org.hibernate.Session;

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


}
