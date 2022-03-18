package TP3.etudiant;

public abstract class Personne {

    private String login;
    private String nom;
    private String prenom;
    private String adresse;

    /**
     * Création d'une personne
     * @param nom
     * @param prenom
     * @param login Nom d'utilisateur
     */
    public Personne(String login, String prenom, String nom) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
    }

    /**
     * Création d'une personne
     * @param login Nom d'utilisateur
     * @param prenom
     * @param nom
     * @param adresse
     */
    public Personne(String login, String prenom, String nom, String adresse) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
        setAdresse(adresse);
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
        this.nom = UniversiteUtilitaire.capitalize(nom);
    }

    /**
     * Définit le prénom
     * @param prenom prénom
     */
    public void setPrenom(String prenom) {
        //On passe le premier caractère en majuscule et le reste en minuscule
        this.prenom = UniversiteUtilitaire.capitalize(prenom);
    }

    /**
     * Définit l'adresse de la personne
     * @param adresse Adresse de la personne
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Retourne vraie si l'adresse est définit
     * @return Vrai si la personne a une adresse définit
     */
    public boolean existAdresse() {
        return this.adresse != null && !this.adresse.isEmpty();
    }

    public String getAdresse() {
        return this.adresse;
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
    public abstract String getMail();

}
