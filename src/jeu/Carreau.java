package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Classe représentant un carreau sur un plateau du jeu Faerun
 */
public class Carreau {

    ArrayList<Guerrier> GuerriersBleus;
    ArrayList<Guerrier> GuerriersRouges;

    /**
     * Création d'un carreau
     */
    public Carreau() {
        GuerriersBleus = new ArrayList<>();
        GuerriersRouges = new ArrayList<>();
    }


    public ArrayList<Guerrier> getGuerriersBleus() {
        return GuerriersBleus;
    }

    public ArrayList<Guerrier> getGuerriersRouges() {
        return GuerriersRouges;
    }

    /**
     * Ajoute un guerrier bleu sur le carreau
     * @param guerriers guerrier à ajouter
     */
    public void ajoutGuerriersBleus(ArrayList<Guerrier> guerriers) {
        GuerriersBleus.addAll(guerriers);
    }

    /**
     * Ajoute un guerrier rouge sur le carreau
     * @param guerriers guerrier à ajouter
     */
    public void ajoutGuerriersRouges(ArrayList<Guerrier> guerriers) {
        GuerriersRouges.addAll(guerriers);
    }

    /**
     * Enlève tout les guerriers spécifié du carreau
     * @param guerriers liste des guerriers à supprimer
     */
    public void retirerGuerriers(ArrayList<Guerrier> guerriers) {
        GuerriersBleus.removeAll(guerriers);
        GuerriersRouges.removeAll(guerriers);
    }

    public void supprimeGuerrier(Guerrier guerrier) {
        if(GuerriersRouges.contains(guerrier)){
            GuerriersRouges.remove(guerrier);
        }
        else {
            GuerriersBleus.remove(guerrier);
        }
    }

    /**
     * Vérifie si le carreau contient des guerriers rouge
     * @return vrai si il y a des guerriers rouge sur le carreau
     */
    public boolean estRouge() {
        return GuerriersRouges.size() > 0;
    }

    /**
     * Vérifie si le carreau contient des guerriers bleus
     * @return vrai si il y a des guerriers bleu sur le carreau
     */
    public boolean estBleu() {
        return GuerriersBleus.size() > 0;
    }

    /**
     * Vérifie si il y a à la fois des guerriers rouge et des guerriers bleu sur le carreau
     * @return Vrai si il y a à la fois des guerriers rouge et bleu.
     */
    public boolean estChampDeBataille() {
        return estRouge() & estBleu();
    }

    /**
     * Création d'un combat sur un carreau. Les bleus commencent à attaquer
     */
    public void lanceCombat() {

        // Les bleus attaquent
        for(Guerrier g : GuerriersBleus) {
            // On regarde si il y a encore des guerriers ennemis à combatre
            if(GuerriersRouges.size() > 0) {
                DegatsDonneSubit degats = g.attaquer(GuerriersRouges.get(0));
                CLI.afficheCombat(g, GuerriersRouges.get(0), degats);

                // Si le guerrier est mort on le supprime de la liste
                if (!GuerriersRouges.get(0).estVivant())
                    GuerriersRouges.remove(0);
            }
        }

        // Les rouges attaquent
        for(Guerrier g : GuerriersRouges) {
            if(GuerriersBleus.size() > 0) {

                DegatsDonneSubit degats = g.attaquer(GuerriersBleus.get(0));
                CLI.afficheCombat(g, GuerriersBleus.get(0), degats);

                if (!GuerriersBleus.get(0).estVivant())
                    GuerriersBleus.remove(0);
            }
        }
    }

    @Override
    public String toString() {
        String txt = "\n#\n";

        // On met à l'envers pour un meilleur affichage: comme le guerrier à l'index 0 est le premier attaqué
        // il est plus logique qu'il soit affiché en face du guerrier rouge directement
        Collections.reverse(getGuerriersBleus());

        for(Guerrier g : getGuerriersBleus()) {
            txt += "# " + g + "\n";
        }

        // On remet l'ordre en place
        Collections.reverse(getGuerriersBleus());

        for(Guerrier g : getGuerriersRouges()) {
            txt += "# " + g + "\n";
        }

        txt += "#\n";

        return txt;
    }
}
