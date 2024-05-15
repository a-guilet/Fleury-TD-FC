//import java.util.Date;
package projet.src;

public class Personne {

    //attribut
    private String nom;
    private String prenom;
    private int id;

    //constructeur
    public Personne (String nom, String prenom, int id) {
         this.nom = nom;
         this.prenom = prenom;
         this.id = id;

    }

    //getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getId(){
        return id;
    }

    //setters
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setId(int id){
        this.id = id;
    }

    //methode

 


}