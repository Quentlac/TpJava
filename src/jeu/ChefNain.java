package jeu;

/**
 * Classe représentant un chef nain
 */
public class ChefNain extends Nain{

    /**
     * Création d'un super nain
     */
    public ChefNain() {
        super();
    }

    /**
     * Un chef nain subit 2x moins de dégats qu'un nain
     * @param degats Nombre de dégats subits
     */
    @Override
    public void subirDegats(int degats) {
        super.subirDegats(degats / 2);
    }
}
