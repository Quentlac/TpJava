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
    }

    /**
     * Ajout d'un guerrier
     * @param guerrier
     */
    public void ajoutGuerrierNovice(Guerrier guerrier) {
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
            if(ressource > guerriersNovices.get(i).getRessourcesPourEntrainement()) {
                guerriersEntraines.add(guerriersNovices.get(i));
                ressource -= guerriersNovices.get(i).getRessourcesPourEntrainement();
            }
        }
        // On supprime les i premiers guerriers qu'on a entrainé
        guerriersNovices = (ArrayList<Guerrier>) guerriersNovices.subList(i - 1, guerriersNovices.size());

        return guerriersEntraines;
    }

    /**
     * Permet d'incrémenter la ressource
     */
    private void incrementerRessources() {
        ressource += 1;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public boolean estBleu() {
        return couleur.getLibelle().equals("Bleu");
    }

    public boolean estRouge() {
        return couleur.getLibelle().equals("Rouge");
    }

}
