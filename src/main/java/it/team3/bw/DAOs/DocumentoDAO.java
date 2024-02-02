package it.team3.bw.DAOs;

import it.team3.bw.biglietto.classi.Documento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DocumentoDAO {
    private final EntityManager entityManager;

    public DocumentoDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("be-buildweek1");
        entityManager = emf.createEntityManager();
    }

    public Documento getDocumentoById(long id){
        return entityManager.find(Documento.class,id);
    }

}
