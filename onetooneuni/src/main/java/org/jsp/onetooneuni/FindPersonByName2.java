package org.jsp.onetooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByName2 {
	public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("select p from Person p where p.name = ?1",Person.class);
        System.out.println("Enter The Name=");
        query.setParameter(1, new Scanner(System.in).next());
        List<Person> list = query.getResultList();
        if (list!=null) {

            for (Person p : list) {
                System.out.println(p);
            }

        } else {
            System.out.println("Person Not Found");
        }
      
    }
}
