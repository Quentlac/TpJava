package TP1.universite;

/**
 * Ensemble de méthodes utilitaire pour les étudiants
 */
public class EtudiantUtilitaire {

    /**
     * Mets le premier caractère en majuscule et le reste en minuscule
     * @param chaine Chaîne à modifier
     * @return Nouvelle chaîne
     */
    public static String capitalize(String chaine) {
        //On passe le premier caractère en majuscule et le reste en minuscule
        return chaine.substring(0, 1).toUpperCase() + chaine.substring(1).toLowerCase();
    }

    /**
     * Affiche un étudiant
     * @param etu étudiant à afficher
     */
    public static void affiche(Etudiant etu) {
        System.out.println("-----------------");
        System.out.println("Login : " + etu.getLogin());
        System.out.println("Nom complet : " + etu.getNomComplet());
        System.out.println("Groupe : " + (etu.getGroupe() == null ? "aucun" : etu.getGroupe().getLibelle()));
        System.out.println("Mail : " + etu.getMail());
        System.out.println("Adresse : " + (etu.existAdresse() ? etu.getAdresse() : "aucune"));
        System.out.println("Moyenne : " + (etu.getNbNotes() > 0 ? etu.getMoyenne() : "aucune note"));

        if(etu.getNbNotes() > 0) {
            System.out.print(etu.getNbNotes() + " notes : ");
            for(int i = 0; i < etu.getNbNotes(); i++) {
                System.out.print(etu.getNotes()[i] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------\n");
    }

}
