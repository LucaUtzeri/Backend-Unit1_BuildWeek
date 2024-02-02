package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.TipologiaAbbonamento;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Abbonamento extends Documento {

    @OneToOne
    @JoinColumn (name = "id_tessera")
    private Tessera tessera;
    @Column (name = "tipo_abbonamento")
    private TipologiaAbbonamento tipologiaAbbonamento;
    @Column (name = "inizio_abbonamento")
    private LocalDate dataInizioAbbonamento;
    @Column (name = "scadenza")
    private LocalDate dataScadenza;
    @ManyToOne
    @JoinColumn(name = "id_punto_emissione")
    private PuntoEmissione puntoEmissione;

    public Abbonamento(){}

    public Abbonamento( LocalDate dataEmissione, long idEmissione, Tessera tessera, TipologiaAbbonamento tipologiaAbbonamento, LocalDate dataInizioAbbonamento, LocalDate dataScadenza, PuntoEmissione puntoEmissione) {
        super(dataEmissione, idEmissione);
        this.tessera = tessera;
        this.tipologiaAbbonamento = tipologiaAbbonamento;
        this.dataInizioAbbonamento = dataInizioAbbonamento;
        this.dataScadenza = dataScadenza;
        this.puntoEmissione = puntoEmissione;
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

    public PuntoEmissione getPuntoEmissione() {
        return puntoEmissione;
    }

    public void setPuntoEmissione(PuntoEmissione puntoEmissione) {
        this.puntoEmissione = puntoEmissione;
    }
}
