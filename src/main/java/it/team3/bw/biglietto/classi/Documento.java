package it.team3.bw.biglietto.classi;

public abstract class Documento {
    private int idDocumento;
    private int dataEmissione;
    private int idEmissione;

    public  Documento(){}

    public Documento(int idDocumento, int dataEmissione, int idEmissione) {
        this.idDocumento = idDocumento;
        this.dataEmissione = dataEmissione;
        this.idEmissione = idEmissione;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {

        this.idDocumento = idDocumento;
    }

    public int getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(int dataEmissione) {
        this.dataEmissione = dataEmissione;
    }

    public int getIdEmissione() {
        return idEmissione;
    }

    public void setIdEmissione(int idEmissione) {
        this.idEmissione = idEmissione;
    }
}
