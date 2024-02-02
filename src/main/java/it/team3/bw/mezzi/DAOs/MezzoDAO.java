package it.team3.bw.mezzi.DAOs;

import it.team3.bw.mezzi.classi.Mezzo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class MezzoDAO {

    private EntityManager entityManager;
    public MezzoDAO(EntityManager em){
        this.entityManager = em;
    }

    public void saveMezzo(Mezzo mezzo){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(mezzo);
        transaction.commit();
        System.out.println(mezzo.getIdMezzo() + " salvato");
    }

//    public Mezzo findUtenteByName(Mezzo mezzo){
//        TypedQuery<Utente> query = entityManager.createNamedQuery("SELECT u FROM utenti u WHERE u.nomeUtente = :nome_utente", Utente.class);
//        query.setParameter("nome_utente",mezzo);
//        return query.getSingleResult();
//    }

    public Mezzo findMezzoById(Long id){return entityManager.find(Mezzo.class, id);}

    public void cancellaMezzo(Long id){
        Mezzo mezzo = this.findMezzoById(id);
        if (mezzo != null){
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(id);
            transaction.commit();
            System.out.println("Mezzo Cancellato");
        }
    }
    public List<Mezzo>getAllMezzo(){
        return entityManager.createQuery("SELECT m FROM mezzi m", Mezzo.class).getResultList();
    }

}
