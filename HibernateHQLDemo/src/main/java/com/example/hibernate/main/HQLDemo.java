package com.example.hibernate.main;

import com.example.hibernate.dao.ProductDAO;

public class HQLDemo {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        System.out.println("Total Products: " + dao.countProducts());

        dao.sortByPriceAsc().forEach(
            p -> System.out.println(p.getName() + " " + p.getPrice())
        );
    }
}
