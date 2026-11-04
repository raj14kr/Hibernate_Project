package org.jsp.onetomany_manytooneBi;



import java.util.Arrays;
import java.util.List;

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
		Merchant m1=new Merchant();
		m1.setName("PE");
		m1.setGst_num("PE12345");
		m1.setEmail("pe@gmail.com");
		m1.setPhone(8797654367l);
		m1.setPassword("pe@123");
		
		Merchant m2=new Merchant();
		m2.setName("Zudio");
		m2.setGst_num("zudio12345");
		m2.setEmail("zudio@gmail.com");
		m2.setPhone(9897654367l);
		m2.setPassword("zudio@123");
		
		Product p1=new Product();
		p1.setName("Jeans");
		p1.setBrand("zudio");
		p1.setCategory("Cargo");
		p1.setPrice(999.0);
		p1.setM(m2);
		
		Product p2=new Product();
		p2.setName("Belt");
		p2.setBrand("pe");
		p2.setCategory("Leather");
		p2.setPrice(2499.0);
		p2.setM(m1);
		
		
		Product p3=new Product();
		p3.setName("TokyoTalkies");
		p3.setBrand("zudio");
		p3.setCategory("Dresses");
		p3.setPrice(199.0);
		p3.setM(m2);
		
		
		Product p4=new Product();
		p4.setName("Watch");
		p4.setBrand("pe");
		p4.setCategory("Analog");
		p4.setPrice(1199.0);
		p4.setM(m1);
		
		Product p5=new Product();
		p5.setName("Kurti");
		p5.setBrand("zudio");
		p5.setCategory("Ethenic");
		p5.setPrice(599.0);
		p5.setM(m2);
		
		Product p6=new Product();
		p6.setName("T-Shirt");
		p6.setBrand("pe");
		p6.setCategory("polo");
		p6.setPrice(2199.0);
		p6.setM(m1);
		
		m1.setProds(Arrays.asList(p2,p4,p6));
		m2.setProds(Arrays.asList(p1,p3,p5));
		
		
		List<Merchant> ml=Arrays.asList(m1,m2);
		for(Merchant m:ml) {
			em.persist(m);
			
		}
		etran.commit();
	}
}
