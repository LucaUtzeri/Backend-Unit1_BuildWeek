package it.team3.bw.biglietti.entities.classi;

import it.team3.bw.biglietti.entities.enums.Abbonamento;
import it.team3.bw.biglietti.entities.enums.Distributore;
import it.team3.bw.biglietti.entities.enums.Venditori;

import java.util.Date;

public class Biglietto {
    private int idBiglietto;
    private Date scadenza;
    private Abbonamento abbonamento;
    private Venditori venditore;
    private Distributore distributore;
    private boolean isVidimato;
    private Date dataConvalida;

    public Biglietto(){}

    public Biglietto(int idBiglietto, Date scadenza, Abbonamento abbonamento, Venditori venditore, Distributore distributore, boolean isVidimato, Date dataConvalida) {
        this.idBiglietto = idBiglietto;
        this.scadenza = scadenza;
        this.abbonamento = abbonamento;
        this.venditore = venditore;
        this.distributore = distributore;
        this.isVidimato = isVidimato;
        this.dataConvalida = dataConvalida;
    }

    public int getIdBiglietto() {
        return idBiglietto;
    }

    public void setIdBiglietto(int idBiglietto) {
        this.idBiglietto = idBiglietto;
    }

    public Date getScadenza() {
        return scadenza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }

    public Abbonamento getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(Abbonamento abbonamento) {
        this.abbonamento = abbonamento;
    }

    public Venditori getVenditore() {
        return venditore;
    }

    public void setVenditore(Venditori venditore) {
        this.venditore = venditore;
    }

    public Distributore getDistributore() {
        return distributore;
    }

    public void setDistributore(Distributore distributore) {
        this.distributore = distributore;
    }

    public boolean isVidimato() {
        return isVidimato;
    }

    public void setVidimato(boolean vidimato) {
        isVidimato = vidimato;
    }

    public Date getDataConvalida() {
        return dataConvalida;
    }

    public void setDataConvalida(Date dataConvalida) {
        this.dataConvalida = dataConvalida;
    }
}

