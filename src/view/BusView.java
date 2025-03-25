package view;

import services.BusService;
import java.util.Scanner;

public class BusView {
    private static Scanner sc = new Scanner(System.in);

    public static void afficherMenuBus() {
        int choix;
        do {
            System.out.println("\n===== Gestion des Bus =====");
            System.out.println("1. Ajouter un bus");
            System.out.println("2. Lister les bus");
            System.out.println("3. Modifier un bus");
            System.out.println("4. Supprimer un bus");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    ajouterBus();
                    break;
                case 2:
                    listerBuses();
                    break;
                case 3:
                    modifierBus();
                    break;
                case 4:
                    supprimerBus();
                    break;
                case 5:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 5);
    }

    private static void ajouterBus() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Immatriculation du bus : ");
        String immatriculation = sc.nextLine();
        System.out.print("Type du bus (Tata, Car rapide, DDK) : ");
        String type = sc.nextLine();
        System.out.print("Nombre de places : ");
        int places = sc.nextInt();
        System.out.print("Kilométrage : ");
        int kilometrage = sc.nextInt();
        sc.nextLine(); // Consommer la ligne vide
        System.out.print("Etat du bus (Actif, Hors service) : ");
        String etat = sc.nextLine();

        BusService.ajouterBus(immatriculation, type, places, kilometrage, etat);
    }

    private static void listerBuses() {
        BusService.listerBuses();
    }

    private static void modifierBus() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Immatriculation du bus à modifier : ");
        String immatriculation = sc.nextLine();
        System.out.print("Nouveau statut du bus (Actif, Hors service) : ");
        String newEtat = sc.nextLine();

        BusService.modifierBus(immatriculation, newEtat);
    }

    private static void supprimerBus() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Immatriculation du bus à supprimer : ");
        String immatriculation = sc.nextLine();

        BusService.supprimerBus(immatriculation);
    }
}
