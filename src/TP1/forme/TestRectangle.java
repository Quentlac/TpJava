package TP1.forme;

/**
 * Classe pour tester les rectangles
 */
public class TestRectangle {

    public static void main(String[] args) {

        // Création d'un rectangle
        Rectangle rectangle = new Rectangle(2, 4, 2, 3);

        FormeUtilitaire.afficheRectangle(rectangle);

        // Déplacement des rectangles
        System.out.println("On déplace l'origine de dx=10 et dy=4");
        rectangle.deplaceOrigine(10,4);

        // afficher le rectangle
        FormeUtilitaire.afficheRectangle(rectangle);

        // Récupérer l'origine
        Point origine = rectangle.getOrigine();

        // déplacer le point origine
        System.out.println("On déplace le point donné par la méthode getOrigine() de dx=-5 et dy=-6");
        origine.deplaceXY(-5,-6);

        // afficher le point et le rectangle
        FormeUtilitaire.affichePoint(origine);
        FormeUtilitaire.afficheRectangle(rectangle);

    }

}
