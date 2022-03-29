package jeu;

/**
 * Classe représentant un nain et héritant d'un guerrier
 */
public class Nain extends Guerrier{


    /**
     * Un nain subit 2x moins de dégats q'un guerrier
     * @param degats Nombre de dégats subits
     */
    @Override
    public void subirDegats(int degats) {
        super.subirDegats(degats / 2);
    }
}
