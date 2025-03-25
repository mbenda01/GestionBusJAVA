package view;

import services.StationService;
import java.util.Scanner;

public class StationView {
    private static Scanner sc = new Scanner(System.in);

    public static void afficherMenuStation() {
        int choix;
        do {
            System.out.println("\n===== Gestion des Stations =====");
            System.out.println("1. Ajouter une station");
            System.out.println("2. Lister les stations");
            System.out.println("3. Modifier une station");
            System.out.println("4. Supprimer une station");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    ajouterStation();
                    break;
                case 2:
                    listerStations();
                    break;
                case 3:
                    modifierStation();
                    break;
                case 4:
                    supprimerStation();
                    break;
                case 5:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 5);
    }

    private static void ajouterStation() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Numéro de la station : ");
        String numero = sc.nextLine();
        System.out.print("Nom de la station : ");
        String nom = sc.nextLine();
        System.out.print("Adresse de la station : ");
        String adresse = sc.nextLine();

        StationService.ajouterStation(numero, nom, adresse);
    }

    private static void listerStations() {
        StationService.listerStations();
    }

    private static void modifierStation() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Numéro de la station à modifier : ");
        String numero = sc.nextLine();
        System.out.print("Nouveau nom : ");
        String newNom = sc.nextLine();
        System.out.print("Nouvelle adresse : ");
        String newAdresse = sc.nextLine();

        StationService.modifierStation(numero, newNom, newAdresse);
    }

    private static void supprimerStation() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Numéro de la station à supprimer : ");
        String numero = sc.nextLine();

        StationService.supprimerStation(numero);
    }
}
