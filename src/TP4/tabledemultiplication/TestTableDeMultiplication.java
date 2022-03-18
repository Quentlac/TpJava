package TP4.tabledemultiplication;

import java.util.Scanner;

public class TestTableDeMultiplication {

    /**
     * Cette fonction permet de demander la réponse à un utilisateur
     * @param multiplication multiplication à demander
     */
    public static void demandeReponseUtilisateur(Multiplication multiplication) throws ErreurMultiplicationException{
        Scanner scanner = new Scanner(System.in);

        System.out.print(multiplication);
        int reponse = scanner.nextInt(); scanner.nextLine();

        multiplication.setReponseUtilisateur(reponse);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // On demande à l'utilisateur de saisir un nombre de table (compris entre 1 et 10)
        System.out.print("Donner un nombre pour la table de multiplication entre 1 et 10 : ");
        int nTable = scanner.nextInt(); scanner.nextLine();


        // Tant que la contrainte n'est pas respectée, on redemande à l'utilisateur
        while (!(nTable >= 1 && nTable <= 10)) {
            System.out.print("Merci de répondre entre 1 et 10 : ");
            nTable = scanner.nextInt(); scanner.nextLine();
        }

        System.out.print("Entrainement 1 ou Exercice 2 : ");
        int exo = scanner.nextInt(); scanner.nextLine();

        // Tant que la exo n'est pas respectée, on redemande à l'utilisateur
        while (!(exo != 1 || exo != 2)) {
            System.out.print("Merci de répondre entre 1 ou 2 : ");
            exo = scanner.nextInt(); scanner.nextLine();
        }

        System.out.print("Mode sans échec : ");
        boolean mode_sans_echec = scanner.nextBoolean(); scanner.nextLine();



        // Création de la table de multiplication
        TableDeMultiplication multiplications = new TableDeMultiplication(nTable, exo == 2, mode_sans_echec);


        // Pour chaque multiplications de la table on demande à l'utilisateur la réponse
        for(int i = 0; i < multiplications.getNombreMultiplications(); i++) {
            boolean bonne_reponse = false; // Cette variable sera vrai lorsque l'utilisateur aura saisis la bonne réponse

            // Tant que ce n'est pas la bonne réponse, on redemande à l'utilisateur
            while (!bonne_reponse) {
                try {
                    demandeReponseUtilisateur(multiplications.getMultiplication(i));
                    bonne_reponse = true;
                } catch (ErreurMultiplicationException e) {
                    System.out.println("Mauvaise réponse !");
                }
            }

        }

        System.out.println("Nombre de bonne réponses : " + multiplications.getNombreReponsesJustes() + " / " + multiplications.getNombreMultiplications());
        System.out.println("Bravo ! ");

    }

}
