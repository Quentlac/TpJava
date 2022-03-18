package TP4.dalton;

import java.util.Comparator;

/**
 * Comparateur permettant de trier les daltons selon leur nom
 */
public class ComparateurNom implements Comparator<Dalton> {

    @Override
    public int compare(Dalton o, Dalton t1) {
        return o.getNom().compareTo(t1.getNom());
    }
}
