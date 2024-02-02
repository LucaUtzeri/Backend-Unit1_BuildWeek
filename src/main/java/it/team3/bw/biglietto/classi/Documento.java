package it.team3.bw.biglietto.classi;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "documenti")
@Inheritance (strategy = InheritanceType.JOINED)
public abstract class Documento {
    @Id
    @GeneratedValue
    @Column (name ="id_documento")
    private long idDocumento;
    @Column (name = "data_emissione")
    private LocalDate dataEmissione;
    @Column
    private LocalDate scadenza;
    @OneToOne
    @Column (name = "punto_emissione")
    private PuntoEmissione puntoEmissione;

    public  Documento(){}

    public Documento(LocalDate dataEmissione, LocalDate scadenza, PuntoEmissione puntoEmissione) {
        this.dataEmissione = dataEmissione;
        this.scadenza = scadenza;
        this.puntoEmissione = puntoEmissione;
    }

    public long getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(long idDocumento) {
        this.idDocumento = idDocumento;
    }

    public LocalDate getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(LocalDate dataEmissione) {
        this.dataEmissione = dataEmissione;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }

    public PuntoEmissione getPuntoEmissione() {
        return puntoEmissione;
    }

    public void setPuntoEmissione(PuntoEmissione puntoEmissione) {
        this.puntoEmissione = puntoEmissione;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "idDocumento=" + idDocumento +
                ", dataEmissione=" + dataEmissione +
                ", scadenza=" + scadenza +
                ", puntoEmissione=" + puntoEmissione +
                '}';
    }
}
