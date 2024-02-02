package it.team3.bw.tratta.DAOs;

import it.team3.bw.tratta.Tratta;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TrattaDAO {
    private final EntityManager entityManager;

    public TrattaDAO(EntityManager em){
        this.entityManager = em;
    }

    public void saveTratta(Tratta tr){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(tr);
        transaction.commit();
        System.out.println("Tratta " + tr.getIdTratta() + " salvata");
    }

    public Tratta findTratta(Long id){return entityManager.find(Tratta.class, id);}

    public void cancellaTratta(Long id){
        Tratta tr = this.findTratta(id);
        if (tr != null){
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(id);
            transaction.commit();
            System.out.println("Tratta Cancellata");
        }
    }

}
