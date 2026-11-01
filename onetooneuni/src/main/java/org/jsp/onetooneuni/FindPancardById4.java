package org.jsp.onetooneuni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

	public class FindPancardById4 {
	    public static void main(String[] args) {

	        EntityManagerFactory emf =
	                Persistence.createEntityManagerFactory("A17");

	        EntityManager em = emf.createEntityManager();

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Pancard Id = ");

	        Pancard card = em.find(Pancard.class, sc.nextInt());

	        if (card != null) {
	            System.out.println(card);
	        } else {
	            System.out.println("Pancard not found");
	        }
}
}