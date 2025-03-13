package service;

import entity.Conducteur;
import java.util.ArrayList;
import java.util.List;

public class ConducteurService {
    private List<Conducteur> conducteurs = new ArrayList<>();

    public void ajouterConducteur(Conducteur conducteur) {
        conducteurs.add(conducteur);
        System.out.println("✅ Conducteur ajouté : " + conducteur);
    }

    public void listerConducteurs() {
        if (conducteurs.isEmpty()) {
            System.out.println("⚠️ Aucun conducteur enregistré.");
        } else {
            System.out.println("📜 Liste des conducteurs :");
            for (Conducteur conducteur : conducteurs) {
                System.out.println(conducteur);
            }
        }
    }

    public Conducteur rechercherConducteur(String matricule) {
        for (Conducteur conducteur : conducteurs) {
            if (conducteur.getMatricule().equalsIgnoreCase(matricule)) {
                return conducteur;
            }
        }
        return null;
    }

    public void affecterConducteur(String matricule) {
        Conducteur conducteur = rechercherConducteur(matricule);
        if (conducteur != null && conducteur.isDisponible()) {
            conducteur.setDisponible(false);
            System.out.println("🚗 Conducteur " + matricule + " affecté à un trajet.");
        } else {
            System.out.println("❌ Conducteur introuvable ou déjà affecté.");
        }
    }

    public void libererConducteur(String matricule) {
        Conducteur conducteur = rechercherConducteur(matricule);
        if (conducteur != null && !conducteur.isDisponible()) {
            conducteur.setDisponible(true);
            System.out.println("✅ Conducteur " + matricule + " est maintenant disponible.");
        } else {
            System.out.println("❌ Conducteur introuvable ou déjà disponible.");
        }
    }
}
