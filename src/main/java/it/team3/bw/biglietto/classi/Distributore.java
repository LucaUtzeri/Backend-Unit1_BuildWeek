package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.StatoDistributore;
import it.team3.bw.biglietto.superclassi.PuntoEmissione;

public class Distributore extends PuntoEmissione {

    private StatoDistributore statoDistributore;

    private String luogoDistributore;

    public Distributore(StatoDistributore statoDistributore, String luogoDistributore) {
        this.statoDistributore = statoDistributore;
        this.luogoDistributore = luogoDistributore;
    }

    public StatoDistributore getStatoDistributore() {
        return statoDistributore;
    }

    public void setStatoDistributore(StatoDistributore statoDistributore) {
        this.statoDistributore = statoDistributore;
    }

    public String getLuogoDistributore() {
        return luogoDistributore;
    }

    public void setLuogoDistributore(String luogoDistributore) {
        this.luogoDistributore = luogoDistributore;
    }
}
