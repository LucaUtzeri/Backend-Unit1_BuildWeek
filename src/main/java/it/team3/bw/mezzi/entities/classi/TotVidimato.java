package it.team3.bw.mezzi.entities.classi;

import it.team3.bw.biglietti.entities.enums.Abbonamento;
import it.team3.bw.biglietti.entities.enums.Distributore;
import it.team3.bw.biglietti.entities.enums.Venditori;

import java.util.Date;

public class TotVidimato extends Convalida{
    private long idVeicolo;

    public TotVidimato(){}

    public TotVidimato(int idBiglietto, Date scadenza, Abbonamento abbonamento, Venditori venditore, Distributore distributore, int idBiglietto1, boolean isVidimato, Date dataConvalida, long idVeicolo) {
        super(idBiglietto, scadenza, abbonamento, venditore, distributore, idBiglietto1, isVidimato, dataConvalida);
        this.idVeicolo = idVeicolo;
    }

    public long getIdVeicolo() {
        return idVeicolo;
    }

    public void setIdVeicolo(long idVeicolo) {
        this.idVeicolo = idVeicolo;
    }
}
