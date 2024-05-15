package projet.src;

public class Employe {

    // Attributs
    private String poste;
    private Double salaire;

    // Le constructeur
    public Employe(String poste, Double salaire) {
        this.poste = poste;
        this.salaire = salaire;
    }
    // Getters

    public String getPoste() {
        return poste;
    }

    public Double getSalaire() {
        return salaire;
    }

    // setters

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    // Methode
    public void afficherDetailsEmploye() {
        System.out.println("Poste: " + poste);
        System.out.println("Salaire: " + salaire);
    }
}
