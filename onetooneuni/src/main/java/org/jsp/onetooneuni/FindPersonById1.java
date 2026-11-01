package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPersonById1 {
	public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
         System.out.println("Enter the Id=");
        Person p = em.find(Person.class, new Scanner(System.in).nextInt());

        if (p != null) {
            System.out.println(p);

        } else {
            System.out.println("Person not found");
        }

       
    }
}
