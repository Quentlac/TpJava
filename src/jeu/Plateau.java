package jeu;

import java.util.ArrayList;

public class Plateau {

    private ArrayList<Carreau> carreaux;

    public Plateau(int longueur) {
        this.carreaux = new ArrayList<>(longueur);
        for(int i = 0; i < longueur; i++) {
            this.carreaux.add(new Carreau());
        }
    }

    public void ajoutGuerriers(Chateau chateau, ArrayList<Guerrier> guerriers) {
        if(chateau.getCouleur().getLibelle().equals("Bleu")) {
            carreaux.get(0).ajoutGuerriersBleus(guerriers);
        }
        else if(chateau.getCouleur().getLibelle().equals("Rouge")) {
            carreaux.get(carreaux.size() - 1).ajoutGuerriersRouges(guerriers);
        }
    }

    public void lanceCombats() {
        for(Carreau c : carreaux) {
            if(c.estChampDeBataille()) {
                c.lanceCombat();
            }
        }
    }

    /**
     * Déplace les guerriers d'une case à l'autre
     */
    public void deplaceGuerriers() {

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
