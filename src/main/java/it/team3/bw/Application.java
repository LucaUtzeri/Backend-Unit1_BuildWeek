package it.team3.bw;

import com.github.javafaker.Faker;


import it.team3.bw.DAOs.PuntoEmissioneDAO;
import it.team3.bw.DAOs.UtenteDAO;

import it.team3.bw.DAOs.*;
import it.team3.bw.biglietto.classi.Distributore;
import it.team3.bw.biglietto.classi.Negoziante;
import it.team3.bw.biglietto.classi.Utente;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Application {

    public static EntityManager em = emf.createEntityManager();
    private static UtenteDAO ud = new UtenteDAO(em);
    private static PuntoEmissioneDAO ped = new PuntoEmissioneDAO(em);
    private static TesseraDAO td = new TesseraDAO(em);
    private static DocumentoDAO dd = new DocumentoDAO(em);
    private static VidimazioneDAO vd = new VidimazioneDAO(em);
    //instanza di tutti i DAOs + Faker come static per renderli disponibili in tutta la Applicazione

    public static Faker faker = new Faker();
    public static Scanner scanner = new Scanner(System.in);
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("be-buildweek1");

    private static UtenteDAO ud;
    private static PuntoEmissioneDAO peD;


    public static void main(String[] args) {

//        Distributore distributore = new Distributore("Distributore 1", true);
//        Negoziante negoziante = new Negoziante("Negozio 1", true);



        int utenti = 50;
        for (int i = 0; i < utenti; i++){
            new Utente(faker.name().firstName(),faker.name().lastName());
        }


        Scanner scanner = new Scanner(System.in);
            Faker faker = new Faker();

            String nomeUtente = faker.name().firstName();
            String cognomeUtente = faker.name().lastName();

            System.out.println("Benvenuto " + nomeUtente + "!");

            System.out.println("Dove vuoi acquistare il documento di viaggio?");
            System.out.println("Digita 1 per acquistare al Distributore");
            System.out.println("Digita 2 per acquistare in Negozio");

            String sceltaAcquisto = scanner.nextLine();

            switch (sceltaAcquisto) {
                case "1":
                    acquistaDistributore();
                    break;
//                case "2":
//                   ();
//                   break;
                default:
                    System.out.println("Scelta non valida");
            }

        EntityManager em = emf.createEntityManager();
            



        //Instansazione DAOs + Faker
//        EntityManager em = emf.createEntityManager();
//        Distributore distributore = new Distributore("Distributore 1", true);
//        Negoziante negoziante = new Negoziante("Negozio 1", true);


//        //Aggiungere Nuovi User nella table
        //System.out.println("Ciao! Prima di cominciare, accedi al tuo profilo...");
       // System.out.println("1: Login");
       // System.out.println("2: Registrati");
       // System.out.print("---> ");
        //int sceltaA = scanner.nextInt();
       // switch (sceltaA) {
            //case 1:
               // System.out.println("Ok, inserisci il tuo nome.");
               // System.out.print("---> ");
//                String login = scanner.nextLine();
//                if (String.valueOf(ud.findUtenteByName(login) != null){
//
//            };
//                System.out.println("Benvenuto! Che vole fare oggi ?");
//                System.out.println("1: Acquista Documento da Viaggio");
//                System.out.println("2: Controllare dati personali");
//                System.out.println("3: Controllare Abbonamenti Attivi");
//                System.out.print("Risposta ---> ");
//                int sceltaServ = scanner.nextInt();
//                switch (sceltaServ) {
//                    case 1:
//                        System.out.println("Cosa vuole acquistare ?");
//                        System.out.println("1: Biglietto");
//                        System.out.println("2: Abbonamento");
//                        System.out.println("Annulla");
//                        System.out.print("---> ");
//                        int sceltaB = scanner.nextInt();
//                        switch (sceltaB) {
//                            case 1:
//                                aquistaBiglietto(scanner);
//                                break;
//                            case 2:
//                                aquistaAbbonamento(scanner);
//                                break;
//                            case 3:
//                                break;
//                            default:
//                                System.out.println("Scelta non valida");
//                        }
//                    case 2:
//                        generateNewUtente(scanner);
//                        break;
//                    case 3:
//                        findAbbonamentoByUtente(scanner);
//                        break;
//                    default:
//                        System.out.println("Opzione non valida");
//                }
//            case 2:
//        }

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
                acquistaAbbonamentoDistributore();
                break;
            case 2:
                acquistaBigliettoDistributore();
                break;
            default:
                System.out.println("Scelta non valida.");
                break;
        }
    }

    private static void acquistaAbbonamentoDistributore() {

        System.out.println("Abbonamento selezionato... ");

        System.out.println("Stampa in corso... ");
    }

    public static void acquistaBigliettoDistributore() {
        System.out.println("Biglietto selezionato...");

        System.out.println("Stampa in corso...");
//        Biglietto biglietto = new Biglietto(LocalDate.now(), Distributore.class, StatoBiglietto.ATTIVO, faker.address().city(), ud.findUtente(), )

    }

}
