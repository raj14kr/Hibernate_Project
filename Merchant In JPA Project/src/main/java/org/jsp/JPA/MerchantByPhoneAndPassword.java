
package org.jsp.JPA;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MerchantByPhoneAndPassword {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Phone Number:");
        Long phone = sc.nextLong();

        System.out.println("Enter Password:");
        String password = sc.next();

        Query q = em.createQuery(
            "SELECT m FROM Merchant m WHERE m.phone = ?1 AND m.password = ?2"
        );

        q.setParameter(1, phone);
        q.setParameter(2, password);

        List<Merchant> m = q.getResultList();

        if (m!=null) {
            System.out.println("Login Successful!");

            for (Merchant m1 : m) {
                System.out.println(m1);
            }
        } else {
            System.out.println("Invalid Phone Number or Password");
        }

    }
}