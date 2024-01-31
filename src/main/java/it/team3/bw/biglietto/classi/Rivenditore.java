package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.superclassi.PuntoEmissione;

public class Rivenditore extends PuntoEmissione {
    private String nomeRivenditore;
    private String luogoRivenditore;

    public Rivenditore(Tipologia tipologia, boolean stato, String nomeRivenditore, String luogoRivenditore) {
        super(tipologia, stato);
        this.nomeRivenditore = nomeRivenditore;
        this.luogoRivenditore = luogoRivenditore;
    }

    public String getNomeRivenditore() {
        return nomeRivenditore;
    }

    public void setNomeRivenditore(String nomeRivenditore) {
        this.nomeRivenditore = nomeRivenditore;
    }

    public String getLuogoRivenditore() {
        return luogoRivenditore;
    }

    public void setLuogoRivenditore(String luogoRivenditore) {
        this.luogoRivenditore = luogoRivenditore;
    }
}
