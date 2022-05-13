package models;

public class Specialiste extends Medecin {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void affiche(){
        System.out.println("Nom :"+nom+" Prenom :"
                          +prenom+" Annee Expe: "+nbreAnneeExp
                          +" Niveau : "+niveau
                          +" Type: "+type);  
    }
}
