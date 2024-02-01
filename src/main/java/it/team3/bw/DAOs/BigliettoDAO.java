package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Biglietto;
import it.team3.bw.biglietto.classi.PuntoEmissione;

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

    public Biglietto getBigliettoById(Long id){
        return entityManager.find(Biglietto.class, id);
    }

    public List<Biglietto> getAllBiglietto(){
        TypedQuery<Biglietto> query = entityManager.createQuery("SELECT b FROM Biglietto b", Biglietto.class);
        return query.getResultList();
    }

    public List<Biglietto> getBigliettoByPuntoEmissione(PuntoEmissione puntoEmissione){
        TypedQuery<Biglietto> query = entityManager.createQuery("SELECT b FROM Biglietto b WHERE b.statoBiglietto = :statoBiglietto", Biglietto.class);
        query.setParameter("statoBiglietto", puntoEmissione);
        return null;
    }

    public List<Biglietto> getActiveBiglietto(){
        TypedQuery<Biglietto> query = entityManager.createQuery("SELECT b FROM Biglietto b WHERE b.statoBiglietto = :statoBiglietto", Biglietto.class);
        query.setParameter("statoBiglietto", Biglietto.class);
        return query.getResultList();
    }

    public void updateBiglietto(Biglietto biglietto){
        entityManager.getTransaction().begin();
        entityManager.merge(biglietto);
        entityManager.getTransaction().commit();
    }

    public void deleteBiglietto(Biglietto biglietto) {
        entityManager.getTransaction().begin();
        entityManager.remove(biglietto);
        entityManager.getTransaction().commit();
    }
}
