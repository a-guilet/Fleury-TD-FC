package projet.src;

public class Livre implements Empruntable {
    // Attributs
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;

    // Constructeurs
    public Livre(String titre, String auteur, String isbn, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    // Getters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Method to display details
    public void afficherDetailsLivres() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponible: " + (disponible ? "Oui" : "Non"));
    }

    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("livre \"" + titre + "\" a été remis.");
        } else {
            System.out.println("livre \"" + titre + "\" n'est pas pris.");
        }
    }

    public void retourner() {
        if (!disponible) {
            disponible = true;
            System.out.println("livre \"" + titre + "\" a été remis.");
        } else {
            System.out.println("livre \"" + titre + "\" n'était pas pris.");
        }
    }


}