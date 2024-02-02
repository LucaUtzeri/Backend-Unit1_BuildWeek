package it.team3.bw.biglietto.classi;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "documento")
public abstract class Documento {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private long idDocumento;
    private LocalDate dataEmissione;
    private long idEmissione;

    public  Documento(){}

    public Documento( LocalDate dataEmissione, long idEmissione) {
        this.dataEmissione = dataEmissione;
        this.idEmissione = idEmissione;
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

    public long getIdEmissione() {
        return idEmissione;
    }

    public void setIdEmissione(long idEmissione) {
        this.idEmissione = idEmissione;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "idDocumento=" + idDocumento +
                ", dataEmissione=" + dataEmissione +
                ", idEmissione=" + idEmissione +
                '}';
    }
}
