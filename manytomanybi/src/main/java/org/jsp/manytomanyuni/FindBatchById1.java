package org.jsp.manytomanyuni;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBatchById1 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Batch ID:");
        int id = sc.nextInt();

        Batch b = em.find(Batch.class, id);

        if (b != null) {
            System.out.println(b);
           
        } else {
            System.out.println("Batch not found");
        }

    }
}

