package org.jsp.onetoonebi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindUserByName2 {
	 public static void main(String[] args) {

	        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

	        EntityManager em = emf.createEntityManager();

	     Query q = em.createQuery("SELECT u FROM User u WHERE u.name = ?1");
	        System.out.println("Enter User Name:");

	        q.setParameter(1, new Scanner(System.in).nextLine());

	        List<User> u = q.getResultList();

	        if (!u.isEmpty()) {

	            for (User u1 : u) {
	                System.out.println(u1);
	            }

	        } else {
	            System.out.println("User not found");
	        }
}
}
