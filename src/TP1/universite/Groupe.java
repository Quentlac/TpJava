package TP1.universite;

/**
 * Classe représentant un groupe
 */
public class Groupe {

    private String libelle;

    /**
     * Création d'un groupe
     * @param libelle Nom du groupe
     */
    public Groupe(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Récupère le nom du groupe
     * @return Nom du groupe
     */
    public String getLibelle() {
        return libelle;
    }
}
