package com.example.myfirstproject.model;

import android.widget.TextView;
import android.widget.Toast;

public class Patient {
    private int age;
    private boolean j;
    private float valeur;
    private String resultat;

    public Patient(int age, boolean j, float valeur) {
        this.age = age;
        this.j = j;
        this.valeur = valeur;
    }

    public Patient(int age, String vm, boolean jeuner) {
    }

    public int getAge() {
        return age;
    }

    public boolean isJ() {
        return j;
    }

    public float getValeur() {
        return valeur;
    }

    public String getResultat() {
        return resultat;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJ(boolean j) {
        this.j = j;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }


        private void cal(){
        if (age > 0) {
            if (j) {
                if (age >= 13 && (valeur >= 5.0 && valeur <= 7.2)) {
                    resultat = "Niveau de glycémie est normale 1";
                } else if (age >= 6 && (valeur >= 5.0 && valeur <= 10.0)) {
                    resultat = "Niveau de glycémie est normale 2";
                } else if (valeur >= 5.5 && valeur <= 10.0) {
                    resultat = "Niveau de glycémie est normale 3";
                } else {
                    resultat = "Niveau de glycémie est trop bas ou niveau de glycémie est trop élevée 1";
                }
            } else {
                if (age >= 13 && valeur < 10.5) {
                    resultat = "Niveau de glycémie est normale";
                } else {
                    resultat = "Niveau de glycémie est trop bas ou niveau de glycémie est trop élevée 2";
                }
            }

        }


    }

    }

