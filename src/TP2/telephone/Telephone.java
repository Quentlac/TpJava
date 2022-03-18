package TP2.telephone;

import java.util.ArrayList;

/**
 * Classe représentant un téléphone
 */
public class Telephone {

    private String libelle;
    private Processeur processeur;
    private Memoire stockage;
    private ArrayList<Memoire> memoires;
    private Ecran ecran;

    /**
     * Création d'un téléphone
     * @param processeur
     * @param stockage
     * @param ecran
     */
    public Telephone(String libelle, Processeur processeur, Memoire stockage, Ecran ecran) {
        this.libelle = libelle;
        this.processeur = processeur;
        this.ecran = ecran;
        this.stockage = stockage;
        memoires = new ArrayList<>();

    }

    /**
     * Ajoute de la mémoire ram
     * @param ram
     */
    public void addRam(Memoire ram) {
        memoires.add(ram);
    }

    /**
     * Valeur totale de ram
     * @return ram
     */
    public int getNombreGiga() {
        int somme = 0;
        // On fait la somme de toutes les valeurs de mémoires
        for(Memoire m : memoires) {
            somme += m.getNombreGiga();
        }
        return somme;
    }

    @Override
    public String toString() {

        String ramString = getNombreGiga() + "Giga [";

        for(int i = 0; i < memoires.size(); i++) {
            ramString += memoires.get(i).getType() + " " + memoires.get(i).getNombreGiga() + "G";

            if(i < memoires.size() - 1) {
                ramString += ", ";
            }
        }

        ramString += "]";

        return libelle + ", processeur = " + processeur + ", ram = " + ramString + ", stockage = " + stockage + ", ecran = " + ecran;
    }
}
