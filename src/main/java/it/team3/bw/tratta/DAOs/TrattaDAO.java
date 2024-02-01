package it.team3.bw.tratta.DAOs;

import it.team3.bw.tratta.Tratta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TrattaDAO {
    private final EntityManager entityManager;

    public TrattaDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("be-buildweek1");
        entityManager = emf.createEntityManager();
    }

    public void closeEntityManager(){
        entityManager.close();
    }

    public void addTratta(Tratta tratta){
        entityManager.getTransaction().begin();
        entityManager.persist(tratta);
        entityManager.getTransaction().commit();
    }

    public Tratta getTrattaById(long id){
        return entityManager.find(Tratta.class, id);
    }

    public void aggiornaTratta(Tratta tratta){
        entityManager.getTransaction().begin();
        entityManager.merge(tratta);
        entityManager.getTransaction().commit();
    }


}
