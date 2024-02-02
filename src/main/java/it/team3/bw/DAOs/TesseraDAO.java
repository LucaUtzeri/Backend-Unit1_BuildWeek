package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Tessera;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesseraDAO {
    private final EntityManager entityManager;

    public TesseraDAO() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("be-buildweek1");
        entityManager = emf.createEntityManager();
    }

    public Tessera getTesseraById(long id) {
        return entityManager.find(Tessera.class, id);
    }
}
