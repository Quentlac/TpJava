package jeu;

/**
 * Celle classe permet de retourner la valeur des dégats subits et infligé par un guerrier
 */
public class DegatsDonneSubit {

    private int degatSubit;
    private int degatInflige;

    public DegatsDonneSubit(int degatSubit, int degatInflige) {
        this.degatSubit = degatSubit;
        this.degatInflige = degatInflige;
    }

    public int getDegatSubit() {
        return degatSubit;
    }

    public int getDegatInflige() {
        return degatInflige;
    }
}
