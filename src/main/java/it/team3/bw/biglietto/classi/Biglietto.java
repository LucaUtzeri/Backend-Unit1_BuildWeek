package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.StatoBiglietto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@Table (name = "biglietti")
public class Biglietto extends Documento {

    @Id
    @GeneratedValue
    @Column (name = "id_biglietto")
    private long idBiglietto;
    @Column
    private LocalDate dataAcquisto;

    @Enumerated(EnumType.STRING)
    private StatoBiglietto statoBiglietto;

    @OneToOne
    private PuntoEmissione PuntoEmissione;

    @OneToOne
    private Utente utente;

    public Biglietto(){}

    public Biglietto(long idDocumento, LocalDate dataEmissione, long idEmissione, LocalDate dataAcquisto, StatoBiglietto statoBiglietto, it.team3.bw.biglietto.classi.PuntoEmissione puntoEmissione, Utente utente) {
        super(idDocumento, dataEmissione, idEmissione);
        this.dataAcquisto = dataAcquisto;
        this.statoBiglietto = statoBiglietto;
        PuntoEmissione = puntoEmissione;
        this.utente = utente;
    }

    public LocalDate getDataAcquisto() {
        return dataAcquisto;
    }

    public void setDataAcquisto(LocalDate dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    public StatoBiglietto getStatoBiglietto() {
        return statoBiglietto;
    }

    public void setStatoBiglietto(StatoBiglietto statoBiglietto) {
        this.statoBiglietto = statoBiglietto;
    }

    public it.team3.bw.biglietto.classi.PuntoEmissione getPuntoEmissione() {
        return PuntoEmissione;
    }

    public void setPuntoEmissione(it.team3.bw.biglietto.classi.PuntoEmissione puntoEmissione) {
        PuntoEmissione = puntoEmissione;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Biglietto{" +
                "idBiglietto=" + idBiglietto +
                ", dataAcquisto=" + dataAcquisto +
                ", statoBiglietto=" + statoBiglietto +
                ", PuntoEmissione=" + PuntoEmissione +
                ", utente=" + utente +
                '}';
    }
}
