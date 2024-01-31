package it.team3.bw.biglietto.classi;

import it.team3.bw.biglietto.enums.Tipologia;

import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "punto_emissione")
public class PuntoEmissione {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_punto_emissione")
    private Long idPuntoEmissione;
    @Column
    private Tipologia tipologia;
    @Column
    private boolean stato;

    public PuntoEmissione(){}

    public PuntoEmissione( Tipologia tipologia, boolean stato) {
        this.tipologia = tipologia;
        this.stato = stato;
    }

    public Long getIdPuntoEmissione() {
        return idPuntoEmissione;
    }

    public void setIdPuntoEmissione(Long idPuntoEmissione) {
        this.idPuntoEmissione = idPuntoEmissione;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }
}
