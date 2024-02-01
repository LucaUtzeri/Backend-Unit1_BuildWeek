package it.team3.bw.biglietto.classi;

import java.time.LocalDate;

public class Tessera {
    private long idTessera;
    private long idUtente;
    private LocalDate dataEmissioneTessera = LocalDate.now();
    private LocalDate dataScadenzaTessera;
    private boolean stato;

    public Tessera() {
    }

    public Tessera(long idTessera, long idUtente, LocalDate dataEmissioneTessera, LocalDate dataScadenzaTessera, boolean stato) {
        this.idTessera = idTessera;
        this.idUtente = idUtente;
        this.dataEmissioneTessera = dataEmissioneTessera;
        this.dataScadenzaTessera = dataScadenzaTessera;
        this.stato = stato;
    }

    public long getIdTessera() {
        return idTessera;
    }

    public void setIdTessera(long idTessera) {
        this.idTessera = idTessera;
    }

    public long getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(long idUtente) {
        this.idUtente = idUtente;
    }

    public LocalDate getDataEmissioneTessera() {
        return dataEmissioneTessera;
    }

    public void setDataEmissioneTessera(LocalDate dataEmissioneTessera) {
        this.dataEmissioneTessera = dataEmissioneTessera;
    }

    public LocalDate getDataScadenzaTessera() {
        return dataScadenzaTessera;
    }

    public void setDataScadenzaTessera(LocalDate dataScadenzaTessera) {
        this.dataScadenzaTessera = dataScadenzaTessera;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }
}
