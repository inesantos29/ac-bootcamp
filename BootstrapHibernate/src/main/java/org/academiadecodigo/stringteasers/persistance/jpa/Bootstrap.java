package org.academiadecodigo.stringteasers.persistance.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Bootstrap {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager em = emf.createEntityManager();

        System.out.println("Result: " + em.createNativeQuery("SELECT 1+1").getSingleResult());

        em.close();

        emf.close();
    }
}
