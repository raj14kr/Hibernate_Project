
package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.NoResultException;


public class FindAadharById7 {

    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

       
        Query q = em.createQuery("SELECT a FROM Aadharcard a WHERE a.id = ?1");
        System.out.println("Enter Aadhar ID:");
        q.setParameter(1, new Scanner(System.in).nextInt());


        try {
           Aadharcard card = (Aadharcard) q.getSingleResult();

            System.out.println(card);
            System.out.println(card.getUser());

        } catch (NoResultException e) {
            System.out.println("Aadharcard not found");

        } 
        }
    }
