package TP3.etudiant.contrainte;

import java.util.Scanner;

public class ContrainteUtilitaire {

    /**
     * Méthode permettant de modifier la valeur d'un réel
     * @param r réel à modifier
     */
    public static void saisir(ReelContraint r) {

        // Variable qui permet de savoir si la saisie de l'utilisateur est valide
        boolean saisieValide = false;
        Scanner scanner = new Scanner(System.in);

        do {
            // On demande à l'utilisateur de saisir un double
            double reel = scanner.nextDouble(); scanner.nextLine();
            try {
                // On essaye de changer la valeur. Si la contraine n'est pas respecté, alors une exception de type ContrainteException sera levé.
                r.setValeur(reel);

                // Si on arrive là c'est qu'aucune exception n'a été levée et donc que la saisie est valide.
                saisieValide = true;
            }
            catch (ContrainteException e) {
                System.out.println("Erreur de saisie ! (" + e.getMessage() + ")");
            }
        } while(!saisieValide); // On redemande à l'utilisateur tant que la saisie n'est pas valide
    }

}
