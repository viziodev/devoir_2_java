package services;

import java.util.ArrayList;

import models.Hopital;
import models.Medecin;

public class Service {
   //Definir les listes
       ArrayList<Medecin> medecins=new ArrayList<>();
       ArrayList<Hopital> hopitaux=new ArrayList<>();

       public void addMedecin(Medecin medecin){
           medecins.add(medecin);
       }

       public void listerMedecin(){
           for (Medecin medecin : medecins) {
                 medecin.affiche();
           }
       }

       public void addHopital(Hopital hopital){
            hopitaux.add(hopital);
       }

       public void listerHopital(){
        for (Hopital hopital : hopitaux) {
               hopital.affiche();
        }
    }
}
