package it.team3.bw;

import com.github.javafaker.Faker;
import it.team3.bw.DAOs.*;
import it.team3.bw.biglietto.classi.*;
import it.team3.bw.biglietto.enums.StatoBiglietto;
import it.team3.bw.biglietto.enums.StatoDistributore;
import it.team3.bw.biglietto.enums.TipologiaAbbonamento;
import it.team3.bw.mezzi.DAOs.MezzoDAO;
import it.team3.bw.mezzi.classi.Autobus;
import it.team3.bw.mezzi.classi.Mezzo;
import it.team3.bw.mezzi.classi.Tram;
import it.team3.bw.tratta.DAOs.TrattaDAO;
import it.team3.bw.tratta.Tratta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("be-buildweek1");
    public static EntityManager em = emf.createEntityManager();
    private static UtenteDAO ud = new UtenteDAO(em);
    private static PuntoEmissioneDAO ped = new PuntoEmissioneDAO(em);
    private static TesseraDAO td = new TesseraDAO(em);
    private static DocumentoDAO dd = new DocumentoDAO(em);
    private static VidimazioneDAO vd = new VidimazioneDAO(em);
    private static MezzoDAO md = new MezzoDAO(em);
    private static TrattaDAO trd = new TrattaDAO(em);
    //instanza di tutti i DAOs + Faker come static per renderli disponibili in tutta la Applicazione

    public static Faker faker = new Faker();
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        PuntoEmissione distributore = new Distributore("Distributore 1", true, StatoDistributore.ATTIVO);
        PuntoEmissione negoziante = new Negoziante("Negozio 1", true);
        Utente utente = new Utente(faker.name().firstName(), faker.name().lastName(), faker.name().title());
        Utente utente2 = new Utente(faker.name().firstName(), faker.name().lastName(), faker.name().title());
        Tessera tessera = new Tessera(LocalDate.now(), utente);
        Documento abbonamento = new Abbonamento(LocalDate.now(), tessera, TipologiaAbbonamento.MENSILE, LocalDate.of(2023, 5, 12), negoziante);
        Documento biglietto = new Biglietto(LocalDate.now(), StatoBiglietto.ATTIVO, distributore, utente2);
        Tratta tratta = new Tratta(faker.address().firstName(), faker.address().firstName(), 10, 2, 15);
        Tratta tratta2 = new Tratta(faker.address().firstName(), faker.address().firstName(), 22, 3, 20);
        Mezzo autobus = new Autobus(50);
        Mezzo tram = new Tram(150);
        Manutenzione manutenzione = new Manutenzione(autobus, LocalDate.now().minusDays(60), LocalDate.now().minusDays(30));


        ped.savePE(distributore);
        ped.savePE(negoziante);
        ud.saveUtente(utente);
        ud.saveUtente(utente2);
        td.saveTessera(tessera);
        dd.saveDocumento(abbonamento);
        dd.saveDocumento(biglietto);
        trd.saveTratta(tratta);
        trd.saveTratta(tratta2);
        md.saveMezzo(autobus);
        md.saveMezzo(tram);
        md.saveManutenzione(manutenzione);

        dd.trovaBigliettiPerData(LocalDate.now().minusDays(30), LocalDate.now());

        Scanner scanner = new Scanner(System.in);

        String nomeUtente = faker.name().firstName();
        String cognomeUtente = faker.name().lastName();

        System.out.println("Ciao " + nomeUtente + "!");

        System.out.println("Dove vuoi acquistare il documento di viaggio?");
        System.out.println("Digita 1 per acquistare al Distributore");
        System.out.println("Digita 2 per acquistare in Negozio");

        String sceltaAcquisto = scanner.nextLine();

        switch (sceltaAcquisto) {
            case "1":
                acquistaDistributore();
                break;
            case "2":
                acquistaNegozio();
                break;
            default:
                System.out.println("Scelta non valida");
        }

        EntityManager em = emf.createEntityManager();

        scanner.close();

        em.close();
        emf.close();
    }

    private static void acquistaDistributore() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vuoi acquistare un Abbonamento o un Biglietto singolo?");
        System.out.println("Digita 1 per Abbonamento");
        System.out.println("Digita 2 per Biglietto singolo");

        int sceltaTipoDocumento = scanner.nextInt();
        scanner.nextLine();

        switch (sceltaTipoDocumento) {
            case 1:
                acquistaAbbonamento();
                break;
            case 2:
                acquistaBiglietto();
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }
    }

    private static void acquistaNegozio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenutə in Negozio");
        System.out.println("Vuoi acquistare un Abbonamento o un Biglietto singolo?");
        System.out.println("Digita 1 per Abbonamento");
        System.out.println("Digita 2 per Biglietto singolo");

        int sceltaTipoDocumento = scanner.nextInt();
        scanner.nextLine();

        switch (sceltaTipoDocumento) {
            case 1:
                acquistaAbbonamento();
                break;
            case 2:
                acquistaBiglietto();
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }
    }

    private static void acquistaAbbonamento() {

        System.out.println("Abbonamento selezionato... ");

        System.out.println("Stampa in corso... ");
    }

    public static void acquistaBiglietto() {
        System.out.println("Biglietto selezionato...");

        System.out.println("Stampa in corso...");
//        Biglietto biglietto = new Biglietto(LocalDate.now(), Distributore.class, StatoBiglietto.ATTIVO, faker.address().city(), ud.findUtente(), )

    }

}
