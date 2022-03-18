package TP2.telephone;

/**
 * Classe représentant un écran
 */
public class Ecran {

    private String type;
    private int taille;

    /**
     * Création d'un écran
     * @param type type d'écran
     * @param taille taille d'écran
     */
    public Ecran(String type, int taille) {
        this.type = type;
        this.taille = taille;
    }

    public String getType() {
        return type;
    }

    public int getTaille() {
        return taille;
    }

    @Override
    public String toString() {
        return "[" + type + ", " + taille + " pouces]";
    }
}
