package TP2.telephone;

/**
 * Classe représentant une mémoire
 */
public class Memoire {

    private String type;
    private int nombreGiga;

    /**
     * Création d'un objet mémoire
     * @param type Type de mémoire
     * @param nombreGiga Capacité
     */
    public Memoire(String type, int nombreGiga) {
        this.type = type;
        this.nombreGiga = nombreGiga;
    }

    public String getType() {
        return type;
    }

    public int getNombreGiga() {
        return nombreGiga;
    }

    @Override
    public String toString() {
        return nombreGiga + "Giga [" + type + "]";
    }
}
