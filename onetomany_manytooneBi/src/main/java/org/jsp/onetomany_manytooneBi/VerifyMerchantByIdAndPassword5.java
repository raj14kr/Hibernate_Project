package org.jsp.onetomany_manytooneBi;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyMerchantByIdAndPassword5 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Merchant ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Password:");
        String password = sc.nextLine();

        Query q = em.createQuery("SELECT m FROM Merchant m WHERE m.id = ?1 AND m.password = ?2");

        q.setParameter(1, id);
        q.setParameter(2, password);

        try {
            Merchant m = (Merchant) q.getSingleResult();
            System.out.println("Merchant verified");
            System.out.println(m);
        } catch (NoResultException e) {
            System.out.println("Invalid ID or password");
        }

    }
}