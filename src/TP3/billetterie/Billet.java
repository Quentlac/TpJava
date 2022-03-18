package TP3.billetterie;

public class Billet {

    private final static double PRIX_KM_MIN = 0.1;
    private final static double PRIX_KM_MAX = 2;

    private double prixAuKm;
    private Trajet trajet;

    /**
     * Création d'un billet
     * @param trajet
     * @param prixAuKm prix au kilomètre
     */
    public Billet(Trajet trajet, double prixAuKm) {
        this.trajet = trajet;
        setPrixAuKm(prixAuKm);
    }

    /**
     * Modifier le prix au km (borné entre le minimum et le maximum)
     * @param prixAuKm prix au kilomètre
     */
    public void setPrixAuKm(double prixAuKm) {
        // La valeur est borné
        if(prixAuKm < PRIX_KM_MIN) {
            this.prixAuKm = PRIX_KM_MIN;
        }
        else if(prixAuKm > PRIX_KM_MAX) {
            this.prixAuKm = PRIX_KM_MAX;
        }
        else {
            this.prixAuKm = prixAuKm;
        }
    }

    public String getDepart() {
        return trajet.getDepart();
    }

    public String getArrive() {
        return trajet.getArrive();
    }

    public int getDistance() {
        return trajet.getDistance();
    }

    public double getPrixAuKm() {
        return prixAuKm;
    }

    /**
     * Retourne le prix du billet
     * @return prix du billet
     */
    public double getPrix() {
        // Le prix est calculé avec le produit du prix au km et la distance
        return getPrixAuKm()*getDistance();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : [" + trajet + "], prix : " + BilletterieUtilitaire.arrondir(getPrix()) + " euros";
    }
}
