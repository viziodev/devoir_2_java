package models;
public class Medecin {
      protected String nom;
      protected String prenom;
      protected int nbreAnneeExp;
      protected String niveau; 
       //Excellent , Moyen ....
      public String getNom() {
            return nom;
      }
      public String getNiveau() {
            return niveau;
      }
      public void setNiveau(String niveau) {
            this.niveau = niveau;
      }
      public int getNbreAnneeExp() {
            return nbreAnneeExp;
      }
      public void setNbreAnneeExp(int nbreAnneeExp) {
            this.nbreAnneeExp = nbreAnneeExp;
      }
      public String getPrenom() {
            return prenom;
      }
      public void setPrenom(String prenom) {
            this.prenom = prenom;
      }
      public void setNom(String nom) {
            this.nom = nom;
      }

      public void affiche(){
            System.out.println("Nom :"+nom+" Prenom :"
                              +prenom+" Annee Expe: "+nbreAnneeExp
                              +" Niveau : "+niveau);  
      }
      
}
