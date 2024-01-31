package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.PuntoEmissione;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PuntoEmissioneDAO {
    private EntityManager entityManager;
    public PuntoEmissioneDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("puntoEmissione");
        EntityManager em = emf.createEntityManager();
    }

    public void closeEntityManager(){
       entityManager.close();
    }

    public void addPuntoEmissione(PuntoEmissione puntoEmissione){
        entityManager.getTransaction().begin();
        entityManager.persist(puntoEmissione);
        entityManager.getTransaction().commit();
    }

    public PuntoEmissione getPuntoEmissione(Long id){
        return entityManager.find(PuntoEmissione.class, id);
    }

    public List<PuntoEmissione>getAllPuntoEmissione() {
        return entityManager.createQuery("SELECT p FROM PuntoEmissione p", PuntoEmissione.class).getResultList();
    }

    public void updatePuntoEmissione(PuntoEmissione puntoEmissione) {
        entityManager.getTransaction().begin();
        entityManager.merge(puntoEmissione);
        entityManager.getTransaction().commit();
    }

    public boolean qtaBiglietti(PuntoEmissione puntoEmissione, int quantita){
        if (puntoEmissione.getBigliettiRimasti() >= quantita){
            puntoEmissione.setBigliettiRimasti(puntoEmissione.getBigliettiRimasti() - quantita);
            if(puntoEmissione.getBigliettiRimasti() == 0){
                puntoEmissione.setStato(false);
            }
            updatePuntoEmissione(puntoEmissione);
            return true;
        } else {
            return false;
        }
    }

}
