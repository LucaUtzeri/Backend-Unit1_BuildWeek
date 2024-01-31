package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Biglietto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class BigliettoDAO {
    private final EntityManager entityManager;

    public BigliettoDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biglietto");
        entityManager = emf.createEntityManager();
    }

    public void closeEntityManager(){
        entityManager.close();
    }

    public void aggiungiBiglietto(Biglietto biglietto){
        entityManager.getTransaction().begin();
        entityManager.persist(biglietto);
        entityManager.getTransaction().commit();
    }

    public Biglietto getBigliettoById(int id){
        return entityManager.find(Biglietto.class, id);
    }

    public List<Biglietto> getAllBiglietto(){
        TypedQuery<Biglietto> query = entityManager.createQuery("SELECT t FROM Ticket t", Biglietto.class);
        return query.getResultList();
    }
}
