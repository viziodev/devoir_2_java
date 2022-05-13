package models;
public class Generaliste extends Medecin {


    
    private String service;
   



//Surcharge du constructeur
    //Creer un Objet
    public Generaliste() {
    }
    //Creer Objet + initialise les attributs
    public Generaliste(String service) {
        this.service = service;
    }



    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void affiche(){
        System.out.println("Nom :"+nom+" Prenom :"
                          +prenom+" Annee Expe: "+nbreAnneeExp
                          +" Niveau : "+niveau
                          +" Service: "+service);  
    }
}
