package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.TipologiaAbbonamento;

import java.time.LocalDate;

public class Abbonamento {
    private int idAbbonamento;
    private int idTessera;
    private TipologiaAbbonamento tipologiaAbbonamento;
    private LocalDate dataInizioAbbonamento = LocalDate.now();
    private LocalDate dataScadenza;
    private int id_PuntoEmissione;
    private String nomeUtente;
    private String cognomeUtente;

    public Abbonamento(){}

    public Abbonamento(int idAbbonamento, int idTessera, TipologiaAbbonamento tipologiaAbbonamento, LocalDate dataInizioAbbonamento, LocalDate dataScadenza, int id_PuntoEmissione, String nomeUtente, String cognomeUtente) {
        this.idAbbonamento = idAbbonamento;
        this.idTessera = idTessera;
        this.tipologiaAbbonamento = tipologiaAbbonamento;
        this.dataInizioAbbonamento = dataInizioAbbonamento;
        this.dataScadenza = dataScadenza;
        this.id_PuntoEmissione = id_PuntoEmissione;
        this.nomeUtente = nomeUtente;
        this.cognomeUtente = cognomeUtente;
    }

    public int getIdAbbonamento() {
        return idAbbonamento;
    }

    public void setIdAbbonamento(int idAbbonamento) {
        this.idAbbonamento = idAbbonamento;
    }

    public int getIdTessera() {
        return idTessera;
    }

    public void setIdTessera(int idTessera) {
        this.idTessera = idTessera;
    }

    public TipologiaAbbonamento getTipologiaAbbonamento() {
        return tipologiaAbbonamento;
    }

    public void setTipologiaAbbonamento(TipologiaAbbonamento tipologiaAbbonamento) {
        this.tipologiaAbbonamento = tipologiaAbbonamento;
    }

    public LocalDate getDataInizioAbbonamento() {
        return dataInizioAbbonamento;
    }

    public void setDataInizioAbbonamento(LocalDate dataInizioAbbonamento) {
        this.dataInizioAbbonamento = dataInizioAbbonamento;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public int getId_PuntoEmissione() {
        return id_PuntoEmissione;
    }

    public void setId_PuntoEmissione(int id_PuntoEmissione) {
        this.id_PuntoEmissione = id_PuntoEmissione;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getCognomeUtente() {
        return cognomeUtente;
    }

    public void setCognomeUtente(String cognomeUtente) {
        this.cognomeUtente = cognomeUtente;
    }
}
