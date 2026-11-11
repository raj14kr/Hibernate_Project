package org.jsp.manytooneuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAnswerDataByQuestionedBy9 {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("A17");

        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Questioned By:");
        String questionedBy = sc.nextLine();

        Query q = em.createQuery("SELECT a FROM AnswerData a WHERE a.qd.questionedBy = ?1");

        q.setParameter(1, questionedBy);

        List<AnswerData> list = q.getResultList();

        if (list.size() > 0) {
            for (AnswerData ad : list) {
                System.out.println(ad);
            }
        } else {
            System.out.println("AnswerData not found");
        }

    }
}