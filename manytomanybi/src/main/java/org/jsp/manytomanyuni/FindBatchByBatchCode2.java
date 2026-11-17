package org.jsp.manytomanyuni;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.NoResultException;

public class FindBatchByBatchCode2 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Batch Code:");
        String code = sc.nextLine();

        Query q = em.createQuery("SELECT b FROM Batch b WHERE b.batch_code = ?1");

        q.setParameter(1, code);

        try {
            Batch b = (Batch) q.getSingleResult();
            System.out.println(b);
        } catch (NoResultException e) {
            System.out.println("Batch not found");
        }

    }
}