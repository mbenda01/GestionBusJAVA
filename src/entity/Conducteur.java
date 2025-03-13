package entity;

public class Conducteur {
    private String matricule;
    private String nom;
    private String prenom;
    private String telephone;
    private String typePermis; // Lourd | Léger
    private boolean disponible; // Par défaut, un conducteur est disponible

    public Conducteur(String matricule, String nom, String prenom, String telephone, String typePermis) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.typePermis = typePermis;
        this.disponible = true;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Conducteur [" + matricule + "] - " + nom + " " + prenom +
                " | 📞 " + telephone + " | 🏅 Permis: " + typePermis +
                " | " + (disponible ? "✅ Disponible" : "⛔ Occupé");
    }
}
