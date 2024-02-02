package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.StatoBiglietto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Biglietto extends Documento {


    @Enumerated(EnumType.STRING)
    private StatoBiglietto statoBiglietto;

    @OneToOne

    private PuntoEmissione PuntoEmissione;

    @OneToOne
    private Utente utente;

    public Biglietto(){}

    public Biglietto(LocalDate dataEmissione, long idEmissione, StatoBiglietto statoBiglietto, PuntoEmissione puntoEmissione, Utente utente) {
        super( dataEmissione, idEmissione);
        this.statoBiglietto = statoBiglietto;
        PuntoEmissione = puntoEmissione;
        this.utente = utente;
    }

    public StatoBiglietto getStatoBiglietto() {
        return statoBiglietto;
    }

    public void setStatoBiglietto(StatoBiglietto statoBiglietto) {
        this.statoBiglietto = statoBiglietto;
    }

    public PuntoEmissione getPuntoEmissione() {
        return PuntoEmissione;
    }

    public void setPuntoEmissione(PuntoEmissione puntoEmissione) {
        PuntoEmissione = puntoEmissione;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
