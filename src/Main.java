import java.util.Scanner;
import view.BusView; // Importer BusView
import view.ConducteurView; // Importer ConducteurView
import view.LigneView; // Importer LigneView
import view.StationView; // Importer StationView
import view.ArretView; // Importer ArretView
import view.TrajetView; // Importer TrajetView

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choix;
        do {
            // Affichage du menu principal
            System.out.println("\n===== Application de Gestion des Autobus Urbains =====");
            System.out.println("1. Gestion Parc");
            System.out.println("2. Gestion Trajet");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    afficherMenuParc();
                    break;
                case 2:
                    afficherMenuTrajet();
                    break;
                case 3:
                    System.out.println("Fermeture de l'application...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 3);
    }

    private static void afficherMenuParc() {
        int choix;
        do {
            System.out.println("\n===== Gestion Parc =====");
            System.out.println("1. Gestion des Bus");
            System.out.println("2. Gestion des Conducteurs");
            System.out.println("3. Retour au menu principal");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    BusView.afficherMenuBus();
                    break;
                case 2:
                    ConducteurView.afficherMenuConducteur();
                    break;
                case 3:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 3);
    }

    private static void afficherMenuTrajet() {
        int choix;
        do {
            System.out.println("\n===== Gestion Trajet =====");
            System.out.println("1. Gestion des Lignes");
            System.out.println("2. Gestion des Stations");
            System.out.println("3. Gestion des Arrêts");
            System.out.println("4. Gestion des Trajets");
            System.out.println("5. Retour au menu principal");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    LigneView.afficherMenuLigne();
                    break;
                case 2:
                    StationView.afficherMenuStation();
                    break;
                case 3:
                    ArretView.afficherMenuArret();
                    break;
                case 4:
                    TrajetView.afficherMenuTrajet();
                    break;
                case 5:
                    System.out.println("Retour au menu principal...");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 5);
    }
}
