package org.jsp.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateUsingMerge {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
//		etran.begin();
//		Merchant m=new Merchant();
//		m.setId(2);
//		m.setEmail("peterEngland@gmail.com");
//		m.setPassword("peterEngland@123");
//		m.setGst_num("PETER1234");
//		em.merge(m);
//		etran.commit();
		
		
		
		etran.begin();
		Merchant m2=new Merchant();
		m2.setId(10);
		m2.setName("Levis");
		m2.setGst_num("LEVIS1234");
		m2.setEmail("levis@gmail.com");
		m2.setPhone(87654456);
		m2.setPassword("levis@123");
		em.merge(m2);
		etran.commit();
	}

}
