package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.StatoBiglietto;
import it.team3.bw.biglietto.superclassi.Documento;

public class Biglietto extends Documento {
    private int idBiglietto;
    private StatoBiglietto statoBiglietto;
    private int idPuntoEmissione;
    private int idUtente;

    public Biglietto(){}

    public Biglietto(int idDocumento, int dataEmissione, int idEmissione, int idBiglietto, StatoBiglietto statoBiglietto, int idPuntoEmissione, int idUtente) {
        super(idDocumento, dataEmissione, idEmissione);
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
