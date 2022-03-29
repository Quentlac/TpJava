package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Carreau {

    ArrayList<Guerrier> GuerriersBleus;
    ArrayList<Guerrier> GuerriersRouges;

    private Couleur couleur;

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

    public void ajoutGuerriersBleus(ArrayList<Guerrier> guerriers) {
        GuerriersBleus.addAll(guerriers);
    }

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

    public boolean estRouge() {
        return couleur.getLibelle().equals("Rouge");
    }

    public boolean estBleu() {
        return couleur.getLibelle().equals("Bleu");
    }

    public boolean estChampDeBataille() {
        return GuerriersBleus.size() > 0 && GuerriersRouges.size() > 0;
    }

    /**
     * Création d'un combat sur un carreau. Les bleus commencent à attaquer
     */
    public void lanceCombat() {

        // Les bleus attaquent
        for(Guerrier g : GuerriersBleus) {
            // On regarde si il y a encore des guerriers ennemis à combatre
            if(GuerriersRouges.size() > 0) {
                g.attaquer(GuerriersRouges.get(0));
                // Si le guerrier est mort on le supprime de la liste
                if (!GuerriersRouges.get(0).estVivant())
                    GuerriersRouges.remove(0);
            }
        }

        // Les rouges attaquent
        for(Guerrier g : GuerriersRouges) {
            if(GuerriersBleus.size() > 0) {
                g.attaquer(GuerriersBleus.get(0));
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
