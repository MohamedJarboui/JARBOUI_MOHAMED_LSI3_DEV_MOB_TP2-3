package com.example.myfirstproject.controler;

import com.example.myfirstproject.model.Patient;

public class Controler {
    private static Controler instance = null;
    private Controler() {
        super();
    }
    private static Patient patient;
    public void createPatient(int age ,boolean isFsting, float valeur){

        patient = new Patient(age, isFsting,valeur);
    }
    public static final Controler getInstance(){
        if(Controler.instance==null){
            Controler.instance=new Controler();

        }
        return Controler.instance;

    }


    // Méthode pour créer un objet Patient en fonction des donné d’utilisateur
    public int createPatient(int age, String vm, boolean jeuner) {
        // Vérifie vide ou non
        if (age <= 0 && vm.isEmpty()) {
            return 1;
        } else if (age <= 0) {
            return -1;
        } else if (vm.isEmpty()) {
            return -2;
        }

        // Crée un nouvel objet Patient avec les paramètres d’utilisateur
        patient = new Patient(age, vm, jeuner);
        return 0; // Retourne 0 pour indiquer que la création du patient s'est déroulée avec succès
    }

    // Méthode pour obtenir la réponse, c'est-à-dire le résultat de l'analyse de la glycémie du patient
    public String getReponse() {

        return patient.getResultat();
    }
}
