package view;

import entity.Ligne;
import services.ArretService;
import services.LigneService;
import java.util.Scanner;

public class ArretView {
    private static Scanner sc = new Scanner(System.in);

    public static void afficherMenuArret() {
        int choix;
        do {
            System.out.println("\n===== Gestion des Arrêts =====");
            System.out.println("1. Ajouter un arrêt");
            System.out.println("2. Lister les arrêts");
            System.out.println("3. Modifier un arrêt");
            System.out.println("4. Supprimer un arrêt");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    ajouterArret();
                    break;
                case 2:
                    listerArrets();
                    break;
                case 3:
                    modifierArret();
                    break;
                case 4:
                    supprimerArret();
                    break;
                case 5:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 5);
    }

    private static void ajouterArret() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Numéro de l'arrêt : ");
        String numero = sc.nextLine();
        System.out.print("Nom de l'arrêt : ");
        String nom = sc.nextLine();

        // Lister les lignes disponibles
        LigneService.listerLignes();
        System.out.print("Numéro de la ligne associée à cet arrêt : ");
        String numeroLigne = sc.nextLine();

        Ligne ligne = LigneService.trouverLigneParNumero(numeroLigne); // Méthode à créer dans LigneService pour
                                                                       // retrouver une ligne
        if (ligne != null) {
            ArretService.ajouterArret(numero, nom, ligne);
        } else {
            System.out.println("Ligne non trouvée.");
        }
    }

    private static void listerArrets() {
        ArretService.listerArrets();
    }

    private static void modifierArret() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Numéro de l'arrêt à modifier : ");
        String numero = sc.nextLine();
        System.out.print("Nouveau nom de l'arrêt : ");
        String newNom = sc.nextLine();

        // Lister les lignes disponibles
        LigneService.listerLignes();
        System.out.print("Nouvelle ligne associée à cet arrêt : ");
        String numeroLigne = sc.nextLine();

        Ligne ligne = LigneService.trouverLigneParNumero(numeroLigne); // Méthode à créer dans LigneService pour
                                                                       // retrouver une ligne
        if (ligne != null) {
            ArretService.modifierArret(numero, newNom, ligne);
        } else {
            System.out.println("Ligne non trouvée.");
        }
    }

    private static void supprimerArret() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Numéro de l'arrêt à supprimer : ");
        String numero = sc.nextLine();

        ArretService.supprimerArret(numero);
    }
}
