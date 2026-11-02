
package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

public class FindAadharByUserPhone11 {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        
        Query q = em.createQuery("SELECT a FROM Aadharcard a WHERE a.user.phone = ?1");
        System.out.println("Enter User Phone:");
        q.setParameter(1, new Scanner(System.in).nextLong());

        try {
            Aadharcard card = (Aadharcard) q.getSingleResult();

            System.out.println(card);

        } catch (NoResultException e) {
            System.out.println("Aadharcard not found");

        } 
    }
}
