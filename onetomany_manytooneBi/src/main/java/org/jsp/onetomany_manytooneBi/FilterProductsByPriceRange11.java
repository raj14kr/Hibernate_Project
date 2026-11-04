package org.jsp.onetomany_manytooneBi;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FilterProductsByPriceRange11 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Minimum Price:");
        double min = sc.nextDouble();

        System.out.println("Enter Maximum Price:");
        double max = sc.nextDouble();

        Query q = em.createQuery("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2" );

        q.setParameter(1, min);
        q.setParameter(2, max);

        List<Product> list = q.getResultList();

        if (list.size() > 0) {
            for (Product p : list) {
                System.out.println(p);
            }
        } else {
            System.out.println("No products found in this price range");
        }

    }
}