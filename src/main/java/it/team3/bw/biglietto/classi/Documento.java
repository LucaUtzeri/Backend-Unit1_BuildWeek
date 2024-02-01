package it.team3.bw.biglietto.classi;

import java.time.LocalDate;

public abstract class Documento {
    private long idDocumento;
    private LocalDate dataEmissione;
    private long idEmissione;

    public  Documento(){}

    public Documento(long idDocumento, LocalDate dataEmissione, long idEmissione) {
        this.idDocumento = idDocumento;
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
