package it.team3.bw.biglietto.classi;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Tessera{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column (name = "id_tessera")
    private long idTessera;
    @OneToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;
    @Column (name = "data_emissione")
    private LocalDate dataEmissioneTessera;
    @Column(name = "data_scadenza")
    private LocalDate dataScadenzaTessera;
    @OneToOne (mappedBy = "tessera")
    private Abbonamento abbonamento;

//    private boolean stato;

    public Tessera(){}

    public Tessera(long idTessera, LocalDate dataEmissioneTessera) {
        this.idTessera = idTessera;
        this.dataEmissioneTessera = dataEmissioneTessera;
        this.dataScadenzaTessera = dataEmissioneTessera.plusYears(1);
    }

    public long getIdTessera() {
        return idTessera;
    }

    public void setIdTessera(long idTessera) {
        this.idTessera = idTessera;
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
}
