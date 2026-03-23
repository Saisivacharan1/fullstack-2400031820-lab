package com.example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernate.entity.Product;
import com.example.hibernate.util.HibernateUtil;

public class InsertProducts {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(new Product("Laptop", "Electronics", 50000, 10));
        session.save(new Product("Mouse", "Electronics", 500, 40));
        session.save(new Product("Chair", "Furniture", 3000, 15));

        tx.commit();
        session.close();

        System.out.println("Products inserted successfully");
    }
}
