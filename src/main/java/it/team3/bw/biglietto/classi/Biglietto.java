package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.StatoBiglietto;

public class Biglietto {

    private int idBiglietto;
    private StatoBiglietto statoBiglietto;
    private int idPuntoEmissione;
    private int idUtente;

    public Biglietto(){}

    public Biglietto(int idBiglietto, StatoBiglietto statoBiglietto, int idPuntoEmissione, int idUtente) {
        this.idBiglietto = idBiglietto;
        this.statoBiglietto = statoBiglietto;
        this.idPuntoEmissione = idPuntoEmissione;
        this.idUtente = idUtente;
    }

    public int getIdBiglietto() {
        return idBiglietto;
    }

    public void setIdBiglietto(int idBiglietto) {
        this.idBiglietto = idBiglietto;
    }

    public StatoBiglietto getStatoBiglietto() {
        return statoBiglietto;
    }

    public void setStatoBiglietto(StatoBiglietto statoBiglietto) {
        this.statoBiglietto = statoBiglietto;
    }

    public int getIdPuntoEmissione() {
        return idPuntoEmissione;
    }

    public void setIdPuntoEmissione(int idPuntoEmissione) {
        this.idPuntoEmissione = idPuntoEmissione;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }
}
