package view;

import services.ConducteurService;
import java.util.Scanner;

public class ConducteurView {
    private static Scanner sc = new Scanner(System.in);

    public static void afficherMenuConducteur() {
        int choix;
        do {
            System.out.println("\n===== Gestion des Conducteurs =====");
            System.out.println("1. Ajouter un conducteur");
            System.out.println("2. Lister les conducteurs");
            System.out.println("3. Modifier un conducteur");
            System.out.println("4. Supprimer un conducteur");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    ajouterConducteur();
                    break;
                case 2:
                    listerConducteurs();
                    break;
                case 3:
                    modifierConducteur();
                    break;
                case 4:
                    supprimerConducteur();
                    break;
                case 5:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 5);
    }

    private static void ajouterConducteur() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Matricule du conducteur : ");
        String matricule = sc.nextLine();
        System.out.print("Nom du conducteur : ");
        String nom = sc.nextLine();
        System.out.print("Prénom du conducteur : ");
        String prenom = sc.nextLine();
        System.out.print("Numéro de téléphone : ");
        String telephone = sc.nextLine();
        System.out.print("Type de permis (Lourd, Léger) : ");
        String typePermis = sc.nextLine();
        System.out.print("Date d'affectation : ");
        String dateAffectation = sc.nextLine();
        System.out.print("Statut du conducteur (Actif, En congé, Suspendu) : ");
        String statut = sc.nextLine();

        ConducteurService.ajouterConducteur(matricule, nom, prenom, telephone, typePermis, dateAffectation, statut);
    }

    private static void listerConducteurs() {
        ConducteurService.listerConducteurs();
    }

    private static void modifierConducteur() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Matricule du conducteur à modifier : ");
        String matricule = sc.nextLine();
        System.out.print("Nouveau statut du conducteur (Actif, En congé, Suspendu) : ");
        String newStatut = sc.nextLine();

        ConducteurService.modifierConducteur(matricule, newStatut);
    }

    private static void supprimerConducteur() {
        sc.nextLine(); // Consommer l'entrée précédente
        System.out.print("Matricule du conducteur à supprimer : ");
        String matricule = sc.nextLine();

        ConducteurService.supprimerConducteur(matricule);
    }
}
