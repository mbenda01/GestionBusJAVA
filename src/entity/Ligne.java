package entity;

import java.util.ArrayList;
import java.util.List;

public class Ligne {
    private String numero;
    private double nombreKilometres;
    private double tarif;
    private Station stationDepart;
    private Station stationArrivee;
    private List<Arret> arrets = new ArrayList<>();

    public Ligne(String numero, double nombreKilometres, double tarif, Station stationDepart, Station stationArrivee) {
        this.numero = numero;
        this.nombreKilometres = nombreKilometres;
        this.tarif = tarif;
        this.stationDepart = stationDepart;
        this.stationArrivee = stationArrivee;
    }

    public void ajouterArret(Arret arret) {
        arrets.add(arret);
    }

    @Override
    public String toString() {
        return "Ligne " + numero + " | 📏 " + nombreKilometres + " km | 💰 Tarif : " + tarif + " FCFA\n" +
                "🚏 Départ : " + stationDepart + "\n" +
                "🚏 Arrivée : " + stationArrivee + "\n" +
                "🔽 Arrets : " + arrets;
    }
}
