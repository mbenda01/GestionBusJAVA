package entity;

public class Station {
    private String numero;
    private String nom;
    private String adresse;

    public Station(String numero, String nom, String adresse) {
        this.numero = numero;
        this.nom = nom;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return nom + " (" + adresse + ")";
    }
}
