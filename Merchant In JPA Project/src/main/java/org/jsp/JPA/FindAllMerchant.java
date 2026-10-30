package org.jsp.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllMerchant {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
	EntityManager em=emf.createEntityManager();
	Query q=em.createNativeQuery("select *from Merchant",Merchant.class);
	List<Merchant> m1=q.getResultList();
	if(m1.size()>0) {
		for (Merchant m : m1) {
			System.out.println(m);
			
		}
	}
	else
	{
		System.err.println("No Record Found");
	}
}
}
