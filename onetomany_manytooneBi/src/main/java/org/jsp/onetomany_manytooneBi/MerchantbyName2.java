package org.jsp.onetomany_manytooneBi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MerchantbyName2 {
	public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Merchant Name:");
        String name = sc.nextLine();

        Query q = em.createQuery("SELECT m FROM Merchant m WHERE m.name = ?1");

        q.setParameter(1, name);

        List<Merchant> list = q.getResultList();

        if (list.size() > 0) {
            for (Merchant m : list) {
                System.out.println(m);
            }
        } else {
            System.out.println("Merchant not found");
        }
	}
}
