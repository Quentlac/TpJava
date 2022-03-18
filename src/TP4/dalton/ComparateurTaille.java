package TP4.dalton;

import java.util.Comparator;

public class ComparateurTaille implements Comparator<Dalton> {

    @Override
    public int compare(Dalton dalton, Dalton dalton2) {
        if(dalton.getTaille() == dalton2.getTaille()) {
            return 0;
        }

        if(dalton.getTaille() == Taille.PETIT)
            return -1;

        if(dalton.getTaille() == Taille.MOYEN) {
            if(dalton2.getTaille() == Taille.PETIT)
                return 1;
            else
                return -1;
        }

        return 1;
    }
}
