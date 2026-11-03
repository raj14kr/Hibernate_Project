
package org.jsp.onetomanyuni;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DepartmentById1 {
    public static void main(String[] args) {

        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();


        System.out.println("Enter Department Number:");

        Dept d = em.find(Dept.class, new Scanner(System.in).nextInt());

        if (d != null) {
            System.out.println(d);         
        } else {
            System.out.println("Department not found");
        }

      
    }
}
