package it.team3.bw.biglietto.classi;

import javax.persistence.*;

public class Biglietto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBiglietto;

    @Enumerated(EnumType.STRING)
    private StatoBiglietto statoBiglietto;

    @ManyToOne
    @JoinColumn(name = "id_punto_emissione")
    private PuntoEmissione PuntoEmissione;

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Long idUtente;



    public Biglietto(){}

    public Biglietto(Long idBiglietto, StatoBiglietto statoBiglietto, PuntoEmissione PuntoEmissione, Long idUtente) {
        this.idBiglietto = idBiglietto;
        this.statoBiglietto = statoBiglietto;
        this.PuntoEmissione = PuntoEmissione;
        this.idUtente = idUtente;
    }

    public Long getIdBiglietto() {
        return idBiglietto;
    }

    public void setIdBiglietto(Long idBiglietto) {
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

    public Long getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(Long idUtente) {
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
