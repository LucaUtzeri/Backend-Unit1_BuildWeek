package it.team3.bw.biglietto.classi;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@Table (name = "tessere")
public class Tessera extends Documento{
    @Column (name = "id_tessera")
    private long idTessera;
    @OneToOne
    private Utente utente;
    @Column (name = "data_emissione")
    private LocalDate dataEmissioneTessera;
    @Column(name = "data_scadenza")
    private LocalDate dataScadenzaTessera;
//    private boolean stato;

    public Tessera(){}

    public Tessera(LocalDate dataEmissione, LocalDate scadenza, PuntoEmissione puntoEmissione, Utente utente, LocalDate dataEmissioneTessera, LocalDate dataScadenzaTessera) {
        super(dataEmissione, scadenza, puntoEmissione);
        this.utente = utente;
        this.dataEmissioneTessera = dataEmissioneTessera;
        this.dataScadenzaTessera = dataScadenzaTessera;
    }

    public long getIdTessera() {
        return idTessera;
    }

    public void setIdTessera(long idTessera) {
        this.idTessera = idTessera;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
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

    @Override
    public String toString() {
        return "Tessera{" +
                "idTessera=" + idTessera +
                ", utente=" + utente +
                ", dataEmissioneTessera=" + dataEmissioneTessera +
                ", dataScadenzaTessera=" + dataScadenzaTessera +
                '}';
    }
}
