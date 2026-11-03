
package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindEmpByDeptIdAndLocation10 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT e FROM Dept d JOIN d.emps e WHERE d.deptno = ?1 AND d.loc = ?2");
        System.out.println("Enter Department ID:");
        q.setParameter(1, new Scanner(System.in).nextInt());
        System.out.println("Enter Department Location:");
        q.setParameter(2, new Scanner(System.in).next());

        List<Emp> employees = q.getResultList();

        if (employees.size() > 0) {
            for (Emp e : employees) {
                System.out.println(e);
            }
        } else {
            System.out.println(
                "No employees found for the given Department ID and Location"
            );
        }

       
    }
}
