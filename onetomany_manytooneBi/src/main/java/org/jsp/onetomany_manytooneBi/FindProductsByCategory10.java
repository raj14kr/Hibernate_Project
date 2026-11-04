package org.jsp.onetomany_manytooneBi;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindProductsByCategory10 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Category:");
        String category = sc.nextLine();

        Query q = em.createQuery("SELECT p FROM Product p WHERE p.category = ?1");

        q.setParameter(1, category);

        List<Product> list = q.getResultList();

        if (list.size() > 0) {
            for (Product p : list) {
                System.out.println(p);
            }
        } else {
            System.out.println("Product not found");
        }

    }
}