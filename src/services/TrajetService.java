package services;

import entity.Trajet;
import java.util.ArrayList;
import java.util.List;
import entity.Bus; // Ajouter l'import de la classe Bus
import entity.Conducteur; // Ajouter l'import de la classe Conducteur
import entity.Ligne; // Ajouter l'import de la classe Ligne

public class TrajetService {
    // Liste statique pour stocker les trajets
    private static List<Trajet> trajetList = new ArrayList<>();

    // Ajouter un trajet
    public static void ajouterTrajet(String type, java.util.Date date, Bus bus, Conducteur conducteur, Ligne ligne) {
        Trajet trajet = new Trajet(type, date, bus, conducteur, ligne);
        trajetList.add(trajet);
        System.out.println("Trajet ajouté avec succès !");
    }

    // Lister les trajets
    public static void listerTrajets() {
        if (trajetList.isEmpty()) {
            System.out.println("Aucun trajet enregistré.");
            return;
        }
        for (Trajet trajet : trajetList) {
            System.out.println(trajet);
        }
    }

    // Modifier un trajet
    public static void modifierTrajet(String type, java.util.Date newDate, Bus newBus, Conducteur newConducteur,
            Ligne newLigne) {
        for (Trajet trajet : trajetList) {
            if (trajet.getType().equals(type)) {
                trajet.setDate(newDate);
                trajet.setBus(newBus);
                trajet.setConducteur(newConducteur);
                trajet.setLigne(newLigne);
                System.out.println("Trajet modifié avec succès !");
                return;
            }
        }
        System.out.println("Trajet non trouvé.");
    }

    // Supprimer un trajet
    public static void supprimerTrajet(String type) {
        trajetList.removeIf(trajet -> trajet.getType().equals(type));
        System.out.println("Trajet supprimé avec succès !");
    }
}
