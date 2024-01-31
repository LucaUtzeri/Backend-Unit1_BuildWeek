package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.StatoBiglietto;

import javax.persistence.*;

public class Biglietto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBiglietto;

    @Enumerated(EnumType.STRING)
    private StatoBiglietto statoBiglietto;

    @ManyToOne
    @JoinColumn(name = "id_punto_emissione")
    private int idPuntoEmissione;

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private int idUtente;

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
        return idPuntoEmissione;
    }

    public void setIdPuntoEmissione(int idPuntoEmissione) {
        this.idPuntoEmissione = idPuntoEmissione;
    }

    public Long getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }
}
