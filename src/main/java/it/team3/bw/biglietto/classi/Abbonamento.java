package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.TipologiaAbbonamento;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "abbonamenti")
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

    public Abbonamento(LocalDate dataEmissione, LocalDate scadenza, PuntoEmissione puntoEmissione, Tessera tessera, TipologiaAbbonamento tipologiaAbbonamento, LocalDate dataInizioAbbonamento, LocalDate dataScadenza, Utente utente, int id_PuntoEmissione) {
        super(dataEmissione, scadenza, puntoEmissione);
        this.tessera = tessera;
        this.tipologiaAbbonamento = tipologiaAbbonamento;
        this.dataInizioAbbonamento = dataInizioAbbonamento;
        this.dataScadenza = dataScadenza;
        this.utente = utente;
        this.id_PuntoEmissione = id_PuntoEmissione;
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

    public int getId_PuntoEmissione() {
        return id_PuntoEmissione;
    }

    public void setId_PuntoEmissione(int id_PuntoEmissione) {
        this.id_PuntoEmissione = id_PuntoEmissione;
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
                ", id_PuntoEmissione=" + id_PuntoEmissione +
                '}';
    }
}
