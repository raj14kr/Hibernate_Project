package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindUserById1 {
	 public static void main(String[] args) {

	        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

	        EntityManager em = emf.createEntityManager();


	        System.out.println("Enter User ID:");

	        User u = em.find(User.class, new Scanner(System.in).nextInt());

	        if (u != null) {
	            System.out.println(u);
	           
	        } else {
	            System.out.println("User not found");
	        }

	       
	    }
}
