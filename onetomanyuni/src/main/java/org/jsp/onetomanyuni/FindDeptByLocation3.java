package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindDeptByLocation3 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT d FROM Dept d WHERE d.loc = ?1");
        System.out.println("Enter Department Location:");
        q.setParameter(1, new Scanner(System.in).next());

        List<Dept> depts = q.getResultList();

        if (!depts.isEmpty()) {
            for (Dept d : depts) {
                System.out.println(d);
                           }
        } else {
            System.out.println("Department not found");
        }

    }
}