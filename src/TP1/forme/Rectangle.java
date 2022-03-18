package TP1.forme;

/**
 * Classe représentant un rectangle dans un plan
 */
public class Rectangle {

    private Point origine;
    private int largeur;
    private int longueur;

    /**
     * Création d'un rectangle
     * @param l largeur
     * @param L longueur
     * @param x position X du point d'origine
     * @param y position Y du point d'origine
     */
    public Rectangle(int l, int L, int x, int y){
        origine = new Point(x, y);

        setLargeur(l);
        setLongueur(L);
    }

    /**
     * Création d'un rectangle
     * @param l largeur
     * @param L longueur
     */
    public Rectangle(int l, int L) {
        this(l, L, 0, 0);
    }

    /**
     * Modifie la largeur du rectangle
     * @param l Largeur (l > 0)
     */
    public void setLargeur(int l) {
        if(l < 0){
            largeur = 0;
        }
        else {
            largeur = l;
        }
    }

    /**
     * Modifie la longueur du rectangle
     * @param L Longueur (L > 0)
     */
    public void setLongueur(int L) {
        if(L < 0){
            longueur = 0;
        }
        else {
            longueur = L;
        }
    }

    /**
     * Récupère le point d'origine
     * @return Point d'origine
     */
    public Point getOrigine() {
        return origine.clone();
    }

    /**
     * Récupère la largeur
     * @return Largeur du rectangle
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Récupère la longueur
     * @return Longueur du rectangle
     */
    public int getLongueur() {
        return longueur;
    }

    /**
     * Récupère le périmètre du rectangle
     * @return Périmètre
     */
    public double getPerimetre() {
        return 2*(longueur+largeur);
    }

    /**
     * Récupère l'aire du rectangle
     * @return Aire
     */
    public double getAire() {
        return largeur * longueur;
    }

    /**
     * Déplace le point d'origine
     * @param dX Valeur de déplacement horizontale
     * @param dY Valeur de déplacement verticale
     */
    public void deplaceOrigine(int dX, int dY) {
        origine.deplaceXY(dX, dY);
    }


}
