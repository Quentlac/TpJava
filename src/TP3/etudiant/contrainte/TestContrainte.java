package TP3.etudiant.contrainte;

public class TestContrainte {

    public static void main(String[] args) {
        ReelContraint r1 = new ReelContraint(12, 15);

        ReelContraint r2 = new ReelContraint(25, 30);

        System.out.print("Saisir valeur pour R1 : ");
        ContrainteUtilitaire.saisir(r1);


        System.out.println("R1 : " + r1.getValeur());
        System.out.println("R2 : " + r2.getValeur());


        //Création de quelques notes:
        Note note1 = new Note();
        Note note2 = new Note(25);
        Note note3 = new Note(12.4);
        Note note4 = new Note(-4.8);

        System.out.print("Saisir une note : ");
        ContrainteUtilitaire.saisir(note1);

        System.out.println("Note 1 : " + note1.toString());
        System.out.println("Note 2 : " + note2.toString());
        System.out.println("Note 3 : " + note3.toString());
        System.out.println("Note 4 : " + note4.toString());


    }

}
