package entity;

public class Arret {
    private String numero;
    private String nom;

    public Arret(String numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
