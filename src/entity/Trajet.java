package entity;

import java.util.Date;

public class Trajet {
    private String type; // Aller ou Retour
    private Date date;
    private Bus bus;
    private Conducteur conducteur;
    private Ligne ligne;

    public Trajet(String type, Date date, Bus bus, Conducteur conducteur, Ligne ligne) {
        this.type = type;
        this.date = date;
        this.bus = bus;
        this.conducteur = conducteur;
        this.ligne = ligne;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public Ligne getLigne() {
        return ligne;
    }

    public void setLigne(Ligne ligne) {
        this.ligne = ligne;
    }

    @Override
    public String toString() {
        return "Trajet [Type: " + type + ", Date: " + date + ", Bus: " + bus.getImmatriculation() + ", Conducteur: "
                + conducteur.getMatricule() + ", Ligne: " + ligne.getNumero() + "]";
    }
}
