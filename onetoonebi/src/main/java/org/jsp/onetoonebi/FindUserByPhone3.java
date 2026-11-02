
package org.jsp.onetoonebi;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.NoResultException;

public class FindUserByPhone3 {
    public static void main(String[] args) {

        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
     
        Query q = em.createQuery("SELECT u FROM User u WHERE u.phone = ?1");
        System.out.println("Enter User Phone:");
        q.setParameter(1, new Scanner(System.in).nextLong());

        try {
           User u = (User) q.getSingleResult();

            System.out.println(u);
            System.out.println(u.getCard());

        } catch (NoResultException e) {
            System.out.println("User not found");

        } 
    }
}
