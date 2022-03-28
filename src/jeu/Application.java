package jeu;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Plateau plateau = new Plateau(5);

        Chateau chateauRouge = new Chateau(new Couleur("Rouge"), plateau);
        Chateau chateauBleu = new Chateau(new Couleur("Bleu"), plateau);

        chateauRouge.ajoutGuerrierNovice(new Elfe());
        chateauRouge.ajoutGuerrierNovice(new Nain());
        chateauRouge.ajoutGuerrierNovice(new ChefNain());

        chateauBleu.ajoutGuerrierNovice(new ChefNain());
        chateauBleu.ajoutGuerrierNovice(new ChefElfe());
        chateauBleu.ajoutGuerrierNovice(new Nain());

        boolean continuer = true;
        int tour = 0;

        Scanner scanner = new Scanner(System.in);

        while (continuer) {

            CLI.afficheNTour(tour);

            System.out.println("Unités construites dans ce tour :");
            ArrayList<Guerrier> guerriersEntraines = chateauBleu.entrainer();

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

            plateau.deplaceGuerriers();
            plateau.lanceCombats();

            tour++;

            System.out.println();
            System.out.println("Appuyez sur une touche pour passer au tour suivant ! ");
            scanner.nextLine();

        }
    }

}
