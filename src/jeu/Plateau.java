package jeu;

import java.util.ArrayList;

/**
 * Classe représentant un plateau composé de plusieurs carreaux
 */
public class Plateau {

    private ArrayList<Carreau> carreaux;

    /**
     * Création d'un plateau
     * @param longueur nombre de carreaux du plateau
     */
    public Plateau(int longueur) {
        this.carreaux = new ArrayList<>(longueur);

        // On initalise chaque carraux
        for(int i = 0; i < longueur; i++) {
            this.carreaux.add(new Carreau());
        }
    }

    /**
     * Permet de placer des guerriers sur le plateau
     * @param chateau chateau qui place les guerriers
     * @param guerriers liste des guerriers à placer
     */
    public void ajoutGuerriers(Chateau chateau, ArrayList<Guerrier> guerriers) {

        // On regarde quel chateau met les guerriers.
        if(chateau.getCouleur().getLibelle().equals("Bleu")) {
            getDepartBleu().ajoutGuerriersBleus(guerriers); // On place les guerriers sur la case de départ relative au chateau.
        }
        else if(chateau.getCouleur().getLibelle().equals("Rouge")) {
            getDepartRouge().ajoutGuerriersRouges(guerriers);
        }
    }

    /**
     * Lance les combats sur chaque carreaux qui est un champ de bataille (qui contient à la fois des guerriers rouges et bleus)
     */
    public void lanceCombats() {

        // On parcourt chaque carreaux
        for(Carreau c : carreaux) {

            if(c.estChampDeBataille()) {
                c.lanceCombat(); // On lance le combat sur le carreau
            }
        }
    }

    /**
     * Déplace les guerriers d'une case à l'autre
     * De gauche à droite pour les bleus et de droite à gauche pour les rouges
     */
    public void deplaceGuerriers() {

        // Liste contenant les guerriers déjà déplacés lors du tour. Cela évite qu'il soit déplacer plusieurs fois lors de l'itération.
        ArrayList<Guerrier> guerriers_deja_deplace = new ArrayList<>();

        for(int i = 0; i < carreaux.size(); i++) {
            if(i >= 1 && !carreaux.get(i - 1).estChampDeBataille()) {
                // Déplacement bleu

                // On récupère les guerriers de la case à déplacer.
                ArrayList<Guerrier> guerriers_a_deplacer = new ArrayList<>(carreaux.get(i - 1).getGuerriersBleus());

                // On enlève de la liste tout les guerriers déjà déplacer
                guerriers_a_deplacer.removeAll(guerriers_deja_deplace);

                // On les enlèves de la case précédente
                carreaux.get(i - 1).retirerGuerriers(guerriers_a_deplacer);

                // Et on les mets dans la nouvelle case
                carreaux.get(i).ajoutGuerriersBleus(guerriers_a_deplacer);

                // Enfin, on ajoute les guerriers déplacer dans la liste des guerriers déjà déplacer
                guerriers_deja_deplace.addAll(guerriers_a_deplacer);
            }

            if(i <= carreaux.size() - 2 && !carreaux.get(i + 1).estChampDeBataille()) {
                // Déplacement rouge

                // On récupère les guerriers de la case à déplacer.
                ArrayList<Guerrier> guerriers_a_deplacer = new ArrayList<>(carreaux.get(i + 1).getGuerriersRouges());

                // On enlève de la liste tout les guerriers déjà déplacer
                guerriers_a_deplacer.removeAll(guerriers_deja_deplace);

                // On les enlèves de la case précédente
                carreaux.get(i + 1).retirerGuerriers(guerriers_a_deplacer);

                // Et on les mets dans la nouvelle case
                carreaux.get(i).ajoutGuerriersRouges(guerriers_a_deplacer);

                // Enfin, on ajoute les guerriers déplacer dans la liste des guerriers déjà déplacer
                guerriers_deja_deplace.addAll(guerriers_a_deplacer);
            }
        }

    }

    /**
     * Retourne le carreau de départ du chateau bleu
     * @return case départ des bleu
     */
    public Carreau getDepartBleu() {
        return carreaux.get(0);
    }

    /**
     * Retourne le carreau de départ du chateau rouge
     * @return case départ des rouges
     */
    public Carreau getDepartRouge() {
        return carreaux.get(carreaux.size() - 1);
    }

    @Override
    public String toString() {
        String txt = "\u001b[0;36mChateau bleu\u001b[0m\n";

        for(Carreau c : carreaux) {
            txt += c;
        }

        txt += "\u001b[0;31mChateau rouge\u001b[0m\n";

        return txt;
    }
}
