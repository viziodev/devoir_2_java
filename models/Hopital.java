package models;

public class Hopital {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affiche(){
        System.out.println(" Nom: "+nom);
    }
}
