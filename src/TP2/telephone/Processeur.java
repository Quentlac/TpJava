package TP2.telephone;

/**
 * Classe d'un processeur
 */
public class Processeur {

    private String libelle;
    private double frequence;

    /**
     * Création d'un processeur
     * @param libelle Nom du processeur
     * @param frequence Fréquence de fonctionnement
     */
    public Processeur(String libelle, double frequence) {
        this.libelle = libelle;
        this.frequence = frequence;
    }

    /**
     *
     * @return Nom du processeur
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     *
     * @return fréquence du processeur
     */
    public double getFrequence() {
        return frequence;
    }

    @Override
    public String toString() {
        return libelle + " (" + frequence + "GHz)";
    }
}
