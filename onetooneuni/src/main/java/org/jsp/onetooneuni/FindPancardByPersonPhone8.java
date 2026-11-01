
package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByPersonPhone8 {

    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT p.card FROM Person p WHERE p.phone = ?1",Pancard.class);
        System.out.println("Enter Pancard By Person Phone Number=");
        q.setParameter(1, new Scanner(System.in).nextLong());

        try {

            Pancard card = (Pancard) q.getSingleResult();
                System.out.println(card);
            
               } catch (NoResultException e) {
            System.out.println("Person or Pancard Not Found");

        } 
    }
}
