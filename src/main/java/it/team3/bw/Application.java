package it.team3.bw;

import com.github.javafaker.Faker;
import it.team3.bw.DAOs.*;
import it.team3.bw.biglietto.classi.Distributore;
import it.team3.bw.biglietto.classi.Negoziante;
import it.team3.bw.biglietto.classi.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Application {

    //instanza di tutti i DAOs + Faker come static per renderli disponibili in tutta la Applicazione

    public static Faker faker = new Faker();
    public static Scanner scanner = new Scanner(System.in);
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("be-buildweek1");
    public static EntityManager em = emf.createEntityManager();
    private static UtenteDAO ud = new UtenteDAO(em);
    private static PuntoEmissioneDAO ped = new PuntoEmissioneDAO(em);
    private static TesseraDAO td = new TesseraDAO(em);
    private static DocumentoDAO dd = new DocumentoDAO(em);
    private static VidimazioneDAO vd = new VidimazioneDAO(em);


    public static void main(String[] args) {

        //Instansazione DAOs + Faker

        Distributore distributore = new Distributore("Distributore 1", true);
        Negoziante negoziante = new Negoziante("Negozio 1", true);



        int utenti = 50;
        for (int i = 0; i < utenti; i++){
            new Utente(faker.name().firstName(),faker.name().lastName());
        }

//        //Inizio Interazione con l'utente
//        System.out.println("Ciao! Prima di cominciare, accedi al tuo profilo...");
//        System.out.println("1: Login");
//        System.out.println("2: Registrati");
//        System.out.print("---> ");
//        //l'utente inserisce una scelta tra i numeri dati
//        int sceltaA = scanner.nextInt();
//        switch (sceltaA) {
//            case 1:
//                System.out.println("Ok, inserisci il tuo nome.");
//                System.out.print("---> ");
//                //inserzione nome utente ---> interrogazione database tramite metodo che invoca una query
//                String login = scanner.nextLine();
//                if (String.valueOf(ud.findUtenteByName(login) != null){
//
//            };
//                System.out.println("Benvenuto! Che vole fare oggi ?");
//                System.out.println("1: Acquista Documento da Viaggio");
//                System.out.println("2: Controllare dati personali");
//                System.out.println("3: Controllare Abbonamenti Attivi");
//                System.out.print("Risposta ---> ");
//                //scelta del servizio desiderato
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
//                            //chiamata di metodi di generazione SQL a seconda della scelta dell'utente
//                            case 1:
//                                aquistaBiglietto(scanner);
//                                break;
//                                //ogni break interrompe il codice dopo la risoluzione del metodo chiamato
//                            case 2:
//                                acquistaAbbonamento(scanner);
//                                break;
//                            case 3:
//                                break;
//                            default:
//                                System.out.println("Scelta non valida");
//                                break;
//                                //break in caso di failsafe + messaggio di errore
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
//                //Route che il codice percorre in caso il nome dell'utente non è presente ne database
//            case 2:
//        }
//        //interruzione funzione scanner
//        scanner.close();
//        //interruzione entity manager
//        em.close();
//        emf.close();
//    }
//    //metodo creazione biglietto, richiamato dallo scanner
//    public static void acquistaBiglietto(Scanner scanner) {
//        System.out.println("Biglietto selezionato...");
//        System.out.println("Stampa in corso...");
//        Biglietto biglietto = new Biglietto(LocalDate.now(),ped.getPuntoEmissione(PuntoEmissione.class,);)
//    }
}
}
