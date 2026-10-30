package org.jsp.JPA;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DeleteRecord {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
	EntityManager em=emf.createEntityManager();
	EntityTransaction etran=em.getTransaction();
	etran.begin();
	System.out.println("Enter Primary key=");
	Merchant m=em.find(Merchant.class,new Scanner(System.in).nextInt());
	if(m!=null) {
		em.remove(m);
		etran.commit();
	}
	else
	{
		System.err.println("No Record Found");
	}
}
}
