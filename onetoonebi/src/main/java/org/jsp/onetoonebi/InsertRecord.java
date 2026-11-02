package org.jsp.onetoonebi;

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

		User u=new User();
		u.setName("Rani");
		u.setPassword("rani@123");
		u.setPhone(98765438915l);

		Aadharcard card=new Aadharcard();
		card.setNumber(863698933445l);
		card.setAddress("New Madarasa");
		card.setDob("26-08-2002");
		card.setUser(u);

		u.setCard(card);

		em.persist(u);
		etran.commit();

	}
}