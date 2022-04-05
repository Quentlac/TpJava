package jeu;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Plateau plateau = new Plateau(5);

        Chateau chateauRouge = new Chateau(new Couleur("Rouge"), plateau);
        Chateau chateauBleu = new Chateau(new Couleur("Bleu"), plateau);

        chateauRouge.ajoutGuerrierNovice(new ChefElfe());
        chateauRouge.ajoutGuerrierNovice(new ChefNain());
        chateauRouge.ajoutGuerrierNovice(new ChefNain());
        chateauRouge.ajoutGuerrierNovice(new Elfe());

        chateauBleu.ajoutGuerrierNovice(new ChefNain());
        chateauBleu.ajoutGuerrierNovice(new ChefElfe());
        chateauBleu.ajoutGuerrierNovice(new Nain());

        boolean continuer = true;
        int tour = 0;

        Scanner scanner = new Scanner(System.in);

        while (continuer) {

            CLI.afficheNTour(tour);
            chateauRouge.incrementerRessources();
            chateauBleu.incrementerRessources();

            plateau.lanceCombats();
            plateau.deplaceGuerriers();

            System.out.println();
            System.out.println("Ressource chateau bleu : " + chateauBleu.getRessource());
            System.out.println("Ressource chateau rouge : " + chateauRouge.getRessource());
            System.out.println();

            System.out.println("Unités construites dans ce tour :");
            ArrayList<Guerrier> guerriersEntraines = chateauBleu.entrainer();

            if(guerriersEntraines.size() == 0) {
                System.out.println("   Aucun guerrier entraîner lors de ce tour !");
            }

            for(Guerrier g: guerriersEntraines) {
                System.out.println("   GUERRIERS AU COMBAT : " + g);
            }

            // On ajoute les guerriers entrainés du chateau bleu
            plateau.ajoutGuerriers(chateauBleu, guerriersEntraines);

            guerriersEntraines = chateauRouge.entrainer();

            for(Guerrier g: guerriersEntraines) {
                System.out.println("   GUERRIERS AU COMBAT : " + g);
            }

            // On ajoute les guerriers entrainés du chateau rouge
            plateau.ajoutGuerriers(chateauRouge, guerriersEntraines);

            System.out.println(plateau);

            // On vérifie si un des joueurs a gagné : c'est à dire qu'il y a des ennemies sur la case départ.
            if(plateau.getDepartRouge().estBleu()) {
                System.out.println("Le joueur \u001b[0;36mbleu\u001b[0m a gagné !");
                continuer = false;
            }
            else if(plateau.getDepartBleu().estRouge()) {
                System.out.println("Le joueur \u001b[0;31mrouge\u001b[0m a gagné !");
                continuer = false;
            }
            else {

                System.out.println();
                System.out.println("Appuyez sur une touche pour passer au tour suivant ! ");
                scanner.nextLine();

                tour++;
            }

        }
    }

}
