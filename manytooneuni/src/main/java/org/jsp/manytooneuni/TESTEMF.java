package org.jsp.manytooneuni;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TESTEMF {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
		System.out.println("Loaded");
		System.out.println(emf);
	}
}
