package it.team3.bw.mezzi.DAOs;

import it.team3.bw.mezzi.classi.Mezzo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class MezzoDAO {

    private EntityManager entityManager;
    public MezzoDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("be-buildweek1");
        EntityManager em =emf.createEntityManager();
    }

    public void addMezzo(String tipologia){
        entityManager.getTransaction().begin();
        entityManager.persist(tipologia);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Mezzo getMezzo(long id){
        return entityManager.find(Mezzo.class, id);
    }

    public List<Mezzo>getAllMezzo(){
        return entityManager.createQuery("SELECT m FROM mezzi m", Mezzo.class).getResultList();
    }

    public void updateMezzo(Mezzo mezzo){
        entityManager.getTransaction().begin();
        entityManager.merge(mezzo);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
