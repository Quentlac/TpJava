package jeu;

/**
 * Création d'un chef Elfe
 */
public class ChefElfe extends Elfe{



    /**
     * Un chef elfe a une force 2x plus grande qu'un elfe
     * @return force
     */
    @Override
    public int getForce() {
        return super.getForce() * 2;
    }
}
