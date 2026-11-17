package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindBatchesByStudentPhoneAndName8 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Phone:");
        long phone = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        Query q = em.createQuery("SELECT b FROM Batch b JOIN b.students s WHERE s.phone = ?1 AND s.name = ?2");

        q.setParameter(1, phone);
        q.setParameter(2, name);

        List<Batch> list = q.getResultList();

        if (list.size() > 0) {
            for (Batch b : list) {
                System.out.println(b);
            }
        } else {
            System.out.println("Batch not found");
        }
    }
}