package services;

import entity.Station;
import java.util.ArrayList;
import java.util.List;

public class StationService {
    // Liste statique pour stocker les stations
    private static List<Station> stationList = new ArrayList<>();

    // Ajouter une station
    public static void ajouterStation(String numero, String nom, String adresse) {
        Station station = new Station(numero, nom, adresse);
        stationList.add(station);
        System.out.println("Station ajoutée avec succès !");
    }

    // Lister les stations
    public static void listerStations() {
        if (stationList.isEmpty()) {
            System.out.println("Aucune station enregistrée.");
            return;
        }
        for (Station station : stationList) {
            System.out.println(station);
        }
    }

    // Modifier une station
    public static void modifierStation(String numero, String newNom, String newAdresse) {
        for (Station station : stationList) {
            if (station.getNumero().equals(numero)) {
                station.setNom(newNom);
                station.setAdresse(newAdresse);
                System.out.println("Station modifiée avec succès !");
                return;
            }
        }
        System.out.println("Station non trouvée.");
    }

    // Supprimer une station
    public static void supprimerStation(String numero) {
        stationList.removeIf(station -> station.getNumero().equals(numero));
        System.out.println("Station supprimée avec succès !");
    }
}
