package services;

import entity.Ligne;
import java.util.ArrayList;
import java.util.List;

public class LigneService {
    // Liste statique pour stocker les lignes
    private static List<Ligne> ligneList = new ArrayList<>();

    // Ajouter une ligne
    public static void ajouterLigne(String numero, int kilometrage, double tarif) {
        Ligne ligne = new Ligne(numero, kilometrage, tarif);
        ligneList.add(ligne);
        System.out.println("Ligne ajoutée avec succès !");
    }

    // Lister les lignes
    public static void listerLignes() {
        if (ligneList.isEmpty()) {
            System.out.println("Aucune ligne enregistrée.");
            return;
        }
        for (Ligne ligne : ligneList) {
            System.out.println(ligne);
        }
    }

    // Modifier une ligne
    public static void modifierLigne(String numero, int newKilometrage, double newTarif) {
        for (Ligne ligne : ligneList) {
            if (ligne.getNumero().equals(numero)) {
                ligne.setKilometrage(newKilometrage);
                ligne.setTarif(newTarif);
                System.out.println("Ligne modifiée avec succès !");
                return;
            }
        }
        System.out.println("Ligne non trouvée.");
    }

    // Supprimer une ligne
    public static void supprimerLigne(String numero) {
        ligneList.removeIf(ligne -> ligne.getNumero().equals(numero));
        System.out.println("Ligne supprimée avec succès !");
    }

    // Méthode pour trouver une ligne par son numéro
    public static Ligne trouverLigneParNumero(String numero) {
        for (Ligne ligne : ligneList) {
            if (ligne.getNumero().equals(numero)) {
                return ligne;
            }
        }
        return null; // Retourne null si la ligne n'est pas trouvée
    }
}
