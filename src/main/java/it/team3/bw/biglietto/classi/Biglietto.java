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
    private Long idPuntoEmissione;

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Long idUtente;

    public Biglietto(){}

    public Biglietto(Long idBiglietto, StatoBiglietto statoBiglietto, Long idPuntoEmissione, Long idUtente) {
        this.idBiglietto = idBiglietto;
        this.statoBiglietto = statoBiglietto;
        this.idPuntoEmissione = idPuntoEmissione;
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

    public Long getIdPuntoEmissione() {
        return Long.valueOf(idPuntoEmissione);
    }

    public void setIdPuntoEmissione(Long idPuntoEmissione) {
        this.idPuntoEmissione = idPuntoEmissione;
    }

    public Long getIdUtente() {
        return Long.valueOf(idUtente);
    }

    public void setIdUtente(Long idUtente) {
        this.idUtente = idUtente;
    }

    public enum StatoBiglietto {
        ATTIVO,
        VIDIMATO
    }
}
