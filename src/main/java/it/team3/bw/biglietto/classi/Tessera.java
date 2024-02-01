package it.team3.bw.biglietto.classi;

import java.time.LocalDate;

public class Tessera {
    private long idTessera;
    private long idUtente;
    private LocalDate dataEmissioneTessera;
    private LocalDate dataScadenzaTessera;
    private boolean stato;

    // Default constructor
    public Tessera() {
        this.dataEmissioneTessera = LocalDate.now();
    }

    // Parameterized constructor
    public Tessera(long idTessera, long idUtente, LocalDate dataEmissioneTessera, LocalDate dataScadenzaTessera, boolean stato) {
        this.idTessera = idTessera;
        this.idUtente = idUtente;
        this.dataEmissioneTessera = dataEmissioneTessera;
        this.dataScadenzaTessera = dataScadenzaTessera;
        this.stato = stato;
    }

    // Getter and setter methods for idTessera
    public long getIdTessera() {
        return idTessera;
    }

    public void setIdTessera(long idTessera) {
        this.idTessera = idTessera;
    }

    // Getter and setter methods for idUtente
    public long getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(long idUtente) {
        this.idUtente = idUtente;
    }

    // Getter and setter methods for dataEmissioneTessera
    public LocalDate getDataEmissioneTessera() {
        return dataEmissioneTessera;
    }

    public void setDataEmissioneTessera(LocalDate dataEmissioneTessera) {
        this.dataEmissioneTessera = dataEmissioneTessera;
    }

    // Getter and setter methods for dataScadenzaTessera
    public LocalDate getDataScadenzaTessera() {
        return dataScadenzaTessera;
    }

    public void setDataScadenzaTessera(LocalDate dataScadenzaTessera) {
        this.dataScadenzaTessera = dataScadenzaTessera;
    }

    // Getter and setter methods for stato
    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }
}
