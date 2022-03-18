package TP1.forme;

/**
 * Classe de test des points
 */
public class TestPoint {

    public static void main(String[] args) {

        //Création de 2 points distincts
        Point pt1 = new Point();
        Point pt2 = new Point(-1, 4);

        System.out.println("---------");
        System.out.println("Les points :");
        FormeUtilitaire.affichePoint(pt1);
        FormeUtilitaire.affichePoint(pt2);

        System.out.println("---------");
        System.out.println("Les points se déplacent");

        // Déplacement des points
        pt1.deplaceXY(23, -2);
        pt2.deplaceXY(-10, -6);

        System.out.println("---------");
        System.out.println("Les points :");
        FormeUtilitaire.affichePoint(pt1);
        FormeUtilitaire.affichePoint(pt2);

    }

}
