package org.jsp.onetomanyuni;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEmpById4 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
         
        Emp e = em.find(Emp.class, new Scanner(System.in).nextInt());

        if (e != null) {
            System.out.println(e);
        } else {
            System.out.println("Employee not found");
        }

    }
}