package org.jsp.onetooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPhone3 {
	public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT p FROM Person p WHERE p.phone = ?1",Person.class);
        System.out.println("Enter The Phone=");
        query.setParameter(1, new Scanner(System.in).nextLong());
        try {
        Person p = (Person) query.getSingleResult();

        System.out.println(p);

    } catch (NoResultException e) {
        System.out.println("Person Not Found");

    } 
      
    }
}
