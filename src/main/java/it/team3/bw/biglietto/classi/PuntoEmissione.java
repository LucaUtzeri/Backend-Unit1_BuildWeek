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
    private String nome;
    @Column
    private Tipologia tipologia;
    @Column
    private boolean attivo;

    public PuntoEmissione(){}

    public PuntoEmissione( Tipologia tipologia, boolean attivo) {
        this.tipologia = tipologia;
        this.attivo = attivo;
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

    public boolean isAttivo() {
        return attivo;
    }

    public void setStato(boolean attivo) {
        this.attivo = attivo;
    }
}
