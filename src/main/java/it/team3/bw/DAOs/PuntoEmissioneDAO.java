package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.PuntoEmissione;
import it.team3.bw.biglietto.enums.Tipologia;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PuntoEmissioneDAO {
    private EntityManager em;
    public PuntoEmissioneDAO(EntityManager em){this.em = em;}
    public PuntoEmissione findPeById(int id) {
        return em.find(PuntoEmissione.class, id);
    }

    public PuntoEmissione findPe(Tipologia tipologia){
        return em.find(PuntoEmissione.class,tipologia);
    }
    public void savePe(PuntoEmissione puntoEmissione){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(puntoEmissione);
        transaction.commit();
        System.out.println(puntoEmissione.getTipologia() + " salvato");
    }


}
