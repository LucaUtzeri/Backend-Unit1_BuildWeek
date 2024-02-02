package it.team3.bw.DAOs;


import it.team3.bw.biglietto.classi.Biglietto;
import it.team3.bw.biglietto.classi.PuntoEmissione;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;


public class PuntoEmissioneDAO {
    private EntityManager entityManager;

    public PuntoEmissioneDAO(EntityManager em) {
        this.entityManager = em;
    }

    public PuntoEmissione getPEById(long id) {
        return entityManager.find(PuntoEmissione.class, id);
    }

    public void savePE(PuntoEmissione pe) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(pe);
        transaction.commit();
        System.out.println("Punto emissione " + pe.getIdPuntoEmissione() + " registrato con successo!");
    }

    public PuntoEmissione findById(long id) {
        return entityManager.find(PuntoEmissione.class, id);
    }

    public void findAndDeleteById(long id) {

        PuntoEmissione pe = this.findById(id);
        if (pe != null) {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(pe);
            transaction.commit();
            System.out.println("Eliminato con successo il punto emissione con id  " + findById(id));
        } else {
            System.out.println("ID non trovato");
        }
    }

    public List<PuntoEmissione> getAllPuntoEmissione() {
        return entityManager.createQuery("SELECT p FROM idPuntoEmissione p", PuntoEmissione.class).getResultList();
    }

//    public void updatePuntoEmissione(PuntoEmissione puntoEmissione) {
//        entityManager.getTransaction().begin();
//        entityManager.merge(puntoEmissione);
//        entityManager.getTransaction().commit();
//    }

//    public boolean qtaBiglietti(PuntoEmissione puntoEmissione, int quantita){
//        if (puntoEmissione.getBigliettiRimasti() >= quantita){
//            puntoEmissione.setBigliettiRimasti(puntoEmissione.getBigliettiRimasti() - quantita);
//            if(puntoEmissione.getBigliettiRimasti() == 0){
//                puntoEmissione.setStato(false);
//            }
//            updatePuntoEmissione(puntoEmissione);
//            return true;
//        } else {
//            return false;
//        }
//    }


    public List<Biglietto> trovaBigliettiPerData(LocalDate dataInizio, LocalDate dataFine) {
        TypedQuery<Biglietto> lista = entityManager.createQuery("SELECT b FROM Biglietto b WHERE b.dataEmissione BETWEEN :dataInizio AND :dataFine", Biglietto.class);
        lista.setParameter("dataInizio", dataInizio);
        lista.setParameter("dataFine", dataFine);
        return lista.getResultList();
    }


}
