package service;

import entity.Ligne;
import entity.Station;
import entity.Arret;
import java.util.ArrayList;
import java.util.List;

public class LigneService {
    private List<Ligne> lignes = new ArrayList<>();

    public void ajouterLigne(Ligne ligne) {
        lignes.add(ligne);
        System.out.println("✅ Ligne ajoutée : " + ligne);
    }

    public void listerLignes() {
        if (lignes.isEmpty()) {
            System.out.println("⚠️ Aucune ligne enregistrée.");
        } else {
            System.out.println("📜 Liste des lignes :");
            for (Ligne ligne : lignes) {
                System.out.println(ligne);
            }
        }
    }

    public Ligne rechercherLigne(String numero) {
        for (Ligne ligne : lignes) {
            if (ligne.toString().contains(numero)) {
                return ligne;
            }
        }
        return null;
    }

    public void ajouterArretALigne(String numeroLigne, Arret arret) {
        Ligne ligne = rechercherLigne(numeroLigne);
        if (ligne != null) {
            ligne.ajouterArret(arret);
            System.out.println("🚏 Arrêt ajouté à la ligne " + numeroLigne);
        } else {
            System.out.println("❌ Ligne introuvable.");
        }
    }
}
