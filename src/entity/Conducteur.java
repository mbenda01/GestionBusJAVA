package entity;

public class Conducteur {
    private String matricule;
    private String nom;
    private String prenom;
    private String telephone;
    private String typePermis;
    private String dateAffectation;
    private String statut;

    public Conducteur(String matricule, String nom, String prenom, String telephone, String typePermis,
            String dateAffectation, String statut) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.typePermis = typePermis;
        this.dateAffectation = dateAffectation;
        this.statut = statut;
    }

    // Getters and Setters
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTypePermis() {
        return typePermis;
    }

    public void setTypePermis(String typePermis) {
        this.typePermis = typePermis;
    }

    public String getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(String dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Matricule: " + matricule + ", Nom: " + nom + ", Prénom: " + prenom + ", Téléphone: " + telephone
                + ", Type Permis: " + typePermis + ", Date Affectation: " + dateAffectation + ", Statut: " + statut;
    }
}
