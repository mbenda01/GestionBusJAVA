package view;

import entity.Trajet;
import entity.Ligne;
import entity.Bus;
import entity.Conducteur;
import service.TrajetService;

import java.time.LocalDate;
import java.util.Scanner;

public class TrajetView {
    private TrajetService trajetService;
    private Scanner scanner = new Scanner(System.in);

    public TrajetView(TrajetService trajetService) {
        this.trajetService = trajetService;
    }

    public void afficherMenu() {
        while (true) {
            System.out.println("\n🛣️ MENU GESTION DES TRAJETS 🚏");
            System.out.println("1️⃣ Planifier un trajet");
            System.out.println("2️⃣ Lister les trajets");
            System.out.println("3️⃣ Valider un trajet");
            System.out.println("0️⃣ Retour au menu principal");
            System.out.print("👉 Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    planifierTrajet();
                    break;
                case 2:
                    trajetService.listerTrajets();
                    break;
                case 3:
                    validerTrajet();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("❌ Choix invalide !");
            }
        }
    }

    private void planifierTrajet() {
        System.out.print("ID du trajet : ");
        String id = scanner.nextLine();

        System.out.print("Numéro de la ligne : ");
        String numeroLigne = scanner.nextLine();

        System.out.print("Immatriculation du bus : ");
        String immatriculationBus = scanner.nextLine();

        System.out.print("Matricule du conducteur : ");
        String matriculeConducteur = scanner.nextLine();

        System.out.print("Type de trajet (Aller/Retour) : ");
        String type = scanner.nextLine();

        System.out.print("Date (AAAA-MM-JJ) : ");
        String dateStr = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateStr);

        System.out.print("Nombre de tickets disponibles : ");
        int nombreTickets = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        // Remplace ces lignes avec une récupération réelle des objets
        Ligne ligne = new Ligne(numeroLigne, 10, 500, null, null);
        Bus bus = new Bus(immatriculationBus, "Tata", 10000, 50);
        Conducteur conducteur = new Conducteur(matriculeConducteur, "Nom", "Prénom", "0700000000", "Lourd");

        trajetService.planifierTrajet(id, ligne, bus, conducteur, type, date, nombreTickets);
    }

    private void validerTrajet() {
        System.out.print("ID du trajet à valider : ");
        String id = scanner.nextLine();

        System.out.print("Nombre de tickets réellement vendus : ");
        int ticketsVendus = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        trajetService.validerTrajet(id, ticketsVendus);
    }
}
