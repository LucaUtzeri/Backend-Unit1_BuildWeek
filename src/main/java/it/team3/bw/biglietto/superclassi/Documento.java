package it.team3.bw.biglietto.superclassi;

public abstract class Documento {
    private long idDocumento;
    private int dataEmissione;
    private long idEmissione;

    public  Documento(){}

    public Documento(long idDocumento, int dataEmissione, long idEmissione) {
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

    public int getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(int dataEmissione) {
        this.dataEmissione = dataEmissione;
    }

    public long getIdEmissione() {
        return idEmissione;
    }

    public void setIdEmissione(long idEmissione) {
        this.idEmissione = idEmissione;
    }
}
