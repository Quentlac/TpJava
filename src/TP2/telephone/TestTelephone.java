package TP2.telephone;

public class TestTelephone {

    public static void main(String[] args) {

        // Création des processeurs
        Processeur processeur1 = new Processeur("Octa-Core", 2.48);
        Processeur processeur2 = new Processeur("Octa-Core", 3);

        // Création des rams
        Memoire ram1 = new Memoire("LPDDR5", 4);
        Memoire ram2 = new Memoire("LPDDR5", 8);

        // Création des stockages
        Memoire stockage1 = new Memoire("UFS Storage 3.1", 64);
        Memoire stockage2 = new Memoire("UFS Storage 3.1", 128);
        Memoire stockage3 = new Memoire("UFS Storage 3.1", 256);

        // Création des écrans
        Ecran ecran1 = new Ecran("amoled", 5);
        Ecran ecran2 = new Ecran("amoled", 6);
        Ecran ecran3 = new Ecran("amoled", 7);

        Telephone telephone1 = new Telephone("Bas de gamme", processeur1, stockage1, ecran1);
        telephone1.addRam(ram1);

        Telephone telephone2 = new Telephone("Bas de gamme+", processeur1, stockage2, ecran1);
        telephone2.addRam(ram1);
        telephone2.addRam(ram1);

        Telephone telephone3 = new Telephone("Milieu de gamme", processeur1, stockage2, ecran2);
        telephone3.addRam(ram1);
        telephone3.addRam(ram1);

        Telephone telephone4 = new Telephone("Haut de gamme", processeur2, stockage3, ecran3);
        telephone4.addRam(ram2);
        telephone4.addRam(ram2);

        System.out.println(telephone1);
        System.out.println();

        System.out.println(telephone2);
        System.out.println();

        System.out.println(telephone3);
        System.out.println();

        System.out.println(telephone4);
        System.out.println();

    }

}
