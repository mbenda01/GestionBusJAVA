package view;

import entity.Ligne;
import entity.Station;
import entity.Arret;
import service.LigneService;
import java.util.Scanner;

public class LigneView {
    private LigneService ligneService;
    private Scanner scanner = new Scanner(System.in);

    public LigneView(LigneService ligneService) {
        this.ligneService = ligneService;
    }

    public void afficherMenu() {
        while (true) {
            System.out.println("\n🚌 MENU GESTION DES LIGNES 🚍");
            System.out.println("1️⃣ Ajouter une ligne");
            System.out.println("2️⃣ Lister les lignes");
            System.out.println("3️⃣ Ajouter un arrêt à une ligne");
            System.out.println("0️⃣ Retour au menu principal");
            System.out.print("👉 Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    ajouterLigne();
                    break;
                case 2:
                    ligneService.listerLignes();
                    break;
                case 3:
                    ajouterArret();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("❌ Choix invalide !");
            }
        }
    }

    private void ajouterLigne() {
        System.out.print("Numéro de la ligne : ");
        String numero = scanner.nextLine();

        System.out.print("Nombre de kilomètres : ");
        double km = scanner.nextDouble();

        System.out.print("Tarif en FCFA : ");
        double tarif = scanner.nextDouble();
        scanner.nextLine(); // Consommer la nouvelle ligne

        System.out.print("Numéro de la station de départ : ");
        String numDep = scanner.nextLine();
        System.out.print("Nom de la station de départ : ");
        String nomDep = scanner.nextLine();
        System.out.print("Adresse de la station de départ : ");
        String adresseDep = scanner.nextLine();

        System.out.print("Numéro de la station d'arrivée : ");
        String numArr = scanner.nextLine();
        System.out.print("Nom de la station d'arrivée : ");
        String nomArr = scanner.nextLine();
        System.out.print("Adresse de la station d'arrivée : ");
        String adresseArr = scanner.nextLine();

        Station stationDepart = new Station(numDep, nomDep, adresseDep);
        Station stationArrivee = new Station(numArr, nomArr, adresseArr);

        Ligne ligne = new Ligne(numero, km, tarif, stationDepart, stationArrivee);
        ligneService.ajouterLigne(ligne);
    }

    private void ajouterArret() {
        System.out.print("Numéro de la ligne : ");
        String numeroLigne = scanner.nextLine();

        System.out.print("Numéro de l'arrêt : ");
        String numArret = scanner.nextLine();
        System.out.print("Nom de l'arrêt : ");
        String nomArret = scanner.nextLine();

        Arret arret = new Arret(numArret, nomArret);
        ligneService.ajouterArretALigne(numeroLigne, arret);
    }
}
