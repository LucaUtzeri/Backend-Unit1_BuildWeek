package it.team3.bw.biglietti.DAOs;

import javax.persistence.EntityManager;

public class BigliettoDAO{
    public BigliettoDAO(EntityManager em) {this.em = em;}
    private EntityManager em;
//
//    public void save(Biglietto biglietto){
//        EntityTransaction transaction = em.getTransaction();
//        transaction.begin();
//        em.persist(biglietto);
//        transaction.commit();
//    }
//
//    public Biglietto findItem (int idBiglietto) {
//        return em.find(Biglietto.class, idBiglietto);
//    }
//
//    public void delete(int idBiglietto){
//        Biglietto biglietto = this.findItem(idBiglietto);
//        if (biglietto != null){
//            EntityTransaction transaction = em.getTransaction();
//            transaction.begin();
//            em.remove(idBiglietto);
//            transaction.commit();
//            System.out.println("Biglietto cancellato");
//        }
//    }
//
//    public Biglietto find(Year year){
//        return em.find(Biglietto.class, "_________");
//    }
//
//    public Biglietto find(String auth){
//        return em.find(Catalogue.class, "_________");
//    }
//
//    public List<Biglietto> search(){
//        TypedQuery<Biglietto> query = em.createQuery("SELECT x FROM Catalogue x WHERE x.title LOWER(b.title) LIKE LOWER(:title)", Catalogue.class);
//        query.setParameter("title", "%" + title + "%");
//        return query.getResultList();
//    }
}
