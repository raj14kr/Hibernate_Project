
package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.NoResultException;

public class FindUserByAadharNumber5 {

    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT u FROM User u WHERE u.card.number = ?1");
        System.out.println("Enter Aadhar Number:");
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

