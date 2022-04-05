package jeu;

/**
 * Classe représentant un chef nain
 */
public class ChefNain extends Nain{

    /**
     * Un chef nain subit 2x moins de dégats qu'un nain
     * @param degats Nombre de dégats subits
     */
    @Override
    public int subirDegats(int degats) {
        return super.subirDegats(degats / 2);
    }
}
