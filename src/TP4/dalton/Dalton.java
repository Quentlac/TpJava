package TP4.dalton;

import java.util.Comparator;

public class Dalton implements Comparable<Dalton> {

    private String nom;
    private Taille taille;

    // Classe anonyme afin de comparer les daltons par nom
    public static Comparator<Dalton> comparateurNomSolution2 = new Comparator<Dalton>() {
        @Override
        public int compare(Dalton dalton, Dalton t1) {
            return dalton.getNom().compareTo(t1.getNom());
        }
    };

    public Dalton(String nom, Taille taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public Taille getTaille() {
        return taille;
    }



    @Override
    public int compareTo(Dalton dalton) {
        if(taille == dalton.getTaille()) {
            return nom.compareTo(dalton.getNom());
        }

        if(taille == Taille.PETIT)
            return -1;

        if(taille == Taille.MOYEN) {
            if(dalton.getTaille() == Taille.PETIT)
                return 1;
            else
                return -1;
        }

        return 1; // Si ducoup taille est grand
    }

    @Override
    public String toString() {
        return nom + " (" + taille + ")";
    }




}
