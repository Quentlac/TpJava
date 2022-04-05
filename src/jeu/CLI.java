package jeu;

public class CLI {

    public static void afficheNTour(int tour) {
        System.out.println("Bienvenue dans le tour n°" + tour + " ! ");
        System.out.println();

    }

    public static void afficheCombat(Guerrier attaquant, Guerrier victime, DegatsDonneSubit degats) {
        System.out.println(attaquant + " attaque " + victime + " : -" + degats.getDegatSubit() + " PV");
    }

    public static void coupDivin() {
        System.out.println("Coup Divin !!!!!!!!");
    }




}
