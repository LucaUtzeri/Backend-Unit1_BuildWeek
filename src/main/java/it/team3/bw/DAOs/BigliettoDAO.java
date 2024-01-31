package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Biglietto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BigliettoDAO {
    private EntityManager entityManager;

    public BigliettoDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biglietto");
        entityManager = emf.createEntityManager();
    }

    public void closeEntityManager(){
        entityManager.close();
    }

    public void aggiungiBiglietto(Biglietto biglietto){
        
    }
}
