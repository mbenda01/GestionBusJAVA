package view;

import services.LigneService;
import java.util.Scanner;

public class LigneView {
    private static Scanner sc = new Scanner(System.in);

    public static void afficherMenuLigne() {
        int choix;
        do {
            System.out.println("\n===== Gestion des Lignes =====");
            System.out.println("1. Ajouter une ligne");
            System.out.println("2. Lister les lignes");
            System.out.println("3. Modifier une ligne");
            System.out.println("4. Supprimer une ligne");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    ajouterLigne();
                    break;
                case 2:
                    listerLignes();
                    break;
                case 3:
                    modifierLigne();
                    break;
                case 4:
                    supprimerLigne();
                    break;
                case 5:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 5);
    }

    private static void ajouterLigne() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Numéro de la ligne : ");
        String numero = sc.nextLine();
        System.out.print("Kilométrage de la ligne : ");
        int kilometrage = sc.nextInt();
        System.out.print("Tarif de la ligne : ");
        double tarif = sc.nextDouble();

        LigneService.ajouterLigne(numero, kilometrage, tarif);
    }

    private static void listerLignes() {
        LigneService.listerLignes();
    }

    private static void modifierLigne() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Numéro de la ligne à modifier : ");
        String numero = sc.nextLine();
        System.out.print("Nouveau kilométrage : ");
        int newKilometrage = sc.nextInt();
        System.out.print("Nouveau tarif : ");
        double newTarif = sc.nextDouble();

        LigneService.modifierLigne(numero, newKilometrage, newTarif);
    }

    private static void supprimerLigne() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Numéro de la ligne à supprimer : ");
        String numero = sc.nextLine();

        LigneService.supprimerLigne(numero);
    }
}
