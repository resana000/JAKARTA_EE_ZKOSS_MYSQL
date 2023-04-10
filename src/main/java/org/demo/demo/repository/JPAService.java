package org.demo.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAService {

    private static JPAService instance;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    private JPAService() {
        entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public static synchronized JPAService getInstance() {
        return instance == null ? instance = new JPAService() : instance;
    }
}