package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.Tipologia;

public class PuntoEmissione {
    private int idPuntoEmissione;
    private Tipologia tipologia;
    private boolean stato;

    public PuntoEmissione(){}

    public PuntoEmissione(int idPuntoEmissione, Tipologia tipologia, boolean stato) {
        this.idPuntoEmissione = idPuntoEmissione;
        this.tipologia = tipologia;
        this.stato = stato;
    }

    public int getIdPuntoEmissione() {
        return idPuntoEmissione;
    }

    public void setIdPuntoEmissione(int idPuntoEmissione) {
        this.idPuntoEmissione = idPuntoEmissione;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }
}
