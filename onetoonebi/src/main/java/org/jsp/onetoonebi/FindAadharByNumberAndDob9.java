
package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.NoResultException;


public class FindAadharByNumberAndDob9 {

    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT a FROM Aadharcard a WHERE a.number = ?1 AND a.dob = ?2");
        System.out.println("Enter Aadhar Number:");
        q.setParameter(1, new Scanner(System.in).nextLong());

        System.out.println("Enter Date of Birth :");
        q.setParameter(2, new Scanner(System.in).next());

        try {
            Aadharcard card = (Aadharcard) q.getSingleResult();

            System.out.println(card);
            System.out.println(card.getUser());

        } catch (NoResultException e) {
            System.out.println("Aadharcard not found");

    }
}
}
