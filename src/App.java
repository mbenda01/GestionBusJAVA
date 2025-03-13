import service.BusService;
import service.ConducteurService;
import service.LigneService;
import service.TrajetService;
import view.BusView;
import view.ConducteurView;
import view.LigneView;
import view.TrajetView;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialisation des services
        BusService busService = new BusService();
        ConducteurService conducteurService = new ConducteurService();
        LigneService ligneService = new LigneService();
        TrajetService trajetService = new TrajetService();

        // Initialisation des vues
        BusView busView = new BusView(busService);
        ConducteurView conducteurView = new ConducteurView(conducteurService);
        LigneView ligneView = new LigneView(ligneService);
        TrajetView trajetView = new TrajetView(trajetService);

        // Menu principal
        while (true) {
            System.out.println("\n🚌 MENU PRINCIPAL - GESTION DES TRANSPORTS URBAINS 🚏");
            System.out.println("1️⃣ Gestion des Bus");
            System.out.println("2️⃣ Gestion des Conducteurs");
            System.out.println("3️⃣ Gestion des Lignes");
            System.out.println("4️⃣ Gestion des Trajets");
            System.out.println("0️⃣ Quitter");
            System.out.print("👉 Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    busView.afficherMenu();
                    break;
                case 2:
                    conducteurView.afficherMenu();
                    break;
                case 3:
                    ligneView.afficherMenu();
                    break;
                case 4:
                    trajetView.afficherMenu();
                    break;
                case 0:
                    System.out.println("👋 Merci d'avoir utilisé l'application. À bientôt !");
                    return;
                default:
                    System.out.println("❌ Option invalide. Veuillez réessayer.");
            }
        }
    }
}
