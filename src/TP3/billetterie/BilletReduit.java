package TP3.billetterie;

/**
 * Classe représentant un billet avec un prix réduit
 */
public class BilletReduit extends Billet{

    private final static double REDUC_MIN = 5;
    private final static double REDUC_MAX = 50;

    private double tauxDeReduction;

    public BilletReduit(Trajet trajet, double prixAuKm, double tauxDeReduction) {
        super(trajet, prixAuKm);
        setTauxDeReduction(tauxDeReduction);
    }

    /**
     * Modifie le taux de réduction (borné entre 5 et 50)
     * @param tauxDeReduction taux de réduction
     */
    public void setTauxDeReduction(double tauxDeReduction) {
        // On fait en sorte de borné la réduction
        if(tauxDeReduction < REDUC_MIN) {
            this.tauxDeReduction = REDUC_MIN;
        }
        else if(tauxDeReduction > REDUC_MAX) {
            this.tauxDeReduction = REDUC_MAX;
        }
        else {
            this.tauxDeReduction = tauxDeReduction;
        }
    }

    public double getTauxDeReduction() {
        return tauxDeReduction;
    }

    @Override
    public double getPrix() {
        // On retroune le prix en appliquant la réduction
        return super.getPrix() - (tauxDeReduction / 100) * super.getPrix();
    }

    @Override
    public String toString() {
        return super.toString() + ", avec une réduction de " + tauxDeReduction + "%";
    }
}
