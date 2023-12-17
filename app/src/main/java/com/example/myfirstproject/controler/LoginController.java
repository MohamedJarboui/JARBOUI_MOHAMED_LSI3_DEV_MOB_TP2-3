package com.example.myfirstproject.controler;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.myfirstproject.model.User;

public class LoginController {

    private static final String SHARED_PREFS = "sharedPrefs";
    private static User user;
    private static LoginController Instance = null;

    // Constructeur privé pour assurer le singleton
    private LoginController() {
        super();
    }

    // Méthode pour obtenir l'instance unique de LoginController
    public static final LoginController getInstance(Context context) {
        if (LoginController.Instance == null)
            Instance = new LoginController();
        recapUser(context);
        return LoginController.Instance;
    }

    // Méthode pour récupérer les informations de l'utilisateur depuis les préférences partagées
    public static void recapUser(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFS,context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username","");
        String password  = sharedPreferences.getString("password","");
        user = new User(username, password);
    }

    // Méthode pour créer un nouvel utilisateur et sauvegarder ses données
    public void createUser(String userName, String password , Context context) {
        // Création de l'utilisateur
        user = new User(userName, password);

        // Persistance des données de l'utilisateur (Sauvegarde dans les préférences partagées)
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", userName);
        editor.putString("password", password);
        editor.apply();
    }

    // Méthode pour obtenir le nom d'utilisateur de l'utilisateur actuel
    public String getUserName(){
        return user.getUserName();
    }

    // Méthode pour obtenir le mot de passe de l'utilisateur actuel
    public String getPassword(){
        return user.getPassword();
    }
}
