package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByPersonId7 {
	public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
         
        
        Query query = em.createQuery(
                "SELECT p.card FROM Person p WHERE p.id = ?1");
        System.out.println("Enter Pancard By Person Id=");
        query.setParameter(1, new Scanner(System.in).nextInt());

        try {
        Pancard card = (Pancard) query.getSingleResult();

        System.out.println(card);

    } catch (NoResultException e) {
        System.out.println("Person or Pancard not found");

    } 
        
    }
}
