package jeu;

/**
 * Création d'un elfe héritant d'un guerrier
 */
public class Elfe extends Guerrier{


    /**
     * Un elfe a 2x plus de force qu'un guerrier
     * @return force de l'elfe
     */
    @Override
    public int getForce() {
        return super.getForce() * 2;
    }
}
