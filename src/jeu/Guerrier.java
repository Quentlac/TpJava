package jeu;

/**
 * Classe représentant un guerrier
 */
public abstract class Guerrier {

    private final int FORCE_BASE = 10;
    private final int PV_MAX_BASE = 100;
    private final int RESSOURCE_BASE = 2;

    private int force;
    private int vie;

    private Chateau chateau;


    /**
     * Création d'un guerrier
     */
    public Guerrier() {
        this.force = FORCE_BASE;
        this.vie = PV_MAX_BASE;
    }

    /**
     * Récupère la force d'un guerrier
     * @return Force
     */
    public int getForce() {
        return force;
    }

    /**
     * Récupère le nombre de point de vie restant
     * @return Nombre de point de vie
     */
    public int getPointDeVie() {
        return vie;
    }

    /**
     * Modifie le nombre de point de vie
     * @param pv Nombre de point de vie
     */
    public void setPointDeVie(int pv) {
        //On fait en sorte que le nombre de PV ne puisse être inférieur à 0
        if(pv < 0) {
            vie = 0;
        }
        else {
            vie = pv;
        }
    }

    /**
     * Le guerrier est il vivant ?
     * @return Vraie si il est encore vivant
     */
    public boolean estVivant() {
        return vie > 0;
    }

    /**
     * Fonction permettant d'attaquer un ennemi passé en paramètre en lui infligeant des dégats
     * @param ennemi Ennemi à attaquer
     * @return dégats infligés
     */
    public int attaquer(Guerrier ennemi) {

        // Le guerrier ne peut attaquer que si il est vivant
        if(estVivant()) {
            //Calcul des dégats à infliger en fonction du résultat des dés.
            int degats = GuerrierUtilitaire.de3(force);
            ennemi.subirDegats(degats);
            return degats;
        }
        return 0;
    }

    /**
     * Fait subir des dégats au guerrier
     * @param degats Nombre de dégats subits
     */
    public void subirDegats(int degats) {
        vie -= degats;
    }


    public void setChateau(Chateau chateau) {
        this.chateau = chateau;
    }

    public boolean estBleu() {
        return chateau.estBleu();
    }

    public boolean estRouge() {
        return chateau.estRouge();
    }

    public int getRessourcesPourEntrainement() {
        return RESSOURCE_BASE;
    }

    @Override
    public String toString() {

        return (this.chateau.estBleu() ? "\u001b[0;36m" : "\u001b[0;31m") + this.getClass().getSimpleName() + "_" + chateau.getCouleur().getLibelle() + "[PV " + getPointDeVie() + "]\u001b[0m";
    }
}
