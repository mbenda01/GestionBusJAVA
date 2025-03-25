package entity;

public class Bus {
    private String immatriculation;
    private String type;
    private int places;
    private int kilometrage;
    private String etat;

    public Bus(String immatriculation, String type, int places, int kilometrage, String etat) {
        this.immatriculation = immatriculation;
        this.type = type;
        this.places = places;
        this.kilometrage = kilometrage;
        this.etat = etat;
    }

    // Getters and Setters
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Immatriculation: " + immatriculation + ", Type: " + type + ", Places: " + places + ", Kilométrage: "
                + kilometrage + ", Etat: " + etat;
    }
}
