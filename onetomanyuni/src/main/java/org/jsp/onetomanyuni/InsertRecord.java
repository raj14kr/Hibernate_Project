package org.jsp.onetomanyuni;

import java.util.ArrayList;
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
		
		Dept d1=new Dept();
		d1.setDname("HR");
		d1.setLoc("BTM");
		
		Dept d2=new Dept();
		d2.setDname("Accounts");
		d2.setLoc("HSR");
		
		Emp e1=new Emp();
		e1.setEname("A");
		e1.setSal(15000);
		e1.setHiredate("11-12-25");
		
		Emp e2=new Emp();
		e2.setEname("B");
		e2.setSal(17000);
		e2.setHiredate("11-12-25");
		
		Emp e3=new Emp();
		e3.setEname("C");
		e3.setSal(19000);
		e3.setHiredate("08-07-25");
		
		
		Emp e4=new Emp();
		e4.setEname("D");
		e4.setSal(21000);
		e4.setHiredate("06-05-25");
		
		
		Emp e5=new Emp();
		e5.setEname("E");
		e5.setSal(23000);
		e5.setHiredate("07-03-25");
		
//		
//		List<Emp> el1=Arrays.asList(e1,e3,e5);
//		List<Emp> el2=Arrays.asList(e2,e4);
		
		List<Emp> el1=new ArrayList<Emp>();
		el1.add(e1);
		el1.add(e3);
		el1.add(e5);
		
		
		List<Emp> el2=new ArrayList<Emp>();
		el2.add(e2);
		el2.add(e4);
		
		d1.setEmps(el1);
		d2.setEmps(el2);
		
		List<Dept> dl1=Arrays.asList(d1,d2);
		for (Dept dept : dl1) {
			em.persist(dept);
			
		}
		etran.commit();
		
		
}}
