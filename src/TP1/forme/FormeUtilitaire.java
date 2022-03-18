package TP1.forme;

/**
 * Classe utilitaire pour l'affichage des formes
 */
public class FormeUtilitaire {

    /**
     * Affichage d'un point
     * @param p point à afficher
     */
    public static void affichePoint(Point p) {
        System.out.println("Point : x=" + p.getPosX() + ", y=" + p.getPosY());
    }

    /**
     * Affichage d'un cercle
     * @param c cercle à afficher
     */
    public static void afficheCercle(Cercle c) {
        System.out.println("Cercle : R="+ c.getRayon() +", Centre="+ c.getCentre() +", Périmètre="+ c.getPerimetre() +", Aire=" + c.getAire());
    }

    /**
     * Affichage d'un rectangle
     * @param r rectangle à afficher
     */
    public static void afficheRectangle(Rectangle r) {
        System.out.println("Rectangle: l=" + r.getLargeur() + ", L=" + r.getLongueur() + ", Origine=" + r.getOrigine()
            + ", Périmètre=" + r.getPerimetre() + ", Aire=" + r.getAire());
    }
}
