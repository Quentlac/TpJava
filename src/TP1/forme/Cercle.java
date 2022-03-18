package TP1.forme;

/**
 * Classe représentant un cercle dans un plan
 */
public class Cercle {

    private int rayon;
    private Point centre;

    /**
     * Initialise le cercle avec un rayon et un point définis à (0;0)
     * @param rayon Taille du rayon
     */
    public Cercle(int rayon) {
        setRayon(rayon);
        this.centre = new Point();
    }

    /**
     * Initialise le cercle avec un rayon et un point agrégé depuis le paramètre
     * @param rayon Taille du rayon
     * @param centre Centre du cercle
     */
    public Cercle(int rayon, Point centre) {
        setRayon(rayon);
        this.centre = centre;
    }

    /**
     * Définit le rayon du cercle
     * @param rayon Taile du rayon
     */
    public void setRayon(int rayon) {
        if(rayon < 0) {
            this.rayon = 0;
        }
        else {
            this.rayon = rayon;
        }
    }

    /**
     * Récupère le rayon
     * @return Taille du rayon
     */
    public int getRayon() {
        return rayon;
    }

    /**
     * Retourne le centre du cercle
     * @return Point centrale
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * Calcule le périmètre du cercle
     * @return Périmètre du cercle
     */
    public double getPerimetre() {
        //Calcul du périmètre à partir du rayon
        return 2.0*Math.PI*rayon;
    }

    /**
     * Calcule l'aire du cercle
     * @return Aire du cercle
     */
    public double getAire() {
        //Calcul de l'aire du cerlce à partir du rayon
        return Math.pow(rayon, 2) * Math.PI;
    }

    /**
     * Déplace le centre du cercle
     * @param dX Valeur horizontale
     * @param dY Valeur verticale
     */
    public void deplaceCentre(int dX, int dY) {
        centre.deplaceXY(dX, dY);
    }



}

