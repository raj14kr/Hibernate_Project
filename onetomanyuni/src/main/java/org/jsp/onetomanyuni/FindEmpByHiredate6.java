
package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindEmpByHiredate6 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hiredate:");
        String hiredate = sc.next();

        Query q = em.createQuery("SELECT e FROM Emp e WHERE e.hiredate = ?1");

        q.setParameter(1, hiredate);

        List<Emp> employees = q.getResultList();

        if (employees.size() > 0) {
            for (Emp e : employees) {
                System.out.println(e);
            }
        } else {
            System.out.println("Employee not found");
        }

       
    }
}
