package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.StatoDistributore;
import it.team3.bw.biglietto.enums.Tipologia;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Distributore extends PuntoEmissione {

    @Enumerated (EnumType.STRING)
    private StatoDistributore statoDistributore;
    public Distributore(){}

    public Distributore(String nome, Tipologia tipologia, boolean attivo, StatoDistributore statoDistributore) {
        super(nome, tipologia, attivo);
        this.statoDistributore = statoDistributore;
    }

    public StatoDistributore getStatoDistributore() {
        return statoDistributore;
    }

    public void setStatoDistributore(StatoDistributore statoDistributore) {
        this.statoDistributore = statoDistributore;
    }
}