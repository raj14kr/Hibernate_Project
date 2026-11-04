package org.jsp.onetomany_manytooneBi;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindProductsByMerchantPhoneAndPassword13 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Merchant Phone:");
        long phone = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter Merchant Password:");
        String password = sc.nextLine();

        Query q = em.createQuery("SELECT p FROM Product p WHERE p.m.phone = ?1 AND p.m.password = ?2");

        q.setParameter(1, phone);
        q.setParameter(2, password);

        List<Product> list = q.getResultList();

        if (list.size() > 0) {
            for (Product p : list) {
                System.out.println(p);
            }
        } else {
            System.out.println("No products found for this merchant");
        }

    }
}