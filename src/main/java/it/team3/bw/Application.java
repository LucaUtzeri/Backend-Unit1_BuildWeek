package it.team3.bw;

import com.github.javafaker.Faker;
import it.team3.bw.DAOs.AbbonamentoDAO;
import it.team3.bw.DAOs.BigliettoDAO;
import it.team3.bw.DAOs.PuntoEmissioneDAO;
import it.team3.bw.DAOs.UtenteDAO;
import it.team3.bw.biglietto.classi.Biglietto;
import it.team3.bw.biglietto.classi.Distributore;
import it.team3.bw.biglietto.classi.Negoziante;
import it.team3.bw.biglietto.classi.Utente;
import it.team3.bw.biglietto.enums.StatoBiglietto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    public static Faker faker = new Faker();
    public static Scanner scanner = new Scanner(System.in);

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("be-buildweek1");
    private static UtenteDAO ud;
    PuntoEmissioneDAO peD;
    AbbonamentoDAO abd;
    BigliettoDAO bigliettoDAO;

    public static void main(String[] args) {

        //Instansazione DAOs + Faker
        EntityManager em = emf.createEntityManager();
        Distributore distributore = new Distributore("Distributore 1", true);
        Negoziante negoziante = new Negoziante("Negozio 1", true);


//        //Aggiungere Nuovi User nella table
        System.out.println("Ciao! Prima di cominciare, accedi al tuo profilo...");
        System.out.println("1: Login");
        System.out.println("2: Registrati");
        System.out.print("---> ");
        int sceltaA = scanner.nextInt();
        switch (sceltaA) {
            case 1:
                System.out.println("Ok, inserisci il tuo nome.");
                System.out.print("---> ");
                String login = scanner.nextLine();
                if (String.valueOf(ud.findUtenteByName(login) != null){

            };
                System.out.println("Benvenuto! Che vole fare oggi ?");
                System.out.println("1: Acquista Documento da Viaggio");
                System.out.println("2: Controllare dati personali");
                System.out.println("3: Controllare Abbonamenti Attivi");
                System.out.print("Risposta ---> ");
                int sceltaServ = scanner.nextInt();
                switch (sceltaServ) {
                    case 1:
                        System.out.println("Cosa vuole acquistare ?");
                        System.out.println("1: Biglietto");
                        System.out.println("2: Abbonamento");
                        System.out.println("Annulla");
                        System.out.print("---> ");
                        int sceltaB = scanner.nextInt();
                        switch (sceltaB) {
                            case 1:
                                aquistaBiglietto(scanner);
                                break;
                            case 2:
                                aquistaAbbonamento(scanner);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Scelta non valida");
                        }
                    case 2:
                        generateNewUtente(scanner);
                        break;
                    case 3:
                        findAbbonamentoByUtente(scanner);
                        break;
                    default:
                        System.out.println("Opzione non valida");
                }
            case 2:
        }

        scanner.close();

        em.close();
        emf.close();
    }

    public static void aquistaBiglietto(Scanner scanner) {
        System.out.println("Biglietto selezionato...");

        System.out.println("Stampa in corso...");
        Biglietto biglietto = new Biglietto(LocalDate.now(), Distributore.class, StatoBiglietto.ATTIVO, faker.address().city(), ud.findUtente(), )

    }
}
