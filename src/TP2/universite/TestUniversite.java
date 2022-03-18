package TP2.universite;

import TP2.contrainte.Note;
import TP3.etudiant.Personne;
import TP3.etudiant.Personnel;
import TP3.etudiant.UniversiteUtilitaire;

import java.util.ArrayList;

/**
 * Classe de test pour la classe Personne et Etudiant
 */
public class TestUniversite {

    public static void main(String[] args) {

        // Création d'une liste de personnes
        ArrayList<Personne> personnes = new ArrayList<>();

        // Création de plusieurs étudiants
        Etudiant etudiant1 = new Etudiant("SANZF", "FLORIANT", "Sanz");
        Etudiant etudiant2 = new Etudiant("portepa", "Pierre-Antoine", "Porte");
        Etudiant etudiant3 = new Etudiant("burlatn", "nils", "burlat", "1 rue pas loin", "10 rue des parents");

        // On ajoute l'adresse de certains étudiants
        etudiant1.setAdresse("13 rue à côté", "23 rue beaucoup plus loin");
        etudiant2.setAdresse("30 avenue Berlioz");

        personnes.add(etudiant1);
        personnes.add(etudiant2);
        personnes.add(etudiant3);


        // Création de deux personnels
        Personnel personnel1 = new Personnel("goulianj", "Jérôme", "Goulian");
        Personnel personnel2 = new Personnel("brunetf", "Francis", "brunet-manquat", 0, 1400);
        Personnel personnel3 = new Personnel("lejeuna", "Anne", "Lejeune");

        personnel3.setEchelon(5);
        personnel3.setPointDIndice(900);

        // Ajouter les personnels à la liste personnes
        personnes.add(personnel1);
        personnes.add(personnel2);
        personnes.add(personnel3);

        // Créer et ajouter les personnels à une liste personnels
        ArrayList<Personnel> personnels = new ArrayList<>();
        personnels.add(personnel1);
        personnels.add(personnel2);
        personnels.add(personnel3);


        // Création de quelques étudiants
        ArrayList<Etudiant> etudiants = new ArrayList<>();

        Etudiant etu1 = new Etudiant("lacombeq", "Quentin", "LACOMBE", "107 Rue des Taillees", "61 Route du Suiffet");
        Etudiant etu2 = new Etudiant("peutotn", "Noe", "Peutot");
        Etudiant etu3 = new Etudiant("lignea", "Adrien", "Ligne");

        // On ajoute 2 notes à Adrien
        etu3.addNote(new Note(14));
        etu3.addNote(new Note(16));

        // On ajoute 3 note à Quentin
        etu1.addNote(new Note(13.4));
        etu1.addNote(new Note(14.6));
        etu1.addNote(new Note(17.8));

        etudiants.add(etu1);
        etudiants.add(etu2);
        etudiants.add(etu3);

        for(Personne p : personnes) {
            UniversiteUtilitaire.affiche(p);
        }

        for(Personnel p : personnels) {
            UniversiteUtilitaire.affiche(p);
        }

        for(Etudiant e : etudiants) {
            UniversiteUtilitaire.affiche(e);
        }

    }
}
