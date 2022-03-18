package TP1.universite;

/**
 * Classe pour tester les étudiants
 */
public class TestEtudiant {

    public static void main(String[] args) {

        //Création d'un groupe
        Groupe info = new Groupe("INFO");

        //Création de deux étudiants
        Etudiant etu1 = new Etudiant("lacombe", "Quentin", "lacombeq");
        Etudiant etu2 = new Etudiant("ligne", "Adrien", "lignea");

        etu1.setAdresse("107 Rue des Taillées");

        //etu1.login = "LOGINNNNN";

        etu2.addNote(8.2);
        etu2.addNote(12.0);
        etu2.addNote(14.0);

        etu1.setGroupe(info);

        EtudiantUtilitaire.affiche(etu1);
        EtudiantUtilitaire.affiche(etu2);



    }
}
