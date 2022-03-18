package TP3.etudiant;

import java.util.Collection;

public class EtudiantUtilitaire {

    public static void afficheEtudiants(Collection<Etudiant> etudiants) {
        for(Etudiant e : etudiants) {
            System.out.println("Moyenne = " + e.getMoyenne() + " : " + e.getNom() + ", " + e.getPrenom());
        }
    }

}
