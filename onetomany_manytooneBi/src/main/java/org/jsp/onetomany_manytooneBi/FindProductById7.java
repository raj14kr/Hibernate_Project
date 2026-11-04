package org.jsp.onetomany_manytooneBi;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindProductById7 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product ID:");
        int id = sc.nextInt();

        Product p = em.find(Product.class, id);

        if (p != null) {
            System.out.println(p);
            System.out.println(p.getM());
        } else {
            System.out.println("Product not found");
        }

    }
}