package it.team3.bw.mezzi.entities.classi;

import it.team3.bw.mezzi.entities.enums.Tipologia;

public abstract class Veicolo {
    private long idVeicolo;
    private Tipologia tipologia;

    public Veicolo(){}

    public Veicolo(long idVeicolo, Tipologia tipologia) {
        this.idVeicolo = idVeicolo;
        this.tipologia = tipologia;
    }

    public long getIdVeicolo() {
        return idVeicolo;
    }

    public void setIdVeicolo(long idVeicolo) {
        this.idVeicolo = idVeicolo;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }
}
