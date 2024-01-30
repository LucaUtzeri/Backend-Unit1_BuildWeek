package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UtenteDAO {

    private EntityManager em;
    public UtenteDAO(EntityManager em){this.em = em;}

    public void saveUtente(Utente utente){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(utente);
        transaction.commit();
        System.out.println(utente.getNomeUtente() + " salvato");
    }

    public Utente findUtente(int id){return em.find(Utente.class, id);}

    public void cancellaUtente(int id){
        Utente utente = this.findUtente(id);
        if (utente != null){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(id);
            transaction.commit();
            System.out.println("User Cancellato");
        }
    }
}


