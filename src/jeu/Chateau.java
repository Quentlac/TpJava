package jeu;

import java.util.ArrayList;

public class Chateau {

    public final int RESSOURCES_INITIAL = 3;
    public final int AJOUTEE_PAR_TOUR = 1;
    private Plateau plateau;

    private int ressource;
    private ArrayList<Guerrier> guerriersNovices;
    private Couleur couleur;

    public Chateau(Couleur couleur, Plateau plateau) {
        this.couleur = couleur;
        this.plateau = plateau;
        this.guerriersNovices = new ArrayList<>();
        this.ressource = RESSOURCES_INITIAL;
    }

    /**
     * Ajout d'un guerrier au chateau afin que celui ci puisse s'entraîner
     * @param guerrier
     */
    public void ajoutGuerrierNovice(Guerrier guerrier) {
        // On modifie le chateau auquel appartient le guerrier
        guerrier.setChateau(this);

        // Puis on l'ajoute au chateau
        guerriersNovices.add(guerrier);
    }

    public ArrayList<Guerrier> getGuerriersNovices() {
        return guerriersNovices;
    }

    /**
     * Permet d'entaîner des guerriers en fonction des ressources
     * @return liste des guerriers entrainés
     */
    public ArrayList<Guerrier> entrainer() {
        ArrayList<Guerrier> guerriersEntraines = new ArrayList<>();
        int i;
        for(i = 0; i < guerriersNovices.size() && ressource > 0; i++) {
            if(ressource >= guerriersNovices.get(i).getRessourcesPourEntrainement()) {
                guerriersEntraines.add(guerriersNovices.get(i));
                ressource -= guerriersNovices.get(i).getRessourcesPourEntrainement();
            }
        }

        // On supprime les guerriers qui ont été entraînés de la liste des novices
        guerriersNovices.removeAll(guerriersEntraines);

        return guerriersEntraines;
    }

    /**
     * Permet d'incrémenter la ressource
     */
    public void incrementerRessources() {
        ressource += 1;
    }

    public int getRessource() {
        return ressource;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public boolean estBleu() {
        return couleur == Couleur.Bleu;
    }

    public boolean estRouge() {
        return couleur == Couleur.Rouge;
    }

}
