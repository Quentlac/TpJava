package TP2.contrainte;

/**
 * Classe représentant un nombre réel borné par 2 valeurs (min et max)
 */
public class ReelContraint {

    private double min;
    private double max;
    private double valeur;

    /**
     * Création d'un réel contraint
     * @param min minimum
     * @param max maximum
     */
    public ReelContraint(double min, double max) {
        this.min = min;
        this.max = max;
        this.valeur = min;
    }

    /**
     * Retourne la valeur
     * @return valeur
     */
    public double getValeur() {
        return valeur;
    }

    /**
     * Modification de la valeur
     * @param v valeur
     * @throws ContrainteException en cas de non respect des contraintes
     */
    public void setValeur(double v) throws ContrainteException{
        // On modifie la valeur uniquement si celle ci respecte la contrainte
        if(v >= min && v <= max) {
            this.valeur = v;
        }
        else {
            throw new ContrainteException("Le réel est en dehors de l'interval [" + min + ", " + max + "]");
        }
    }

    @Override
    public String toString() {
        return "valeur : " + valeur + ", min : " + min + ", max : " + max;
    }
}
