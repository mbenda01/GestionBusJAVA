package view;

import entity.Conducteur;
import service.ConducteurService;
import java.util.Scanner;

public class ConducteurView {
    private ConducteurService conducteurService;
    private Scanner scanner = new Scanner(System.in);

    public ConducteurView(ConducteurService conducteurService) {
        this.conducteurService = conducteurService;
    }

    public void afficherMenu() {
        while (true) {
            System.out.println("\n👨‍✈️ MENU GESTION DES CONDUCTEURS 🚍");
            System.out.println("1️⃣ Ajouter un conducteur");
            System.out.println("2️⃣ Lister les conducteurs");
            System.out.println("3️⃣ Affecter un conducteur");
            System.out.println("4️⃣ Libérer un conducteur");
            System.out.println("0️⃣ Retour au menu principal");
            System.out.print("👉 Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    ajouterConducteur();
                    break;
                case 2:
                    conducteurService.listerConducteurs();
                    break;
                case 3:
                    affecterConducteur();
                    break;
                case 4:
                    libererConducteur();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("❌ Choix invalide !");
            }
        }
    }

    private void ajouterConducteur() {
        System.out.print("Matricule : ");
        String matricule = scanner.nextLine();

        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Téléphone : ");
        String telephone = scanner.nextLine();

        System.out.print("Type de permis (Lourd/Léger) : ");
        String typePermis = scanner.nextLine();

        Conducteur conducteur = new Conducteur(matricule, nom, prenom, telephone, typePermis);
        conducteurService.ajouterConducteur(conducteur);
    }

    private void affecterConducteur() {
        System.out.print("Matricule du conducteur à affecter : ");
        String matricule = scanner.nextLine();
        conducteurService.affecterConducteur(matricule);
    }

    private void libererConducteur() {
        System.out.print("Matricule du conducteur à libérer : ");
        String matricule = scanner.nextLine();
        conducteurService.libererConducteur(matricule);
    }
}
