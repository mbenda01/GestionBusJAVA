package view;

import entity.Bus;
import service.BusService;
import java.util.Scanner;

public class BusView {
    private BusService busService;
    private Scanner scanner = new Scanner(System.in);

    public BusView(BusService busService) {
        this.busService = busService;
    }

    public void afficherMenu() {
        while (true) {
            System.out.println("\n🚍 MENU GESTION DES BUS 🚍");
            System.out.println("1️⃣ Ajouter un bus");
            System.out.println("2️⃣ Lister les bus");
            System.out.println("3️⃣ Mettre un bus hors circulation");
            System.out.println("0️⃣ Quitter");
            System.out.print("👉 Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    ajouterBus();
                    break;
                case 2:
                    busService.listerBus();
                    break;
                case 3:
                    mettreHorsCirculation();
                    break;
                case 0:
                    System.out.println("👋 Au revoir !");
                    return;
                default:
                    System.out.println("❌ Choix invalide !");
            }
        }
    }

    private void ajouterBus() {
        System.out.print("Immatriculation : ");
        String immatriculation = scanner.nextLine();

        System.out.print("Type (Tata/Car Rapide/DDK) : ");
        String type = scanner.nextLine();

        System.out.print("Kilométrage : ");
        int kilometrage = scanner.nextInt();

        System.out.print("Nombre de places : ");
        int places = scanner.nextInt();

        busService.ajouterBus(new Bus(immatriculation, type, kilometrage, places));
    }

    private void mettreHorsCirculation() {
        System.out.print("Immatriculation du bus : ");
        String immatriculation = scanner.nextLine();
        busService.mettreHorsCirculation(immatriculation);
    }
}
