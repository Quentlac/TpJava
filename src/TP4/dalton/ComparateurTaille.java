package TP4.dalton;

import java.util.Comparator;

/**
 * Classe comparator permettant de comparer des daltons en fonction de leur taille.
 */
public class ComparateurTaille implements Comparator<Dalton> {

    @Override
    public int compare(Dalton dalton, Dalton dalton2) {

        if(dalton.getTaille() == dalton2.getTaille()) {
            return 0;
        }

        // Si le dalton est petit et que il n'a pas la même taille que l'autre, cela veut forcément dire que c'est le plus petit
        // car les deux autres possibilités sont moyen et grand
        if(dalton.getTaille() == Taille.PETIT)
            return -1;

        if(dalton.getTaille() == Taille.MOYEN) {
            if(dalton2.getTaille() == Taille.PETIT)
                return 1;
            else
                return -1;
        }

        // Si il n'est ni petit ni moyen, il est forcément grand et donc plus grand que l'autre.
        return 1;
    }
}
