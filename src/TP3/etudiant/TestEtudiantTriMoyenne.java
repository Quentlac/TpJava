package TP3.etudiant;
import TP3.etudiant.contrainte.Note;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestEtudiantTriMoyenne {

    public static void main(String[] args) {

        // Création de quelques étudiants
        ArrayList<Etudiant> etudiants = new ArrayList<>();

        Etudiant etu1 = new Etudiant("lacombeq", "Quentin", "LACOMBE", "107 Rue des Taillees", "61 Route du Suiffet");
        Etudiant etu2 = new Etudiant("peutotn", "Noe", "Peutot");
        Etudiant etu3 = new Etudiant("lignea", "Adrien", "Ligne");

        // On ajoute 2 notes à Adrien
        etu3.addNote(new Note(14));
        etu3.addNote(new Note(16));

        // On ajoute 3 note à Quentin
        etu1.addNote(new Note(14));
        etu1.addNote(new Note(14.6));
        etu1.addNote(new Note(19.8));

        // On ajoute 3 note à Noé
        etu2.addNote(new Note(10.6));
        etu2.addNote(new Note(16.2));
        etu2.addNote(new Note(17.9));

        etudiants.add(etu1);
        etudiants.add(etu2);
        etudiants.add(etu3);

        System.out.println("--------------\n" +
                "Les étudiants avant Collections.sort() :");

        EtudiantUtilitaire.afficheEtudiants(etudiants);

        // On trie les étudiants selon leurs moyennes
        Collections.sort(etudiants, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant etudiant, Etudiant t1) {
                if(etudiant.getMoyenne() > t1.getMoyenne()) return 1;
                if(etudiant.getMoyenne() < t1.getMoyenne()) return -1;
                return 0;
            }
        });

        System.out.println("\n--------------\n" +
                "Les étudiants après Collections.sort() :");

        EtudiantUtilitaire.afficheEtudiants(etudiants);



    }

}
