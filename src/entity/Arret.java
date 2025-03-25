package entity;

public class Arret {
    private String numero;
    private String nom;
    private Ligne ligne;

    public Arret(String numero, String nom, Ligne ligne) {
        this.numero = numero;
        this.nom = nom;
        this.ligne = ligne;
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

    public Ligne getLigne() {
        return ligne;
    }

    public void setLigne(Ligne ligne) {
        this.ligne = ligne;
    }

    @Override
    public String toString() {
        return "Arret [Numéro: " + numero + ", Nom: " + nom + ", Ligne: " + ligne.getNumero() + "]";
    }
}
