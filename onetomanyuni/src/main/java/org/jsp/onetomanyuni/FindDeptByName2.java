package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindDeptByName2 {
	public static void main(String[] args) {

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("SELECT d FROM Dept d WHERE d.dname = ?1");
		System.out.println("Enter Department Name:");
		q.setParameter(1, new Scanner(System.in).next());

		try {

			Dept d = (Dept) q.getSingleResult();

			System.out.println(d);

		} catch (NoResultException e) {
			System.out.println("Department not found");

		}


	}
}