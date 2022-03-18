package TP4.tabledemultiplication;

public class Multiplication {

    private int terme1;
    private int terme2;
    private boolean mode_sans_echec;

    private Integer reponseUtilisateur;

    /**
     * Création d'une multiplication
     * @param terme1
     * @param terme2
     */
    public Multiplication(int terme1, int terme2, boolean mode_sans_echec) {
        this.terme1 = terme1;
        this.terme2 = terme2;
        this.mode_sans_echec = mode_sans_echec;
    }

    /**
     * Récupère la réponse de l'utilisateur
     * @param reponseUtilisateur
     * @throws ErreurMultiplicationException
     */
    public void setReponseUtilisateur(Integer reponseUtilisateur) throws ErreurMultiplicationException{
        if(terme1 * terme2 == reponseUtilisateur) {
            this.reponseUtilisateur = reponseUtilisateur;
        }
        else if(mode_sans_echec){
            throw new ErreurMultiplicationException();
        }
    }

    /**
     * Vérifie si la réponse de l'utilisateur est juste
     * @return vrai si la réponse est juste
     */
    public boolean isReponseJuste() {
        return terme1 * terme2 == reponseUtilisateur;
    }

    @Override
    public String toString() {
        return terme1 + " x " + terme2 + " = ";
    }
}
