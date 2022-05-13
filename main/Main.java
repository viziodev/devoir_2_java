package main;

import java.util.Scanner;

import models.Generaliste;
import models.Medecin;
import models.Specialiste;
import services.Service;

public class Main {
       public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        Service service=new Service();
        int choix;
         do{
             System.out.println("1- Ajout Medecin");
             System.out.println("2- Lister les Medecins");
             System.out.println("3- Ajouter un Hopital");
             System.out.println("4- Lister les Hopitaux");
             System.out.println("5- Affecter un Medecin  a un Hopital");
             System.out.println("6- Lister les Medecins d'un hopital");
             System.out.println("7- Quitter");
             System.out.println("Faites votre choix");
             choix=clavier.nextInt();
              
             switch (choix) {
                 case 1:
                    Medecin medecin=null;
                      clavier.nextLine();
                       System.out.println("Entrer le Nom du Medecin");
                       String nom=clavier.nextLine();
                       System.out.println("Entrer le Prenom du Medecin");
                       String prenom=clavier.nextLine();
                       System.out.println("Entrer le Nbre Annee Experience du Medecin");
                       int nbrAnExp=clavier.nextInt();
                       clavier.nextLine();
                       System.out.println("Entrer le Niveau du Medecin");
                       String  niveau=clavier.nextLine();
                       System.out.println("Enter le Type du Medecin");
                       System.out.println("---->1-Generaliste");
                       System.out.println("---->2-Specialiste");
                       int type=clavier.nextInt();
                       clavier.nextLine();
                          if(type==1){
                            System.out.println("Entrer le service  du Medecin");
                             String serviceMed=clavier.nextLine();
                             medecin=new Generaliste(serviceMed);
                             //Methode 1 => convertir medecin en Generaliste downcasting
                             //((Fille)ObMere).MethodeFille()
                              //((Generaliste)medecin).setService(serviceMed);
                            //Methode 2 => Surcharge Methode consiste a lui ajouter un 
                                           //nouveau comportement
                            /**
                             * Surcharge 
                             *  1.Soit vous ajouter un ou + sieurs arguments a la fonction
                             *  2.Soit vous changer le type d'un ou  de + sieurs arguments a la fonction
                             *  public int somme(int a, int b){
                             *     return a+b;
                             * }
                             * public int somme(double a, double b){
                             *     return a+b;
                             * }
                             *  public int somme(int a, int b,int c){
                             *     return a+b+c;
                             * }
                             */
                          }
                          if(type==2){
                            System.out.println("Entrer le Type  du Medecin");
                            String typeMed=clavier.nextLine(); 
                            medecin=new Specialiste();
                            //Methode 1
                           //((Specialiste)medecin).setType(typeMed);
                            
                            
                        }

                        medecin.setNom(nom);
                        medecin.setPrenom(prenom);
                        medecin.setNiveau(niveau);
                        medecin.setNbreAnneeExp(nbrAnExp);

                        service.addMedecin(medecin);

                     break;
                case 2:
                       System.out.println("Liste des Medecin");
                       service.listerMedecin();
                     break;
                case 3:
                     break;
                case 4:
                     break;
                case 5:
                     break;
                case 6:
                     break;
                case 7:
                      System.out.println("Au Revoir");
                     break;
                 default:
                      System.out.println("Veillez faire un bon choix entre [1-7}");
                     break;
             }

         }while(choix!=7);
           
       }
}
