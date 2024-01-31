package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Abbonamento;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.util.List;

public class AbbonamentoDAO {
    private final EntityManager em;

    public AbbonamentoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Abbonamento abbonamento) {
        EntityTransaction t = em.getTransaction();
        t.begin();

        em.persist(abbonamento);

        t.commit();

        System.out.println("Elemento salvato correttamente");

    }

    public Abbonamento ricercaAbbonamentoDaId(Long id) {
        return em.find(Abbonamento.class, id);
    }

    public List<Abbonamento> ricercaAbbonamentiPerData(LocalDate data) {
        return em.createQuery("SELECT p FROM Abbonamenti p WHERE p.dataEmissione =:dataemissione", Abbonamento.class)
                .setParameter("dataemissione", data).getResultList();
    }
}