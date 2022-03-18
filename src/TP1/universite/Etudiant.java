package TP1.universite;

/**
 * La classe Etudiant représente la notion d'étudiant (login, nom, prénom
 et adresse).
 * ATTENTION des contraintes sur la notion d’étudiant :
 * – un étudiant doit toujours avoir un login en minuscule
 * – un étudiant doit toujours avoir un nom et un prénom avec
 * le premier caractère en majuscule et les autres en minuscule.
 */

public class Etudiant {

    private String login;
    private String nom;
    private String prenom;
    private String adresse;

    private Groupe groupe;

    private double notes[] = new double[5]; // Liste des notes de l'étudiant
    private int nbNotes; //Indice du tableau pour ajouter une nouvelle note


    /**
     * Création d'un étudiant
     * @param nom Nom de l'étudiant
     * @param prenom Prénom de l'étudiant
     * @param login Nom d'utilisateur de l'étudiant
     */
    public Etudiant(String nom, String prenom, String login) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
    }


    /**
     * Définit le login
     * @param login Nom d'utilisateur
     */
    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }

    /**
     * Définit le nom
     * @param nom Nom de l'étudiant
     */
    public void setNom(String nom) {
        //On passe le premier caractère en majuscule et le reste en minuscule
        this.nom = EtudiantUtilitaire.capitalize(nom);
    }

    /**
     * Définit le prénom
     * @param prenom prénom
     */
    public void setPrenom(String prenom) {
        //On passe le premier caractère en majuscule et le reste en minuscule
        this.prenom = EtudiantUtilitaire.capitalize(prenom);
    }

    /**
     * Modifie le groupe auquel appartient l'étudiant
     * @param g Groupe
     */
    public void setGroupe(Groupe g) {
        this.groupe = g;
    }

    /**
     * Définit l'adresse de l'étudiant
     * @param adresse Adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Vérifie si une adresse est définit pour l'étudiant
     * @return Vraie si une adresse est définit
     */
    public boolean existAdresse() {
        return adresse != null && !adresse.isEmpty();
    }

    /**
     * Récupère le nom d'utilisateur
     * @return Nom d'utilisateur
     */
    public String getLogin() {
        return login;
    }

    /**
     * Récupère le nom
     * @return Nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupère le prénom
     * @return Prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Récupère l'adresse
     * @return Adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Récupère le groupe auquel appartient l'étudiant
     * @return Groupe de l'étudiant
     */
    public Groupe getGroupe() {
        return groupe;
    }

    /**
     * Retourne le nom complet de l'étudiant
     * @return Nom complet (prénom + nom)
     */
    public String getNomComplet() {
        return prenom + " " + nom;
    }

    /**
     * Retourne le mail construit à partir du nom et du prénom de l'étudiant
     * @return Mail
     */
    public String getMail() {
        return prenom.toLowerCase() + "." + nom.toLowerCase() + "@etu.univ-grenoble-alpes.fr";
    }

    /**
     * Ajout d'une nouvelle note
     * @param note Note à ajouter
     */
    public void addNote(double note) {
        if(nbNotes < notes.length){
            notes[nbNotes] = note;
            nbNotes++;
        }
    }

    /**
     * Récupère la moyenne de l'étudiant
     * @return Moyenne des notes
     */
    public double getMoyenne() {

        //On traite le cas où l'étudiant n'a pas de notes pour éviter de faire une division par 0.
        if(nbNotes == 0)
            return 0;

        double somme = 0;
        for(int i = 0; i < nbNotes; i++) {
            somme += notes[i];
        }
        return Math.round(somme / nbNotes * 100) / 100;
    }

    /**
     * Retourne les notes de l'étudiants
     * @return Tableau de toutes les notes
     */
    public double[] getNotes() {
        return notes;
    }

    /**
     * Récupère le nombre de notes de l'étudiant
     * @return Nombre de notes
     */
    public int getNbNotes() {
        return nbNotes;
    }

}
