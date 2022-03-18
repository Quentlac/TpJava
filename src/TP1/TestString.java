package TP1;
import java.util.Scanner;

/**
 * Classe pour tester les Strings
 */
public class TestString {

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        // Test git
        System.out.println("Donner une chaîne de caractères maChaine :");
        String maChaine = entree.nextLine();

        System.out.println();
        System.out.println("1. Nombre de caractères de la chaîne de caractères maChaine : " + maChaine.length());

        maChaine = maChaine.toUpperCase();
        System.out.println("2. La chaîne de caractères maChaine en majuscule : " + maChaine);
        System.out.println("3. Donner une deuxieme chaîne de caractères deuxiemeChaine :");
        String deuxiemeChaine = entree.nextLine();

        if(maChaine.compareToIgnoreCase(deuxiemeChaine) == 0)
            System.out.println("Les deux chaînes sont identiques - sans tenir compte de la casse.");

        //On met la chaine en minuscule et on la compare avec elle même avant, si c'est la même c'est qu'elle était déjà en minuscule
        if(maChaine.toLowerCase().compareTo(maChaine) == 0)
            System.out.println("4. La chaîne de caractères maChaine est en minuscule.");

        maChaine = maChaine.trim();
        System.out.println("5. La chaîne de caractères maChaine en majuscule sans les 'blancs' en début et fin de chaîne : " + maChaine);

        //On inverse la chaîne et on regarde si c'est la même
        if(new StringBuilder(maChaine.toLowerCase()).reverse().compareTo(new StringBuilder(maChaine.toLowerCase())) == 0)
            System.out.println("6. La chaîne de caractères maChaine est un palindrome.");


    }
}
