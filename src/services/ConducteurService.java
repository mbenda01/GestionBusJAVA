package services;

import entity.Conducteur;
import java.util.ArrayList;
import java.util.List;

public class ConducteurService {
    // Liste statique pour stocker les conducteurs
    private static List<Conducteur> conducteurList = new ArrayList<>();

    // Ajouter un conducteur
    public static void ajouterConducteur(String matricule, String nom, String prenom, String telephone,
            String typePermis, String dateAffectation, String statut) {
        Conducteur conducteur = new Conducteur(matricule, nom, prenom, telephone, typePermis, dateAffectation, statut);
        conducteurList.add(conducteur);
        System.out.println("Conducteur ajouté avec succès !");
    }

    // Lister les conducteurs
    public static void listerConducteurs() {
        if (conducteurList.isEmpty()) {
            System.out.println("Aucun conducteur n'est enregistré.");
            return;
        }
        for (Conducteur conducteur : conducteurList) {
            System.out.println(conducteur);
        }
    }

    // Modifier un conducteur
    public static void modifierConducteur(String matricule, String newStatut) {
        for (Conducteur conducteur : conducteurList) {
            if (conducteur.getMatricule().equals(matricule)) {
                conducteur.setStatut(newStatut);
                System.out.println("Conducteur modifié avec succès !");
                return;
            }
        }
        System.out.println("Conducteur non trouvé.");
    }

    // Supprimer un conducteur
    public static void supprimerConducteur(String matricule) {
        conducteurList.removeIf(conducteur -> conducteur.getMatricule().equals(matricule));
        System.out.println("Conducteur supprimé avec succès !");
    }

    // Méthode pour obtenir un conducteur par son matricule
    public static Conducteur trouverConducteurParMatricule(String matricule) {
        for (Conducteur conducteur : conducteurList) {
            if (conducteur.getMatricule().equals(matricule)) {
                return conducteur;
            }
        }
        return null;
    }
}
