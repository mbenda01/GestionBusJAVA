package service;

import entity.Trajet;
import entity.Ligne;
import entity.Bus;
import entity.Conducteur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrajetService {
    private List<Trajet> trajets = new ArrayList<>();

    public void planifierTrajet(String id, Ligne ligne, Bus bus, Conducteur conducteur, String type, LocalDate date,
            int nombreTickets) {
        if (!conducteur.isDisponible()) {
            System.out.println("❌ Conducteur déjà affecté à un autre trajet.");
            return;
        }

        Trajet trajet = new Trajet(id, ligne, bus, conducteur, type, date, nombreTickets);
        trajets.add(trajet);
        conducteur.setDisponible(false); // Conducteur devient indisponible
        System.out.println("✅ Trajet planifié avec succès !");
    }

    public void listerTrajets() {
        if (trajets.isEmpty()) {
            System.out.println("⚠️ Aucun trajet planifié.");
        } else {
            System.out.println("📜 Liste des trajets :");
            for (Trajet trajet : trajets) {
                System.out.println(trajet);
            }
        }
    }

    public void validerTrajet(String id, int ticketsVendus) {
        for (Trajet trajet : trajets) {
            if (trajet.toString().contains(id) && !trajet.toString().contains("Validé")) {
                trajet.validerTrajet(ticketsVendus);
                trajet.getConducteur().setDisponible(true); // Conducteur devient disponible après validation
                System.out.println("✅ Trajet validé !");
                return;
            }
        }
        System.out.println("❌ Trajet introuvable ou déjà validé.");
    }
}
