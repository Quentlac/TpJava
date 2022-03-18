package TP3.billetterie;

import java.util.ArrayList;

public class BilletterieUtilitaire {

    /**
     * Arrondir le prix à 2 décimals après la virgule
     * @param prix prix à arrondir
     * @return prix arrondis
     */
    public static double arrondir(double prix) {
        return Math.round(prix * 100) / 100.0;
    }

    /**
     * Afficher la liste des trajets
     * @param trajets liste des trajets
     */
    public static void afficheTrajets(ArrayList<Trajet> trajets) {
        System.out.println();
        System.out.println("----- Les trajets -----");

        // On parcours la liste et pour chaque éléments on affiche les informations associées.
        for(Trajet t : trajets) {
            System.out.println(t);
        }
    }

    public static void afficheBillets(ArrayList<Billet> billets) {
        System.out.println();
        System.out.println("----- Les billets -----");

        // On parcours la liste et pour chaque éléments on affiche les infos
        for(Billet b : billets) {
            System.out.println(b);
        }
    }

}
