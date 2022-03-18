package TP3.etudiant;

import TP3.etudiant.contrainte.Note;

import java.util.ArrayList;

/**
 * Classe représentant un étudiant, héritant de la classe Personne
 */
public class Etudiant extends Personne implements Comparable<Etudiant>{

    private String adresseParent;
    private ArrayList<Note> notes = new ArrayList<>();
    private Groupe groupe;

    /**
     * Création d'un étudiant en appelant le constructeur de la classe mère
     * @param login
     * @param prenom
     * @param nom
     */
    public Etudiant(String login, String prenom, String nom) {
        super(login, prenom, nom);
    }

    /**
     * Création d'un étudiant avec une adresse personnelle et celle de ces parents
     * @param login
     * @param prenom
     * @param nom
     * @param adresse
     * @param adresseParent
     */
    public Etudiant(String login, String prenom, String nom, String adresse, String adresseParent) {
        super(login, prenom, nom);
        setAdresse(adresse, adresseParent);
    }


    /**
     * Modifier l'adresse de l'étudiant et celle de ses parents
     * @param adresse
     * @param adresseEtudiantParent
     */
    public void setAdresse(String adresse, String adresseEtudiantParent) {
        super.setAdresse(adresse); // Modification de son adresse personnelle
        this.adresseParent = adresseEtudiantParent; // Modification de l'adresse de ses parents
    }

    /**
     * Redéfinition de la méthode getMail() afin de retourner l'adresse mail d'un étudiant
     * @return mail de l'étudiant
     */
    @Override
    public String getMail() {
        return getPrenom().toLowerCase() + "." + getNom().toLowerCase() + "@etu.univ-grenoble-alpes.fr";
    }

    /**
     * Redéfinition de la méthode existAdresse() afin de savoir si l'étudiant possède au moins une adresse
     * @return vraie si l'étudiant possède au moins une adresse définit.
     */
    @Override
    public boolean existAdresse() {
        return super.existAdresse() | adresseParent != null & !adresseParent.isEmpty();
    }


    /**
     * Redéfinition de la méthode getAdresse() pour prendre en compte l'adresse des parents
     * @return l'adresse de l'étudiant ainsi que celle de ses parents
     */
    @Override
    public String getAdresse() {
        String adresseComplete = null;

        // On regarde d'abord si l'étudiant possède une adresse personnelle
        if(super.existAdresse()){
            adresseComplete = super.getAdresse();

            // Ensuite on regarde si on l'adresse de ses parents pour la rajouter à coté
            if(adresseParent != null && !adresseParent.isEmpty()) {
                adresseComplete += " (Adresse des parents " + adresseParent + " )";
            }
        }
        else if(adresseParent != null && !adresseParent.isEmpty()) {
            // Si l'étudiant n'a pas d'adresse perso alors on met uniquement celle de ces parents
            adresseComplete = adresseParent;
        }

        return adresseComplete;
    }

    /**
     * Ajoute une note à l'étudiant
     * @param note valeur de la note
     */
    public void addNote(Note note) {
        notes.add(note);
    }


    /**
     * Récupère la moyenne de l'étudiant
     * @return Moyenne des notes
     */
    public double getMoyenne() {

        //On traite le cas où l'étudiant n'a pas de notes pour éviter de faire une division par 0.
        if(notes.size() == 0)
            return 0;

        double somme = 0;
        for(Note n : notes) {
            somme += n.getValeur();
        }
        return Math.round(somme / notes.size() * 100) / 100;
    }

    /**
     * Retourne toutes les notes de l'étudiant
     * @return tableau de notes de l'étudiant
     */
    public ArrayList<Note> getNotes() {
        return notes;
    }

    /**
     * Vérifie si l'étudiant appartient à un groupe
     * @return Vrai si l'étudiant apparaît à un groupe
     */
    public boolean existGroupe() {
        return groupe != null && !groupe.getLibelle().isEmpty();
    }

    public Groupe getGroupe() {
        return groupe;
    }

    /**
     * Vérifie si l'étudiant existe bien à un groupe
     * @param groupe
     * @return Vrai si l'étudiant existe dans le groupe
     */
    public boolean isContainedGroupe(Groupe groupe) {
        return groupe.containsEtudiant(this);
    }

    public void setGroupe(Groupe g) {
        if(!g.containsEtudiant(this))
            g.addEtudiant(this);

        this.groupe = g;
    }

    @Override
    public int compareTo(Etudiant etudiant) {
        // Si les étudiants on le même nom on compare selon leur prénom
        if(getNom().compareTo(etudiant.getNom()) == 0) {
            return getPrenom().compareTo(etudiant.getPrenom());
        }

        // Sinon on compare selon leur nom
        return getNom().compareTo(etudiant.getNom());
    }
}
