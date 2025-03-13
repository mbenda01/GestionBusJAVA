package entity;

public class Bus {
    private String immatriculation;
    private String type; // Tata, Car Rapide, DDK
    private int kilometrage;
    private int nombrePlaces;
    private boolean enCirculation;

    public Bus(String immatriculation, String type, int kilometrage, int nombrePlaces) {
        this.immatriculation = immatriculation;
        this.type = type;
        this.kilometrage = kilometrage;
        this.nombrePlaces = nombrePlaces;
        this.enCirculation = true;
    }

    public void mettreHorsCirculation() {
        this.enCirculation = false;
    }

    public boolean estEnCirculation() {
        return enCirculation;
    }

    @Override
    public String toString() {
        return "Bus " + immatriculation + " [" + type + ", " + kilometrage + " km, " + nombrePlaces + " places, "
                + (enCirculation ? "En service" : "Hors circulation") + "]";
    }
}
