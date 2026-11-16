package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindBatchBySubject2 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subject:");
        String subject = sc.nextLine();

        Query q = em.createQuery("SELECT b FROM Batch b WHERE b.subject = ?1");

        q.setParameter(1, subject);

        List<Batch> list = q.getResultList();

        if (list.size() > 0) {
            for (Batch b : list) {
                System.out.println(b);
            }
        } else {
            System.out.println("Subject not found");
        }

    }
}