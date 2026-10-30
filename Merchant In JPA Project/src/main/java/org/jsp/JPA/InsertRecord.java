package org.jsp.JPA;



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
	Merchant m=new Merchant();
//	m.setName("Zudio");
//	m.setGst_num("ZUDIO234");
//	m.setEmail("Zudio@gmail.com");
//	m.setPhone(787612345);
//	m.setPassword("Zudio@123");
//	em.persist(m);
//	etran.commit();
	
	m.setName("PE");
	m.setGst_num("pe234");
	m.setEmail("Pe@gmail.com");
	m.setPhone(798612345);
	m.setPassword("pe@123");
	em.persist(m);
	etran.commit();
	
}
}
