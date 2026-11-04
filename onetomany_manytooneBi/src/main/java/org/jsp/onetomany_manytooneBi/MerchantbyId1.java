package org.jsp.onetomany_manytooneBi;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MerchantbyId1 {
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("A17");
		EntityManager em=emf.createEntityManager();

        System.out.println("Enter Merchant Id:");

        Merchant m= em.find(Merchant.class, new Scanner(System.in).nextInt());

        if (m != null) {
            System.out.println(m);         
        } else {
            System.out.println(" not found");
        }

      
    }
}
