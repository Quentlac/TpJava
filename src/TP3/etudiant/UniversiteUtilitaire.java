package TP3.etudiant;

import TP2.contrainte.Note;
import TP2.universite.Etudiant;

/**
 * Classe utilitaire pour gérer les personnes
 */
public class UniversiteUtilitaire {

    /**
     * Mets le premier caractère en majuscule et le reste en minuscule
     * @param chaine Chaîne à modifier
     * @return Nouvelle chaîne
     */
    public static String capitalize(String chaine) {

        // On regarde si il s'agit d'un nom composé
        if(chaine.contains("-")) {
            // On découpe en 2 parties
            String[] parts = chaine.split("-");
            return capitalize(parts[0]) + "-" + capitalize(parts[1]);
        }
        else {
            //On passe le premier caractère en majuscule et le reste en minuscule
            return chaine.substring(0, 1).toUpperCase() + chaine.substring(1).toLowerCase();
        }
    }

    /**
     * Afficher une personne
     * @param personne
     */
    public static void affiche(Personne personne) {
        System.out.println("-----------------");
        System.out.println("Login : " + personne.getLogin());
        System.out.println("Nom complet : " + personne.getNomComplet());
        System.out.println("Mail : " + personne.getMail());
        System.out.println("Adresse : " + (personne.existAdresse() ? personne.getAdresse() : "aucune"));
        System.out.println("-----------------\n");
    }

    /**
     * Afficher un membre du personnel
     * @param personnel
     */
    public static void affiche(Personnel personnel) {
        System.out.println("-----------------");
        System.out.println("Login : " + personnel.getLogin());
        System.out.println("Nom complet : " + personnel.getNomComplet());
        System.out.println("Mail : " + personnel.getMail());
        System.out.println("Adresse : " + (personnel.existAdresse() ? personnel.getAdresse() : "aucune"));
        System.out.println("Echelon : " + personnel.getEchelon());
        System.out.println("Point d'indice : " + personnel.getPointDIndice());
        System.out.println("Salaire : " + personnel.getSalaire());
        System.out.println("\n-----------------\n");
    }

    /**
     * Afficher un étudiant
     * @param etudiant
     */
    public static void affiche(Etudiant etudiant) {
        System.out.println("-----------------");
        System.out.println("Login : " + etudiant.getLogin());
        System.out.println("Nom complet : " + etudiant.getNomComplet());
        System.out.println("Mail : " + etudiant.getMail());
        System.out.println("Adresse : " + (etudiant.existAdresse() ? etudiant.getAdresse() : "aucune"));
        System.out.println("Moyenne : " + (etudiant.getNotes().size() > 0 ? etudiant.getMoyenne() : "aucune note"));

        if(etudiant.getNotes().size() > 0) {
            System.out.print(etudiant.getNotes().size() + " notes : ");
            for(Note n : etudiant.getNotes()) {
                System.out.print(n.getValeur() + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------\n");
    }



}
