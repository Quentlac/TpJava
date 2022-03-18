package jeu;

/**
 * Ensemble de méthodes utilitaires pour la gestion des guerriers
 */
public class GuerrierUtilitaire {

    /**
     * Lancé d'un dé à 3 faces
     * @return
     */
    public static int de3() {
        return (int) Math.round(Math.random() * 3 + 1);
    }

    /**
     * Lancé de plusieurs dés à 3 faces
     * @param nbLance : Nombre de lancés
     * @return Somme des résultats des dés
     */
    public static int de3(int nbLance) {
        int somme = 0;
        for(int i = 0; i < nbLance; i++) {
            somme += de3(); // On ajoute le résultat du lancé à la somme total
        }
        return somme;
    }

    /**
     * Affichage d'un guerrier
     * @param g : Guerrier à afficher
     */
    public static void affiche(Guerrier g) {

        //System.out.println("\u001B[42m\u001B[30mSaluuuut\u001B[0m");

        // On affiche une barre de PV
        System.out.print("\u001B[32m(PV): \u001B[0m");

        int i = 0;
        while(i < Math.round(g.getPointDeVie() / 5.0)) {
            System.out.print("\u001B[4;" + ((Math.round(g.getPointDeVie() / 5.0) <= 5) ? "31" : "33") + "m▰\u001B[0m");
            i++;
        }
        while(i < 20){
            System.out.print("\u001B[4;" + ((Math.round(g.getPointDeVie() / 5.0) <= 5) ? "31" : "33") + "m \u001B[0m");
            i++;
        }

        System.out.println("\u001B[32m " + g.getPointDeVie() + "/100\u001B[0m");

        System.out.println("\u001b[36mForce: " + g.getForce() + " pts\u001B[0m");

        System.out.println();

    }

}
