package TP3.billetterie;

public class Trajet {

    private final static int DISTANCE_MIN = 5;
    private final static int DISTANCE_MAX = 2000;

    private String depart;
    private String arrive;
    private int distance;

    /**
     * Création d'un trajet
     * @param depart ville de départ
     * @param arrive ville d'arrivé
     * @param distance distance entre les 2 villes
     */
    public Trajet(String depart, String arrive, int distance) {
        setDepart(depart);
        setArrive(arrive);
        setDistance(distance);
    }


    /**
     * Modifier la ville de départ (passage automatiquement en majuscule)
     * @param depart nom de la ville
     */
    public void setDepart(String depart) {
        this.depart = depart.toUpperCase();
    }

    /**
     * Modifier la ville de d'arrivé (passage automatiquement en majuscule)
     * @param arrive nom de la ville
     */
    public void setArrive(String arrive) {
        this.arrive = arrive.toUpperCase();
    }

    /**
     * Modifier la distance entre les 2 villes
     * @param distance distance
     */
    public void setDistance(int distance) {

        // On borne la distance entre la valeur min et la valeur max
        if(distance < DISTANCE_MIN) {
            this.distance = DISTANCE_MIN;
        }
        else if(distance > DISTANCE_MAX) {
            this.distance = DISTANCE_MAX;
        }
        else {
            this.distance = distance;
        }
    }

    public String getDepart() {
        return depart;
    }

    public String getArrive() {
        return arrive;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + getDepart() + " -> " + getArrive() + " (" + getDistance() + " km)";
    }
}
