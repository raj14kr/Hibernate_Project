package org.jsp.onetooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPancardNumberAndDob {
	public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT p FROM Person p WHERE p.card.panNo = ?1 AND p.card.dob =?2",
                Person.class);
        System.out.println("Enter Person By Pancard Number=");
                q.setParameter(1, new Scanner(System.in).next());
                System.out.println("Enter Person By  DOB=");
                q.setParameter(2, new Scanner(System.in).next());
                try {
                Person p = (Person) q.getSingleResult();

                System.out.println(p);

            } catch (NoResultException e) {
                System.out.println("Person Not Found");

            }
	}
}
