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

    // Getters and Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Station [Numéro: " + numero + ", Nom: " + nom + ", Adresse: " + adresse + "]";
    }
}
