package entity;

import java.time.LocalDate;

public class Trajet {
    private String id;
    private Ligne ligne;
    private Bus bus;
    private Conducteur conducteur;
    private String type; // Aller | Retour
    private LocalDate date;
    private int nombreTickets;
    private int ticketsVendus;
    private boolean valide; // Par défaut false, devient true après validation

    public Trajet(String id, Ligne ligne, Bus bus, Conducteur conducteur, String type, LocalDate date,
            int nombreTickets) {
        this.id = id;
        this.ligne = ligne;
        this.bus = bus;
        this.conducteur = conducteur;
        this.type = type;
        this.date = date;
        this.nombreTickets = nombreTickets;
        this.ticketsVendus = 0;
        this.valide = false;
    }

    public void validerTrajet(int ticketsVendus) {
        this.ticketsVendus = ticketsVendus;
        this.valide = true;
    }

    @Override
    public String toString() {
        return "🚍 Trajet [" + id + "] - " + type + " | 🗓️ " + date +
                "\n📌 Ligne: " + ligne +
                "\n🚌 Bus: " + bus +
                "\n👨‍✈️ Conducteur: " + conducteur +
                "\n🎫 Tickets disponibles: " + nombreTickets +
                "\n✅ Tickets vendus: " + ticketsVendus +
                "\n🟢 Statut: " + (valide ? "Validé" : "Non validé");
    }
}
