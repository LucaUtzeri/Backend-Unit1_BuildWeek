package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Documento;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DocumentoDAO {
    private final EntityManager entityManager;

    public DocumentoDAO(EntityManager em){
        this.entityManager = em;
    }

    public Documento getDocumentoById(long id){
        return entityManager.find(Documento.class,id);
    }

    public void saveDocumento(Documento documento) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(documento);
        transaction.commit();
        System.out.println("Documento " + documento.getIdDocumento() + " creato con successo!");
    }

    public Documento findById(long id) {

        return entityManager.find(Documento.class, id);

    }

    public void findAndDeleteById(long id) {

        Documento doc = this.findById(id);
        if (doc != null) {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.remove(doc);
            transaction.commit();
            System.out.println("Eliminato con successo il documento con id  " + getDocumentoById(id));
        } else {
            System.out.println("ID non trovato");
        }
    }
}
