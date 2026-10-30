package org.jsp.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNativeQuery("select  phone from Merchant");
		List<Object> m1=q.getResultList();
		if(m1.size()>0) {
			for (Object m : m1) {
				System.out.println(m);
				
			}
		}
		else
		{
			System.err.println("No Record Found");
		}
	}
}


