package TP3.etudiant;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestOrdreNaturelEtudiant {

    public static void main(String[] args) {

        // Création d'étudiant
        ArrayList<Etudiant> mesEtudiantsOrdreQcq = new ArrayList<>();

        // Création de plusieurs étudiants
        Etudiant etudiant1 = new Etudiant("SANZF", "FLORIANT", "Sanz");
        Etudiant etudiant2 = new Etudiant("portepa", "Pierre-Antoine", "Porte");
        Etudiant etudiant3 = new Etudiant("burlatn", "nils", "burlat", "1 rue pas loin", "10 rue des parents");

        mesEtudiantsOrdreQcq.add(etudiant1);
        mesEtudiantsOrdreQcq.add(etudiant2);
        mesEtudiantsOrdreQcq.add(etudiant3);

        System.out.println("----- Non trié -----");
        EtudiantUtilitaire.afficheEtudiants(mesEtudiantsOrdreQcq);

        TreeSet<Etudiant> mesEtudiantsTries = new TreeSet<>();

        mesEtudiantsTries.add(etudiant1);
        mesEtudiantsTries.add(etudiant2);
        mesEtudiantsTries.add(etudiant3);

        System.out.println();
        System.out.println("----- Trié -----");

        EtudiantUtilitaire.afficheEtudiants(mesEtudiantsTries);




    }

}
