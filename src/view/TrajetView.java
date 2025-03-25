package view;

import services.TrajetService;
import services.BusService;
import services.ConducteurService;
import services.LigneService;
import java.util.Scanner;
import java.util.Date;
import entity.Bus; // Importer la classe Bus
import entity.Conducteur; // Importer la classe Conducteur
import entity.Ligne; // Importer la classe Ligne

public class TrajetView {
    private static Scanner sc = new Scanner(System.in);

    public static void afficherMenuTrajet() {
        int choix;
        do {
            System.out.println("\n===== Gestion des Trajets =====");
            System.out.println("1. Ajouter un trajet");
            System.out.println("2. Lister les trajets");
            System.out.println("3. Modifier un trajet");
            System.out.println("4. Supprimer un trajet");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    ajouterTrajet();
                    break;
                case 2:
                    listerTrajets();
                    break;
                case 3:
                    modifierTrajet();
                    break;
                case 4:
                    supprimerTrajet();
                    break;
                case 5:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 5);
    }

    private static void ajouterTrajet() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Type de trajet (Aller/Retour) : ");
        String type = sc.nextLine();
        System.out.print("Date du trajet (format YYYY-MM-DD) : ");
        String dateStr = sc.nextLine();
        Date date = new Date(dateStr);

        // Lister les bus, conducteurs et lignes disponibles
        BusService.listerBuses();
        System.out.print("Immatriculation du bus : ");
        String immatriculation = sc.nextLine();
        Bus bus = BusService.trouverBusParImmatriculation(immatriculation);

        ConducteurService.listerConducteurs();
        System.out.print("Matricule du conducteur : ");
        String matricule = sc.nextLine();
        Conducteur conducteur = ConducteurService.trouverConducteurParMatricule(matricule);

        LigneService.listerLignes();
        System.out.print("Numéro de la ligne : ");
        String numeroLigne = sc.nextLine();
        Ligne ligne = LigneService.trouverLigneParNumero(numeroLigne);

        if (bus != null && conducteur != null && ligne != null) {
            TrajetService.ajouterTrajet(type, date, bus, conducteur, ligne);
        } else {
            System.out.println("Erreur dans les informations fournies.");
        }
    }

    private static void listerTrajets() {
        TrajetService.listerTrajets();
    }

    private static void modifierTrajet() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Type du trajet à modifier (Aller/Retour) : ");
        String type = sc.nextLine();
        System.out.print("Nouvelle date du trajet (format YYYY-MM-DD) : ");
        String dateStr = sc.nextLine();
        Date newDate = new Date(dateStr);

        // Lister les bus, conducteurs et lignes disponibles
        BusService.listerBuses();
        System.out.print("Nouvelle immatriculation du bus : ");
        String newImmatriculation = sc.nextLine();
        Bus newBus = BusService.trouverBusParImmatriculation(newImmatriculation);

        ConducteurService.listerConducteurs();
        System.out.print("Nouveau matricule du conducteur : ");
        String newMatricule = sc.nextLine();
        Conducteur newConducteur = ConducteurService.trouverConducteurParMatricule(newMatricule);

        LigneService.listerLignes();
        System.out.print("Nouvelle ligne du trajet : ");
        String newNumeroLigne = sc.nextLine();
        Ligne newLigne = LigneService.trouverLigneParNumero(newNumeroLigne);

        if (newBus != null && newConducteur != null && newLigne != null) {
            TrajetService.modifierTrajet(type, newDate, newBus, newConducteur, newLigne);
        } else {
            System.out.println("Erreur dans les informations fournies.");
        }
    }

    private static void supprimerTrajet() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Type du trajet à supprimer (Aller/Retour) : ");
        String type = sc.nextLine();

        TrajetService.supprimerTrajet(type);
    }
}
