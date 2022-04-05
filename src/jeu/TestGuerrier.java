package jeu;

/**
 * Classe permettant de tester un guerrier
 */
public class TestGuerrier {

    public static void main(String[] args) {

        // Création de 2 guerriers
        Guerrier g1 = new ChefNain();
        Guerrier g2 = new ChefElfe();

        System.out.println();

        // Simulation combat
        System.out.println("Combat:");

        while(g1.estVivant() && g2.estVivant()) {

            //Affichage des guerriers
            System.out.println("\u001b[41m\u001b[30m \u001b[47m " + g1.getClass().getSimpleName()+ " \u001b[0m");
            GuerrierUtilitaire.affiche(g1);

            System.out.println("\u001b[44m\u001b[30m \u001b[47m " + g2.getClass().getSimpleName() + " \u001b[0m");
            GuerrierUtilitaire.affiche(g2);

            // Attaque du guerrier 1 sur le 2
            System.out.println("Attaque !");
            //System.out.println(g1.getClass().getSimpleName() + " inflige " + g1.attaquer(g2) + " dégats à " + g2.getClass().getSimpleName());
            //System.out.println(g2.getClass().getSimpleName() + " inflige " + g2.attaquer(g1) + " dégats à " + g1.getClass().getSimpleName());

            System.out.println("-------------------");

        }

        if(!g1.estVivant()) {// Classe permettant de tester la classe Guerrier

            System.out.println("Le guerrier 1 est mort !");
        }
        if(!g2.estVivant()) {
            if(!g1.estVivant()) {
                System.out.println("Le guerrier 1 est mort !");
            }
            System.out.println("Le guerrier 2 est mort !");
        }


        //Affichage des guerriers
        System.out.println("Guerrier 1:");
        GuerrierUtilitaire.affiche(g1);

        System.out.println("Guerrier 2:");
        GuerrierUtilitaire.affiche(g2);

    }

}
