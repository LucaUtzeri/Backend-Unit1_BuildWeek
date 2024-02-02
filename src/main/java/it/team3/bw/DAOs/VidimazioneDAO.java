package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Vidimazione;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class VidimazioneDAO {

    private EntityManager entityManager;

    public VidimazioneDAO(EntityManager em) {
        this.entityManager = em;
    }

    public void saveVidimazione(Vidimazione vidi) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(vidi);
        transaction.commit();
        System.out.println("Biglietto / Abbonamento " + vidi.getIdVidimazione() + " creato con successo!");
    }

    public Vidimazione findById(long id) {
        return entityManager.find(Vidimazione.class, id);

    }

    public void findAndDeleteById(long id) {

        Vidimazione vidi = this.findById(id);
        if (vidi != null) {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(vidi);
            transaction.commit();
            System.out.println("Eliminato con successo il biglietto / abbonamento con id  " + vidi.getIdVidimazione());
        } else {
            System.out.println("ID non trovato");
        }
    }
}
