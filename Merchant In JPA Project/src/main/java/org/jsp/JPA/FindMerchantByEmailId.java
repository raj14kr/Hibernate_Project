package org.jsp.JPA;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByEmailId {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
		EntityManager em=emf.createEntityManager();
//		Query q=em.createNamedQuery("findByName");
//		System.out.println("Enter name=");
//		q.setParameter(1, new Scanner(System.in).next());
//		
//		try {
//			Merchant m=(Merchant) q.getSingleResult();
//			System.out.println(m);
//		}
//		catch(NoResultException e) {
//			System.err.println("No Record Found");
//		}
		
		
		
		Query q1=em.createNamedQuery("findByEmail");
		System.out.println("Enter Email=");
		q1.setParameter(1, new Scanner(System.in).next());
		
		try {
			Merchant m1=(Merchant) q1.getSingleResult();
			System.out.println(m1);
		}
		catch(NoResultException e) {
			System.err.println("No Record Found");
		}
}
}
