package jeu;

public enum Couleur {

    Rouge("Rouge"), Bleu("Bleu");

    String libelle;

    private Couleur(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
