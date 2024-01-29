package it.team3.bw.mezzi.entities.classi;

import it.team3.bw.mezzi.entities.enums.Tipologia;

import java.time.LocalDate;

public class Manutenzione extends Veicolo{
    private LocalDate dataInizio;
    private LocalDate dataFine;

    public Manutenzione() {
    }

    public Manutenzione(long idVeicolo, Tipologia tipologia, LocalDate dataInizio, LocalDate dataFine) {
        super(idVeicolo, tipologia);
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }
}
