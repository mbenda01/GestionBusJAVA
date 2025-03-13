package service;

import entity.Bus;
import java.util.ArrayList;
import java.util.List;

public class BusService {
    private List<Bus> busList = new ArrayList<>();

    public void ajouterBus(Bus bus) {
        busList.add(bus);
        System.out.println("✅ Bus ajouté : " + bus);
    }

    public void listerBus() {
        if (busList.isEmpty()) {
            System.out.println("⚠️ Aucun bus enregistré.");
        } else {
            System.out.println("📜 Liste des bus :");
            for (Bus bus : busList) {
                System.out.println(bus);
            }
        }
    }

    public void mettreHorsCirculation(String immatriculation) {
        for (Bus bus : busList) {
            if (bus.toString().contains(immatriculation)) {
                bus.mettreHorsCirculation();
                System.out.println("🚫 Bus " + immatriculation + " mis hors circulation.");
                return;
            }
        }
        System.out.println("❌ Bus introuvable.");
    }
}
