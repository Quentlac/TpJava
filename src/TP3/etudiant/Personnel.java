package TP3.etudiant;

import TP2.contrainte.ContrainteException;
import TP2.contrainte.ReelContraint;

/**
 * Classe représentant le personnel héritant de personne
 */
public class Personnel extends Personne{

    private int echelon;
    private ReelContraint pointDIndice;

    // Définition de constante pour respecter les contraintes
    public static final int ECHELON_MIN = 1;
    public static final int ECHELON_MAX = 3;

    public static final double POINTDINDICE_MIN = 1000;
    public static final double POINTDINDICE_MAX = 1200;

    /**
     * Création d'un membre du personnel
     * @param login Nom d'utilisateur
     * @param prenom
     * @param nom
     */
    public Personnel(String login, String prenom, String nom) {
        this(login, prenom, nom, ECHELON_MIN, POINTDINDICE_MIN);
    }

    /**
     * Création d'un membre du personnel
     * @param login Nom d'utilisateur
     * @param prenom
     * @param echelon
     * @param pointDIndice
     */
    public Personnel(String login, String prenom, String nom, int echelon, double pointDIndice) {
        super(login, prenom, nom);
        setEchelon(echelon);

        // Création d'un réel contraint pour les point d'indices
        this.pointDIndice = new ReelContraint(POINTDINDICE_MIN, POINTDINDICE_MAX);

        setPointDIndice(pointDIndice);
    }

    public int getEchelon() {
        return this.echelon;
    }

    public double getPointDIndice() {
        return this.pointDIndice.getValeur();
    }

    /**
     * Calcule le salaire d'un membre du personnel
     * @return salaire d'un membre du personnel
     */
    public double getSalaire() {
        return this.pointDIndice.getValeur() * this.echelon;
    }
 // TODO: Calculer le salaire
    /**
     * Change la valeur d'échelon en respectant les contraintes
     * @param echelon Nouvelle valeur d'échelon
     */
    public void setEchelon(int echelon) {
        if(echelon < ECHELON_MIN){
            this.echelon = ECHELON_MIN;
        }
        else if(echelon > ECHELON_MAX){
            this.echelon = ECHELON_MAX;
        }
        else {
            this.echelon = echelon;
        }
    }

    /**
     * Change la veleur de point d'indice en respectant les contraintes
     * @param point Nouvelle valeur de point
     */
    public void setPointDIndice(double point) {
        try {
            if (point < POINTDINDICE_MIN) {
                this.pointDIndice.setValeur(POINTDINDICE_MIN);
            } else if (point > POINTDINDICE_MAX) {
                this.pointDIndice.setValeur(POINTDINDICE_MAX);
            } else {
                this.pointDIndice.setValeur(point);
            }
        } catch (ContrainteException e) {
            System.out.println(e);
        }
    }

    @Override
    public String getMail() {
        return getPrenom().toLowerCase() + "." + getNom().toLowerCase() + "@univ-grenoble-alpes.fr";
    }
}
