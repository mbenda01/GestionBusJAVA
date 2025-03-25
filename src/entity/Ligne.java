package entity;

public class Ligne {
    private String numero;
    private int kilometrage;
    private double tarif;

    public Ligne(String numero, int kilometrage, double tarif) {
        this.numero = numero;
        this.kilometrage = kilometrage;
        this.tarif = tarif;
    }

    // Getters and Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "Ligne [Numéro: " + numero + ", Kilométrage: " + kilometrage + ", Tarif: " + tarif + "]";
    }
}
