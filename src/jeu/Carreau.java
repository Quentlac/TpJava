package jeu;

import java.util.ArrayList;

public class Carreau {

    ArrayList<Guerrier> GuerriersBleus;
    ArrayList<Guerrier> GuerriersRouges;

    private Couleur couleur;

    public Carreau() {

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

    public void retirerGuerriersBleus(ArrayList<Guerrier> guerriers) {
        GuerriersBleus.removeAll(guerriers);
    }

    public void retirerGuerriersRouges(ArrayList<Guerrier> guerriers) {
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
            g.attaquer(GuerriersRouges.get(0));
            // Si le guerrier est mort on le supprime de la liste
            if(!GuerriersRouges.get(0).estVivant())
                GuerriersRouges.remove(0);
        }

        // Les rouges attaquent
        for(Guerrier g : GuerriersRouges) {
            g.attaquer(GuerriersBleus.get(0));
            if(!GuerriersBleus.get(0).estVivant())
                GuerriersBleus.remove(0);
        }
    }

}
