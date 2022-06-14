package TP5.tabledoperation;

public class Soustraction extends Operation {

    public Soustraction(double terme1, double terme2) {
        super(terme1, terme2);
    }

    @Override
    public double calculResultat() {
        return getTerme1() - getTerme2();
    }

    @Override
    public String toString() {
        return getTerme1() + " - " + getTerme2() + " = " + calculResultat();
    }
}

