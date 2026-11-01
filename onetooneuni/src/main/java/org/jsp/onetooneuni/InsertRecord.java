package org.jsp.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
	EntityManager em=emf.createEntityManager();
	EntityTransaction etran=em.getTransaction();
	etran.begin();
	
//	Person p=new Person();
//	p.setName("Ayush");
//	p.setPhone(987632345);
//	
//	Pancard card=new Pancard();
//	card.setPanNo("SDRTG8765H");
//	card.setDob("11-11-1999");
//	
//	p.setCard(card);
	
	Person p=new Person();
	p.setName("Neha");
	p.setPhone(987662299);
	
	Pancard card=new Pancard();
	card.setPanNo("UVWXY9876Z");
	card.setDob("25-12-2002");
	
	p.setCard(card);
	
	em.persist(card);
	em.persist(p);
	etran.commit();
	
}
}
