package projet.src;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Membre membre = new Membre("Arthur", "Guilet", 1, new Date(), "invisible");
        membre.afficherDetails();
        Livre livre = new Livre("Les miserables goats", "Victor Hugoat", "9781234567890", true);
        livre.afficherDetailsLivres();
        Employe employe = new Employe("Le Patron", 2000.00);
        employe.afficherDetailsEmploye();


    }
}
