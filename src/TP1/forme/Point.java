package TP1.forme;


/**
 * Classe représentant un point dans un plan en 2D
 */
public class Point implements Cloneable {

    //Déclaration des attributs (coordonnées)
    private int posX;
    private int posY;

    /**
     * Constructeur pour initialiser le point à (0,0)
     * */
    public Point() {
        this(0, 0);
    }

    /**
     * Initialise le point avec des coordonnées définies
     * @param posX Position X
     * @param posY Position Y
     */
    public Point(int posX, int posY) {
        //Appel des setters directement pour contrôler la modifications des coordonnées.
        setX(posX);
        setY(posY);
    }

    /**
     * Déplacement d'un point
     * @param dX Valeur de déplacement horizontal
     * @param dY Valeur de déplacement vertical
     */
    public void deplaceXY(int dX, int dY) {
        setX(this.posX + dX);
        setY(this.posY + dY);
    }

    /**
     * Modifier la position horizontale
     * @param x Position X (horizontale) avec x > 0
     */
    public void setX(int x) {
        if(x < 0) {
            this.posX = 0;
        }
        else {
            this.posX = x;
        }
    }

    /**
     * Modifier la position verticale
     * @param y Position Y (verticale) avec y > 0
     */
    public void setY(int y) {
        if(y < 0) {
            this.posY = 0;
        }
        else {
            this.posY = y;
        }
    }

    /**
     * Récupérer position horizontale
     * @return Position horizontale du point
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Récupérer position verticale
     * @return Position verticale du point
     */
    public int getPosY() {
        return posY;
    }

    @Override
    public String toString() {
        return "(" + posX + "," + posY + ")";
    }

    public Point clone() {
        return new Point(posX, posY);
    }
}
