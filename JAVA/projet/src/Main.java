package projet.src;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Membre membre = new Membre("Arthur", "Guilet", 1, new Date(), "invisible");
        membre.afficherDetails();
        Livre livre = new Livre("Les goatesques goats", "Victor Hugoat", "9781234567890", true);
        livre.afficherDetailsLivres();

    }
}
