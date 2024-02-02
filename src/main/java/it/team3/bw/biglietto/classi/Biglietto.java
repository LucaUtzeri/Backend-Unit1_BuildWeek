package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.StatoBiglietto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Biglietto extends Documento {

    @Enumerated(EnumType.STRING)
    private StatoBiglietto statoBiglietto;

    @ManyToOne
    private PuntoEmissione puntoEmissione;

    @OneToOne
    private Utente utente;

    public Biglietto() {
    }

    public Biglietto(LocalDate dataEmissione, StatoBiglietto statoBiglietto,PuntoEmissione puntoEmissione, Utente utente) {
        super(dataEmissione);
        this.statoBiglietto = statoBiglietto;
        this.utente = utente;
        this.puntoEmissione= puntoEmissione;
    }


    public StatoBiglietto getStatoBiglietto() {
        return statoBiglietto;
    }

    public void setStatoBiglietto(StatoBiglietto statoBiglietto) {
        this.statoBiglietto = statoBiglietto;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
