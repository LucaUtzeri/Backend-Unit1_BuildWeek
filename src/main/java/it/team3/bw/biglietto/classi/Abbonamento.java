package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.TipologiaAbbonamento;

import javax.persistence.*;
import java.time.LocalDate;

public class Abbonamento extends Documento {
    @Id
    @GeneratedValue
    @Column (name = "id_abbonamento")
    private long idAbbonamento;
    @OneToOne
    @JoinColumn (name = "id_tessera")
    private Tessera tessera;
    @Column (name = "tipo_abbonamento")
    private TipologiaAbbonamento tipologiaAbbonamento;
    @Column (name = "inizio_abbonamento")
    private LocalDate dataInizioAbbonamento;
    @Column (name = "scadenza")
    private LocalDate dataScadenza;
    @OneToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;
    private int id_PuntoEmissione;

    public Abbonamento(){}

    public Abbonamento(long idDocumento, LocalDate dataEmissione, long idEmissione, long idAbbonamento, Tessera tessera, TipologiaAbbonamento tipologiaAbbonamento, LocalDate dataInizioAbbonamento, LocalDate dataScadenza, Utente utente) {
        super(idDocumento, dataEmissione, idEmissione);
        this.idAbbonamento = idAbbonamento;
        this.tessera = tessera;
        this.tipologiaAbbonamento = tipologiaAbbonamento;
        this.dataInizioAbbonamento = dataInizioAbbonamento;
        this.dataScadenza = dataScadenza;
        this.utente = utente;
    }

    public long getIdAbbonamento() {
        return idAbbonamento;
    }

    public void setIdAbbonamento(long idAbbonamento) {
        this.idAbbonamento = idAbbonamento;
    }

    public Tessera getTessera() {
        return tessera;
    }

    public void setTessera(Tessera tessera) {
        this.tessera = tessera;
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

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Abbonamento{" +
                "idAbbonamento=" + idAbbonamento +
                ", tessera=" + tessera +
                ", tipologiaAbbonamento=" + tipologiaAbbonamento +
                ", dataInizioAbbonamento=" + dataInizioAbbonamento +
                ", dataScadenza=" + dataScadenza +
                ", utente=" + utente +
                '}';
    }
}
