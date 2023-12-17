package com.example.myfirstproject.controler;
import com.example.myfirstproject.model.Patient;

public final class Controler {
    //L'attribut statique “instance” de type Controller, joue le rôle du singleton de la classe.
    private static Controler instance = null;
    //Le Constructeur par défaut
    private Controler() {
        super();
    }
    //L’attribut de la classe Patient
    private static Patient patient;
    // Méthode createPatient initialise le modèle par les propriétés d’un patient donné par l’utilisateur.
    public void createPatient(int age, float valeur, boolean fasting, boolean isFasting) {
        patient = new Patient(age, valeur, isFasting);
    }

    //Update Controller -> View
    //La méthode getResponse() retourne le résultat de l’analyse du niveau de glycémie.
    public String getRes() {
        return patient.getRes();//Update Patient -> Controller
    }
    //La méthode statique et finale “getInstance()” qui est responsable à la création d'une seule instance de la classe Controller.
    public static Controler getInstance() {
        if (Controler.instance == null)
            Controler.instance = new Controler();
        return Controler.instance;
    }
}
