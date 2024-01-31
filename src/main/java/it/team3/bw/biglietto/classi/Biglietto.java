package it.team3.bw.biglietto.classi;

import javax.persistence.*;
import it.team3.bw.biglietto.enums.StatoBiglietto;
import it.team3.bw.biglietto.superclassi.Documento;

public class Biglietto extends Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBiglietto;

    @Enumerated(EnumType.STRING)
    private StatoBiglietto statoBiglietto;

    @ManyToOne
    @JoinColumn(name = "id_punto_emissione")
    private PuntoEmissione PuntoEmissione;

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private long idUtente;

    public Biglietto(){}

    public Biglietto(long idDocumento, int dataEmissione, long idEmissione, long idBiglietto, StatoBiglietto statoBiglietto, it.team3.bw.biglietto.classi.PuntoEmissione puntoEmissione, long idUtente) {
        super(idDocumento, dataEmissione, idEmissione);
        this.idBiglietto = idBiglietto;
        this.statoBiglietto = statoBiglietto;
        PuntoEmissione = puntoEmissione;
        this.idUtente = idUtente;
    }

    public long getIdBiglietto() {
        return idBiglietto;
    }

    public void setIdBiglietto(long idBiglietto) {
        this.idBiglietto = idBiglietto;
    }

    public StatoBiglietto getStatoBiglietto() {
        return statoBiglietto;
    }

    public void setStatoBiglietto(StatoBiglietto statoBiglietto) {
        this.statoBiglietto = statoBiglietto;
    }

    public it.team3.bw.biglietto.classi.PuntoEmissione getPuntoEmissione() {
        return PuntoEmissione;
    }

    public void setPuntoEmissione(it.team3.bw.biglietto.classi.PuntoEmissione puntoEmissione) {
        PuntoEmissione = puntoEmissione;
    }

    public long getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(long idUtente) {
        this.idUtente = idUtente;
    }

    public enum StatoBiglietto {
        ATTIVO,
        VIDIMATO

    }


//    public Biglietto(long idBiglietto, StatoBiglietto statoBiglietto, PuntoEmissione PuntoEmissione, long idUtente) {
//
//    public Biglietto(long idDocumento, int dataEmissione, int idEmissione, int idBiglietto, StatoBiglietto statoBiglietto, int idPuntoEmissione, int idUtente) {
//        super(idDocumento, dataEmissione, idEmissione);
//
//        this.idBiglietto = idBiglietto;
//        this.statoBiglietto = statoBiglietto;
//        this.PuntoEmissione = PuntoEmissione;
//        this.idUtente = idUtente;
//    }
//
//    public Long getIdBiglietto() {
//        return idBiglietto;
//    }
//
//    public void setIdBiglietto(Long idBiglietto) {
//        this.idBiglietto = idBiglietto;
//    }
//
//    public StatoBiglietto getStatoBiglietto() {
//        return statoBiglietto;
//    }
//
//    public void setStatoBiglietto(StatoBiglietto statoBiglietto) {
//        this.statoBiglietto = statoBiglietto;
//    }
//
//    //public PuntoEmissione getIdPuntoEmissione() {
//       // return PuntoEmissione;
//    //}
//
//    //public void setIdPuntoEmissione(PuntoEmissione idPuntoEmissione) {
//    //}
//
//    public Long getIdUtente() {
//        return idUtente;
//    }
//
//    public void setIdUtente(Long idUtente) {
//        this.idUtente = idUtente;
//    }
//
//    public PuntoEmissione getPuntoEmissione(){
//        return PuntoEmissione;
//    }
//
//    public void setPuntoEmissione(PuntoEmissione puntoEmissione) {
//        this.PuntoEmissione = puntoEmissione;
//    }



}
