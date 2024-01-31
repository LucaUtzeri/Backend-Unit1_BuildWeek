package it.team3.bw.biglietto.classi;

import javax.persistence.*;

public class Biglietto {

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

    public Biglietto(long idBiglietto, StatoBiglietto statoBiglietto, PuntoEmissione PuntoEmissione, long idUtente) {
        this.idBiglietto = idBiglietto;
        this.statoBiglietto = statoBiglietto;
        this.PuntoEmissione = PuntoEmissione;
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

    //public PuntoEmissione getIdPuntoEmissione() {
       // return PuntoEmissione;
    //}

    //public void setIdPuntoEmissione(PuntoEmissione idPuntoEmissione) {
    //}

    public long getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(long idUtente) {
        this.idUtente = idUtente;
    }

    public PuntoEmissione getPuntoEmissione(){
        return PuntoEmissione;
    }

    public void setPuntoEmissione(PuntoEmissione puntoEmissione) {
        this.PuntoEmissione = puntoEmissione;
    }

    public enum StatoBiglietto {
        ATTIVO,
        VIDIMATO

    }


}
