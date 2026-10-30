package org.jsp.JPA;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadRecord {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
	EntityManager em=emf.createEntityManager();
	System.out.println("Please Provide the Primary Key=");
	Merchant m=em.find(Merchant.class, new Scanner(System.in).nextInt());
	if(m!=null)
	{
		System.out.println(m);
		
	}
	else
	{
		System.err.println("No Record found");
	}
}
}
