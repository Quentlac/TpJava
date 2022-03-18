package TP3.etudiant.contrainte;

/**
 * Classe représentant une note /20
 */
public class Note extends ReelContraint {

    /**
     * Création d'une note simple
     */
    public Note() {
        super(0, 20);
    }

    /**
     * Création d'une note en spécifiant la valeur de celle ci
     * @param valeur note /20
     */
    public Note(double valeur) {
        super(0, 20);

        try {

            // Si la note est < 0 alors on la mets à 0
            if (valeur < 0) {
                setValeur(0);
            }
            // Si la note est > 20 alors on la mets à 20
            else if (valeur > 20) {
                setValeur(20);
            } else {
                setValeur(valeur);
            }

        }
        catch (ContrainteException e) {
            System.out.println(e);
        }

    }
}
