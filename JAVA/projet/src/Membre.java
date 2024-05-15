package projet.src;

import java.util.Date;

public class Membre extends Personne {

    private Date dateAdhesion;
    private String statut;

    //constructeur
    public Membre(String nom, String prenom, int id, Date dateAdhesion, String statut) {
        super(nom, prenom, id);
        this.dateAdhesion = dateAdhesion;
        this.statut = statut;
    }

    //getters
    public Date getdaDateAdhesion() {
        return dateAdhesion;
    }

    public String getStatut() {
        return statut;
    }

    //setters

    public void setDateAdhesion(Date dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }

    public void getStatut(String statut) {
        this.statut = statut;
    }

}
