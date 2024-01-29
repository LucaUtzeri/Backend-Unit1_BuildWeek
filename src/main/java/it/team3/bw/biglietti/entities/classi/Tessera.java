package it.team3.bw.biglietti.entities.classi;

import it.team3.bw.biglietti.entities.enums.Abbonamento;

import java.time.LocalDate;

public class Tessera {
    private int idTessera;
    private int numAbbMensili;
    private int numAbbSettimanali;
    private LocalDate dataEmissione = LocalDate.now();
    private LocalDate scadenza = dataEmissione.plusYears(1);
    private Abbonamento abbonamento;

    public Tessera(){}

    public Tessera(int idTessera, int numAbbMensili, int numAbbSettimanali, LocalDate dataEmissione, LocalDate scadenza, Abbonamento abbonamento) {
        this.idTessera = idTessera;
        this.numAbbMensili = numAbbMensili;
        this.numAbbSettimanali = numAbbSettimanali;
        this.dataEmissione = dataEmissione;
        this.scadenza = scadenza;
        this.abbonamento = abbonamento;
    }

    public int getIdTessera() {
        return idTessera;
    }

    public void setIdTessera(int idTessera) {
        this.idTessera = idTessera;
    }

    public int getNumAbbMensili() {
        return numAbbMensili;
    }

    public void setNumAbbMensili(int numAbbMensili) {
        this.numAbbMensili = numAbbMensili;
    }

    public int getNumAbbSettimanali() {
        return numAbbSettimanali;
    }

    public void setNumAbbSettimanali(int numAbbSettimanali) {
        this.numAbbSettimanali = numAbbSettimanali;
    }

    public LocalDate getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(LocalDate dataEmissione) {
        this.dataEmissione = dataEmissione;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }

    public Abbonamento getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(Abbonamento abbonamento) {
        this.abbonamento = abbonamento;
    }
}
