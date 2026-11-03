
package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindEmpByDeptId8 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Department ID:");
        int deptno = sc.nextInt();

        Query q = em.createQuery("SELECT e FROM Dept d JOIN d.emps e WHERE d.deptno = ?1");

        q.setParameter(1, deptno);

       List<Emp> employees = q.getResultList();

        if (employees.size() > 0) {
             for (Emp e : employees) {
                System.out.println(e);
            }
        } else {
            System.out.println("No employees in this department");
        }

      
    }
}
