package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class UtenteDAO {

    private final EntityManager em;
    public UtenteDAO(EntityManager em){this.em = em;}

    public void saveUtente(Utente utente){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(utente);
        transaction.commit();
        System.out.println(utente.getNomeUtente() + " salvato");
    }

    public Utente findUtenteByName(String nomeUtente){
        TypedQuery<Utente> query = em.createNamedQuery("SELECT u FROM utenti u WHERE u.nome_utente = :nome_utente", Utente.class);
        query.setParameter("nome_utente",nomeUtente);
        return query.getSingleResult();
    }

    public Utente findUtente(Long id){return em.find(Utente.class, id);}

    public void cancellaUtente(Long id){
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


