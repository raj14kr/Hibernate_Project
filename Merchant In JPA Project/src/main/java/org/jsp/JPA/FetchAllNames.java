
package org.jsp.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllNames {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery(
            "SELECT m.name FROM Merchant m"
        );

        List<String> n = q.getResultList();

        if (n!=null) {

            System.out.println("All Merchant Names:");

            for (String n1 : n) {
                System.out.println(n1);
            }

        } else {
            System.out.println("No Records Found");
        }

    }
}
