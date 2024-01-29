package it.team3.bw.mezzi.entities.classi;

import it.team3.bw.biglietti.entities.classi.Biglietto;
import it.team3.bw.biglietti.entities.enums.Abbonamento;
import it.team3.bw.biglietti.entities.enums.Distributore;
import it.team3.bw.biglietti.entities.enums.Venditori;

import java.util.Date;

public class Convalida extends Biglietto {
    private int idBiglietto;
    private boolean isVidimato;
    private Date dataConvalida;

    public Convalida(){}

    public Convalida(int idBiglietto, Date scadenza, Abbonamento abbonamento, Venditori venditore, Distributore distributore, int idBiglietto1, boolean isVidimato, Date dataConvalida) {
        super(idBiglietto, scadenza, abbonamento, venditore, distributore);
        this.idBiglietto = idBiglietto1;
        this.isVidimato = isVidimato;
        this.dataConvalida = dataConvalida;
    }

    @Override
    public int getIdBiglietto() {
        return idBiglietto;
    }

    @Override
    public void setIdBiglietto(int idBiglietto) {
        this.idBiglietto = idBiglietto;
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
