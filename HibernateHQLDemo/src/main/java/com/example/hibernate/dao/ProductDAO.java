package com.example.hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.example.hibernate.entity.Product;
import com.example.hibernate.util.HibernateUtil;

public class ProductDAO {

    public List<Product> sortByPriceAsc() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Product> list = session
                .createQuery("FROM Product p ORDER BY p.price ASC", Product.class)
                .list();
        session.close();
        return list;
    }

    public List<Product> sortByQuantityDesc() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Product> list = session
                .createQuery("FROM Product p ORDER BY p.quantity DESC", Product.class)
                .list();
        session.close();
        return list;
    }

    public Long countProducts() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Long count = session
                .createQuery("SELECT COUNT(p) FROM Product p", Long.class)
                .uniqueResult();
        session.close();
        return count;
    }
}
