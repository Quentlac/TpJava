package TP4.tabledemultiplication;

import java.util.ArrayList;
import java.util.Scanner;

public class TableDeMultiplication {

    private final static int NOMBRE_MAX = 10;

    private int nombreTable; // Numéro de la table
    private boolean mode_sans_echec; // mode sans echec
    private ArrayList<Multiplication> multiplications;

    /**
     * Initialisation d'une table de multiplication
     * @param nombreTable
     * @param estMelange
     */
    public TableDeMultiplication(int nombreTable, boolean estMelange, boolean mode_sans_echec) {
        this.nombreTable = nombreTable;
        this.multiplications = new ArrayList<>(nombreTable);
        this.mode_sans_echec = mode_sans_echec;
        initialisation();
        if(estMelange) melange();
    }

    /**
     * Initialise toutes les multiplications
     */
    private void initialisation() {
        for(int i = 1; i <= NOMBRE_MAX;i++) {
            multiplications.add(new Multiplication(nombreTable, i, mode_sans_echec));
        }
    }

    /**
     * Permet de mélanger la table de multiplication
     */
    private void melange() {
        ArrayList<Multiplication> tableMelange = new ArrayList<>();

        int initSize = multiplications.size();

        while(tableMelange.size() < initSize) {
            int i = (int) Math.floor(Math.random() * (multiplications.size()));
            tableMelange.add(multiplications.get(i));
            multiplications.remove(i);
        }

        multiplications = new ArrayList<>(tableMelange);
    }

    public int getNombreMultiplications() {
        return NOMBRE_MAX;
    }

    public Multiplication getMultiplication(int index) {
        return multiplications.get(index);
    }

    /**
     * Retourne le nombre de réponses justes
     * @return nombre de réponses justes
     */
    public int getNombreReponsesJustes() {

        int nbJustes = 0;
        for(Multiplication m : multiplications) {
            if(m.isReponseJuste())
                nbJustes++;
        }

        return nbJustes;
    }

}
