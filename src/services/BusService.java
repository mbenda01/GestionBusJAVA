package services;

import entity.Bus;
import java.util.ArrayList;
import java.util.List;

public class BusService {
    // Liste statique pour stocker les bus
    private static List<Bus> busList = new ArrayList<>();

    // Ajouter un bus
    public static void ajouterBus(String immatriculation, String type, int places, int kilometrage, String etat) {
        Bus bus = new Bus(immatriculation, type, places, kilometrage, etat);
        busList.add(bus);
        System.out.println("Bus ajouté avec succès !");
    }

    // Lister les bus
    public static void listerBuses() {
        if (busList.isEmpty()) {
            System.out.println("Aucun bus n'est enregistré.");
            return;
        }
        for (Bus bus : busList) {
            System.out.println(bus);
        }
    }

    // Modifier un bus
    public static void modifierBus(String immatriculation, String newEtat) {
        for (Bus bus : busList) {
            if (bus.getImmatriculation().equals(immatriculation)) {
                bus.setEtat(newEtat);
                System.out.println("Bus modifié avec succès !");
                return;
            }
        }
        System.out.println("Bus non trouvé.");
    }

    // Supprimer un bus
    public static void supprimerBus(String immatriculation) {
        busList.removeIf(bus -> bus.getImmatriculation().equals(immatriculation));
        System.out.println("Bus supprimé avec succès !");
    }

    // Méthode pour obtenir un bus par son immatriculation
    public static Bus trouverBusParImmatriculation(String immatriculation) {
        for (Bus bus : busList) {
            if (bus.getImmatriculation().equals(immatriculation)) {
                return bus;
            }
        }
        return null;
    }
}
