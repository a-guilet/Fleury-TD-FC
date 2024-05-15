package projet.src;

import java.util.ArrayList;

public class Employe {

    // Attributs
    private String poste;
    private Double salaire;
    //private ArrayList emprunts;

    // Le constructeur
    public Employe(String poste, Double salaire, ArrayList emprunts) {
        this.poste = poste;
        this.salaire = salaire;
      //  this.emprunts = emprunts;
    }
    // Getters

    public String getPoste() {
        return poste;
    }

    public Double getSalaire() {
        return salaire;
    }

    // public ArrayList getEmprunt() {
    //     return emprunts;
    // }

    // setters

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    // public void setEmprunt(ArrayList emprunts) {
    //     this.emprunts = emprunts;
    // }

    // Methode
    public void afficherDetailsEmploye() {
        System.out.println("Poste: " + poste);
        System.out.println("Salaire: " + salaire);
    }
}
