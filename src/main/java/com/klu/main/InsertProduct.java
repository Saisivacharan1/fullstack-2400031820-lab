package com.klu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klu.entity.Product;
import com.klu.util.HibernateUtil;

public class InsertProduct {

public static void main(String[] args) {

Session session = HibernateUtil.getSessionFactory().openSession();

Transaction tx = session.beginTransaction();

Product p1 = new Product("Laptop","Dell",80000,10);
Product p2 = new Product("Tab","Samsung",80000,30);

session.save(p1);
session.save(p2);

tx.commit();
session.close();

System.out.println("Products inserted");

}
}