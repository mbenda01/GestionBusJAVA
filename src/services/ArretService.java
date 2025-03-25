package services;

import entity.Arret;
import java.util.ArrayList;
import java.util.List;
import entity.Ligne; // Ajouter l'import de la classe Ligne

public class ArretService {
    // Liste statique pour stocker les arrêts
    private static List<Arret> arretList = new ArrayList<>();

    // Ajouter un arrêt
    public static void ajouterArret(String numero, String nom, Ligne ligne) {
        Arret arret = new Arret(numero, nom, ligne);
        arretList.add(arret);
        System.out.println("Arrêt ajouté avec succès !");
    }

    // Lister les arrêts
    public static void listerArrets() {
        if (arretList.isEmpty()) {
            System.out.println("Aucun arrêt enregistré.");
            return;
        }
        for (Arret arret : arretList) {
            System.out.println(arret);
        }
    }

    // Modifier un arrêt
    public static void modifierArret(String numero, String newNom, Ligne newLigne) {
        for (Arret arret : arretList) {
            if (arret.getNumero().equals(numero)) {
                arret.setNom(newNom);
                arret.setLigne(newLigne);
                System.out.println("Arrêt modifié avec succès !");
                return;
            }
        }
        System.out.println("Arrêt non trouvé.");
    }

    // Supprimer un arrêt
    public static void supprimerArret(String numero) {
        arretList.removeIf(arret -> arret.getNumero().equals(numero));
        System.out.println("Arrêt supprimé avec succès !");
    }
}
