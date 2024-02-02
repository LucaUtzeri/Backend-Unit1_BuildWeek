package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Tessera;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesseraDAO {
    private final EntityManager entityManager;

    public TesseraDAO(EntityManager em) {
        this.entityManager = em;
    }

    public Tessera getTesseraById(long id) {
        return entityManager.find(Tessera.class, id);
    }

    public void saveTessera(Tessera tessera) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(tessera);
        transaction.commit();
        System.out.println("Tessera " + tessera.getIdTessera() + " creata con successo!");
    }

    public Tessera findById(long id) {
        return entityManager.find(Tessera.class, id);
    }

    public void findAndDeleteById(long id) {

        Tessera tessera = this.findById(id);
        if (tessera != null) {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(tessera);
            transaction.commit();
            System.out.println("Tessera " + findById(id) + " eliminata con successo.");
        } else {
            System.out.println("ID non trovato");
        }
    }
}
