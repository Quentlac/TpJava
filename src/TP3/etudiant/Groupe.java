package TP3.etudiant;

import TP3.etudiant.Etudiant;

import java.util.Collection;
import java.util.TreeSet;

public class Groupe {

    private String libelle;
    private TreeSet<Etudiant> etudiants; // On utilise un tree set pour conserver l'ordre naturel des étudiants

    /**
     * Création d'un groupe
     * @param libelle nom du groupe
     */
    public Groupe(String libelle) {
        this.libelle = libelle;
        this.etudiants = new TreeSet<>();
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    /**
     * Ajout d'un étudiant
     * @param e étudiant à ajouter
     */
    public void addEtudiant(Etudiant e) {
        // Si l'étudiant n'est pas dans ce groupe alors on le rajoute et on le supprime de l'ancien
        if(e.existGroupe()) {
            e.getGroupe().removeEtudiant(e);
        }

        etudiants.add(e);
        e.setGroupe(this);

    }

    /***
     * Suprimme un étudiant
     * @param e étudiant à supprimer
     */
    public void removeEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    /**
     * Vérifie l'existance d'un étudiant
     * @param e étudiant
     * @return vrai si l'étudiant existe dans le groupe
     */
    public boolean containsEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    /**
     * Retourne la liste des étudiants
     * @return
     */
    public Collection<Etudiant> getEtudiants() {
        return this.etudiants;
    }

}
