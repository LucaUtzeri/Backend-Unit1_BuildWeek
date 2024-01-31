package it.team3.bw.biglietto.superclassi;

import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "tipo_venditore")
public abstract class PuntoEmissione {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_punto_emissione")
    private long idPuntoEmissione;

    public PuntoEmissione(){}



    public long getIdPuntoEmissione() {
        return idPuntoEmissione;
    }

    public void setIdPuntoEmissione(int idPuntoEmissione) {
        this.idPuntoEmissione = idPuntoEmissione;
    }

}
