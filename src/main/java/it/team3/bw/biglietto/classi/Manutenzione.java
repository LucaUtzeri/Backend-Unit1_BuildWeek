package it.team3.bw.biglietto.classi;

import it.team3.bw.mezzi.classi.Mezzo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Manutenzione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_manutenzione", nullable = false)
    private Long idManutenzione;


    @ManyToOne
    @JoinColumn(name = "id_mezzo")
    private Mezzo mezzo;

    private LocalDate inizioManutenzione;

    private LocalDate fineManutenzione;

    public Manutenzione() {
    }

    public Manutenzione(Mezzo mezzo, LocalDate inizioManutenzione, LocalDate fineManutenzione) {
        this.mezzo = mezzo;
        this.inizioManutenzione = inizioManutenzione;
        this.fineManutenzione = fineManutenzione;
    }

    public Long getIdManutenzione() {
        return idManutenzione;
    }

    public void setIdManutenzione(Long idManutenzione) {
        this.idManutenzione = idManutenzione;
    }

    public Mezzo getMezzo() {
        return mezzo;
    }

    public void setMezzo(Mezzo mezzo) {
        this.mezzo = mezzo;
    }

    public LocalDate getInizioManutenzione() {
        return inizioManutenzione;
    }

    public void setInizioManutenzione(LocalDate inizioManutenzione) {
        this.inizioManutenzione = inizioManutenzione;
    }

    public LocalDate getFineManutenzione() {
        return fineManutenzione;
    }

    public void setFineManutenzione(LocalDate fineManutenzione) {
        this.fineManutenzione = fineManutenzione;
    }
}
